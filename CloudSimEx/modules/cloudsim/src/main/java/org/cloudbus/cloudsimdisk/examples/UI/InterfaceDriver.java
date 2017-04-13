package org.cloudbus.cloudsimdisk.examples.UI;

import static org.cloudbus.cloudsimdisk.examples.SimulationScenarios.FlushEntireStagingDiskContents.startSimulation;

/**
 * Created by spadigi on 4/4/17.
 */
public class InterfaceDriver {
    public static void main(String args[]) throws Exception{
        // node properties
        int totalNoOfNodes = Integer.parseInt(args[0]);

        // staging disk properties
        boolean addStagingDisk = Boolean.parseBoolean(args[1]);

        /*
        int numberOfOperations = 10;
        String distribution = "read intensive";

        // will have a set of predefined workloads , user selects one of them,
        // predefindedWorkloadNumber variable stores the workload id
        int predefindedWorkloadNumber = 1;

        int noOfReplicas = 3; //default 3
        String cachingMechanism = "LRU"; // FIFO also possible
        int diskType = 1; // basicallly this number is the id for storage and power model, will assign ids to them
        //Scenarios : this part is to be done in front end
        */

        int numberOfOperations = Integer.parseInt(args[2]);
        String distribution = args[3];

        // will have a set of predefined workloads , user selects one of them,
        // predefindedWorkloadNumber variable stores the workload id
        int predefindedWorkloadNumber = Integer.parseInt(args[4]);

        int noOfReplicas = Integer.parseInt(args[5]); //default 3
        String cachingMechanism = args[5]; // FIFO also possible
        int diskType = Integer.parseInt(args[6]); // basicallly this number is the id for storage and power model, will assign ids to them

        //startSimulation(totalNoOfNodes, addStagingDisk, numberOfOperations, predefindedWorkloadNumber, noOfReplicas, cachingMechanism, diskType);
    }
}
