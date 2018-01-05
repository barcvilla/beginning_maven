/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal hello
 * 
 */
public class HelloMojo extends AbstractMojo
{
    public void execute() throws MojoExecutionException, MojoFailureException
    {
        getLog().info("Hello Maven Plugin");
    }
}
