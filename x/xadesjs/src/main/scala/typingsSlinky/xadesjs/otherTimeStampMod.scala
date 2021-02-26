package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.genericTimeStampMod.EncapsulatedTimeStampCollection
import typingsSlinky.xadesjs.genericTimeStampMod.ReferenceInfos
import typingsSlinky.xadesjs.genericTimeStampMod.XMLTimeStampCollection
import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherTimeStampMod {
  
  @JSImport("xadesjs/build/types/xml/other_time_stamp", "OtherTimeStamp")
  @js.native
  class OtherTimeStamp () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CanonicalizationMethod: typingsSlinky.xmldsigjs.mod.CanonicalizationMethod = js.native
    
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    
    var Id: String = js.native
    
    var ReferenceInfo: ReferenceInfos = js.native
    
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
}
