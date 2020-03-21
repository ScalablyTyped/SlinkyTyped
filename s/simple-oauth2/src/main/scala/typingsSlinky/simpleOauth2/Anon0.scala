package typingsSlinky.simpleOauth2

import typingsSlinky.simpleOauth2.mod.ClientCredentialTokenConfig
import typingsSlinky.simpleOauth2.mod.Token
import typingsSlinky.simpleOauth2.mod.WreckHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  /** Returns the Access Token Object */
  def getToken(params: ClientCredentialTokenConfig): js.Promise[Token] = js.native
  def getToken(params: ClientCredentialTokenConfig, httpOptions: WreckHttpOptions): js.Promise[Token] = js.native
}

