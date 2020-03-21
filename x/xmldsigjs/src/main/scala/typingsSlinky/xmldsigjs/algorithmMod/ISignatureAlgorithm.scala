package typingsSlinky.xmldsigjs.algorithmMod

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignatureAlgorithm extends IAlgorithm {
  def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: scala.scalajs.js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
  def Verify(
    signedInfo: String,
    key: CryptoKey,
    signatureValue: scala.scalajs.js.typedarray.Uint8Array,
    algorithm: Algorithm
  ): js.Promise[Boolean] = js.native
}

