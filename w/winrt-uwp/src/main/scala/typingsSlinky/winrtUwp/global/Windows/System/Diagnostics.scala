package typingsSlinky.winrtUwp.global.Windows.System

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides diagnostic information about the system and running processes. */
@JSGlobal("Windows.System.Diagnostics")
@js.native
object Diagnostics extends js.Object {
  /** Provides access to data about the CPU usage of a process. */
  @js.native
  abstract class ProcessCpuUsage ()
    extends typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsage
  
  /** Provides data about the CPU usage of the process. */
  @js.native
  abstract class ProcessCpuUsageReport ()
    extends typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsageReport
  
  /** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
  @js.native
  abstract class ProcessDiagnosticInfo ()
    extends typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo
  
  /** Provides access to data about the disk usage of a process. */
  @js.native
  abstract class ProcessDiskUsage ()
    extends typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsage
  
  /** Provides data about the disk usage of the process. */
  @js.native
  abstract class ProcessDiskUsageReport ()
    extends typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsageReport
  
  /** Provides access to data about the memory usage of a process. */
  @js.native
  abstract class ProcessMemoryUsage ()
    extends typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsage
  
  /** Provides data about the memory usage of the process. */
  @js.native
  abstract class ProcessMemoryUsageReport ()
    extends typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsageReport
  
  /* static members */
  @js.native
  object ProcessDiagnosticInfo extends js.Object {
    /**
      * Gets the ProcessDiagnosticInfo for the currently running process.
      * @return The ProcessDiagnosticInfo for the currently running process.
      */
    def getForCurrentProcess(): typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo = js.native
    /**
      * Gets a list of ProcessDiagnosticInfo objects for all running processes.
      * @return A list of ProcessDiagnosticInfo objects for all running processes.
      */
    def getForProcesses(): IVectorView[typingsSlinky.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo] = js.native
  }
  
}

