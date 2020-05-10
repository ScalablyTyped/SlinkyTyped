package typingsSlinky.yup

import typingsSlinky.yup.mod.TestOptionsMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcludeEmptyString extends js.Object {
  var excludeEmptyString: js.UndefOr[Boolean] = js.native
  var message: js.UndefOr[TestOptionsMessage[AnonRegex, _]] = js.native
}

object AnonExcludeEmptyString {
  @scala.inline
  def apply(): AnonExcludeEmptyString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExcludeEmptyString]
  }
  @scala.inline
  implicit class AnonExcludeEmptyStringOps[Self <: AnonExcludeEmptyString] (val x: Self) extends AnyVal {
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
    def withMessageFunction1(value: /* params */ AnonRegex with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMessage(value: TestOptionsMessage[AnonRegex, _]): Self = {
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

