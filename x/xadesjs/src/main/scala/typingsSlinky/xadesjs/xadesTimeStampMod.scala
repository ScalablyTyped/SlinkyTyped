package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.genericTimeStampMod.EncapsulatedTimeStampCollection
import typingsSlinky.xadesjs.genericTimeStampMod.XMLTimeStampCollection
import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/xades_time_stamp", JSImport.Namespace)
@js.native
object xadesTimeStampMod extends js.Object {
  
  @js.native
  class XAdESTimeStamp () extends XmlObject {
    
    var CanonicalizationMethod: typingsSlinky.xmldsigjs.mod.CanonicalizationMethod = js.native
    
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    
    var Id: String = js.native
    
    var Include: typingsSlinky.xadesjs.genericTimeStampMod.Include = js.native
    
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
}
