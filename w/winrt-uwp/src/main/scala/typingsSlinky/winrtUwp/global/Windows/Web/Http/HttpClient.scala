package typingsSlinky.winrtUwp.global.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Web.Http.Filters.IHttpFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sends HTTP requests and receives HTTP responses from a resource identified by a URI. */
@JSGlobal("Windows.Web.Http.HttpClient")
@js.native
/** Initializes a new instance of the HttpClient class. */
class HttpClient ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.HttpClient {
  /**
    * Initializes a new instance of the HttpClient class with a specific filter for handling HTTP response messages.
    * @param filter The HTTP filter to use for handling response messages.
    */
  def this(filter: IHttpFilter) = this()
}
