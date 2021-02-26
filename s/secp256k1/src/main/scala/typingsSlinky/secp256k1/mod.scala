package typingsSlinky.secp256k1

import typingsSlinky.secp256k1.anon.Recid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secp256k1", "ecdh")
  @js.native
  def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("secp256k1", "ecdh")
  @js.native
  def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, opt: ecdhOptions): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "ecdsaRecover")
  @js.native
  def ecdsaRecover(signature: js.typedarray.Uint8Array, recid: Double, message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("secp256k1", "ecdsaRecover")
  @js.native
  def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    message: js.typedarray.Uint8Array,
    compressed: Boolean
  ): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "ecdsaSign")
  @js.native
  def ecdsaSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): Recid = js.native
  @JSImport("secp256k1", "ecdsaSign")
  @js.native
  def ecdsaSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, options: SignOptions): Recid = js.native
  
  @JSImport("secp256k1", "ecdsaVerify")
  @js.native
  def ecdsaVerify(
    signature: js.typedarray.Uint8Array,
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): Boolean = js.native
  
  @JSImport("secp256k1", "privateKeyExport")
  @js.native
  def privateKeyExport(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("secp256k1", "privateKeyExport")
  @js.native
  def privateKeyExport(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyImport")
  @js.native
  def privateKeyImport(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyModInverse")
  @js.native
  def privateKeyModInverse(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyNegate")
  @js.native
  def privateKeyNegate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyTweakAdd")
  @js.native
  def privateKeyTweakAdd(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyTweakMul")
  @js.native
  def privateKeyTweakMul(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "privateKeyVerify")
  @js.native
  def privateKeyVerify(privateKey: js.typedarray.Uint8Array): Boolean = js.native
  
  @JSImport("secp256k1", "publicKeyCombine")
  @js.native
  def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyCombine")
  @js.native
  def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array], compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyTweakMul")
  @js.native
  def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("secp256k1", "publicKeyTweakMul")
  @js.native
  def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "publicKeyVerify")
  @js.native
  def publicKeyVerify(publicKey: js.typedarray.Uint8Array): Boolean = js.native
  
  @JSImport("secp256k1", "signatureExport")
  @js.native
  def signatureExport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "signatureImport")
  @js.native
  def signatureImport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("secp256k1", "signatureNormalize")
  @js.native
  def signatureNormalize(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @js.native
  trait SignOptions extends StObject {
    
    /**
      * Additional data for noncefn (RFC 6979 3.6) (32 bytes).
      *
      * By default is `null`.
      */
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /** Nonce generator. By default it is rfc6979 */
    var noncefn: js.UndefOr[
        js.Function5[
          /* message */ js.typedarray.Uint8Array, 
          /* privateKey */ js.typedarray.Uint8Array, 
          /* algo */ js.typedarray.Uint8Array | Null, 
          /* data */ js.typedarray.Uint8Array | Null, 
          /* attempt */ Double, 
          js.typedarray.Uint8Array
        ]
      ] = js.native
  }
  object SignOptions {
    
    @scala.inline
    def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit class SignOptionsMutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setNoncefn(
        value: (/* message */ js.typedarray.Uint8Array, /* privateKey */ js.typedarray.Uint8Array, /* algo */ js.typedarray.Uint8Array | Null, /* data */ js.typedarray.Uint8Array | Null, /* attempt */ Double) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "noncefn", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNoncefnUndefined: Self = StObject.set(x, "noncefn", js.undefined)
    }
  }
  
  @js.native
  trait ecdhOptions extends StObject {
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    var hashfn: js.UndefOr[
        js.Function3[
          /* x */ js.typedarray.Uint8Array, 
          /* y */ js.typedarray.Uint8Array, 
          /* data */ js.typedarray.Uint8Array, 
          js.typedarray.Uint8Array
        ]
      ] = js.native
    
    var xbuf: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    var ybuf: js.UndefOr[js.typedarray.Uint8Array] = js.native
  }
  object ecdhOptions {
    
    @scala.inline
    def apply(): ecdhOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ecdhOptions]
    }
    
    @scala.inline
    implicit class ecdhOptionsMutableBuilder[Self <: ecdhOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHashfn(
        value: (/* x */ js.typedarray.Uint8Array, /* y */ js.typedarray.Uint8Array, /* data */ js.typedarray.Uint8Array) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "hashfn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHashfnUndefined: Self = StObject.set(x, "hashfn", js.undefined)
      
      @scala.inline
      def setXbuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "xbuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXbufUndefined: Self = StObject.set(x, "xbuf", js.undefined)
      
      @scala.inline
      def setYbuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ybuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYbufUndefined: Self = StObject.set(x, "ybuf", js.undefined)
    }
  }
}
