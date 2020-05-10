package typingsSlinky.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataPlanUsage extends js.Object {
  var lastSyncTime: js.Date = js.native
  var megabytesUsed: Double = js.native
}

object IDataPlanUsage {
  @scala.inline
  def apply(lastSyncTime: js.Date, megabytesUsed: Double): IDataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPlanUsage]
  }
  @scala.inline
  implicit class IDataPlanUsageOps[Self <: IDataPlanUsage] (val x: Self) extends AnyVal {
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

