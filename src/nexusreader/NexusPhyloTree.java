package nexusreader;

import dat.PhyloTree;
import dat.PhyloTree.*;

import java.io.*;
import java.util.*;

public class NexusPhyloTree extends PhyloTree {
    private NexusPhyloTree(Node root) {
        super(root);
    }

    private static Node parseNexus(String str, Node parent) {
        return parseNexus(str, parent, new ArrayList<>(), 0);
    }

    private static Node parseNexus(String str, Node parent, ArrayList<Integer> nodeIds, int count) {
        Node node = null;
        // Do some stuff
        return node;
    }

    public static PhyloTree loadNexus(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        String line = null;
        int cnt = 1;
        while ((line = reader.readLine()) != null)
            sb.append(line.trim());
        String nexus = sb.toString();
        Node root = parseNexus(nexus, null);
        PhyloTree t = new PhyloTree(root);
        reader.close();
        return t
    }
}
