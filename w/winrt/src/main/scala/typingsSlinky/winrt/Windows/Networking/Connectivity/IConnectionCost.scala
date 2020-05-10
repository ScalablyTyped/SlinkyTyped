package typingsSlinky.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionCost extends js.Object {
  var approachingDataLimit: Boolean = js.native
  var networkCostType: NetworkCostType = js.native
  var overDataLimit: Boolean = js.native
  var roaming: Boolean = js.native
}

object IConnectionCost {
  @scala.inline
  def apply(
    approachingDataLimit: Boolean,
    networkCostType: NetworkCostType,
    overDataLimit: Boolean,
    roaming: Boolean
  ): IConnectionCost = {
    val __obj = js.Dynamic.literal(approachingDataLimit = approachingDataLimit.asInstanceOf[js.Any], networkCostType = networkCostType.asInstanceOf[js.Any], overDataLimit = overDataLimit.asInstanceOf[js.Any], roaming = roaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionCost]
  }
  @scala.inline
  implicit class IConnectionCostOps[Self <: IConnectionCost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproachingDataLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approachingDataLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkCostType(value: NetworkCostType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkCostType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverDataLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overDataLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roaming")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

