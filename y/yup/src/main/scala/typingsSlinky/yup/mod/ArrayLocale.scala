package typingsSlinky.yup.mod

import typingsSlinky.yup.anon.Max
import typingsSlinky.yup.anon.Min
import typingsSlinky.yup.anon.PartialTestMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLocale extends js.Object {
  var max: js.UndefOr[TestOptionsMessage[Max, _]] = js.native
  var min: js.UndefOr[TestOptionsMessage[Min, _]] = js.native
}

object ArrayLocale {
  @scala.inline
  def apply(): ArrayLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayLocale]
  }
  @scala.inline
  implicit class ArrayLocaleOps[Self <: ArrayLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

