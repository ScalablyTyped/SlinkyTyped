package typingsSlinky.winrt.global.Windows.Security.Cryptography

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.ExportOption
import typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.InstallOptions
import typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Security.Cryptography.Certificates")
@js.native
object Certificates extends js.Object {
  
  @js.native
  class CertificateEnrollmentManager ()
    extends typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager
  /* static members */
  @js.native
  object CertificateEnrollmentManager extends js.Object {
    
    def createRequestAsync(
      request: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.CertificateRequestProperties
    ): IAsyncOperation[String] = js.native
    
    def importPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String
    ): IAsyncAction = js.native
    
    def installCertificateAsync(certificate: String, installOption: InstallOptions): IAsyncAction = js.native
  }
  
  @js.native
  class CertificateRequestProperties ()
    extends typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.CertificateRequestProperties
  
  @js.native
  object EnrollKeyUsages extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages with Double
      ] = js.native
    
    /* 4 */ val all: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.all with Double = js.native
    
    /* 1 */ val decryption: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.decryption with Double = js.native
    
    /* 3 */ val keyAgreement: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.keyAgreement with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.none with Double = js.native
    
    /* 2 */ val signing: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.signing with Double = js.native
  }
  
  @js.native
  object ExportOption extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.ExportOption with Double
      ] = js.native
    
    /* 1 */ val exportable: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.ExportOption.exportable with Double = js.native
    
    /* 0 */ val notExportable: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.ExportOption.notExportable with Double = js.native
  }
  
  @js.native
  object InstallOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.InstallOptions with Double
      ] = js.native
    
    /* 1 */ val deleteExpired: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.InstallOptions.deleteExpired with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.InstallOptions.none with Double = js.native
  }
  
  @js.native
  class KeyAlgorithmNames ()
    extends typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeyAlgorithmNames
  /* static members */
  @js.native
  object KeyAlgorithmNames extends js.Object {
    
    var dsa: String = js.native
    
    var ecdh256: String = js.native
    
    var ecdh384: String = js.native
    
    var ecdh521: String = js.native
    
    var ecdsa256: String = js.native
    
    var ecdsa384: String = js.native
    
    var ecdsa521: String = js.native
    
    var rsa: String = js.native
  }
  
  @js.native
  object KeyProtectionLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel with Double
      ] = js.native
    
    /* 1 */ val consentOnly: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentOnly with Double = js.native
    
    /* 2 */ val consentWithPassword: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithPassword with Double = js.native
    
    /* 0 */ val noConsent: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.noConsent with Double = js.native
  }
  
  @js.native
  object KeySize extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeySize with Double
      ] = js.native
    
    /* 0 */ val invalid: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeySize.invalid with Double = js.native
    
    /* 1 */ val rsa2048: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa2048 with Double = js.native
    
    /* 2 */ val rsa4096: typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa4096 with Double = js.native
  }
  
  @js.native
  class KeyStorageProviderNames ()
    extends typingsSlinky.winrt.Windows.Security.Cryptography.Certificates.KeyStorageProviderNames
  /* static members */
  @js.native
  object KeyStorageProviderNames extends js.Object {
    
    var platformKeyStorageProvider: String = js.native
    
    var smartcardKeyStorageProvider: String = js.native
    
    var softwareKeyStorageProvider: String = js.native
  }
}
