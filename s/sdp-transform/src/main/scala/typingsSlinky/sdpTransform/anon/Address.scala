package typingsSlinky.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: String = js.native
  var netType: String = js.native
  var sessionId: String | Double = js.native
  var sessionVersion: Double = js.native
  var username: String = js.native
}

object Address {
  @scala.inline
  def apply(
    address: String,
    netType: String,
    sessionId: String | Double,
    sessionVersion: Double,
    username: String
  ): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], netType = netType.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], sessionVersion = sessionVersion.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

