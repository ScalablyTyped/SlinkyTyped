package typingsSlinky.xadesjs

import typingsSlinky.xadesjs.signingCertificateMod.DigestAlgAndValueType
import typingsSlinky.xmlCore.mod.XmlCollection
import typingsSlinky.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/signing_certificate_v2", JSImport.Namespace)
@js.native
object signingCertificateV2Mod extends js.Object {
  
  @js.native
  class CertIDListV2 () extends XmlCollection[CertV2]
  
  @js.native
  class CertV2 () extends XmlObject {
    
    var CertDigest: DigestAlgAndValueType = js.native
    
    var IssuerSerial: js.typedarray.Uint8Array = js.native
    
    var Uri: String = js.native
  }
  
  @js.native
  class SigningCertificateV2 () extends XmlCollection[CertV2]
}
