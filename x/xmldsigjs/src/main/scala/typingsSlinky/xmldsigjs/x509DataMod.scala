package typingsSlinky.xmldsigjs

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.EcKeyImportParams
import org.scalajs.dom.crypto.RsaHashedImportParams
import typingsSlinky.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import typingsSlinky.xmldsigjs.pkiMod.X509Certificate
import typingsSlinky.xmldsigjs.xmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object x509DataMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/x509_data", "KeyInfoX509Data")
  @js.native
  class KeyInfoX509Data () extends KeyInfoClause {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: js.typedarray.Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
    
    /**
      * Adds the specified X.509v3 certificate to the KeyInfoX509Data.
      * @param  {X509Certificate} certificate
      * @returns void
      */
    def AddCertificate(certificate: X509Certificate): Unit = js.native
    
    var AddCertificatesChainFrom: js.Any = js.native
    
    /**
      * Adds the specified issuer name and serial number pair to the KeyInfoX509Data object.
      * @param  {string} issuerName
      * @param  {string} serialNumber
      * @returns void
      */
    def AddIssuerSerial(issuerName: String, serialNumber: String): Unit = js.native
    
    /**
      * Adds the specified subject key identifier (SKI) to the KeyInfoX509Data object.
      * @param  {string | Uint8Array} subjectKeyId
      * @returns void
      */
    def AddSubjectKeyId(subjectKeyId: String): Unit = js.native
    def AddSubjectKeyId(subjectKeyId: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Adds the subject name of the entity that was issued an X.509v3 certificate to the KeyInfoX509Data object.
      * @param  {string} subjectName
      * @returns void
      */
    def AddSubjectName(subjectName: String): Unit = js.native
    
    /**
      * Gets or sets the Certificate Revocation List (CRL) contained within the KeyInfoX509Data object.
      */
    def CRL: js.typedarray.Uint8Array | Null = js.native
    def CRL_=(value: js.typedarray.Uint8Array | Null): Unit = js.native
    
    /**
      * Gets a list of the X.509v3 certificates contained in the KeyInfoX509Data object.
      */
    def Certificates: js.Array[X509Certificate] = js.native
    
    var IssuerSerialList: js.Any = js.native
    
    /**
      * Gets a list of X509IssuerSerial structures that represent an issuer name and serial number pair.
      */
    def IssuerSerials: js.Array[IX509IssuerSerial] = js.native
    
    /**
      * Gets public key of the X509Data
      */
    @JSName("Key")
    def Key_MKeyInfoX509Data: CryptoKey | Null = js.native
    
    var SubjectKeyIdList: js.Any = js.native
    
    /**
      * Gets a list of the subject key identifiers (SKIs) contained in the KeyInfoX509Data object.
      */
    def SubjectKeyIds: js.Array[js.typedarray.Uint8Array] = js.native
    
    var SubjectNameList: js.Any = js.native
    
    /**
      * Gets a list of the subject names of the entities contained in the KeyInfoX509Data object.
      */
    def SubjectNames: js.Array[String] = js.native
    
    var X509CertificateList: js.Any = js.native
    
    def exportKey(alg: EcKeyImportParams): js.Promise[_] = js.native
    /**
      * Exports key from X509Data object
      * @param  {Algorithm} alg
      * @returns Promise
      */
    def exportKey(alg: RsaHashedImportParams): js.Promise[_] = js.native
    
    var key: js.Any = js.native
    
    var x509crl: js.Any = js.native
  }
  
  @js.native
  sealed trait X509IncludeOption extends StObject
  @JSImport("xmldsigjs/build/types/xml/key_infos/x509_data", "X509IncludeOption")
  @js.native
  object X509IncludeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[X509IncludeOption with Double] = js.native
    
    @js.native
    sealed trait EndCertOnly extends X509IncludeOption
    /* 1 */ val EndCertOnly: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.EndCertOnly with Double = js.native
    
    @js.native
    sealed trait ExcludeRoot extends X509IncludeOption
    /* 2 */ val ExcludeRoot: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.ExcludeRoot with Double = js.native
    
    @js.native
    sealed trait None extends X509IncludeOption
    /* 0 */ val None: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.None with Double = js.native
    
    @js.native
    sealed trait WholeChain extends X509IncludeOption
    /* 3 */ val WholeChain: typingsSlinky.xmldsigjs.x509DataMod.X509IncludeOption.WholeChain with Double = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/x509_data", "X509IssuerSerial")
  @js.native
  class X509IssuerSerial () extends XmlSignatureObject {
    def this(properties: js.Object) = this()
    
    var X509IssuerName: String = js.native
    
    var X509SerialNumber: String = js.native
  }
  
  @js.native
  trait IX509IssuerSerial extends StObject {
    
    var issuerName: String = js.native
    
    var serialNumber: String = js.native
  }
  object IX509IssuerSerial {
    
    @scala.inline
    def apply(issuerName: String, serialNumber: String): IX509IssuerSerial = {
      val __obj = js.Dynamic.literal(issuerName = issuerName.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[IX509IssuerSerial]
    }
    
    @scala.inline
    implicit class IX509IssuerSerialMutableBuilder[Self <: IX509IssuerSerial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssuerName(value: String): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    }
  }
}
