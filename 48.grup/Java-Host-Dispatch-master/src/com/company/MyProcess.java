
package com.company;

public class MyProcess {
    private int processId;
    private int cpuUsage; // CPU usage percentage
    private int memoryUsage; // Memory usage in MB
    private ProcessState state;

    public MyProcess(int processId, int cpuUsage, int memoryUsage) {
        this.processId = processId;
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
        this.state = ProcessState.NEW; // Initial state
    }

    // Method to simulate process execution
    public void execute() {
        // Simulate processing
        // Change state as needed
        state = ProcessState.RUNNING;
        // Additional logic here...
    }

    public int getProcessId() {
        return processId;
    }

    public int getCpuUsage() {
        return cpuUsage;
    }

    public int getMemoryUsage() {
        return memoryUsage;
    }

    public ProcessState getState() {
        return state;
    }

    public void setState(ProcessState state) {
        this.state = state;
    }
}

enum ProcessState {
    NEW, RUNNING, WAITING, TERMINATED
}
