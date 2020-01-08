package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.buildTypesXmlAnyMod.Any
import typingsSlinky.xadesjs.buildTypesXmlEncapsulatedUnderscorePkiUnderscoreDataMod.EncapsulatedPKIData
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlCollection
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signer_role", JSImport.Namespace)
@js.native
object buildTypesXmlSignerUnderscoreRoleMod extends js.Object {
  @js.native
  class CertifiedRole () extends EncapsulatedPKIData
  
  @js.native
  class CertifiedRoles () extends XmlCollection[CertifiedRole]
  
  @js.native
  class ClaimedRole () extends Any
  
  @js.native
  class ClaimedRoles () extends XmlCollection[ClaimedRole]
  
  @js.native
  class SignerRole () extends XmlObject {
    var CertifiedRoles: typingsSlinky.xadesjs.buildTypesXmlSignerUnderscoreRoleMod.CertifiedRoles = js.native
    var ClaimedRoles: typingsSlinky.xadesjs.buildTypesXmlSignerUnderscoreRoleMod.ClaimedRoles = js.native
  }
  
}

