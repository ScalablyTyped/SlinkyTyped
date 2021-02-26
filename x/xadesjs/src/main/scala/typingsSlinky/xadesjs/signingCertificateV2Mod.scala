package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.signingCertificateMod.DigestAlgAndValueType
import typingsSlinky.xadesjs.xmlBaseMod.XadesCollection
import typingsSlinky.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signingCertificateV2Mod {
  
  @JSImport("xadesjs/build/types/xml/signing_certificate_v2", "CertIDListV2")
  @js.native
  class CertIDListV2 () extends XadesCollection[CertV2] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signing_certificate_v2", "CertV2")
  @js.native
  class CertV2 () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CertDigest: DigestAlgAndValueType = js.native
    
    var IssuerSerial: js.typedarray.Uint8Array = js.native
    
    var Uri: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/signing_certificate_v2", "SigningCertificateV2")
  @js.native
  class SigningCertificateV2 () extends CertIDListV2 {
    def this(properties: js.Object) = this()
  }
}
