package typingsSlinky.winrtUwp.global.Windows.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an app for mail to evaluate and apply the Exchange Active Synchronization (EAS) policies. */
object ExchangeActiveSyncProvisioning {
  
  /** Provides the app the ability to retrieve device information from the local device. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation")
  @js.native
  /** Creates an instance of an object that allows the caller app to retrieve device information from the local device. */
  class EasClientDeviceInformation ()
    extends typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation
  
  /** Modern mail apps evaluate and apply the EAS security policies. An EasClientSecurityPolicy object is constructed by the caller app to set policies received from the Exchange server or application. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy")
  @js.native
  /** Creates an instance of an object that allows the caller app to set policies received from the Exchange server for evaluation or application. */
  class EasClientSecurityPolicy ()
    extends typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy
  
  /** Provides the mail app with the results of the evaluation of the EAS security policies. Every policy being evaluated returns an enumerated value indicating the evaluation results against the policy. The evaluations results are encapsulated in the EasComplianceResults object for the caller app to retrieve. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults")
  @js.native
  abstract class EasComplianceResults ()
    extends typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults
  
  /** Results of whether the logon can occur. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult")
  @js.native
  object EasDisallowConvenienceLogonResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult with Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.canBeCompliant with Double = js.native
    
    /* 1 */ val compliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.compliant with Double = js.native
    
