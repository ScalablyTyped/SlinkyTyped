package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataGroupOptions extends js.Object {
  var drawPoints: js.UndefOr[Graph2dDrawPointsOption | js.Function0[Unit]] = js.native
   // TODO
  var excludeFromLegend: js.UndefOr[Boolean] = js.native
  var interpolation: js.UndefOr[Boolean | InterpolationOptions] = js.native
  var shaded: js.UndefOr[Graph2dShadedOption] = js.native
  var style: js.UndefOr[String] = js.native
  var yAxisOrientation: js.UndefOr[RightLeftEnumType] = js.native
}

object DataGroupOptions {
  @scala.inline
  def apply(): DataGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataGroupOptions]
  }
  @scala.inline
  implicit class DataGroupOptionsOps[Self <: DataGroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawPointsFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPoints")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawPoints(value: Graph2dDrawPointsOption | js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFromLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeFromLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolation(value: Boolean | InterpolationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withShaded(value: Graph2dShadedOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaded")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisOrientation(value: RightLeftEnumType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisOrientation")(js.undefined)
        ret
    }
  }
  
}

