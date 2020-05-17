package typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the mail app with the results of the evaluation of the EAS security policies. Every policy being evaluated returns an enumerated value indicating the evaluation results against the policy. The evaluations results are encapsulated in the EasComplianceResults object for the caller app to retrieve. */
@js.native
trait EasComplianceResults extends js.Object {
  /** Returns the result of whether the computer is compliant with the EAS policies. */
  var compliant: Boolean = js.native
  /** Returns the result of whether convenience logons are disallowed. */
  var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult = js.native
  /** Gets the type of the Exchange ActiveSync encryption provider. */
  var encryptionProviderType: EasEncryptionProviderType = js.native
  /** Returns the result of the maximum time of inactivity allowed before the computer is locked. */
  var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult = js.native
  /** Returns the result of the maximum number of failed password attempts allowed. */
  var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult = js.native
  /** Returns the result of the minimum number of complex password characters required. */
  var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult = js.native
  /** Returns the result of the minimum length of the password required. */
  var minPasswordLengthResult: EasMinPasswordLengthResult = js.native
  /** Returns the result of whether the password is expired. */
  var passwordExpirationResult: EasPasswordExpirationResult = js.native
  /** Returns the result of the history of passwords. */
  var passwordHistoryResult: EasPasswordHistoryResult = js.native
  /** Returns the result of whether encryption is required. */
  var requireEncryptionResult: EasRequireEncryptionResult = js.native
}

object EasComplianceResults {
  @scala.inline
  def apply(
    compliant: Boolean,
    disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult,
    encryptionProviderType: EasEncryptionProviderType,
    maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult,
    maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult,
    minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult,
    minPasswordLengthResult: EasMinPasswordLengthResult,
    passwordExpirationResult: EasPasswordExpirationResult,
    passwordHistoryResult: EasPasswordHistoryResult,
    requireEncryptionResult: EasRequireEncryptionResult
  ): EasComplianceResults = {
    val __obj = js.Dynamic.literal(compliant = compliant.asInstanceOf[js.Any], disallowConvenienceLogonResult = disallowConvenienceLogonResult.asInstanceOf[js.Any], encryptionProviderType = encryptionProviderType.asInstanceOf[js.Any], maxInactivityTimeLockResult = maxInactivityTimeLockResult.asInstanceOf[js.Any], maxPasswordFailedAttemptsResult = maxPasswordFailedAttemptsResult.asInstanceOf[js.Any], minPasswordComplexCharactersResult = minPasswordComplexCharactersResult.asInstanceOf[js.Any], minPasswordLengthResult = minPasswordLengthResult.asInstanceOf[js.Any], passwordExpirationResult = passwordExpirationResult.asInstanceOf[js.Any], passwordHistoryResult = passwordHistoryResult.asInstanceOf[js.Any], requireEncryptionResult = requireEncryptionResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[EasComplianceResults]
  }
  @scala.inline
  implicit class EasComplianceResultsOps[Self <: EasComplianceResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompliant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisallowConvenienceLogonResult(value: EasDisallowConvenienceLogonResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowConvenienceLogonResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionProviderType(value: EasEncryptionProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxInactivityTimeLockResult(value: EasMaxInactivityTimeLockResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInactivityTimeLockResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPasswordFailedAttemptsResult(value: EasMaxPasswordFailedAttemptsResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPasswordFailedAttemptsResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPasswordComplexCharactersResult(value: EasMinPasswordComplexCharactersResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPasswordComplexCharactersResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPasswordLengthResult(value: EasMinPasswordLengthResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPasswordLengthResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordExpirationResult(value: EasPasswordExpirationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordExpirationResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordHistoryResult(value: EasPasswordHistoryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordHistoryResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireEncryptionResult(value: EasRequireEncryptionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireEncryptionResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

