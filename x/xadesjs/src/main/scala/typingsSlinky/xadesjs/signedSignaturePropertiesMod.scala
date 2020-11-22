package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.dateTimeMod.XadesDateTime
import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/signed_signature_properties", JSImport.Namespace)
@js.native
object signedSignaturePropertiesMod extends js.Object {
  
  @js.native
  class SignedSignatureProperties () extends XmlObject {
    
    var Id: String = js.native
    
    var SignaturePolicyIdentifier: typingsSlinky.xadesjs.signaturePolicyIdentifierMod.SignaturePolicyIdentifier = js.native
    
    var SignatureProductionPlace: typingsSlinky.xadesjs.signatureProductPlaceMod.SignatureProductionPlace = js.native
    
    var SignerRole: typingsSlinky.xadesjs.signerRoleMod.SignerRole = js.native
    
    var SigningCertificate: typingsSlinky.xadesjs.signingCertificateMod.SigningCertificate = js.native
    
    var SigningCertificateV2: typingsSlinky.xadesjs.signingCertificateV2Mod.SigningCertificateV2 = js.native
    
    var SigningTime: XadesDateTime = js.native
  }
}
