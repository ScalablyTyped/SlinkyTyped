package typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEasComplianceResults extends js.Object {
  var compliant: Boolean = js.native
  var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult = js.native
  var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult = js.native
  var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult = js.native
  var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult = js.native
  var minPasswordLengthResult: EasMinPasswordLengthResult = js.native
  var passwordExpirationResult: EasPasswordExpirationResult = js.native
  var passwordHistoryResult: EasPasswordHistoryResult = js.native
  var requireEncryptionResult: EasRequireEncryptionResult = js.native
}

object IEasComplianceResults {
  @scala.inline
  def apply(
    compliant: Boolean,
    disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult,
    maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult,
    maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult,
    minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult,
    minPasswordLengthResult: EasMinPasswordLengthResult,
    passwordExpirationResult: EasPasswordExpirationResult,
    passwordHistoryResult: EasPasswordHistoryResult,
    requireEncryptionResult: EasRequireEncryptionResult
  ): IEasComplianceResults = {
    val __obj = js.Dynamic.literal(compliant = compliant.asInstanceOf[js.Any], disallowConvenienceLogonResult = disallowConvenienceLogonResult.asInstanceOf[js.Any], maxInactivityTimeLockResult = maxInactivityTimeLockResult.asInstanceOf[js.Any], maxPasswordFailedAttemptsResult = maxPasswordFailedAttemptsResult.asInstanceOf[js.Any], minPasswordComplexCharactersResult = minPasswordComplexCharactersResult.asInstanceOf[js.Any], minPasswordLengthResult = minPasswordLengthResult.asInstanceOf[js.Any], passwordExpirationResult = passwordExpirationResult.asInstanceOf[js.Any], passwordHistoryResult = passwordHistoryResult.asInstanceOf[js.Any], requireEncryptionResult = requireEncryptionResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEasComplianceResults]
  }
  @scala.inline
  implicit class IEasComplianceResultsOps[Self <: IEasComplianceResults] (val x: Self) extends AnyVal {
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

