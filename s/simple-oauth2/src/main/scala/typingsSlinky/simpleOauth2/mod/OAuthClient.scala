package typingsSlinky.simpleOauth2.mod

import typingsSlinky.simpleOauth2.Anon0
import typingsSlinky.simpleOauth2.AnonAuthorizeURL
import typingsSlinky.simpleOauth2.AnonCreate
import typingsSlinky.simpleOauth2.AnonGetToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthClient[ClientIdName /* <: String */] extends js.Object {
  var accessToken: AnonCreate
  var authorizationCode: AnonAuthorizeURL[ClientIdName]
  var clientCredentials: Anon0
  var ownerPassword: AnonGetToken
}

object OAuthClient {
  @scala.inline
  def apply[ClientIdName /* <: String */](
    accessToken: AnonCreate,
    authorizationCode: AnonAuthorizeURL[ClientIdName],
    clientCredentials: Anon0,
    ownerPassword: AnonGetToken
  ): OAuthClient[ClientIdName] = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authorizationCode = authorizationCode.asInstanceOf[js.Any], clientCredentials = clientCredentials.asInstanceOf[js.Any], ownerPassword = ownerPassword.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OAuthClient[ClientIdName]]
  }
}

