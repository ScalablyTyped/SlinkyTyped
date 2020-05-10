package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailablePhoneNumberInstance extends js.Object {
  var local: AvailablePhoneNumberResourceGroup = js.native
  var mobile: AvailablePhoneNumberResourceGroup = js.native
  var tollFree: AvailablePhoneNumberResourceGroup = js.native
}

object AvailablePhoneNumberInstance {
  @scala.inline
  def apply(
    local: AvailablePhoneNumberResourceGroup,
    mobile: AvailablePhoneNumberResourceGroup,
    tollFree: AvailablePhoneNumberResourceGroup
  ): AvailablePhoneNumberInstance = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], tollFree = tollFree.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailablePhoneNumberInstance]
  }
  @scala.inline
  implicit class AvailablePhoneNumberInstanceOps[Self <: AvailablePhoneNumberInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocal(value: AvailablePhoneNumberResourceGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: AvailablePhoneNumberResourceGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTollFree(value: AvailablePhoneNumberResourceGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tollFree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

