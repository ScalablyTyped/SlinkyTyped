package typingsSlinky.winrtUwp.Windows.Devices.SmartCards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
@js.native
trait SmartCardPinPolicy extends js.Object {
  /** Gets or sets whether number characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var digits: SmartCardPinCharacterPolicyOption = js.native
  /** Gets or sets whether lowercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var lowercaseLetters: SmartCardPinCharacterPolicyOption = js.native
  /** Gets or sets the maximum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var maxLength: Double = js.native
  /** Gets or sets the minimum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var minLength: Double = js.native
  /** Gets or sets whether special characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var specialCharacters: SmartCardPinCharacterPolicyOption = js.native
  /** Gets or sets whether uppercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var uppercaseLetters: SmartCardPinCharacterPolicyOption = js.native
}

object SmartCardPinPolicy {
  @scala.inline
  def apply(
    digits: SmartCardPinCharacterPolicyOption,
    lowercaseLetters: SmartCardPinCharacterPolicyOption,
    maxLength: Double,
    minLength: Double,
    specialCharacters: SmartCardPinCharacterPolicyOption,
    uppercaseLetters: SmartCardPinCharacterPolicyOption
  ): SmartCardPinPolicy = {
    val __obj = js.Dynamic.literal(digits = digits.asInstanceOf[js.Any], lowercaseLetters = lowercaseLetters.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], specialCharacters = specialCharacters.asInstanceOf[js.Any], uppercaseLetters = uppercaseLetters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCardPinPolicy]
  }
  @scala.inline
  implicit class SmartCardPinPolicyOps[Self <: SmartCardPinPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigits(value: SmartCardPinCharacterPolicyOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowercaseLetters(value: SmartCardPinCharacterPolicyOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercaseLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecialCharacters(value: SmartCardPinCharacterPolicyOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUppercaseLetters(value: SmartCardPinCharacterPolicyOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercaseLetters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

