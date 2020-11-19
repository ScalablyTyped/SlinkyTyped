package typingsSlinky.xmldoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldoc", "XmlTextNode")
@js.native
class XmlTextNode protected () extends XmlNode {
  def this(text: String) = this()
  
  var text: String = js.native
  
  def toString(opts: XmlOptions): String = js.native
  
  def toStringWithIndent(indent: String): String = js.native
  def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
  
  var `type`: typingsSlinky.xmldoc.xmldocStrings.text = js.native
}
