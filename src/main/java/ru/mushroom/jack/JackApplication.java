package ru.mushroom.jack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.mushroom.jack.Domain.*;
import ru.mushroom.jack.Domain.Alive.Player;
import ru.mushroom.jack.Repository.CellRepository;
import ru.mushroom.jack.Repository.LocationRepository;
import ru.mushroom.jack.Repository.PlayerRepository;
import ru.mushroom.jack.Service.ShellAdminInterface.ShellAdminInterface;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class JackApplication {

    @Autowired
    private LocationRepository locationRepository;

    public static void main(String[] args) throws InterruptedException {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });

        ApplicationContext context = SpringApplication.run(JackApplication.class, args);

        PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
        playerRepository.save(
                new Player(
                        new Coordinate(1, 1),
                        new Long(0),
                        Orientation.S,
                        "Jack",
                        "Player",
                        new Integer(1000),
                        new Integer(1000),
                        new Integer(1000),
                        new Integer(1000)
                )
        );




        LocationRepository locationRepository = context.getBean(LocationRepository.class);
        locationRepository.save(new Location("TestSandBox", new Coordinate(0, 0)));

        CellRepository cellRepository = context.getBean(CellRepository.class);
        //cellRepository.save(new Cell(playerRepository.findById("Jack")));

        Thread.sleep(3000);

        /*System.out.println("\n\n");
        System.out.println(playerRepository.findById("Jack").get().getPosition());
        //System.out.println(cellRepository.findById(new Coordinate(0, 0)).get().getAllUnit().forEach(p -> System.out.println(p.getId())));
        System.out.println("\n\n");
        locationRepository.findAll().forEach(p -> System.out.println(p.getName()));
        System.out.println("\n\n");
        System.out.println(locationRepository.findById(new Coordinate(0, 0)).get().getName());
        System.out.println("\n\n");*/

        ShellAdminInterface shellAdminInterface = new ShellAdminInterface();//context.getBean(ShellAdminInterface.class);
        //shellAdminInterface.startSAI();
    }

    public static void createGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        String mesh[][] = new String[80][24];
        for(int i = 0; i < 24; i++){
            for (int k = 0; k < 80; k++){
                mesh[k][i] = "+";
            }
        }

        JLabel label = new JLabel(mesh);

        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(800, 400));

        frame.pack();
        frame.setVisible(true);
    }

}
