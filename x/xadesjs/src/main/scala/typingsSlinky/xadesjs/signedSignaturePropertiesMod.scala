package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.dateTimeMod.XadesDateTime
import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signedSignaturePropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/signed_signature_properties", "SignedSignatureProperties")
  @js.native
  class SignedSignatureProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignaturePolicyIdentifier: typingsSlinky.xadesjs.signaturePolicyIdentifierMod.SignaturePolicyIdentifier = js.native
    
    var SignatureProductionPlace: typingsSlinky.xadesjs.signatureProductPlaceMod.SignatureProductionPlace = js.native
    
    var SignerRole: typingsSlinky.xadesjs.signerRoleMod.SignerRole = js.native
    
    var SigningCertificate: typingsSlinky.xadesjs.signingCertificateMod.SigningCertificate = js.native
    
    var SigningCertificateV2: typingsSlinky.xadesjs.signingCertificateV2Mod.SigningCertificateV2 = js.native
    
    var SigningTime: XadesDateTime = js.native
  }
}
