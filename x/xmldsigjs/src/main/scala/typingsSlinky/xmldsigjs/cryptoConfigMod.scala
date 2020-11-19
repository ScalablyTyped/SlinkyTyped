package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.Algorithm
import typingsSlinky.std.AlgorithmIdentifier
import typingsSlinky.xmldsigjs.algorithmMod.HashAlgorithm
import typingsSlinky.xmldsigjs.algorithmMod.IHashAlgorithm
import typingsSlinky.xmldsigjs.algorithmMod.ISignatureAlgorithm
import typingsSlinky.xmldsigjs.algorithmMod.SignatureAlgorithm
import typingsSlinky.xmldsigjs.signatureMethodMod.SignatureMethod
import typingsSlinky.xmldsigjs.xmlMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/crypto_config", JSImport.Namespace)
@js.native
object cryptoConfigMod extends js.Object {
  
  @js.native
  class CryptoConfig () extends js.Object
  /* static members */
  @js.native
  object CryptoConfig extends js.Object {
    
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
    def CreateFromName(): Transform = js.native
    def CreateFromName(name: String): Transform = js.native
    
    def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
    
    def CreateSignatureAlgorithm(method: SignatureMethod): SignatureAlgorithm = js.native
    
    def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
    
    def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
  }
}
