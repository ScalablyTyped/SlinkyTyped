package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See [TextView.setLineSpacing](https://developer.android.com/reference/android/widget/TextView#setLineSpacing(float,%20float))
  */
@js.native
trait LabelLineSpacing extends js.Object {
  /**
  	 * The value in pixels that should be added to each line other than the last line. This will be applied after the multiplier
  	 */
  var add: js.UndefOr[Double] = js.native
  /**
  	 * The value by which each line height other than the last line will be multiplied by
  	 */
  var multiply: js.UndefOr[Double] = js.native
}

object LabelLineSpacing {
  @scala.inline
  def apply(): LabelLineSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLineSpacing]
  }
  @scala.inline
  implicit class LabelLineSpacingOps[Self <: LabelLineSpacing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiply(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.undefined)
        ret
    }
  }
  
}

