package typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typingsSlinky.winrtUwp.Windows.Web.Http.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a retrieve cookies operation made by a web account provider. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation")
@js.native
abstract class WebAccountProviderRetrieveCookiesOperation () extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  /** Gets the context of the retrieve cookies operation. */
  var context: Uri = js.native
  /** Gets the cookies. */
  var cookies: IVector[HttpCookie] = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets or sets the Uri to retrieve cookies from. */
  var uri: Uri = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
}

