package typingsSlinky.vscode.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "env")
@js.native
object env extends js.Object {
  
  val appName: String = js.native
  
  val appRoot: String = js.native
  
  def asExternalUri(target: Uri): Thenable[Uri] = js.native
  
  val clipboard: Clipboard = js.native
  
  val language: String = js.native
  
  val machineId: String = js.native
  
  def openExternal(target: Uri): Thenable[Boolean] = js.native
  
  val remoteName: js.UndefOr[String] = js.native
  
  val sessionId: String = js.native
  
  val shell: String = js.native
  
  val uiKind: UIKind = js.native
  
  val uriScheme: String = js.native
}
