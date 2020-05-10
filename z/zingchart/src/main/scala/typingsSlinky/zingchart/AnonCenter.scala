package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCenter extends js.Object {
  var center: js.UndefOr[AnonSize] = js.native
  var guide: js.UndefOr[AnonVisible] = js.native
  var item: js.UndefOr[AnonOffsetR] = js.native
  /**
    * Gauge Charts Only: To set custom labels that correspond to each tick mark on the scale. If there are more tick marks than labels,
    * the default scale values will be used for the remaining labels. ['A', 'B', 'C', 'D', 'E'] | ...
    */
  var labels: js.UndefOr[js.Any] = js.native
  var markers: js.UndefOr[js.Array[AnonLabel]] = js.native
  var `minor-guide`: js.UndefOr[AnonLinecolorLinestyle] = js.native
  var `minor-tick`: js.UndefOr[AnonPlacement] = js.native
  /**
    * Gauge Charts Only: To set the number of minor tick marks displayed between the major tick marks. 9 | 5 | 2 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.native
  var ring: js.UndefOr[AnonBorderwidthItems] = js.native
  var tick: js.UndefOr[AnonPlacement] = js.native
  /**
    * Gauge Charts Only: To set the minimum, maximum, and step scale values. '0:10' | '0:25:5' | ...
    */
  var values: js.UndefOr[js.Any] = js.native
}

object AnonCenter {
  @scala.inline
  def apply(): AnonCenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCenter]
  }
  @scala.inline
  implicit class AnonCenterOps[Self <: AnonCenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: AnonSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withGuide(value: AnonVisible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: AnonOffsetR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Any): Self = {
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
    def withMarkers(value: js.Array[AnonLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def `withMinor-guide`(value: AnonLinecolorLinestyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-guide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMinor-guide`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-guide")(js.undefined)
        ret
    }
    @scala.inline
    def `withMinor-tick`(value: AnonPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMinor-tick`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-tick")(js.undefined)
        ret
    }
    @scala.inline
    def `withMinor-ticks`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMinor-ticks`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withRing(value: AnonBorderwidthItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ring")(js.undefined)
        ret
    }
    @scala.inline
    def withTick(value: AnonPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

