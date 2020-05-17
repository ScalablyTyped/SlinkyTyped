package typingsSlinky.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents process memory usage at a single point in time. */
@js.native
trait ProcessMemoryReport extends js.Object {
  /** Gets the process' private working set usage. */
  var privateWorkingSetUsage: Double = js.native
  /** Gets the process' total working set usage. */
  var totalWorkingSetUsage: Double = js.native
}

object ProcessMemoryReport {
  @scala.inline
  def apply(privateWorkingSetUsage: Double, totalWorkingSetUsage: Double): ProcessMemoryReport = {
    val __obj = js.Dynamic.literal(privateWorkingSetUsage = privateWorkingSetUsage.asInstanceOf[js.Any], totalWorkingSetUsage = totalWorkingSetUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMemoryReport]
  }
  @scala.inline
  implicit class ProcessMemoryReportOps[Self <: ProcessMemoryReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivateWorkingSetUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateWorkingSetUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalWorkingSetUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalWorkingSetUsage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

