package typingsSlinky.yup.mod

import typingsSlinky.yup.anon.Length
import typingsSlinky.yup.anon.Max
import typingsSlinky.yup.anon.Min
import typingsSlinky.yup.anon.PartialTestMessageParams
import typingsSlinky.yup.anon.Regex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringLocale extends js.Object {
  var email: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
  var length: js.UndefOr[TestOptionsMessage[Length, _]] = js.native
  var lowercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var matches: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.native
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.native
  var trim: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var uppercase: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var url: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
}

object StringLocale {
  @scala.inline
  def apply(): StringLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringLocale]
  }
  @scala.inline
  implicit class StringLocaleOps[Self <: StringLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmail(value: TestOptionsMessage[Regex, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthFunction1(value: /* params */ Length with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: TestOptionsMessage[Length, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLowercaseFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLowercase(value: TestOptionsMessage[js.Object, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchesFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatches(value: TestOptionsMessage[Regex, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFunction1(value: /* params */ Max with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMax(value: TestOptionsMessage[Max, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFunction1(value: /* params */ Min with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMin(value: TestOptionsMessage[Min, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrim(value: TestOptionsMessage[js.Object, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withUppercaseFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUppercase(value: TestOptionsMessage[js.Object, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUppercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrl(value: TestOptionsMessage[Regex, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

