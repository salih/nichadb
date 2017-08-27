package org.sorenle.config;

import org.sorenle.partitioner.Partitioner;

public class Config {
    // Cluster name
    public String cluster_name;

    // How frequently should gossip check for alive nodes in cluster in milliseconds
    public Long gossip_status_check_interval;

    //Indicates number of maximum reconect
    public Integer maximum_reconnect_tomark_dead;

    // Server port for nicha clients
    public Integer server_port;

    //Partitioner class

    public Partitioner partitioner;

    //SSL Enabled

    public Boolean ssl_enabled;




}
