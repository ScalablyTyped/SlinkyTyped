package typingsSlinky.winrt.Windows.Security.Authentication.Web

import typingsSlinky.winrt.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebAuthenticationBrokerStatics extends js.Object {
  def authenticateAndContinue(requestUri: Uri): Unit = js.native
  def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = js.native
  def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = js.native
  def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
  def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
  def getCurrentApplicationCallbackUri(): Uri = js.native
}

