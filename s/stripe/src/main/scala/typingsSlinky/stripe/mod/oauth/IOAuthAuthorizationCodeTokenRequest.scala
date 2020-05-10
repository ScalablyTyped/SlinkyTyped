package typingsSlinky.stripe.mod.oauth

import typingsSlinky.stripe.stripeStrings.authorization_code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOAuthAuthorizationCodeTokenRequest extends js.Object {
  /**
    * Check whether the suggested_capabilities were applied to the connected account.
    */
  var assert_capabilities: js.UndefOr[String] = js.native
  /**
    * The value of the code
    */
  var code: String = js.native
  /**
    * authorization_code when turning an authorization code into an access token
    */
  var grant_type: authorization_code = js.native
  /**
    * Has no effect when requesting an access token from an authorization code.
    */
  var scope: js.UndefOr[String] = js.native
}

object IOAuthAuthorizationCodeTokenRequest {
  @scala.inline
  def apply(code: String, grant_type: authorization_code): IOAuthAuthorizationCodeTokenRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthAuthorizationCodeTokenRequest]
  }
  @scala.inline
  implicit class IOAuthAuthorizationCodeTokenRequestOps[Self <: IOAuthAuthorizationCodeTokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrant_type(value: authorization_code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssert_capabilities(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert_capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssert_capabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert_capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

