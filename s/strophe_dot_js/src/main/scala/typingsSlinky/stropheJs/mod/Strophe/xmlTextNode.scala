package typingsSlinky.stropheJs.mod.Strophe

import org.scalajs.dom.raw.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strophe.js", "Strophe.xmlTextNode")
@js.native
object xmlTextNode extends js.Object {
  
  /** Function: xmlTextNode
    *  Creates an XML DOM text node.
    *
    *  Provides a cross implementation version of document.createTextNode.
    *
    *  Parameters:
    *    (String) text - The content of the text node.
    *
    *  Returns:
    *    A new XML DOM text node.
    */
  def apply(text: String): Text = js.native
}
