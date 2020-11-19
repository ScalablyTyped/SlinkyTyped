package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zetapush-js", "Authentication")
@js.native
class Authentication () extends js.Object
/* static members */
@JSImport("zetapush-js", "Authentication")
@js.native
object Authentication extends js.Object {
  
  def create(authData: AbstractAuthData): CredentialsHandshake | TokenHandshake = js.native
  
  def delegating(authData: TokenAuthData): TokenHandshake = js.native
  
  def simple(authData: CredentialsAuthData): CredentialsHandshake = js.native
  
  def weak(authData: TokenAuthData): TokenHandshake = js.native
}
