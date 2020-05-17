package typingsSlinky.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
@js.native
trait ProcessDiagnosticInfo extends js.Object {
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
  implicit class ProcessDiagnosticInfoOps[Self <: ProcessDiagnosticInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuUsage(value: ProcessCpuUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskUsage(value: ProcessDiskUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutableFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoryUsage(value: ProcessMemoryUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ProcessDiagnosticInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processStartTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

