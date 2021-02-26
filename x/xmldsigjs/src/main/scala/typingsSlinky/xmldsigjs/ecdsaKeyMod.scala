package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.xmlCore.mod.XmlObject
import typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecdsaKeyMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "DomainParameters")
  @js.native
  class DomainParameters () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var NamedCurve: typingsSlinky.xmldsigjs.ecdsaKeyMod.NamedCurve = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "EcdsaKeyValue")
  @js.native
  class EcdsaKeyValue () extends KeyInfoClause {
    def this(properties: js.Object) = this()
    
    var DomainParameters: typingsSlinky.xmldsigjs.ecdsaKeyMod.DomainParameters = js.native
    
    /**
      * Gets the NamedCurve value of then public key
      */
    def NamedCurve: String = js.native
    
    var PublicKey: EcdsaPublicKey = js.native
    
    var jwk: JsonWebKey | Null = js.native
    
    var key: CryptoKey | Null = js.native
    
    var keyUsage: js.Array[String] | Null = js.native
    
    var name: String = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "EcdsaPublicKey")
  @js.native
  class EcdsaPublicKey () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var X: js.typedarray.Uint8Array = js.native
    
    var Y: js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "NamedCurve")
  @js.native
  class NamedCurve () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var Uri: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-256`
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-384`
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-521`
  */
  type NamedCurveType = _NamedCurveType | String
  
  trait _NamedCurveType extends StObject
}
