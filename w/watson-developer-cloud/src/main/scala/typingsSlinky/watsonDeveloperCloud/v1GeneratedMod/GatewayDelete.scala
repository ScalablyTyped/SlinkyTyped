package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gatway deletion confirmation. */
@js.native
trait GatewayDelete extends js.Object {
  /** The gateway ID of the deleted gateway. */
  var gateway_id: js.UndefOr[String] = js.native
  /** The status of the request. */
  var status: js.UndefOr[String] = js.native
}

object GatewayDelete {
  @scala.inline
  def apply(): GatewayDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayDelete]
  }
  @scala.inline
  implicit class GatewayDeleteOps[Self <: GatewayDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGateway_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGateway_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway_id")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

