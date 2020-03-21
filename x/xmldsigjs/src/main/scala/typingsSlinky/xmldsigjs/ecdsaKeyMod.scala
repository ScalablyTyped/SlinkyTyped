package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.xmlCore.mod.XmlObject
import typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", JSImport.Namespace)
@js.native
object ecdsaKeyMod extends js.Object {
  @js.native
  class DomainParameters () extends XmlObject {
    var NamedCurve: typingsSlinky.xmldsigjs.ecdsaKeyMod.NamedCurve = js.native
  }
  
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
    def NamedCurve(): String = js.native
  }
  
  @js.native
  class EcdsaPublicKey () extends XmlObject {
    var X: scala.scalajs.js.typedarray.Uint8Array = js.native
    var Y: scala.scalajs.js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  class NamedCurve () extends XmlObject {
    var Uri: String = js.native
  }
  
  trait _NamedCurveType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-256`
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-384`
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-521`
  */
  type NamedCurveType = _NamedCurveType | String
}

