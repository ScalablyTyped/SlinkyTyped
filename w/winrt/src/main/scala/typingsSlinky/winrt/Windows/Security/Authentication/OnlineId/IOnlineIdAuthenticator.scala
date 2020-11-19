package typingsSlinky.winrt.Windows.Security.Authentication.OnlineId

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOnlineIdAuthenticator extends js.Object {
  
  var applicationId: String = js.native
  
  def authenticateUserAsync(requests: IIterable[OnlineIdServiceTicketRequest], credentialPromptType: CredentialPromptType): UserAuthenticationOperation = js.native
  def authenticateUserAsync(request: OnlineIdServiceTicketRequest): UserAuthenticationOperation = js.native
  
  var authenticatedSafeCustomerId: String = js.native
  
  var canSignOut: Boolean = js.native
  
  def signOutUserAsync(): SignOutUserOperation = js.native
}
