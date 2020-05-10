package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object describing a specific gateway. */
@js.native
trait Gateway extends js.Object {
  /** The gateway ID of the gateway. */
  var gateway_id: js.UndefOr[String] = js.native
  /** The user defined name of the gateway. */
  var name: js.UndefOr[String] = js.native
  /** The current status of the gateway. `connected` means the gateway is connected to the remotly installed gateway. `idle` means this gateway is not currently in use. */
  var status: js.UndefOr[String] = js.native
  /** The generated **token** for this gateway. The value of this field is used when configuring the remotly installed gateway. */
  var token: js.UndefOr[String] = js.native
  /** The generated **token_id** for this gateway. The value of this field is used when configuring the remotly installed gateway. */
  var token_id: js.UndefOr[String] = js.native
}

object Gateway {
  @scala.inline
  def apply(): Gateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gateway]
  }
  @scala.inline
  implicit class GatewayOps[Self <: Gateway] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id")(js.undefined)
        ret
    }
  }
  
}

