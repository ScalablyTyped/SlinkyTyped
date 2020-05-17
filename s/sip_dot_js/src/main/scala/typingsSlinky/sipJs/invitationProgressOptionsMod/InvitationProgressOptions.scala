package typingsSlinky.sipJs.invitationProgressOptionsMod

import typingsSlinky.sipJs.anon.Body
import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationProgressOptions extends js.Object {
  /**
    * Body
    */
  var body: js.UndefOr[String | Body] = js.native
  /**
    * Array of extra headers added to the response.
    */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Reason phrase for response.
    */
  var reasonPhrase: js.UndefOr[String] = js.native
  /**
    * Send reliable response.
    */
  var rel100: js.UndefOr[Boolean] = js.native
  /**
    * Modifiers to pass to SessionDescriptionHandler's getDescription() and setDescription().
    */
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  /**
    * Options to pass to SessionDescriptionHandler's getDescription() and setDescription().
    */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
  /**
    * Status code for response.
    */
  var statusCode: js.UndefOr[Double] = js.native
}

object InvitationProgressOptions {
  @scala.inline
  def apply(): InvitationProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationProgressOptions]
  }
  @scala.inline
  implicit class InvitationProgressOptionsOps[Self <: InvitationProgressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String | Body): Self = {
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
    def withReasonPhrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonPhrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonPhrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonPhrase")(js.undefined)
        ret
    }
    @scala.inline
    def withRel100(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel100")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRel100: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel100")(js.undefined)
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
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

