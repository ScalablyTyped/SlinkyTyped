package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encapsulatedPkiDataMod {
  
  @JSImport("xadesjs/build/types/xml/encapsulated_pki_data", "EncapsulatedPKIData")
  @js.native
  class EncapsulatedPKIData () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Encoding: EncodingType = js.native
    
    var Id: String = js.native
    
    var Value: js.typedarray.Uint8Array = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.xadesjs.xadesjsStrings.der
    - typingsSlinky.xadesjs.xadesjsStrings.ber
    - typingsSlinky.xadesjs.xadesjsStrings.cer
    - typingsSlinky.xadesjs.xadesjsStrings.per
    - typingsSlinky.xadesjs.xadesjsStrings.xer
    - scala.Null
  */
  type EncodingType = _EncodingType | Null
  
  trait _EncodingType extends StObject
}
