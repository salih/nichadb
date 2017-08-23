package org.sorenle.config;

public class Config {
    // Cluster name
    public String cluster_name;

    // How frequently should gossip check for alive nodes in cluster in milliseconds
    public Long gossip_status_check_interval;

    //Indicates number of maximum reconect
    public Integer maximum_reconnect_tomark_dead;



}
