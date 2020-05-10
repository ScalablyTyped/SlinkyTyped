package typingsSlinky.stripejs.tokenMod

import typingsSlinky.stripejs.mod.StripeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenResult extends js.Object {
  /**
    * There was an error. This includes client-side validation errors.
    */
  var error: js.UndefOr[StripeError] = js.native
  /**
    * The generated string that can be used for communication with the backend
    */
  var token: js.UndefOr[Token] = js.native
}

object TokenResult {
  @scala.inline
  def apply(): TokenResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenResult]
  }
  @scala.inline
  implicit class TokenResultOps[Self <: TokenResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: StripeError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

