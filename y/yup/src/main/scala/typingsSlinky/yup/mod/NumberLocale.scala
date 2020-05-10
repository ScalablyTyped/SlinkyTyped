package typingsSlinky.yup.mod

import typingsSlinky.yup.AnonLess
import typingsSlinky.yup.AnonMax
import typingsSlinky.yup.AnonMin
import typingsSlinky.yup.AnonMore
import typingsSlinky.yup.PartialTestMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberLocale extends js.Object {
  var integer: js.UndefOr[TestOptionsMessage[js.Object, _]] = js.native
  var lessThan: js.UndefOr[TestOptionsMessage[AnonLess, _]] = js.native
  var max: js.UndefOr[TestOptionsMessage[AnonMax, _]] = js.native
  var min: js.UndefOr[TestOptionsMessage[AnonMin, _]] = js.native
  var moreThan: js.UndefOr[TestOptionsMessage[AnonMore, _]] = js.native
  var negative: js.UndefOr[TestOptionsMessage[AnonLess, _]] = js.native
  var positive: js.UndefOr[TestOptionsMessage[AnonMore, _]] = js.native
}

object NumberLocale {
  @scala.inline
  def apply(): NumberLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberLocale]
  }
  @scala.inline
  implicit class NumberLocaleOps[Self <: NumberLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntegerFunction1(value: /* params */ js.Object with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInteger(value: TestOptionsMessage[js.Object, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(js.undefined)
        ret
    }
    @scala.inline
    def withLessThanFunction1(value: /* params */ AnonLess with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLessThan(value: TestOptionsMessage[AnonLess, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFunction1(value: /* params */ AnonMax with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMax(value: TestOptionsMessage[AnonMax, _]): Self = {
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
    def withMinFunction1(value: /* params */ AnonMin with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMin(value: TestOptionsMessage[AnonMin, _]): Self = {
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
    def withMoreThanFunction1(value: /* params */ AnonMore with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoreThan(value: TestOptionsMessage[AnonMore, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreThan")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeFunction1(value: /* params */ AnonLess with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNegative(value: TestOptionsMessage[AnonLess, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(js.undefined)
        ret
    }
    @scala.inline
    def withPositiveFunction1(value: /* params */ AnonMore with PartialTestMessageParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPositive(value: TestOptionsMessage[AnonMore, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(js.undefined)
        ret
    }
  }
  
}

