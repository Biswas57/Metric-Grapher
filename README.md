# Metrics Visualization Lab

## Overview
This project is a Java-based application that utilizes the observer and strategy design patterns to graphically represent metrics, providing insights into system performance. It simulates an `Emitter` component generating sine wave values as metrics, which can be visualized in real-time on a graph.

Metrics are crucial for monitoring various aspects of a system such as CPU utilization, API calls, or network packet drops. By observing these metrics, developers can proactively detect and address issues, improving system reliability and performance without awaiting user reports.

## Features
- **Real-time Graphing**: Visualize sine wave metrics as they are generated.
- **Design Patterns**: Leverages observer and strategy patterns for modular and responsive design.
- **Interactive Dashboard**: Select different metrics to view from the provided panel.

## Running the Application
To see the graph in action, navigate to `Grapher.java` and execute the main function. The GUI window will display the graph panel with default random data sourced from `Plot.java`. Interact with the panel to switch between different statistical views of the metrics.
