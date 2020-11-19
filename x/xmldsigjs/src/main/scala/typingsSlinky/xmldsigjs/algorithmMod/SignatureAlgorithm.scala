package typingsSlinky.xmldsigjs.algorithmMod

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.xmldsigjs.algorithmMod.IAlgorithm because Already inherited
- typingsSlinky.xmldsigjs.algorithmMod.ISignatureAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Sign, Verify, Verify */ @JSImport("xmldsigjs/build/types/algorithm", "SignatureAlgorithm")
@js.native
abstract class SignatureAlgorithm () extends XmlAlgorithm {
  
  /**
    * Sign the given string using the given key
    */
  def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Verify the given signature of the given string using key
    */
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array, algorithm: Algorithm): js.Promise[Boolean] = js.native
}
