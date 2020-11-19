package typingsSlinky.winrt.global.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Foundation.Uri")
@js.native
class Uri protected ()
  extends typingsSlinky.winrt.Windows.Foundation.Uri {
  def this(uri: String) = this()
  def this(baseUri: String, relativeUri: String) = this()
}
/* static members */
@JSGlobal("Windows.Foundation.Uri")
@js.native
object Uri extends js.Object {
  
  def escapeComponent(toEscape: String): String = js.native
  
  def unescapeComponent(toUnescape: String): String = js.native
}
