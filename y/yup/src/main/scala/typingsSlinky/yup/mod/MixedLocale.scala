package typingsSlinky.yup.mod

import typingsSlinky.yup.anon.PartialTestMessageParams
import typingsSlinky.yup.anon.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MixedLocale extends js.Object {
  var default: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var notOneOf: js.UndefOr[TestOptionsMessage[Values, _]] = js.native
  var notType: js.UndefOr[LocaleValue] = js.native
  var oneOf: js.UndefOr[TestOptionsMessage[Values, _]] = js.native
  var required: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
}

object MixedLocale {
  @scala.inline
  def apply(): MixedLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedLocale]
  }
  @scala.inline
  implicit class MixedLocaleOps[Self <: MixedLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefault(value: TestOptionsMessage[js.Object, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withNotOneOfFunction1(value: /* params */ Values with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notOneOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotOneOf(value: TestOptionsMessage[Values, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notOneOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotOneOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notOneOf")(js.undefined)
        ret
    }
    @scala.inline
    def withNotTypeFunction1(value: /* params */ FormatErrorParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotType(value: LocaleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notType")(js.undefined)
        ret
    }
    @scala.inline
    def withOneOfFunction1(value: /* params */ Values with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOneOf(value: TestOptionsMessage[Values, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequired(value: TestOptionsMessage[js.Object, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

