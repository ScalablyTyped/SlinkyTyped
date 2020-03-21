package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.anyMod.Any
import typingsSlinky.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typingsSlinky.xmlCore.mod.XmlCollection
import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signer_role", JSImport.Namespace)
@js.native
object signerRoleMod extends js.Object {
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
    var CertifiedRoles: typingsSlinky.xadesjs.signerRoleMod.CertifiedRoles = js.native
    var ClaimedRoles: typingsSlinky.xadesjs.signerRoleMod.ClaimedRoles = js.native
  }
  
}

