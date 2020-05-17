package typingsSlinky.yup.mod

import typingsSlinky.yup.anon.PartialTestMessageParams
import typingsSlinky.yup.anon.`0`
import typingsSlinky.yup.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[`1`, _]] = js.native
  var min: js.UndefOr[TestOptionsMessage[`0`, _]] = js.native
}

object DateLocale {
  @scala.inline
  def apply(): DateLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateLocale]
  }
  @scala.inline
  implicit class DateLocaleOps[Self <: DateLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxFunction1(value: /* params */ `1` with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMax(value: TestOptionsMessage[`1`, _]): Self = {
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
    def withMinFunction1(value: /* params */ `0` with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMin(value: TestOptionsMessage[`0`, _]): Self = {
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
  }
  
}

