package typingsSlinky.winrt.global.Windows.Security

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult
import typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult
import typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult
import typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult
import typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult
import typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult
import typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult
import typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning")
@js.native
object ExchangeActiveSyncProvisioning extends js.Object {
  @js.native
  class EasClientDeviceInformation ()
    extends typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation {
    /* CompleteClass */
    override var friendlyName: String = js.native
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var operatingSystem: String = js.native
    /* CompleteClass */
    override var systemManufacturer: String = js.native
    /* CompleteClass */
    override var systemProductName: String = js.native
    /* CompleteClass */
    override var systemSku: String = js.native
  }
  
  @js.native
  class EasClientSecurityPolicy ()
    extends typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy {
    /* CompleteClass */
    override var disallowConvenienceLogon: Boolean = js.native
    /* CompleteClass */
    override var maxInactivityTimeLock: Double = js.native
    /* CompleteClass */
    override var maxPasswordFailedAttempts: Double = js.native
    /* CompleteClass */
    override var minPasswordComplexCharacters: Double = js.native
    /* CompleteClass */
    override var minPasswordLength: Double = js.native
    /* CompleteClass */
    override var passwordExpiration: Double = js.native
    /* CompleteClass */
    override var passwordHistory: Double = js.native
    /* CompleteClass */
    override var requireEncryption: Boolean = js.native
    /* CompleteClass */
    override def applyAsync(): IAsyncOperation[
        typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults
      ] = js.native
    /* CompleteClass */
    override def checkCompliance(): typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults = js.native
  }
  
  @js.native
  class EasComplianceResults ()
    extends typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults {
    /* CompleteClass */
    override var compliant: Boolean = js.native
    /* CompleteClass */
    override var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult = js.native
    /* CompleteClass */
    override var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult = js.native
    /* CompleteClass */
    override var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult = js.native
    /* CompleteClass */
    override var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult = js.native
    /* CompleteClass */
    override var minPasswordLengthResult: EasMinPasswordLengthResult = js.native
    /* CompleteClass */
    override var passwordExpirationResult: EasPasswordExpirationResult = js.native
    /* CompleteClass */
    override var passwordHistoryResult: EasPasswordHistoryResult = js.native
    /* CompleteClass */
    override var requireEncryptionResult: EasRequireEncryptionResult = js.native
  }
  
