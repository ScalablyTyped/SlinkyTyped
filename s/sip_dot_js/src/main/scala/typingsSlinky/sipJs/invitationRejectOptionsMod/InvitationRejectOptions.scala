package typingsSlinky.sipJs.invitationRejectOptionsMod

import typingsSlinky.sipJs.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationRejectOptions extends js.Object {
  /**
    * Body
    */
  var body: js.UndefOr[String | AnonBody] = js.native
  /**
    * Array of extra headers added to the response.
    */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Reason phrase for response.
    */
  var reasonPhrase: js.UndefOr[String] = js.native
  /**
    * Status code for response.
    */
  var statusCode: js.UndefOr[Double] = js.native
}

object InvitationRejectOptions {
  @scala.inline
  def apply(): InvitationRejectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationRejectOptions]
  }
  @scala.inline
  implicit class InvitationRejectOptionsOps[Self <: InvitationRejectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String | AnonBody): Self = {
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

