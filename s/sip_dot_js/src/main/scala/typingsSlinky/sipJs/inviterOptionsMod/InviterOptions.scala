package typingsSlinky.sipJs.inviterOptionsMod

import typingsSlinky.sipJs.anon.FromDisplayName
import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typingsSlinky.sipJs.sessionOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviterOptions extends SessionOptions {
  /** If true, an anonymous call. */
  var anonymous: js.UndefOr[Boolean] = js.native
  /**
    * If true, the first answer to the local offer is immediately utilized for media.
    * Requires that the INVITE request MUST NOT fork.
    * Has no effect if `inviteWithoutSdp` is true.
    * Default is false.
    */
  var earlyMedia: js.UndefOr[Boolean] = js.native
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /** If true, send INVITE without SDP. Default is false. */
  var inviteWithoutSdp: js.UndefOr[Boolean] = js.native
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[FromDisplayName] = js.native
  /** @deprecated TODO: provide alternative. */
  var renderbody: js.UndefOr[String] = js.native
  /** @deprecated TODO: provide alternative. */
  var rendertype: js.UndefOr[String] = js.native
  /** Modifiers to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
}

object InviterOptions {
  @scala.inline
  def apply(): InviterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviterOptions]
  }
  @scala.inline
  implicit class InviterOptionsOps[Self <: InviterOptions] (val x: Self) extends AnyVal {
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
    def withEarlyMedia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarlyMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyMedia")(js.undefined)
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
    def withSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionDescriptionHandlerModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionDescriptionHandlerModifiers")(js.undefined)
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

