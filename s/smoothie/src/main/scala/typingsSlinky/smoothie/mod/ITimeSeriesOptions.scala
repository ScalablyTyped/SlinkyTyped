package typingsSlinky.smoothie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeSeriesOptions extends js.Object {
  var resetBounds: js.UndefOr[Boolean] = js.native
  var resetBoundsInterval: js.UndefOr[Double] = js.native
}

object ITimeSeriesOptions {
  @scala.inline
  def apply(): ITimeSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeSeriesOptions]
  }
  @scala.inline
  implicit class ITimeSeriesOptionsOps[Self <: ITimeSeriesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResetBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withResetBoundsInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetBoundsInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetBoundsInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetBoundsInterval")(js.undefined)
        ret
    }
  }
  
}

