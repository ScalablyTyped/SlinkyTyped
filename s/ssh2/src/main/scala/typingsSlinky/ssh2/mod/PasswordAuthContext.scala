package typingsSlinky.ssh2.mod

import typingsSlinky.ssh2.ssh2Strings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordAuthContext
  extends AuthContextBase
     with AuthContext {
  
  /** The method of authentication. */
  @JSName("method")
  var method_PasswordAuthContext: password = js.native
  
  /** The password sent by the client. */
  var password: String = js.native
}
