package typingsSlinky.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	VoxImplant login options
	*/
@js.native
trait LoginOptions extends js.Object {
  /**
  		*	If set to false Web SDK can be used only for ACD status management
  		*/
  var receiveCalls: js.UndefOr[Boolean] = js.native
  /**
  		*	If set to true user presence will be changed automatically while a call
  		*/
  var serverPresenceControl: js.UndefOr[Boolean] = js.native
}

object LoginOptions {
  @scala.inline
  def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  @scala.inline
  implicit class LoginOptionsOps[Self <: LoginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceiveCalls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiveCalls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveCalls")(js.undefined)
        ret
    }
    @scala.inline
    def withServerPresenceControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPresenceControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerPresenceControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPresenceControl")(js.undefined)
        ret
    }
  }
  
}

