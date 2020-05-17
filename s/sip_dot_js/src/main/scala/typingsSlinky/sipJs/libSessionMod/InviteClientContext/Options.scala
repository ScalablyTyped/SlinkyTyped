package typingsSlinky.sipJs.libSessionMod.InviteClientContext

import typingsSlinky.sipJs.anon.FromDisplayName
import typingsSlinky.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Anonymous call if true. */
  var anonymous: js.UndefOr[Boolean] = js.native
  /** Deprecated. */
  var body: js.UndefOr[String] = js.native
  /** Deprecated. */
  var contentType: js.UndefOr[String] = js.native
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /** If true, send INVITE without SDP. */
  var inviteWithoutSdp: js.UndefOr[Boolean] = js.native
  /** Deprecated. */
  var onInfo: js.UndefOr[js.Any] = js.native
  /** Deprecated. */
  var params: js.UndefOr[FromDisplayName] = js.native
  /** Deprecated. */
  var renderbody: js.UndefOr[String] = js.native
  /** Deprecated. */
  var rendertype: js.UndefOr[String] = js.native
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withInviteWithoutSdp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteWithoutSdp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteWithoutSdp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteWithoutSdp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: FromDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderbody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderbody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderbody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderbody")(js.undefined)
        ret
    }
    @scala.inline
    def withRendertype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendertype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendertype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendertype")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionDescriptionHandlerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerOptions")(js.undefined)
        ret
    }
  }
  
}

