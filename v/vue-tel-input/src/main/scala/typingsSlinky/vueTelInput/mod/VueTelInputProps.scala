package typingsSlinky.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTelInputProps extends js.Object {
  var autocomplete: String = js.native
  var defaultCountry: String = js.native
  var disabled: Boolean = js.native
  var disabledFetchingCountry: Boolean = js.native
  var disabledFormatting: Boolean = js.native
  var dropdownOptions: VueTelInputDowndownOption = js.native
  var enabledCountryCode: Boolean = js.native
  var enabledFlags: Boolean = js.native
  var ignoredCountries: js.Array[_] = js.native
  var inputClasses: String = js.native
  var inputOptions: VueTelInputInputOption = js.native
  var invalidMsg: String = js.native
  var maxLen: Double = js.native
  var name: String = js.native
  var onlyCountries: js.Array[_] = js.native
  var placeholder: String = js.native
  var preferredCountries: Boolean = js.native
  var required: Boolean = js.native
  var value: String = js.native
  var wrapperClasses: String = js.native
}

object VueTelInputProps {
  @scala.inline
  def apply(
    autocomplete: String,
    defaultCountry: String,
    disabled: Boolean,
    disabledFetchingCountry: Boolean,
    disabledFormatting: Boolean,
    dropdownOptions: VueTelInputDowndownOption,
    enabledCountryCode: Boolean,
    enabledFlags: Boolean,
    ignoredCountries: js.Array[_],
    inputClasses: String,
    inputOptions: VueTelInputInputOption,
    invalidMsg: String,
    maxLen: Double,
    name: String,
    onlyCountries: js.Array[_],
    placeholder: String,
    preferredCountries: Boolean,
    required: Boolean,
    value: String,
    wrapperClasses: String
  ): VueTelInputProps = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], defaultCountry = defaultCountry.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledFetchingCountry = disabledFetchingCountry.asInstanceOf[js.Any], disabledFormatting = disabledFormatting.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any], enabledCountryCode = enabledCountryCode.asInstanceOf[js.Any], enabledFlags = enabledFlags.asInstanceOf[js.Any], ignoredCountries = ignoredCountries.asInstanceOf[js.Any], inputClasses = inputClasses.asInstanceOf[js.Any], inputOptions = inputOptions.asInstanceOf[js.Any], invalidMsg = invalidMsg.asInstanceOf[js.Any], maxLen = maxLen.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onlyCountries = onlyCountries.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], preferredCountries = preferredCountries.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], wrapperClasses = wrapperClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputProps]
  }
  @scala.inline
  implicit class VueTelInputPropsOps[Self <: VueTelInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocomplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledFetchingCountry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledFetchingCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledFormatting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdownOptions(value: VueTelInputDowndownOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabledCountryCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabledFlags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoredCountries(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputOptions(value: VueTelInputInputOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyCountries(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredCountries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClasses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

