package typingsSlinky.vegaTypings.axisMod

import typingsSlinky.vegaTypings.encodeMod.GroupEncodeEntry
import typingsSlinky.vegaTypings.encodeMod.RuleEncodeEntry
import typingsSlinky.vegaTypings.encodeMod.TextEncodeEntry
import typingsSlinky.vegaTypings.legendMod.GuideEncodeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisEncode extends js.Object {
  /**
    * Custom encoding for the axis container.
    */
  var axis: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  /**
    * Custom encoding for the axis domain rule mark.
    */
  var domain: js.UndefOr[GuideEncodeEntry[RuleEncodeEntry]] = js.native
  /**
    * Custom encoding for axis gridline rule marks.
    */
  var grid: js.UndefOr[GuideEncodeEntry[RuleEncodeEntry]] = js.native
  /**
    * Custom encoding for axis label text marks.
    */
  var labels: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
  /**
    * Custom encoding for axis tick rule marks.
    */
  var ticks: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  /**
    * Custom encoding for the axis title text mark.
    */
  var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
}

object AxisEncode {
  @scala.inline
  def apply(): AxisEncode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisEncode]
  }
  @scala.inline
  implicit class AxisEncodeOps[Self <: AxisEncode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: GuideEncodeEntry[GroupEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: GuideEncodeEntry[RuleEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: GuideEncodeEntry[RuleEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: GuideEncodeEntry[TextEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: GuideEncodeEntry[GroupEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

