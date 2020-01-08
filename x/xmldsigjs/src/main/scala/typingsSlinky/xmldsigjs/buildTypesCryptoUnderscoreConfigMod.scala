package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.Algorithm
import typingsSlinky.std.AlgorithmIdentifier
import typingsSlinky.xmldsigjs.buildTypesAlgorithmMod.HashAlgorithm
import typingsSlinky.xmldsigjs.buildTypesAlgorithmMod.IHashAlgorithm
import typingsSlinky.xmldsigjs.buildTypesAlgorithmMod.ISignatureAlgorithm
import typingsSlinky.xmldsigjs.buildTypesAlgorithmMod.SignatureAlgorithm
import typingsSlinky.xmldsigjs.buildTypesXmlMod.Transform
import typingsSlinky.xmldsigjs.buildTypesXmlSignatureUnderscoreMethodMod.SignatureMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/crypto_config", JSImport.Namespace)
@js.native
object buildTypesCryptoUnderscoreConfigMod extends js.Object {
  @js.native
  class CryptoConfig () extends js.Object
  
  /* static members */
  @js.native
  object CryptoConfig extends js.Object {
    def CreateFromName(): Transform = js.native
    /**
      * Creates Transform from given name
      * if name is not exist then throws error
      *
      * @static
      * @param {(string |)} [name=null]
      * @returns
      *
      * @memberOf CryptoConfig
      */
    def CreateFromName(name: String): Transform = js.native
    def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
    def CreateSignatureAlgorithm(method: SignatureMethod): SignatureAlgorithm = js.native
    def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
    def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
  }
  
}

