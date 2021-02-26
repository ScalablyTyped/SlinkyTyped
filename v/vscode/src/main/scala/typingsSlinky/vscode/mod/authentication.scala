package typingsSlinky.vscode.mod

import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.anon.AuthenticationGetSessionO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authentication {
  
  @JSImport("vscode", "authentication.getSession")
  @js.native
  def getSession(providerId: String, scopes: js.Array[String]): Thenable[js.UndefOr[AuthenticationSession]] = js.native
  @JSImport("vscode", "authentication.getSession")
  @js.native
  def getSession(providerId: String, scopes: js.Array[String], options: AuthenticationGetSessionO): Thenable[AuthenticationSession] = js.native
  @JSImport("vscode", "authentication.getSession")
  @js.native
  def getSession(providerId: String, scopes: js.Array[String], options: AuthenticationGetSessionOptions): Thenable[js.UndefOr[AuthenticationSession]] = js.native
  
  @JSImport("vscode", "authentication.onDidChangeSessions")
  @js.native
  val onDidChangeSessions: Event[AuthenticationSessionsChangeEvent] = js.native
}
