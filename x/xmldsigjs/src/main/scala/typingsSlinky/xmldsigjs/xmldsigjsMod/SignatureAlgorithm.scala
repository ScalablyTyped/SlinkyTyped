package typingsSlinky.xmldsigjs.xmldsigjsMod

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.xmldsigjs.xmldsigjsMod.IAlgorithm because Already inherited
- typings.xmldsigjs.xmldsigjsMod.ISignatureAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Sign, Verify, Verify */ @JSImport("xmldsigjs", "SignatureAlgorithm")
@js.native
abstract class SignatureAlgorithm () extends XmlAlgorithm {
  /**
    * Sign the given string using the given key
    */
  def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Verify the given signature of the given string using key
    */
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: scala.scalajs.js.typedarray.Uint8Array): js.Thenable[Boolean] = js.native
  def Verify(
    signedInfo: String,
    key: CryptoKey,
    signatureValue: scala.scalajs.js.typedarray.Uint8Array,
    algorithm: Algorithm
  ): js.Thenable[Boolean] = js.native
}

