package typingsSlinky.xadesjs.xadesjsMod

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.xadesjs.xadesjsMod.xml.QualifyingProperties
import typingsSlinky.xmldsigjs.xmldsigjsMod.X509Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "SignedXml")
@js.native
class SignedXml ()
  extends typingsSlinky.xmldsigjs.xmldsigjsMod.SignedXml {
  def this(node: Document) = this()
  def this(node: Element) = this()
  val Properties: QualifyingProperties | Null = js.native
  val SignedProperties: typingsSlinky.xadesjs.xadesjsMod.xml.SignedProperties = js.native
  val UnsignedProperties: typingsSlinky.xadesjs.xadesjsMod.xml.UnsignedProperties = js.native
  var properties: QualifyingProperties | Null = js.native
  /* protected */ def ApplySignOptions(
    signature: typingsSlinky.xmldsigjs.xmldsigjsMod.Signature,
    algorithm: Algorithm,
    key: CryptoKey,
    options: OptionsXAdES
  ): js.Promise[Unit] = js.native
  /* protected */ def ApplySignaturePolicyIdentifier(): Unit = js.native
  /* protected */ def ApplySignaturePolicyIdentifier(options: OptionsPolicyId): Unit = js.native
  /* protected */ def ApplySignatureProductionPlace(): Unit = js.native
  /* protected */ def ApplySignatureProductionPlace(options: OptionsProductionPlace): Unit = js.native
  /* protected */ def ApplySignerRoles(): Unit = js.native
  /* protected */ def ApplySignerRoles(options: OptionsSignerRole): Unit = js.native
  /* protected */ def ApplySigningCertificate(): js.Promise[Unit] = js.native
  /* protected */ def ApplySigningCertificate(base64string: String): js.Promise[Unit] = js.native
  /* protected */ def CreateQualyingProperties(): Unit = js.native
  def Sign(algorithm: Algorithm, key: CryptoKey, data: Document, options: OptionsXAdES): js.Thenable[typingsSlinky.xmldsigjs.xmldsigjsMod.Signature] = js.native
  /* protected */ def VerifySigningCertificate(): js.Promise[X509Certificate | Null] = js.native
}

