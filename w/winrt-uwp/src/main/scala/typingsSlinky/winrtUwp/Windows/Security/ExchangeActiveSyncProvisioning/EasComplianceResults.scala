package typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the mail app with the results of the evaluation of the EAS security policies. Every policy being evaluated returns an enumerated value indicating the evaluation results against the policy. The evaluations results are encapsulated in the EasComplianceResults object for the caller app to retrieve. */
@js.native
trait EasComplianceResults extends StObject {
  
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
  implicit class EasComplianceResultsMutableBuilder[Self <: EasComplianceResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompliant(value: Boolean): Self = StObject.set(x, "compliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowConvenienceLogonResult(value: EasDisallowConvenienceLogonResult): Self = StObject.set(x, "disallowConvenienceLogonResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionProviderType(value: EasEncryptionProviderType): Self = StObject.set(x, "encryptionProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInactivityTimeLockResult(value: EasMaxInactivityTimeLockResult): Self = StObject.set(x, "maxInactivityTimeLockResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPasswordFailedAttemptsResult(value: EasMaxPasswordFailedAttemptsResult): Self = StObject.set(x, "maxPasswordFailedAttemptsResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPasswordComplexCharactersResult(value: EasMinPasswordComplexCharactersResult): Self = StObject.set(x, "minPasswordComplexCharactersResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPasswordLengthResult(value: EasMinPasswordLengthResult): Self = StObject.set(x, "minPasswordLengthResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpirationResult(value: EasPasswordExpirationResult): Self = StObject.set(x, "passwordExpirationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordHistoryResult(value: EasPasswordHistoryResult): Self = StObject.set(x, "passwordHistoryResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireEncryptionResult(value: EasRequireEncryptionResult): Self = StObject.set(x, "requireEncryptionResult", value.asInstanceOf[js.Any])
  }
}
