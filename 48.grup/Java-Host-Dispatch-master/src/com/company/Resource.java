
package com.company;

public class Resource {
    private int resourceId;
    private int cpuCapacity; // CPU capacity in percentage
    private int memoryCapacity; // Memory capacity in MB
    private boolean isAllocated;

    public Resource(int resourceId, int cpuCapacity, int memoryCapacity) {
        this.resourceId = resourceId;
        this.cpuCapacity = cpuCapacity;
        this.memoryCapacity = memoryCapacity;
        this.isAllocated = false;
    }

    // Method to allocate resource to a process
    public boolean allocateToProcess(MyProcess process) {
        if (!isAllocated && process.getCpuUsage() <= cpuCapacity && process.getMemoryUsage() <= memoryCapacity) {
            isAllocated = true;
            // Additional logic here for allocation
            return true;
        }
        return false;
    }

    // Method to release the resource
    public void release() {
        isAllocated = false;
        // Additional logic here for release
    }

    // Getters and Setters
    public int getResourceId() {
        return resourceId;
    }

    public int getCpuCapacity() {
        return cpuCapacity;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public boolean isAllocated() {
        return isAllocated;
    }
}
