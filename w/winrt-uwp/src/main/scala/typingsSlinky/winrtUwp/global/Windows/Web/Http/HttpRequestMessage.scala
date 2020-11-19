package typingsSlinky.winrtUwp.global.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an HTTP request message including headers. */
@JSGlobal("Windows.Web.Http.HttpRequestMessage")
@js.native
/** Initializes a new instance of the HttpRequestMessage class. */
class HttpRequestMessage ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.HttpRequestMessage {
  /**
    * Initializes a new instance of the HttpRequestMessage class with an HTTP method and a request Uri .
    * @param method The HTTP method to perform
    * @param uri The Uri to request.
    */
  def this(method: typingsSlinky.winrtUwp.Windows.Web.Http.HttpMethod, uri: Uri) = this()
}
