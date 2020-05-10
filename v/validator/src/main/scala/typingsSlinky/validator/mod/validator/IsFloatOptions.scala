package typingsSlinky.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsFloatOptions extends js.Object {
  /**
    * greater than
    */
  var gt: js.UndefOr[Double] = js.native
  /**
    * FloatLocale
    */
  var locale: js.UndefOr[FloatLocale] = js.native
  /**
    * less than
    */
  var lt: js.UndefOr[Double] = js.native
  /**
    * greater or equal
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * less or equal
    */
  var min: js.UndefOr[Double] = js.native
}

object IsFloatOptions {
  @scala.inline
  def apply(): IsFloatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFloatOptions]
  }
  @scala.inline
  implicit class IsFloatOptionsOps[Self <: IsFloatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: FloatLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
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
    def withMin(value: Double): Self = {
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

