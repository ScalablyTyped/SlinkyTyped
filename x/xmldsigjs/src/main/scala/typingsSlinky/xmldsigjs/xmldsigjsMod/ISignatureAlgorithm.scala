package typingsSlinky.xmldsigjs.xmldsigjsMod

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignatureAlgorithm extends IAlgorithm {
  def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: scala.scalajs.js.typedarray.Uint8Array): js.Thenable[Boolean] = js.native
  def Verify(
    signedInfo: String,
    key: CryptoKey,
    signatureValue: scala.scalajs.js.typedarray.Uint8Array,
    algorithm: Algorithm
  ): js.Thenable[Boolean] = js.native
}

