package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.std.AlgorithmIdentifier
import typingsSlinky.std.RsaPssParams
import typingsSlinky.xmlCore.mod.XmlObject
import typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaKeyMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "MaskGenerationFunction")
  @js.native
  class MaskGenerationFunction () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var Algorithm: String = js.native
    
    var DigestMethod: typingsSlinky.xmldsigjs.digestMethodMod.DigestMethod = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "PssAlgorithmParams")
  @js.native
  class PssAlgorithmParams () extends XmlObject {
    def this(algorithm: RsaPSSSignParams) = this()
    
    var DigestMethod: typingsSlinky.xmldsigjs.digestMethodMod.DigestMethod = js.native
    
    def FromAlgorithm(algorithm: RsaPSSSignParams): Unit = js.native
    
    var MGF: MaskGenerationFunction = js.native
    
    var SaltLength: Double = js.native
    
    var TrailerField: Double = js.native
  }
  /* static members */
  object PssAlgorithmParams {
    
    @JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "PssAlgorithmParams.FromAlgorithm")
    @js.native
    def FromAlgorithm(algorithm: RsaPSSSignParams): PssAlgorithmParams = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "RsaKeyValue")
  @js.native
  class RsaKeyValue () extends KeyInfoClause {
    def this(properties: js.Object) = this()
    
    /**
      * Gets the Exponent of the public key
      */
    var Exponent: js.typedarray.Uint8Array | Null = js.native
    
    /**
      * Gets the Modulus of the public key
      */
    var Modulus: js.typedarray.Uint8Array | Null = js.native
    
    var jwk: JsonWebKey | Null = js.native
    
    var key: CryptoKey | Null = js.native
    
    var keyUsage: js.Array[String] = js.native
  }
  
  @js.native
  trait IJwkRsa extends StObject {
    
    var alg: String = js.native
    
    var e: String = js.native
    
    var ext: Boolean = js.native
    
    var kty: String = js.native
    
    var n: String = js.native
  }
  object IJwkRsa {
    
    @scala.inline
    def apply(alg: String, e: String, ext: Boolean, kty: String, n: String): IJwkRsa = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJwkRsa]
    }
    
    @scala.inline
    implicit class IJwkRsaMutableBuilder[Self <: IJwkRsa] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: Boolean): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RsaPSSSignParams extends RsaPssParams {
    
    var hash: AlgorithmIdentifier = js.native
  }
  object RsaPSSSignParams {
    
    @scala.inline
    def apply(hash: AlgorithmIdentifier, name: String, saltLength: Double): RsaPSSSignParams = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[RsaPSSSignParams]
    }
    
    @scala.inline
    implicit class RsaPSSSignParamsMutableBuilder[Self <: RsaPSSSignParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: AlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashAlgorithm(value: Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
}
