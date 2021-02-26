package typingsSlinky.xmldsigjs

import typingsSlinky.xmlCore.mod.XmlCollection
import typingsSlinky.xmlCore.mod.XmlObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlObjectMod {
  
  @JSImport("xmldsigjs/build/types/xml/xml_object", "XmlSignatureCollection")
  @js.native
  abstract class XmlSignatureCollection[I /* <: XmlSignatureObject */] () extends XmlCollection[I] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/xml_object", "XmlSignatureObject")
  @js.native
  abstract class XmlSignatureObject () extends XmlObject {
    def this(properties: js.Object) = this()
  }
}
