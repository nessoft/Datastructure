/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstraInterpreter;

/**
 *
 * @author iNez-Server
 */
public class App {
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        algorithm.interpretExpression("( ( 1 + 2 ) * ( 2 + 1 ) )");
        algorithm.result();
    }
}
