package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.EcKeyImportParams
import org.scalajs.dom.crypto.RsaHashedImportParams
import typingsSlinky.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object x509Mod {
  
  @JSImport("xmldsigjs/build/types/pki/x509", "X509Certificate")
  @js.native
  class X509Certificate () extends StObject {
    def this(rawData: BufferSource) = this()
    
    /**
      * Returns DER raw of X509Certificate
      */
    def GetRaw(): js.typedarray.Uint8Array = js.native
    
    /**
      * Gets a issuer name of the certificate
      */
    def Issuer: String = js.native
    
    /**
      * Loads X509Certificate from DER data
      * @param  {Uint8Array} rawData
      */
    /* protected */ def LoadRaw(rawData: BufferSource): Unit = js.native
    
    /**
      * Converts X500Name to string
      * @param  {RDN} name X500Name
      * @param  {string} splitter Splitter char. Default ','
      * @returns string Formated string
      * Example:
      * > C=Some name, O=Some organization name, C=RU
      */
    /* protected */ def NameToString(name: js.Any): String = js.native
    /* protected */ def NameToString(name: js.Any, splitter: String): String = js.native
    
    /**
      * Gets the public key from the X509Certificate
      */
    def PublicKey: CryptoKey | Null = js.native
    
    /**
      * Gets a serial number of the certificate in BIG INTEGER string format
      */
    def SerialNumber: String = js.native
    
    /**
      * Gets a subject name of the certificate
      */
    def Subject: String = js.native
    
    /**
      * Returns a thumbprint of the certificate
      * @param  {DigestAlgorithm="SHA-1"} algName Digest algorithm name
      * @returns Promise<ArrayBuffer>
      */
    def Thumbprint(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def Thumbprint(algName: DigestAlgorithm): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Returns public key from X509Certificate
      * @param  {Algorithm} algorithm
      * @returns Promise<CryptoKey>
      */
    def exportKey(algorithm: Algorithm): js.Promise[_] = js.native
    def exportKey(algorithm: EcKeyImportParams): js.Promise[_] = js.native
    def exportKey(algorithm: RsaHashedImportParams): js.Promise[_] = js.native
    
    var isHashedAlgorithm: js.Any = js.native
    
    var publicKey: CryptoKey | Null = js.native
    
    var raw: js.typedarray.Uint8Array = js.native
    
    var simpl: js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-1`
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-256`
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-384`
    - typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-512`
  */
  type DigestAlgorithm = _DigestAlgorithm | String
  
  trait _DigestAlgorithm extends StObject
}
