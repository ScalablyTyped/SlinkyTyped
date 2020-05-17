package typingsSlinky.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the disk usage of the process. */
@js.native
trait ProcessDiskUsageReport extends js.Object {
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
  implicit class ProcessDiskUsageReportOps[Self <: ProcessDiskUsageReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesReadCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesReadCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesWrittenCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesWrittenCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherBytesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherBytesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherOperationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherOperationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOperationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOperationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteOperationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeOperationCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

