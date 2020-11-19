package typingsSlinky.xmldom.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMParser extends js.Object {
  
  def parseFromString(xmlsource: String): Document = js.native
  def parseFromString(xmlsource: String, mimeType: String): Document = js.native
}
@JSImport("xmldom", "DOMParser")
@js.native
object DOMParser extends TopLevel[DOMParserStatic]
