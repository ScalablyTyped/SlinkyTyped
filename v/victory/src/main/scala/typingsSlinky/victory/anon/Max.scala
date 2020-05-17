package typingsSlinky.victory.anon

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Max extends js.Object {
  var max: js.UndefOr[CSSProperties] = js.native
  var maxLabels: js.UndefOr[CSSProperties] = js.native
  var median: js.UndefOr[CSSProperties] = js.native
  var medianLabels: js.UndefOr[CSSProperties] = js.native
  var min: js.UndefOr[CSSProperties] = js.native
  var minLabels: js.UndefOr[CSSProperties] = js.native
  var q1: js.UndefOr[CSSProperties] = js.native
  var q1Labels: js.UndefOr[CSSProperties] = js.native
  var q3: js.UndefOr[CSSProperties] = js.native
  var q3Labels: js.UndefOr[CSSProperties] = js.native
}

object Max {
  @scala.inline
  def apply(): Max = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Max]
  }
  @scala.inline
  implicit class MaxOps[Self <: Max] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: CSSProperties): Self = {
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
    def withMaxLabels(value: CSSProperties): Self = {
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
    def withMedian(value: CSSProperties): Self = {
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
    def withMedianLabels(value: CSSProperties): Self = {
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
    def withMin(value: CSSProperties): Self = {
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
    def withMinLabels(value: CSSProperties): Self = {
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
    def withQ1(value: CSSProperties): Self = {
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
    def withQ1Labels(value: CSSProperties): Self = {
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
    def withQ3(value: CSSProperties): Self = {
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
    def withQ3Labels(value: CSSProperties): Self = {
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

