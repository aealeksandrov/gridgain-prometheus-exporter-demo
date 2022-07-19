package demo;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.cluster.ClusterState;

public class StartNode {
    public static void main(String[] args) {
        Ignite ign = Ignition.start("server.xml");

        ign.cluster().state(ClusterState.ACTIVE);
    }
}
