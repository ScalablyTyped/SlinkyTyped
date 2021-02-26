package typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasRequireEncryptionResult extends StObject
/** Represents the type of encryption required. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult")
@js.native
object EasRequireEncryptionResult extends StObject {
  
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasRequireEncryptionResult
  
  /** This computer is already DeviceProtected. */
  @js.native
  sealed trait compliant extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use FixedDataNotSupported. */
  @js.native
  sealed trait deFixedDataNotSupported extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use HardwareNotCompliant. */
  @js.native
  sealed trait deHardwareNotCompliant extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use OsVolumeNotProtected. */
  @js.native
  sealed trait deOsVolumeNotProtected extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use ProtectionNotYetEnabled. */
  @js.native
  sealed trait deProtectionNotYetEnabled extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use ProtectionSuspended. */
  @js.native
  sealed trait deProtectionSuspended extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use LockNotConfigured. */
  @js.native
  sealed trait deWinReNotConfigured extends EasRequireEncryptionResult
  
  /** This computer cannot support device encryption because unencrypted fixed data volumes are present. */
  @js.native
  sealed trait fixedDataNotSupported extends EasRequireEncryptionResult
  
  /** This computer does not meet the hardware requirements to support device encryption. */
  @js.native
  sealed trait hardwareNotCompliant extends EasRequireEncryptionResult
  
  /** This computer cannot support device encryption because WinRE is not properly configured. */
  @js.native
  sealed trait lockNotConfigured extends EasRequireEncryptionResult
  
  /** This computer does not have a feature license. */
  @js.native
  sealed trait noFeatureLicense extends EasRequireEncryptionResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasRequireEncryptionResult
  
  /** This computer is not provisioned to support device encryption. Enable BitLocker on all volumes to comply with device encryption policy. */
  @js.native
  sealed trait notProvisionedOnAllVolumes extends EasRequireEncryptionResult
  
  /** The operating system drive is not protected by BitLocker drive encryption. */
  @js.native
  sealed trait osNotProtected extends EasRequireEncryptionResult
  
  /** This computer is not provisioned with device encryption. Enable Device encryption on all volumes to comply with device encryption policy if it is supported. */
  @js.native
  sealed trait osVolumeNotProtected extends EasRequireEncryptionResult
  
  /** Protection has not been enabled on the volume. Enabling protection requires a connected account. If you already have a connected account and are seeing this error, refer to the event log for more information. */
  @js.native
  sealed trait protectionNotYetEnabled extends EasRequireEncryptionResult
  
  /** Protection is enabled on this volume but has been suspended. This is most likely due to an update of your computer. Reboot and try again. */
  @js.native
  sealed trait protectionSuspended extends EasRequireEncryptionResult
  
  /** An unexpected failure occurred. */
  @js.native
  sealed trait unexpectedFailure extends EasRequireEncryptionResult
}
