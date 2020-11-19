package typingsSlinky.waitOn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.waitOn.anon.Password
  - typingsSlinky.waitOn.anon.Pass
*/
trait WaitOnAuth extends js.Object
object WaitOnAuth {
  
  @scala.inline
  def Password(password: String, username: String): WaitOnAuth = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitOnAuth]
  }
  
  @scala.inline
  def Pass(pass: String, user: String): WaitOnAuth = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitOnAuth]
  }
}
