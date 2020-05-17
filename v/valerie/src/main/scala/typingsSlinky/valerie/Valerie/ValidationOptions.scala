package typingsSlinky.valerie.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  var applicable: js.UndefOr[js.Function0[_]] = js.native
    // the function used to determine if the property is applicable
  var converter: js.UndefOr[IConverter] = js.native
    // the converter used to parse user entries and format display of the property's value
  var entryFormat: js.UndefOr[String] = js.native
    // the string used to format the property's value for display in a user entry
  var excludeFromSummary: js.UndefOr[Boolean] = js.native
    // whether any validation failures for this property are excluded from a summary
  var invalidFailureMessage: js.UndefOr[String] = js.native
    // the message shown when the user has entered an invalid value
  var missingFailureMessage: js.UndefOr[String] = js.native
    // the message shown when a value is required but is missing
  var name: js.UndefOr[js.Function0[_]] = js.native
    // the function used to determine the name of the property; used in failure messages
  var required: js.UndefOr[js.Function0[_]] = js.native
    // the function used to determine if a value is required
  var rules: js.UndefOr[js.Any] = js.native
   //Valerie.array.<IRule>;  // the chain of rules used to validate the property's value
  var valueFormat: js.UndefOr[String] = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicable(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutApplicable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicable")(js.undefined)
        ret
    }
    @scala.inline
    def withConverter(value: IConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFromSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeFromSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFailureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingFailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingFailureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(js.undefined)
        ret
    }
  }
  
}

