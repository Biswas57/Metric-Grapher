# Metrics Visualization Lab

## Overview
This project is a Java-based app that uses an observer to graphically represent metrics, which lays the foundation for representing all types of performance data and mathematical relationships and formulae. This specific metric grapher simulates an `Emitter` component to generate a sin wave, which can be visualized on a real-time graph.

Metrics are crucial for monitoring various aspects of a system such as daily CPM charts, Request Error ratios, etc.. By observing these metrics, businesses can proactively detect and address issues, to improve their system's performance without having to receive any user complaints.

## Features
- **Real-time Graphing**: Visualise sin wave metrics as they are generated.
- **Design Patterns**: Uses observer and data strategy methods for data manipulation and hence visualisation.
- **Interactive Dashboard**: Select different metrics of the given data set to view from the provided panel.

## Running the Application
To see the graph in action, go to `Grapher.java` and execute the main function. The GUI window will display the graph panel with default random data sourced from `Plot.java`. Interact with the panel to switch between different statistical views of the metrics.
