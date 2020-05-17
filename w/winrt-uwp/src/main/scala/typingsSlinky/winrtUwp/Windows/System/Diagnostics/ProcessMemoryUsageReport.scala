package typingsSlinky.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the memory usage of the process. */
@js.native
trait ProcessMemoryUsageReport extends js.Object {
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
  implicit class ProcessMemoryUsageReportOps[Self <: ProcessMemoryUsageReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonPagedPoolSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPagedPoolSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageFaultCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFaultCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageFileSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageFileSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagedPoolSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagedPoolSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeakNonPagedPoolSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakNonPagedPoolSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeakPageFileSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakPageFileSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeakPagedPoolSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakPagedPoolSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeakVirtualMemorySizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakVirtualMemorySizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeakWorkingSetSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakWorkingSetSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivatePageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privatePageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualMemorySizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualMemorySizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkingSetSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingSetSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

