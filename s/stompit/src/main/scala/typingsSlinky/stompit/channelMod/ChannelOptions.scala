package typingsSlinky.stompit.channelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelOptions extends js.Object {
  var alwaysConnected: js.UndefOr[Boolean] = js.native
  var recoverAfterApplicationError: js.UndefOr[Boolean] = js.native
}

object ChannelOptions {
  @scala.inline
  def apply(): ChannelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelOptions]
  }
  @scala.inline
  implicit class ChannelOptionsOps[Self <: ChannelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysConnected")(js.undefined)
        ret
    }
    @scala.inline
    def withRecoverAfterApplicationError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoverAfterApplicationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoverAfterApplicationError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoverAfterApplicationError")(js.undefined)
        ret
    }
  }
  
}

