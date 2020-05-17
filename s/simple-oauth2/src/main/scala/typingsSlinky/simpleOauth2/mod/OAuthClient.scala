package typingsSlinky.simpleOauth2.mod

import typingsSlinky.simpleOauth2.anon.AuthorizeURL
import typingsSlinky.simpleOauth2.anon.Create
import typingsSlinky.simpleOauth2.anon.GetToken
import typingsSlinky.simpleOauth2.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthClient[ClientIdName /* <: String */] extends js.Object {
  var accessToken: Create = js.native
  var authorizationCode: AuthorizeURL[ClientIdName] = js.native
  var clientCredentials: `0` = js.native
  var ownerPassword: GetToken = js.native
}

object OAuthClient {
  @scala.inline
  def apply[ClientIdName](
    accessToken: Create,
    authorizationCode: AuthorizeURL[ClientIdName],
    clientCredentials: `0`,
    ownerPassword: GetToken
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
    def withAccessToken(value: Create): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizationCode(value: AuthorizeURL[ClientIdName]): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientCredentials(value: `0`): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerPassword(value: GetToken): Self[ClientIdName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