    /* 0 */ val notEvaluated: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.notEvaluated with Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.requestedPolicyIsStricter with Double = js.native
  }
  
  /** Describes the type of Exchange ActiveSync encryption provider. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType")
  @js.native
  object EasEncryptionProviderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType with Double
      ] = js.native
    
    /* 0 */ val notEvaluated: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.notEvaluated with Double = js.native
    
    /* 2 */ val otherEncryption: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.otherEncryption with Double = js.native
    
    /* 1 */ val windowsEncryption: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasEncryptionProviderType.windowsEncryption with Double = js.native
  }
  
  /** Represents the maximum length of time result before locking the computer. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult")
  @js.native
  object EasMaxInactivityTimeLockResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult with Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.canBeCompliant with Double = js.native
    
    /* 1 */ val compliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.compliant with Double = js.native
    
    /* 4 */ val invalidParameter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.invalidParameter with Double = js.native
    
    /* 0 */ val notEvaluated: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.notEvaluated with Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.requestedPolicyIsStricter with Double = js.native
  }
  
  /** Represents the maximum number of password attempts results. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult")
  @js.native
  object EasMaxPasswordFailedAttemptsResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult with Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.canBeCompliant with Double = js.native
    
    /* 1 */ val compliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.compliant with Double = js.native
    
    /* 4 */ val invalidParameter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.invalidParameter with Double = js.native
    
    /* 0 */ val notEvaluated: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.notEvaluated with Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.requestedPolicyIsStricter with Double = js.native
  }
  
  /** Represents the minimum complexity result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult")
  @js.native
  object EasMinPasswordComplexCharactersResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult with Double
      ] = js.native
    
    /* 9 */ val adminsCannotChangePassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsCannotChangePassword with Double = js.native
    
    /* 7 */ val adminsHaveBlankPassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsHaveBlankPassword with Double = js.native
    
    /* 2 */ val canBeCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.canBeCompliant with Double = js.native
    
    /* 13 */ val changeConnectedAdminsPassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedAdminsPassword with Double = js.native
    
    /* 14 */ val changeConnectedUserPassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedUserPassword with Double = js.native
    
    /* 1 */ val compliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.compliant with Double = js.native
    
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
    
    /* 12 */ val connectedUserProviderPolicyIsWeak: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedUserProviderPolicyIsWeak with Double = js.native
    
    /* 6 */ val currentUserHasBlankPassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.currentUserHasBlankPassword with Double = js.native
    
    /* 5 */ val invalidParameter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.invalidParameter with Double = js.native
    
    /* 10 */ val localControlledUsersCannotChangePassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.localControlledUsersCannotChangePassword with Double = js.native
    
    /* 0 */ val notEvaluated: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.notEvaluated with Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyIsStricter with Double = js.native
    
    /* 4 */ val requestedPolicyNotEnforceable: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyNotEnforceable with Double = js.native
    
    /* 8 */ val userCannotChangePassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.userCannotChangePassword with Double = js.native
  }
  
  /** Represents the minimum length result for passwords. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult")
  @js.native
  object EasMinPasswordLengthResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult with Double
      ] = js.native
    
    /* 9 */ val adminsCannotChangePassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsCannotChangePassword with Double = js.native
    
    /* 7 */ val adminsHaveBlankPassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsHaveBlankPassword with Double = js.native
    
    /* 2 */ val canBeCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.canBeCompliant with Double = js.native
    
    /* 13 */ val changeConnectedAdminsPassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedAdminsPassword with Double = js.native
    
    /* 14 */ val changeConnectedUserPassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedUserPassword with Double = js.native
    
    /* 1 */ val compliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.compliant with Double = js.native
    
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
    
    /* 12 */ val connectedUserProviderPolicyIsWeak: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedUserProviderPolicyIsWeak with Double = js.native
    
    /* 6 */ val currentUserHasBlankPassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.currentUserHasBlankPassword with Double = js.native
    
    /* 5 */ val invalidParameter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.invalidParameter with Double = js.native
    
    /* 10 */ val localControlledUsersCannotChangePassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.localControlledUsersCannotChangePassword with Double = js.native
    
    /* 0 */ val notEvaluated: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.notEvaluated with Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyIsStricter with Double = js.native
    
    /* 4 */ val requestedPolicyNotEnforceable: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyNotEnforceable with Double = js.native
    
    /* 8 */ val userCannotChangePassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.userCannotChangePassword with Double = js.native
  }
  
  /** Results of querying on the password expiration information. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult")
  @js.native
  object EasPasswordExpirationResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult with Double
      ] = js.native
    
    /* 7 */ val adminsCannotChangePassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.adminsCannotChangePassword with Double = js.native
    
    /* 2 */ val canBeCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.canBeCompliant with Double = js.native
    
    /* 1 */ val compliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.compliant with Double = js.native
    
    /* 5 */ val invalidParameter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.invalidParameter with Double = js.native
    
    /* 8 */ val localControlledUsersCannotChangePassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.localControlledUsersCannotChangePassword with Double = js.native
    
    /* 0 */ val notEvaluated: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.notEvaluated with Double = js.native
    
    /* 4 */ val requestedExpirationIncompatible: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedExpirationIncompatible with Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedPolicyIsStricter with Double = js.native
    
    /* 6 */ val userCannotChangePassword: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.userCannotChangePassword with Double = js.native
  }
  
  /** Represents the password history. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult")
  @js.native
  object EasPasswordHistoryResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult with Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.canBeCompliant with Double = js.native
    
    /* 1 */ val compliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.compliant with Double = js.native
    
    /* 4 */ val invalidParameter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.invalidParameter with Double = js.native
    
    /* 0 */ val notEvaluated: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.notEvaluated with Double = js.native
    
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.requestedPolicyIsStricter with Double = js.native
  }
  
  /** Represents the type of encryption required. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
  @JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult")
  @js.native
  object EasRequireEncryptionResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult with Double
      ] = js.native
    
    /* 2 */ val canBeCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.canBeCompliant with Double = js.native
    
    /* 1 */ val compliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.compliant with Double = js.native
    
    /* 4 */ val deFixedDataNotSupported: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deFixedDataNotSupported with Double = js.native
    
    /* 6 */ val deHardwareNotCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deHardwareNotCompliant with Double = js.native
    
    /* 12 */ val deOsVolumeNotProtected: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deOsVolumeNotProtected with Double = js.native
    
    /* 14 */ val deProtectionNotYetEnabled: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionNotYetEnabled with Double = js.native
    
    /* 10 */ val deProtectionSuspended: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionSuspended with Double = js.native
    
    /* 8 */ val deWinReNotConfigured: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deWinReNotConfigured with Double = js.native
    
    /* 5 */ val fixedDataNotSupported: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.fixedDataNotSupported with Double = js.native
    
    /* 7 */ val hardwareNotCompliant: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.hardwareNotCompliant with Double = js.native
    
    /* 9 */ val lockNotConfigured: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.lockNotConfigured with Double = js.native
    
    /* 16 */ val noFeatureLicense: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.noFeatureLicense with Double = js.native
    
    /* 0 */ val notEvaluated: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notEvaluated with Double = js.native
    
    /* 3 */ val notProvisionedOnAllVolumes: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notProvisionedOnAllVolumes with Double = js.native
    
    /* 17 */ val osNotProtected: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.osNotProtected with Double = js.native
    
    /* 13 */ val osVolumeNotProtected: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.osVolumeNotProtected with Double = js.native
    
    /* 15 */ val protectionNotYetEnabled: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.protectionNotYetEnabled with Double = js.native
    
    /* 11 */ val protectionSuspended: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.protectionSuspended with Double = js.native
    
    /* 18 */ val unexpectedFailure: typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.unexpectedFailure with Double = js.native
  }
}
