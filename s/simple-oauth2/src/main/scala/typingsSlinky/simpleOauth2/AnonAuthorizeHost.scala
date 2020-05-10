package typingsSlinky.simpleOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthorizeHost extends js.Object {
  /** String used to set the host to request an "authorization code". Default to the value set on auth.tokenHost. */
  var authorizeHost: js.UndefOr[String] = js.native
  /** String path to request an authorization code. Default to /oauth/authorize. */
  var authorizePath: js.UndefOr[String] = js.native
  /** String path to revoke an access token. Default to /oauth/revoke. */
  var revokePath: js.UndefOr[String] = js.native
  /** String used to set the host to request the tokens to. Required. */
  var tokenHost: String = js.native
  /** String path to request an access token. Default to /oauth/token. */
  var tokenPath: js.UndefOr[String] = js.native
}

object AnonAuthorizeHost {
  @scala.inline
  def apply(tokenHost: String): AnonAuthorizeHost = {
    val __obj = js.Dynamic.literal(tokenHost = tokenHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizeHost]
  }
  @scala.inline
  implicit class AnonAuthorizeHostOps[Self <: AnonAuthorizeHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokenHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizeHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizeHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizeHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizeHost")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizePath")(js.undefined)
        ret
    }
    @scala.inline
    def withRevokePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevokePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokePath")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenPath")(js.undefined)
        ret
    }
  }
  
}

