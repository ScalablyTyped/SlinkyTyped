package typingsSlinky.xmldsigjs.mod

import org.scalajs.dom.crypto.Algorithm
import typingsSlinky.std.AlgorithmIdentifier
import typingsSlinky.xmldsigjs.algorithmMod.HashAlgorithm
import typingsSlinky.xmldsigjs.algorithmMod.IHashAlgorithm
import typingsSlinky.xmldsigjs.algorithmMod.ISignatureAlgorithm
import typingsSlinky.xmldsigjs.algorithmMod.SignatureAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
class CryptoConfig ()
  extends typingsSlinky.xmldsigjs.cryptoConfigMod.CryptoConfig

/* static members */
@JSImport("xmldsigjs", "CryptoConfig")
@js.native
object CryptoConfig extends js.Object {
  def CreateFromName(): typingsSlinky.xmldsigjs.xmlMod.Transform = js.native
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
  def CreateFromName(name: String): typingsSlinky.xmldsigjs.xmlMod.Transform = js.native
  def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
  def CreateSignatureAlgorithm(method: typingsSlinky.xmldsigjs.signatureMethodMod.SignatureMethod): SignatureAlgorithm = js.native
  def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
  def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
}

