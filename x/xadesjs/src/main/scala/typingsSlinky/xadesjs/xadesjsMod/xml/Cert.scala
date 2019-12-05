package typingsSlinky.xadesjs.xadesjsMod.xml

import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import typingsSlinky.xmldsigjs.xmldsigjsMod.X509IssuerSerial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "xml.Cert")
@js.native
class Cert () extends XmlObject {
  var CertDigest: DigestAlgAndValueType = js.native
  var IssuerSerial: X509IssuerSerial = js.native
  var Uri: String = js.native
}

