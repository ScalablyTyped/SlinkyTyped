package typingsSlinky.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsIntOptions extends js.Object {
  /**
    * if `false`, will disallow integer values with leading zeroes
    * @default true
    */
  var allow_leading_zeroes: js.UndefOr[Boolean] = js.native
  /**
    * enforce integers being less than the value provided
    */
  var gt: js.UndefOr[Double] = js.native
  /**
    * enforce integers being greater than the value provided
    */
  var lt: js.UndefOr[Double] = js.native
  /**
    * to check the integer max boundary
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * to check the integer min boundary
    */
  var min: js.UndefOr[Double] = js.native
}

object IsIntOptions {
  @scala.inline
  def apply(): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIntOptions]
  }
  @scala.inline
  implicit class IsIntOptionsOps[Self <: IsIntOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_leading_zeroes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_leading_zeroes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_leading_zeroes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_leading_zeroes")(js.undefined)
        ret
    }
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

