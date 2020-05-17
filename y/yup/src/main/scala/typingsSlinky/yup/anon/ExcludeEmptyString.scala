package typingsSlinky.yup.anon

import typingsSlinky.yup.mod.TestOptionsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeEmptyString extends js.Object {
  var excludeEmptyString: js.UndefOr[Boolean] = js.native
  var message: js.UndefOr[TestOptionsMessage[Regex, _]] = js.native
}

object ExcludeEmptyString {
  @scala.inline
  def apply(): ExcludeEmptyString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeEmptyString]
  }
  @scala.inline
  implicit class ExcludeEmptyStringOps[Self <: ExcludeEmptyString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeEmptyString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEmptyString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeEmptyString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEmptyString")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageFunction1(value: /* params */ Regex with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMessage(value: TestOptionsMessage[Regex, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

