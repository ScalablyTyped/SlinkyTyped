package typingsSlinky.xmldsigjs.xmldsigjsMod

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "X509Certificate")
@js.native
class X509Certificate () extends js.Object {
  def this(rawData: BufferSource) = this()
  /**
    * Gets a issuer name of the certificate
    */
  val Issuer: String = js.native
  /**
    * Gets the public key from the X509Certificate
    */
  val PublicKey: CryptoKey | Null = js.native
  /**
    * Gets a serial number of the certificate in HEX format
    */
  val SerialNumber: String = js.native
  /**
    * Gets a subject name of the certificate
    */
  val Subject: String = js.native
  var publicKey: CryptoKey | Null = js.native
  var raw: scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * Returns DER raw of X509Certificate
    */
  def GetRaw(): scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * Loads X509Certificate from DER data
    * @param  {Uint8Array} rawData
    */
  /* protected */ def LoadRaw(rawData: BufferSource): Unit = js.native
  /**
    * Returns a thumbprint of the certificate
    * @param  {DigestAlgorithm="SHA-1"} algName Digest algorithm name
    * @returns PromiseLike
    */
  def Thumbprint(): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def Thumbprint(algName: DigestAlgorithm): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Returns public key from X509Certificate
    * @param  {Algorithm} algorithm
    * @returns Promise
    */
  def exportKey(algorithm: Algorithm): js.Promise[CryptoKey] = js.native
}

