package typingsSlinky.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPlanUsage extends js.Object {
  var lastSyncTime: js.Date
  var megabytesUsed: Double
}

object IDataPlanUsage {
  @scala.inline
  def apply(lastSyncTime: js.Date, megabytesUsed: Double): IDataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDataPlanUsage]
  }
}

