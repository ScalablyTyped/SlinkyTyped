package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.buildTypesXmlEncapsulatedUnderscorePkiUnderscoreDataMod.EncapsulatedPKIData
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlCollection
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/revocation_values", JSImport.Namespace)
@js.native
object buildTypesXmlRevocationUnderscoreValuesMod extends js.Object {
  @js.native
  class CRLValues () extends XmlCollection[EncapsulatedCRLValue]
  
  @js.native
  class EncapsulatedCRLValue () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedOCSPValue () extends EncapsulatedPKIData
  
  @js.native
  class OCSPValues () extends XmlCollection[EncapsulatedOCSPValue]
  
  @js.native
  class OtherValue () extends EncapsulatedPKIData
  
  @js.native
  class OtherValues () extends XmlCollection[OtherValue]
  
  @js.native
  class RevocationValues () extends XmlObject {
    var CRLValues: typingsSlinky.xadesjs.buildTypesXmlRevocationUnderscoreValuesMod.CRLValues = js.native
    var Id: String = js.native
    var OCSPValues: typingsSlinky.xadesjs.buildTypesXmlRevocationUnderscoreValuesMod.OCSPValues = js.native
    var OtherValues: typingsSlinky.xadesjs.buildTypesXmlRevocationUnderscoreValuesMod.OtherValues = js.native
  }
  
}

