package typingsSlinky.simpleOauth2.mod

import typingsSlinky.simpleOauth2.anon.AuthorizeURL
import typingsSlinky.simpleOauth2.anon.Create
import typingsSlinky.simpleOauth2.anon.GetToken
import typingsSlinky.simpleOauth2.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthClient[ClientIdName /* <: String */] extends js.Object {
  var accessToken: Create
  var authorizationCode: AuthorizeURL[ClientIdName]
  var clientCredentials: `0`
  var ownerPassword: GetToken
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
}

