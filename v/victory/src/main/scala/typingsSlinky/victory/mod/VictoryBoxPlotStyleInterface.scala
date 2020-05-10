package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryBoxPlotStyleInterface extends VictoryStyleInterface {
  var max: js.UndefOr[VictoryStyleObject] = js.native
  var maxLabels: js.UndefOr[VictoryStyleObject] = js.native
  var median: js.UndefOr[VictoryStyleObject] = js.native
  var medianLabels: js.UndefOr[VictoryStyleObject] = js.native
  var min: js.UndefOr[VictoryStyleObject] = js.native
  var minLabels: js.UndefOr[VictoryStyleObject] = js.native
  var q1: js.UndefOr[VictoryStyleObject] = js.native
  var q1Labels: js.UndefOr[VictoryStyleObject] = js.native
  var q3: js.UndefOr[VictoryStyleObject] = js.native
  var q3Labels: js.UndefOr[VictoryStyleObject] = js.native
}

object VictoryBoxPlotStyleInterface {
  @scala.inline
  def apply(): VictoryBoxPlotStyleInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBoxPlotStyleInterface]
  }
  @scala.inline
  implicit class VictoryBoxPlotStyleInterfaceOps[Self <: VictoryBoxPlotStyleInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: VictoryStyleObject): Self = {
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
    def withMaxLabels(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withMedian(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("median")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("median")(js.undefined)
        ret
    }
    @scala.inline
    def withMedianLabels(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedianLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: VictoryStyleObject): Self = {
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
    def withMinLabels(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withQ1(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1")(js.undefined)
        ret
    }
    @scala.inline
    def withQ1Labels(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ1Labels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1Labels")(js.undefined)
        ret
    }
    @scala.inline
    def withQ3(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3")(js.undefined)
        ret
    }
    @scala.inline
    def withQ3Labels(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ3Labels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3Labels")(js.undefined)
        ret
    }
  }
  
}

