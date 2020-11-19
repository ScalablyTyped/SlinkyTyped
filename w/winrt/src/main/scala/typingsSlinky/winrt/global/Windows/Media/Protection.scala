package typingsSlinky.winrt.global.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Media.Protection.RenewalStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Media.Protection")
@js.native
object Protection extends js.Object {
  
  @js.native
  class ComponentLoadFailedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.Protection.ComponentLoadFailedEventArgs
  
  @js.native
  class ComponentRenewal ()
    extends typingsSlinky.winrt.Windows.Media.Protection.ComponentRenewal
  /* static members */
  @js.native
  object ComponentRenewal extends js.Object {
    
    def renewSystemComponentsAsync(information: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalInformation): IAsyncOperationWithProgress[RenewalStatus, Double] = js.native
  }
  
  @js.native
  class MediaProtectionManager ()
    extends typingsSlinky.winrt.Windows.Media.Protection.MediaProtectionManager
  
  @js.native
  class MediaProtectionServiceCompletion ()
    extends typingsSlinky.winrt.Windows.Media.Protection.MediaProtectionServiceCompletion
  
  @js.native
  object RenewalStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.Protection.RenewalStatus with Double] = js.native
    
    /* 3 */ val appComponentsMayNeedUpdating: typingsSlinky.winrt.Windows.Media.Protection.RenewalStatus.appComponentsMayNeedUpdating with Double = js.native
    
    /* 4 */ val noComponentsFound: typingsSlinky.winrt.Windows.Media.Protection.RenewalStatus.noComponentsFound with Double = js.native
    
    /* 0 */ val notStarted: typingsSlinky.winrt.Windows.Media.Protection.RenewalStatus.notStarted with Double = js.native
    
    /* 1 */ val updatesInProgress: typingsSlinky.winrt.Windows.Media.Protection.RenewalStatus.updatesInProgress with Double = js.native
    
    /* 2 */ val userCancelled: typingsSlinky.winrt.Windows.Media.Protection.RenewalStatus.userCancelled with Double = js.native
  }
  
  @js.native
  class RevocationAndRenewalInformation ()
    extends typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalInformation
  
  @js.native
  class RevocationAndRenewalItem ()
    extends typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalItem
  
  @js.native
  object RevocationAndRenewalReasons extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons with Double
      ] = js.native
    
    /* 2 */ val appComponent: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.appComponent with Double = js.native
    
    /* 12 */ val bootDriverVerificationFailed: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.bootDriverVerificationFailed with Double = js.native
    
    /* 8 */ val componentCertificateRevoked: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentCertificateRevoked with Double = js.native
    
    /* 10 */ val componentHighSecurityCertificateRevoked: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentHighSecurityCertificateRevoked with Double = js.native
    
    /* 11 */ val componentLowSecurityCertificateRevoked: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentLowSecurityCertificateRevoked with Double = js.native
    
    /* 6 */ val componentRevoked: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentRevoked with Double = js.native
    
    /* 13 */ val componentSignedWithTestCertificate: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.componentSignedWithTestCertificate with Double = js.native
    
    /* 14 */ val encryptionFailure: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.encryptionFailure with Double = js.native
    
    /* 5 */ val globalRevocationListAbsent: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListAbsent with Double = js.native
    
    /* 3 */ val globalRevocationListLoadFailed: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.globalRevocationListLoadFailed with Double = js.native
    
    /* 7 */ val invalidComponentCertificateExtendedKeyUse: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateExtendedKeyUse with Double = js.native
    
    /* 9 */ val invalidComponentCertificateRoot: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidComponentCertificateRoot with Double = js.native
    
    /* 4 */ val invalidGlobalRevocationListSignature: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.invalidGlobalRevocationListSignature with Double = js.native
    
    /* 1 */ val kernelModeComponentLoad: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.kernelModeComponentLoad with Double = js.native
    
    /* 0 */ val userModeComponentLoad: typingsSlinky.winrt.Windows.Media.Protection.RevocationAndRenewalReasons.userModeComponentLoad with Double = js.native
  }
  
  @js.native
  class ServiceRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Media.Protection.ServiceRequestedEventArgs
}
