package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing gateways array. */
@js.native
trait GatewayList extends js.Object {
  /** Array of configured gateway connections. */
  var gateways: js.UndefOr[js.Array[Gateway]] = js.native
}

object GatewayList {
  @scala.inline
  def apply(): GatewayList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayList]
  }
  @scala.inline
  implicit class GatewayListOps[Self <: GatewayList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGateways(value: js.Array[Gateway]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGateways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateways")(js.undefined)
        ret
    }
  }
  
}

