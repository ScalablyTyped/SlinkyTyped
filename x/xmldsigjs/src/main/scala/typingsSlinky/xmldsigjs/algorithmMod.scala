package typingsSlinky.xmldsigjs

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.raw.Node
import typingsSlinky.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithmMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.xmldsigjs.algorithmMod.IAlgorithm because Already inherited
  - typingsSlinky.xmldsigjs.algorithmMod.IHashAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Digest, Digest, Digest */ @JSImport("xmldsigjs/build/types/algorithm", "HashAlgorithm")
  @js.native
  abstract class HashAlgorithm () extends XmlAlgorithm {
    
    def Digest(xml: String): js.Promise[js.typedarray.Uint8Array] = js.native
    def Digest(xml: Node): js.Promise[js.typedarray.Uint8Array] = js.native
    def Digest(xml: BufferSource): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.xmldsigjs.algorithmMod.IAlgorithm because Already inherited
  - typingsSlinky.xmldsigjs.algorithmMod.ISignatureAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Sign, Verify, Verify */ @JSImport("xmldsigjs/build/types/algorithm", "SignatureAlgorithm")
  @js.native
  abstract class SignatureAlgorithm () extends XmlAlgorithm {
    
    /**
      * Sign the given string using the given key
      */
    def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Verify the given signature of the given string using key
      */
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array, algorithm: Algorithm): js.Promise[Boolean] = js.native
  }
  
  @JSImport("xmldsigjs/build/types/algorithm", "XmlAlgorithm")
  @js.native
  abstract class XmlAlgorithm () extends IAlgorithm
  
  type BASE64 = String
  
  @js.native
  trait IAlgorithm extends StObject {
    
    var algorithm: Algorithm = js.native
    
    def getAlgorithmName(): String = js.native
    
    var namespaceURI: String = js.native
  }
  object IAlgorithm {
    
    @scala.inline
    def apply(algorithm: Algorithm, getAlgorithmName: () => String, namespaceURI: String): IAlgorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], getAlgorithmName = js.Any.fromFunction0(getAlgorithmName), namespaceURI = namespaceURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAlgorithm]
    }
    
    @scala.inline
    implicit class IAlgorithmMutableBuilder[Self <: IAlgorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAlgorithmName(value: () => String): Self = StObject.set(x, "getAlgorithmName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IHashAlgorithm extends IAlgorithm {
    
    def Digest(xml: String): js.Promise[js.typedarray.Uint8Array] = js.native
    def Digest(xml: Node): js.Promise[js.typedarray.Uint8Array] = js.native
    def Digest(xml: BufferSource): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  type IHashAlgorithmConstructable = Instantiable0[IHashAlgorithm]
  
  @js.native
  trait ISignatureAlgorithm extends IAlgorithm {
    
    def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array, algorithm: Algorithm): js.Promise[Boolean] = js.native
  }
  
  type ISignatureAlgorithmConstructable = Instantiable0[ISignatureAlgorithm]
}