  @js.native
  object EasDisallowConvenienceLogonResult extends js.Object {
    /* 2 */ val canBeCompliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.compliant with Double = js.native
    /* 0 */ val notEvaluated: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult.requestedPolicyIsStricter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult with Double
      ] = js.native
  }
  
  @js.native
  object EasMaxInactivityTimeLockResult extends js.Object {
    /* 2 */ val canBeCompliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.compliant with Double = js.native
    /* 4 */ val invalidParameter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.invalidParameter with Double = js.native
    /* 0 */ val notEvaluated: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult.requestedPolicyIsStricter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxInactivityTimeLockResult with Double
      ] = js.native
  }
  
  @js.native
  object EasMaxPasswordFailedAttemptsResult extends js.Object {
    /* 2 */ val canBeCompliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.compliant with Double = js.native
    /* 4 */ val invalidParameter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.invalidParameter with Double = js.native
    /* 0 */ val notEvaluated: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult.requestedPolicyIsStricter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult with Double
      ] = js.native
  }
  
  @js.native
  object EasMinPasswordComplexCharactersResult extends js.Object {
    /* 9 */ val adminsCannotChangePassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsCannotChangePassword with Double = js.native
    /* 7 */ val adminsHaveBlankPassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.adminsHaveBlankPassword with Double = js.native
    /* 2 */ val canBeCompliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.canBeCompliant with Double = js.native
    /* 13 */ val changeConnectedAdminsPassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedAdminsPassword with Double = js.native
    /* 14 */ val changeConnectedUserPassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.changeConnectedUserPassword with Double = js.native
    /* 1 */ val compliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.compliant with Double = js.native
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
    /* 12 */ val connectedUserProviderPolicyIsWeak: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.connectedUserProviderPolicyIsWeak with Double = js.native
    /* 6 */ val currentUserHasBlankPassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.currentUserHasBlankPassword with Double = js.native
    /* 5 */ val invalidParameter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.invalidParameter with Double = js.native
    /* 10 */ val localControlledUsersCannotChangePassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.localControlledUsersCannotChangePassword with Double = js.native
    /* 0 */ val notEvaluated: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyIsStricter with Double = js.native
    /* 4 */ val requestedPolicyNotEnforceable: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.requestedPolicyNotEnforceable with Double = js.native
    /* 8 */ val userCannotChangePassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult.userCannotChangePassword with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult with Double
      ] = js.native
  }
  
  @js.native
  object EasMinPasswordLengthResult extends js.Object {
    /* 9 */ val adminsCannotChangePassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsCannotChangePassword with Double = js.native
    /* 7 */ val adminsHaveBlankPassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.adminsHaveBlankPassword with Double = js.native
    /* 2 */ val canBeCompliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.canBeCompliant with Double = js.native
    /* 13 */ val changeConnectedAdminsPassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedAdminsPassword with Double = js.native
    /* 14 */ val changeConnectedUserPassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.changeConnectedUserPassword with Double = js.native
    /* 1 */ val compliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.compliant with Double = js.native
    /* 11 */ val connectedAdminsProviderPolicyIsWeak: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedAdminsProviderPolicyIsWeak with Double = js.native
    /* 12 */ val connectedUserProviderPolicyIsWeak: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.connectedUserProviderPolicyIsWeak with Double = js.native
    /* 6 */ val currentUserHasBlankPassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.currentUserHasBlankPassword with Double = js.native
    /* 5 */ val invalidParameter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.invalidParameter with Double = js.native
    /* 10 */ val localControlledUsersCannotChangePassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.localControlledUsersCannotChangePassword with Double = js.native
    /* 0 */ val notEvaluated: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyIsStricter with Double = js.native
    /* 4 */ val requestedPolicyNotEnforceable: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.requestedPolicyNotEnforceable with Double = js.native
    /* 8 */ val userCannotChangePassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult.userCannotChangePassword with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordLengthResult with Double
      ] = js.native
  }
  
  @js.native
  object EasPasswordExpirationResult extends js.Object {
    /* 7 */ val adminsCannotChangePassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.adminsCannotChangePassword with Double = js.native
    /* 2 */ val canBeCompliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.compliant with Double = js.native
    /* 5 */ val invalidParameter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.invalidParameter with Double = js.native
    /* 8 */ val localControlledUsersCannotChangePassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.localControlledUsersCannotChangePassword with Double = js.native
    /* 0 */ val notEvaluated: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.notEvaluated with Double = js.native
    /* 4 */ val requestedExpirationIncompatible: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedExpirationIncompatible with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.requestedPolicyIsStricter with Double = js.native
    /* 6 */ val userCannotChangePassword: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult.userCannotChangePassword with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult with Double
      ] = js.native
  }
  
  @js.native
  object EasPasswordHistoryResult extends js.Object {
    /* 2 */ val canBeCompliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.compliant with Double = js.native
    /* 4 */ val invalidParameter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.invalidParameter with Double = js.native
    /* 0 */ val notEvaluated: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.notEvaluated with Double = js.native
    /* 3 */ val requestedPolicyIsStricter: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult.requestedPolicyIsStricter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordHistoryResult with Double
      ] = js.native
  }
  
  @js.native
  object EasRequireEncryptionResult extends js.Object {
    /* 2 */ val canBeCompliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.canBeCompliant with Double = js.native
    /* 1 */ val compliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.compliant with Double = js.native
    /* 4 */ val deFixedDataNotSupported: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deFixedDataNotSupported with Double = js.native
    /* 5 */ val deHardwareNotCompliant: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deHardwareNotCompliant with Double = js.native
    /* 8 */ val deOsVolumeNotProtected: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deOsVolumeNotProtected with Double = js.native
    /* 9 */ val deProtectionNotYetEnabled: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionNotYetEnabled with Double = js.native
    /* 7 */ val deProtectionSuspended: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionSuspended with Double = js.native
    /* 6 */ val deWinReNotConfigured: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deWinReNotConfigured with Double = js.native
    /* 10 */ val noFeatureLicense: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.noFeatureLicense with Double = js.native
    /* 0 */ val notEvaluated: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notEvaluated with Double = js.native
    /* 3 */ val notProvisionedOnAllVolumes: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notProvisionedOnAllVolumes with Double = js.native
    /* 11 */ val osNotProtected: typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.osNotProtected with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult with Double
      ] = js.native
  }
  
}

