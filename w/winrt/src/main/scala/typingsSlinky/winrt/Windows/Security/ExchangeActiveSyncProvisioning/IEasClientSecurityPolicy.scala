package typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEasClientSecurityPolicy extends js.Object {
  var disallowConvenienceLogon: Boolean = js.native
  var maxInactivityTimeLock: Double = js.native
  var maxPasswordFailedAttempts: Double = js.native
  var minPasswordComplexCharacters: Double = js.native
  var minPasswordLength: Double = js.native
  var passwordExpiration: Double = js.native
  var passwordHistory: Double = js.native
  var requireEncryption: Boolean = js.native
  def applyAsync(): IAsyncOperation[EasComplianceResults] = js.native
  def checkCompliance(): EasComplianceResults = js.native
}

object IEasClientSecurityPolicy {
  @scala.inline
  def apply(
    applyAsync: () => IAsyncOperation[EasComplianceResults],
    checkCompliance: () => EasComplianceResults,
    disallowConvenienceLogon: Boolean,
    maxInactivityTimeLock: Double,
    maxPasswordFailedAttempts: Double,
    minPasswordComplexCharacters: Double,
    minPasswordLength: Double,
    passwordExpiration: Double,
    passwordHistory: Double,
    requireEncryption: Boolean
  ): IEasClientSecurityPolicy = {
    val __obj = js.Dynamic.literal(applyAsync = js.Any.fromFunction0(applyAsync), checkCompliance = js.Any.fromFunction0(checkCompliance), disallowConvenienceLogon = disallowConvenienceLogon.asInstanceOf[js.Any], maxInactivityTimeLock = maxInactivityTimeLock.asInstanceOf[js.Any], maxPasswordFailedAttempts = maxPasswordFailedAttempts.asInstanceOf[js.Any], minPasswordComplexCharacters = minPasswordComplexCharacters.asInstanceOf[js.Any], minPasswordLength = minPasswordLength.asInstanceOf[js.Any], passwordExpiration = passwordExpiration.asInstanceOf[js.Any], passwordHistory = passwordHistory.asInstanceOf[js.Any], requireEncryption = requireEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEasClientSecurityPolicy]
  }
  @scala.inline
  implicit class IEasClientSecurityPolicyOps[Self <: IEasClientSecurityPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyAsync(value: () => IAsyncOperation[EasComplianceResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckCompliance(value: () => EasComplianceResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCompliance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisallowConvenienceLogon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowConvenienceLogon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxInactivityTimeLock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInactivityTimeLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPasswordFailedAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPasswordFailedAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPasswordComplexCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPasswordComplexCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPasswordLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPasswordLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordExpiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordHistory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireEncryption")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

