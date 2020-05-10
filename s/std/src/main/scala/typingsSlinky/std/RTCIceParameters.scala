package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceParameters extends js.Object {
  var password: js.UndefOr[java.lang.String] = js.native
  var usernameFragment: js.UndefOr[java.lang.String] = js.native
}

object RTCIceParameters {
  @scala.inline
  def apply(): RTCIceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceParameters]
  }
  @scala.inline
  implicit class RTCIceParametersOps[Self <: RTCIceParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameFragment(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameFragment")(js.undefined)
        ret
    }
  }
  
}

