package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows an application to launch the email application with a new message displayed. Use this to allow users to send email from your application. */
@JSGlobal("Windows.ApplicationModel.Email.EmailManager")
@js.native
abstract class EmailManager ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailManager
object EmailManager {
  
  /**
    * Gets an email store that is within the specified scope.
    * @param accessType The enumerator of scope.
    * @return The requested email store.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Email.EmailManager.requestStoreAsync")
  @js.native
  def requestStoreAsync(accessType: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailStoreAccessType): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailStore] = js.native
  
  /**
    * Launches the email application with a new message displayed.
    * @param message The email message that is displayed when the email application is launched.
    * @return An asynchronous action.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Email.EmailManager.showComposeNewEmailAsync")
  @js.native
  def showComposeNewEmailAsync(message: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMessage): IPromiseWithIAsyncAction = js.native
}
