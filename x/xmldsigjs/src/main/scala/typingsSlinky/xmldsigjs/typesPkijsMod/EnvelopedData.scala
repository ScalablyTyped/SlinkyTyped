package typingsSlinky.xmldsigjs.typesPkijsMod

import org.scalajs.dom.crypto.Algorithm
import typingsSlinky.xmldsigjs.Anon_HmacHashAlgorithm
import typingsSlinky.xmldsigjs.Anon_KdfAlgorithm
import typingsSlinky.xmldsigjs.Anon_RecipientCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "EnvelopedData")
@js.native
class EnvelopedData () extends js.Object {
  def this(params: js.Any) = this()
  var encryptedContentInfo: EncryptedContentInfo = js.native
  var originatorInfo: js.UndefOr[OriginatorInfo] = js.native
  var recipientInfos: js.Array[RecipientInfo] = js.native
  var unprotectedAttrs: js.UndefOr[js.Array[Attribute]] = js.native
  var version: Double = js.native
  /**
    * Helpers function for filling "RecipientInfo" based on recipient's certificate.
    * Problem with WebCrypto is that for RSA certificates we have only one option - "key transport" and
    * for ECC certificates we also have one option - "key agreement". As soon as Google will implement
    * DH algorithm it would be possible to use "key agreement" also for RSA certificates.
    * @param {Certificate} [certificate] Recipient's certificate
    * @param {*} [parameters] Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} [variant] Variant = 1 is for "key transport", variant = 2 is for "key agreement". In fact the "variant" is unneccessary now because Google has no DH algorithm implementation. Thus key encryption scheme would be choosen by certificate type only: "key transport" for RSA and "key agreement" for ECC certificates.
    */
  def addRecipientByCertificate(certificate: Certificate, parameters: Anon_KdfAlgorithm, variant: Double): Boolean = js.native
  /**
    * Add recipient based on pre-defined data like password or KEK
    * @param {ArrayBuffer} preDefinedData ArrayBuffer with pre-defined data
    * @param {*} parameters Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} variant Variant = 1 for pre-defined "key encryption key" (KEK). Variant = 2 for password-based encryption.
    */
  def addRecipientByPreDefinedData(
    preDefinedData: scala.scalajs.js.typedarray.ArrayBuffer,
    parameters: Anon_HmacHashAlgorithm,
    variant: Double
  ): Boolean = js.native
  /**
    * Decrypt existing CMS Enveloped Data content
    * @param {number} recipientIndex Index of recipient
    * @param {*} parameters Additional parameters
    * @returns {Promise}
    */
  def decrypt(recipientIndex: Double, parameters: Anon_RecipientCertificate): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Create a new CMS Enveloped Data content with encrypted data
    * @param {Algorithm} contentEncryptionAlgorithm WebCrypto algorithm. For the moment here could be only "AES-CBC" or "AES-GCM" algorithms.
    * @param {ArrayBuffer} contentToEncrypt Content to encrypt
    * @returns {Promise}
    */
  def encrypt(contentEncryptionAlgorithm: Algorithm, contentToEncrypt: scala.scalajs.js.typedarray.ArrayBuffer): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "EnvelopedData")
@js.native
object EnvelopedData extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

