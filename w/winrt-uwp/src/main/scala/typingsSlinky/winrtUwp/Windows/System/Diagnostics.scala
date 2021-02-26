package typingsSlinky.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides diagnostic information about the system and running processes. */
object Diagnostics {
  
  /** Provides access to data about the CPU usage of a process. */
  @js.native
  trait ProcessCpuUsage extends StObject {
    
    /**
      * Gets the ProcessCpuUsageReport for the process.
      * @return The CPU usage report for the process.
      */
    def getReport(): ProcessCpuUsageReport = js.native
  }
  object ProcessCpuUsage {
    
    @scala.inline
    def apply(getReport: () => ProcessCpuUsageReport): ProcessCpuUsage = {
      val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction0(getReport))
      __obj.asInstanceOf[ProcessCpuUsage]
    }
    
    @scala.inline
    implicit class ProcessCpuUsageMutableBuilder[Self <: ProcessCpuUsage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetReport(value: () => ProcessCpuUsageReport): Self = StObject.set(x, "getReport", js.Any.fromFunction0(value))
    }
  }
  
  /** Provides data about the CPU usage of the process. */
  @js.native
  trait ProcessCpuUsageReport extends StObject {
    
    /** Gets the amount of CPU kernel time consumed by the process. */
    var kernelTime: Double = js.native
    
    /** Gets the amount of CPU user time consumed by the process. */
    var userTime: Double = js.native
  }
  object ProcessCpuUsageReport {
    
    @scala.inline
    def apply(kernelTime: Double, userTime: Double): ProcessCpuUsageReport = {
      val __obj = js.Dynamic.literal(kernelTime = kernelTime.asInstanceOf[js.Any], userTime = userTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessCpuUsageReport]
    }
    
    @scala.inline
    implicit class ProcessCpuUsageReportMutableBuilder[Self <: ProcessCpuUsageReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKernelTime(value: Double): Self = StObject.set(x, "kernelTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserTime(value: Double): Self = StObject.set(x, "userTime", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
  @js.native
  trait ProcessDiagnosticInfo extends StObject {
    
    /** Gets the CPU time used by the process. */
    var cpuUsage: ProcessCpuUsage = js.native
    
    /** Gets the disk I/O usage of the process. */
    var diskUsage: ProcessDiskUsage = js.native
    
    /** Gets the name of the executable file for the process. */
    var executableFileName: String = js.native
    
    /** Get memory usage data for the process. */
    var memoryUsage: ProcessMemoryUsage = js.native
    
    /** Gets the ProcessDiagnosticInfo for the parent process. */
    var parent: ProcessDiagnosticInfo = js.native
    
    /** Gets the unique process ID. */
    var processId: Double = js.native
    
    /** Gets the time the process was started. */
    var processStartTime: js.Date = js.native
  }
  object ProcessDiagnosticInfo {
    
    @scala.inline
    def apply(
      cpuUsage: ProcessCpuUsage,
      diskUsage: ProcessDiskUsage,
      executableFileName: String,
      memoryUsage: ProcessMemoryUsage,
      parent: ProcessDiagnosticInfo,
      processId: Double,
      processStartTime: js.Date
    ): ProcessDiagnosticInfo = {
      val __obj = js.Dynamic.literal(cpuUsage = cpuUsage.asInstanceOf[js.Any], diskUsage = diskUsage.asInstanceOf[js.Any], executableFileName = executableFileName.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], processStartTime = processStartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessDiagnosticInfo]
    }
    
    @scala.inline
    implicit class ProcessDiagnosticInfoMutableBuilder[Self <: ProcessDiagnosticInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpuUsage(value: ProcessCpuUsage): Self = StObject.set(x, "cpuUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskUsage(value: ProcessDiskUsage): Self = StObject.set(x, "diskUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutableFileName(value: String): Self = StObject.set(x, "executableFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryUsage(value: ProcessMemoryUsage): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: ProcessDiagnosticInfo): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessStartTime(value: js.Date): Self = StObject.set(x, "processStartTime", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides access to data about the disk usage of a process. */
  @js.native
  trait ProcessDiskUsage extends StObject {
    
    /**
      * Gets the ProcessDiskUsageReport for the process.
      * @return The ProcessDiskUsageReport for the process.
      */
    def getReport(): ProcessDiskUsageReport = js.native
  }
  object ProcessDiskUsage {
    
    @scala.inline
    def apply(getReport: () => ProcessDiskUsageReport): ProcessDiskUsage = {
      val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction0(getReport))
      __obj.asInstanceOf[ProcessDiskUsage]
    }
    
    @scala.inline
    implicit class ProcessDiskUsageMutableBuilder[Self <: ProcessDiskUsage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetReport(value: () => ProcessDiskUsageReport): Self = StObject.set(x, "getReport", js.Any.fromFunction0(value))
    }
  }
  
  /** Provides data about the disk usage of the process. */
  @js.native
  trait ProcessDiskUsageReport extends StObject {
    
    /** Gets the number of bytes the process has read from disk. */
    var bytesReadCount: Double = js.native
    
    /** Gets the number of bytes the process has written to disk. */
    var bytesWrittenCount: Double = js.native
    
    /** Gets the number of bytes used by the process in disk operations that were not read or write operations. */
    var otherBytesCount: Double = js.native
    
    /** Gets the number of disk operations performed by the process that were not read or write operations. */
    var otherOperationCount: Double = js.native
    
    /** Gets the number of disk read operations performed by the process. */
    var readOperationCount: Double = js.native
    
    /** Gets the number of disk write operations performed by the process. */
    var writeOperationCount: Double = js.native
  }
  object ProcessDiskUsageReport {
    
    @scala.inline
    def apply(
      bytesReadCount: Double,
      bytesWrittenCount: Double,
      otherBytesCount: Double,
      otherOperationCount: Double,
      readOperationCount: Double,
      writeOperationCount: Double
    ): ProcessDiskUsageReport = {
      val __obj = js.Dynamic.literal(bytesReadCount = bytesReadCount.asInstanceOf[js.Any], bytesWrittenCount = bytesWrittenCount.asInstanceOf[js.Any], otherBytesCount = otherBytesCount.asInstanceOf[js.Any], otherOperationCount = otherOperationCount.asInstanceOf[js.Any], readOperationCount = readOperationCount.asInstanceOf[js.Any], writeOperationCount = writeOperationCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessDiskUsageReport]
    }
    
    @scala.inline
    implicit class ProcessDiskUsageReportMutableBuilder[Self <: ProcessDiskUsageReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesReadCount(value: Double): Self = StObject.set(x, "bytesReadCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesWrittenCount(value: Double): Self = StObject.set(x, "bytesWrittenCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherBytesCount(value: Double): Self = StObject.set(x, "otherBytesCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherOperationCount(value: Double): Self = StObject.set(x, "otherOperationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOperationCount(value: Double): Self = StObject.set(x, "readOperationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteOperationCount(value: Double): Self = StObject.set(x, "writeOperationCount", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides access to data about the memory usage of a process. */
  @js.native
  trait ProcessMemoryUsage extends StObject {
    
    /**
      * Gets the ProcessMemoryUsageReport for the process.
      * @return The ProcessMemoryUsageReport for the process.
      */
    def getReport(): ProcessMemoryUsageReport = js.native
  }
  object ProcessMemoryUsage {
    
    @scala.inline
    def apply(getReport: () => ProcessMemoryUsageReport): ProcessMemoryUsage = {
      val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction0(getReport))
      __obj.asInstanceOf[ProcessMemoryUsage]
    }
    
    @scala.inline
    implicit class ProcessMemoryUsageMutableBuilder[Self <: ProcessMemoryUsage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetReport(value: () => ProcessMemoryUsageReport): Self = StObject.set(x, "getReport", js.Any.fromFunction0(value))
    }
  }
  
  /** Provides data about the memory usage of the process. */
  @js.native
  trait ProcessMemoryUsageReport extends StObject {
    
    /** Gets the amount of non-paged memory available to the process, in bytes. */
    var nonPagedPoolSizeInBytes: Double = js.native
    
    /** Gets the number of memory page faults. */
    var pageFaultCount: Double = js.native
    
    /** Gets the size of the memory page file in bytes. */
    var pageFileSizeInBytes: Double = js.native
    
    /** Gets the amount of paged memory available to the process, in bytes. */
    var pagedPoolSizeInBytes: Double = js.native
    
    /** Gets the maximum amount of non-paged memory used by the process, in bytes. */
    var peakNonPagedPoolSizeInBytes: Double = js.native
    
    /** Gets the maximum size of the memory page file used by the process, in bytes. */
    var peakPageFileSizeInBytes: Double = js.native
    
    /** Gets the maximum amount of paged memory used by the process, in bytes. */
    var peakPagedPoolSizeInBytes: Double = js.native
    
    /** Gets the maximum amount of virtual memory used by the associated process. */
    var peakVirtualMemorySizeInBytes: Double = js.native
    
    /** Gets the maximum amount of physical memory used by the associated process. */
    var peakWorkingSetSizeInBytes: Double = js.native
    
    /** Gets the number of private memory pages allocated for the associated process. */
    var privatePageCount: Double = js.native
    
    /** Gets the amount of the virtual memory allocated for the associated process. */
    var virtualMemorySizeInBytes: Double = js.native
    
    /** Gets the amount of physical memory allocated for the associated process. */
    var workingSetSizeInBytes: Double = js.native
  }
  object ProcessMemoryUsageReport {
    
    @scala.inline
    def apply(
      nonPagedPoolSizeInBytes: Double,
      pageFaultCount: Double,
      pageFileSizeInBytes: Double,
      pagedPoolSizeInBytes: Double,
      peakNonPagedPoolSizeInBytes: Double,
      peakPageFileSizeInBytes: Double,
      peakPagedPoolSizeInBytes: Double,
      peakVirtualMemorySizeInBytes: Double,
      peakWorkingSetSizeInBytes: Double,
      privatePageCount: Double,
      virtualMemorySizeInBytes: Double,
      workingSetSizeInBytes: Double
    ): ProcessMemoryUsageReport = {
      val __obj = js.Dynamic.literal(nonPagedPoolSizeInBytes = nonPagedPoolSizeInBytes.asInstanceOf[js.Any], pageFaultCount = pageFaultCount.asInstanceOf[js.Any], pageFileSizeInBytes = pageFileSizeInBytes.asInstanceOf[js.Any], pagedPoolSizeInBytes = pagedPoolSizeInBytes.asInstanceOf[js.Any], peakNonPagedPoolSizeInBytes = peakNonPagedPoolSizeInBytes.asInstanceOf[js.Any], peakPageFileSizeInBytes = peakPageFileSizeInBytes.asInstanceOf[js.Any], peakPagedPoolSizeInBytes = peakPagedPoolSizeInBytes.asInstanceOf[js.Any], peakVirtualMemorySizeInBytes = peakVirtualMemorySizeInBytes.asInstanceOf[js.Any], peakWorkingSetSizeInBytes = peakWorkingSetSizeInBytes.asInstanceOf[js.Any], privatePageCount = privatePageCount.asInstanceOf[js.Any], virtualMemorySizeInBytes = virtualMemorySizeInBytes.asInstanceOf[js.Any], workingSetSizeInBytes = workingSetSizeInBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessMemoryUsageReport]
    }
    
    @scala.inline
    implicit class ProcessMemoryUsageReportMutableBuilder[Self <: ProcessMemoryUsageReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonPagedPoolSizeInBytes(value: Double): Self = StObject.set(x, "nonPagedPoolSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageFaultCount(value: Double): Self = StObject.set(x, "pageFaultCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageFileSizeInBytes(value: Double): Self = StObject.set(x, "pageFileSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagedPoolSizeInBytes(value: Double): Self = StObject.set(x, "pagedPoolSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakNonPagedPoolSizeInBytes(value: Double): Self = StObject.set(x, "peakNonPagedPoolSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakPageFileSizeInBytes(value: Double): Self = StObject.set(x, "peakPageFileSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakPagedPoolSizeInBytes(value: Double): Self = StObject.set(x, "peakPagedPoolSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakVirtualMemorySizeInBytes(value: Double): Self = StObject.set(x, "peakVirtualMemorySizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakWorkingSetSizeInBytes(value: Double): Self = StObject.set(x, "peakWorkingSetSizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivatePageCount(value: Double): Self = StObject.set(x, "privatePageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualMemorySizeInBytes(value: Double): Self = StObject.set(x, "virtualMemorySizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkingSetSizeInBytes(value: Double): Self = StObject.set(x, "workingSetSizeInBytes", value.asInstanceOf[js.Any])
    }
  }
}
