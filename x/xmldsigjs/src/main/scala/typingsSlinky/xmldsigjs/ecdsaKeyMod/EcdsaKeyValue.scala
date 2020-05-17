package typingsSlinky.xmldsigjs.ecdsaKeyMod

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "EcdsaKeyValue")
@js.native
class EcdsaKeyValue () extends KeyInfoClause {
  var DomainParameters: typingsSlinky.xmldsigjs.ecdsaKeyMod.DomainParameters = js.native
  var PublicKey: EcdsaPublicKey = js.native
  var jwk: JsonWebKey | Null = js.native
  var key: CryptoKey | Null = js.native
  var keyUsage: js.Array[String] | Null = js.native
  var name: String = js.native
  /**
    * Gets the NamedCurve value of then public key
    */
  def NamedCurve: String = js.native
}

