package typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.xmldsigjs.buildTypesXmlKeyUnderscoreInfosKeyUnderscoreInfoUnderscoreClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "RsaKeyValue")
@js.native
class RsaKeyValue () extends KeyInfoClause {
  /**
    * Gets the Exponent of the public key
    */
  var Exponent: scala.scalajs.js.typedarray.Uint8Array | Null = js.native
  /**
    * Gets the Modulus of the public key
    */
  var Modulus: scala.scalajs.js.typedarray.Uint8Array | Null = js.native
  var jwk: JsonWebKey | Null = js.native
  var key: CryptoKey | Null = js.native
  var keyUsage: js.Array[String] = js.native
}

