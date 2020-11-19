package typingsSlinky.xmlcreate.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmlcreate/lib/options", "StringOptions")
@js.native
class StringOptions protected () extends IStringOptions {
  def this(options: IStringOptions) = this()
  
  @JSName("doubleQuotes")
  var doubleQuotes_StringOptions: Boolean = js.native
  
  @JSName("indent")
  var indent_StringOptions: String = js.native
  
  @JSName("newline")
  var newline_StringOptions: String = js.native
  
  @JSName("pretty")
  var pretty_StringOptions: Boolean = js.native
}
