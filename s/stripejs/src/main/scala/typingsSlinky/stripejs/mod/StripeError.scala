package typingsSlinky.stripejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeError extends js.Object {
  /**
    * For card errors, the ID of the failed charge
    */
  var charge: js.UndefOr[String] = js.native
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported
    */
  var code: js.UndefOr[String] = js.native
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for the decline if they provide one
    */
  var decline_code: js.UndefOr[String] = js.native
  /**
    * A URL to more information about the error code reported
    */
  var doc_url: js.UndefOr[String] = js.native
  /**
    * A human-readable message providing more details about the error.
    * NOTE: For card errors, these messages can be shown to your users
    */
  var message: js.UndefOr[String] = js.native
  /**
    * If the error is parameter-specific, the parameter related to the error
    */
  var param: js.UndefOr[String] = js.native
  /**
    * The type of error that has occurred
    */
  var `type`: errorType = js.native
}

object StripeError {
  @scala.inline
  def apply(`type`: errorType): StripeError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeError]
  }
  @scala.inline
  implicit class StripeErrorOps[Self <: StripeError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: errorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withDecline_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decline_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecline_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decline_code")(js.undefined)
        ret
    }
    @scala.inline
    def withDoc_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_url")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(js.undefined)
        ret
    }
  }
  
}

