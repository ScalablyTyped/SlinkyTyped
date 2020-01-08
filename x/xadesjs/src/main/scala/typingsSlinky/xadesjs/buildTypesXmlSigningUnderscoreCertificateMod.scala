package typingsSlinky.xadesjs

import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlCollection
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import typingsSlinky.xmldsigjs.xmldsigjsMod.X509IssuerSerial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signing_certificate", JSImport.Namespace)
@js.native
object buildTypesXmlSigningUnderscoreCertificateMod extends js.Object {
  @js.native
  class Cert () extends XmlObject {
    var CertDigest: DigestAlgAndValueType = js.native
    var IssuerSerial: X509IssuerSerial = js.native
    var Uri: String = js.native
  }
  
  @js.native
  class CertIDList () extends XmlCollection[Cert]
  
  @js.native
  class DigestAlgAndValueType () extends XmlObject {
    var DigestMethod: typingsSlinky.xmldsigjs.xmldsigjsMod.DigestMethod = js.native
    var DigestValue: scala.scalajs.js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  class IssuerSerial ()
    extends typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IssuerSerial
  
  @js.native
  class SigningCertificate () extends XmlCollection[Cert]
  
}

