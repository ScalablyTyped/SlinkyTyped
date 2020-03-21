package typingsSlinky.xadesjs

import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/encapsulated_pki_data", JSImport.Namespace)
@js.native
object encapsulatedPkiDataMod extends js.Object {
  @js.native
  class EncapsulatedPKIData () extends XmlObject {
    var Encoding: EncodingType = js.native
    var Id: String = js.native
    var Value: scala.scalajs.js.typedarray.Uint8Array = js.native
  }
  
  trait _EncodingType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.xadesjs.xadesjsStrings.der
    - typingsSlinky.xadesjs.xadesjsStrings.ber
    - typingsSlinky.xadesjs.xadesjsStrings.cer
    - typingsSlinky.xadesjs.xadesjsStrings.per
    - typingsSlinky.xadesjs.xadesjsStrings.xer
    - scala.Null
  */
  type EncodingType = _EncodingType | Null
}

