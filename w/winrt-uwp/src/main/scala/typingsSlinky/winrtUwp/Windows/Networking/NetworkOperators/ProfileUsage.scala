package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to update the usage of plan data. */
@js.native
trait ProfileUsage extends js.Object {
  /** The last time UsageInMegabytes was updated. */
  var lastSyncTime: js.Date = js.native
  /** Updates the usage in megabytes. */
  var usageInMegabytes: Double = js.native
}

object ProfileUsage {
  @scala.inline
  def apply(lastSyncTime: js.Date, usageInMegabytes: Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], usageInMegabytes = usageInMegabytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileUsage]
  }
  @scala.inline
  implicit class ProfileUsageOps[Self <: ProfileUsage] (val x: Self) extends AnyVal {
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
    def withUsageInMegabytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageInMegabytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

