package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data plan specific data usage information for a connection. */
@js.native
trait DataPlanUsage extends js.Object {
  /** Gets a DateTime object indicating the date and time when the MegabytesUsed property was last updated. */
  var lastSyncTime: js.Date = js.native
  /** Gets a value indicating the total amount of data transferred, in megabytes, over the connection. */
  var megabytesUsed: Double = js.native
}

object DataPlanUsage {
  @scala.inline
  def apply(lastSyncTime: js.Date, megabytesUsed: Double): DataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPlanUsage]
  }
  @scala.inline
  implicit class DataPlanUsageOps[Self <: DataPlanUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastSyncTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMegabytesUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("megabytesUsed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

