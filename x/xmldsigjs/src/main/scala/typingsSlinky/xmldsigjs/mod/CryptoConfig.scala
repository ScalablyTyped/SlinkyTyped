package typingsSlinky.xmldsigjs.mod

import org.scalajs.dom.crypto.Algorithm
import typingsSlinky.std.AlgorithmIdentifier
import typingsSlinky.xmldsigjs.algorithmMod.HashAlgorithm
import typingsSlinky.xmldsigjs.algorithmMod.IHashAlgorithm
import typingsSlinky.xmldsigjs.algorithmMod.ISignatureAlgorithm
import typingsSlinky.xmldsigjs.algorithmMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
class CryptoConfig ()
  extends typingsSlinky.xmldsigjs.cryptoConfigMod.CryptoConfig
/* static members */
object CryptoConfig {
  
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
  @JSImport("xmldsigjs", "CryptoConfig.CreateFromName")
  @js.native
  def CreateFromName(): typingsSlinky.xmldsigjs.xmlMod.Transform = js.native
  @JSImport("xmldsigjs", "CryptoConfig.CreateFromName")
  @js.native
  def CreateFromName(name: String): typingsSlinky.xmldsigjs.xmlMod.Transform = js.native
  
  @JSImport("xmldsigjs", "CryptoConfig.CreateHashAlgorithm")
  @js.native
  def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
  
  @JSImport("xmldsigjs", "CryptoConfig.CreateSignatureAlgorithm")
  @js.native
  def CreateSignatureAlgorithm(method: typingsSlinky.xmldsigjs.signatureMethodMod.SignatureMethod): SignatureAlgorithm = js.native
  
  @JSImport("xmldsigjs", "CryptoConfig.GetHashAlgorithm")
  @js.native
  def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
  
  @JSImport("xmldsigjs", "CryptoConfig.GetSignatureAlgorithm")
  @js.native
  def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
}
