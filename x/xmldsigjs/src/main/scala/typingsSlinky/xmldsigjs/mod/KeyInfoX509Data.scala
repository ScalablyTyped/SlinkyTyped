package typingsSlinky.xmldsigjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "KeyInfoX509Data")
@js.native
class KeyInfoX509Data ()
  extends typingsSlinky.xmldsigjs.keyInfosMod.KeyInfoX509Data {
  def this(cert: typingsSlinky.xmldsigjs.pkiMod.X509Certificate) = this()
  def this(rgbCert: scala.scalajs.js.typedarray.Uint8Array) = this()
  def this(
    cert: typingsSlinky.xmldsigjs.pkiMod.X509Certificate,
    includeOptions: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption
  ) = this()
}

