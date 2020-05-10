package typingsSlinky.sipJs.referContextMod.ReferServerContext

import typingsSlinky.sipJs.libSessionMod.InviteClientContext.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptOptions extends js.Object {
  /** If true, accept REFER request and automatically attempt to follow it. */
  var followRefer: js.UndefOr[Boolean] = js.native
  /** If followRefer is true, options to following INVITE request. */
  var inviteOptions: js.UndefOr[Options] = js.native
}

object AcceptOptions {
  @scala.inline
  def apply(): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptOptions]
  }
  @scala.inline
  implicit class AcceptOptionsOps[Self <: AcceptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowRefer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRefer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowRefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followRefer")(js.undefined)
        ret
    }
    @scala.inline
    def withInviteOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteOptions")(js.undefined)
        ret
    }
  }
  
}

