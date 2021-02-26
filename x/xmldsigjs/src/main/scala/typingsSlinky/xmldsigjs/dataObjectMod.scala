package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.xmlObjectMod.XmlSignatureCollection
import typingsSlinky.xmldsigjs.xmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataObjectMod {
  
  @JSImport("xmldsigjs/build/types/xml/data_object", "DataObject")
  @js.native
  class DataObject () extends XmlSignatureObject {
    def this(properties: js.Object) = this()
    
    var Encoding: String = js.native
    
    var Id: String = js.native
    
    var MimeType: String = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/data_object", "DataObjects")
  @js.native
  class DataObjects () extends XmlSignatureCollection[DataObject] {
    def this(properties: js.Object) = this()
  }
}
