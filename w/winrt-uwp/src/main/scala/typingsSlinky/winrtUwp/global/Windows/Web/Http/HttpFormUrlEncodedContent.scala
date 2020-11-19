package typingsSlinky.winrtUwp.global.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses name/value data encoded with the application/x-www-form-urlencoded MIME type. */
@JSGlobal("Windows.Web.Http.HttpFormUrlEncodedContent")
@js.native
class HttpFormUrlEncodedContent protected ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.HttpFormUrlEncodedContent {
  /**
    * Initializes a new instance of the HttpFormUrlEncodedContent class with the specified content.
    * @param content The content used to initialize the HttpFormUrlEncodedContent .
    */
  def this(content: IIterable[IKeyValuePair[_, _]]) = this()
}
