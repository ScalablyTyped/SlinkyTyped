package typingsSlinky.simpleOauth2.mod

import typingsSlinky.simpleOauth2.Anon0
import typingsSlinky.simpleOauth2.AnonAuthorizeURL
import typingsSlinky.simpleOauth2.AnonCreate
import typingsSlinky.simpleOauth2.AnonGetToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthClient[ClientIdName /* <: String */] extends js.Object {
  var accessToken: AnonCreate = js.native
  var authorizationCode: AnonAuthorizeURL[ClientIdName] = js.native
  var clientCredentials: Anon0 = js.native
  var ownerPassword: AnonGetToken = js.native
}

object OAuthClient {
  @scala.inline
  def apply[ClientIdName](
    accessToken: AnonCreate,
    authorizationCode: AnonAuthorizeURL[ClientIdName],
    clientCredentials: Anon0,
    ownerPassword: AnonGetToken
  ): OAuthClient[ClientIdName] = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authorizationCode = authorizationCode.asInstanceOf[js.Any], clientCredentials = clientCredentials.asInstanceOf[js.Any], ownerPassword = ownerPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthClient[ClientIdName]]
  }
  @scala.inline
  implicit class OAuthClientOps[Self[clientidname] <: OAuthClient[clientidname], ClientIdName] (val x: Self[ClientIdName]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ClientIdName] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ClientIdName]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ClientIdName] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ClientIdName] with Other]
    @scala.inline
    def withAccessToken(value: AnonCreate): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizationCode(value: AnonAuthorizeURL[ClientIdName]): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientCredentials(value: Anon0): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerPassword(value: AnonGetToken): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

