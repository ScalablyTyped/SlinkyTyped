package typingsSlinky.zingchart.mod

import typingsSlinky.zingchart.AnonActive
import typingsSlinky.zingchart.AnonAdjustlayout
import typingsSlinky.zingchart.AnonAlign
import typingsSlinky.zingchart.AnonAlpha
import typingsSlinky.zingchart.AnonAnchor
import typingsSlinky.zingchart.AnonAngle
import typingsSlinky.zingchart.AnonAngleend
import typingsSlinky.zingchart.AnonAnimation
import typingsSlinky.zingchart.AnonAspect
import typingsSlinky.zingchart.AnonAsync
import typingsSlinky.zingchart.AnonAutofit
import typingsSlinky.zingchart.AnonBackgroundimage
import typingsSlinky.zingchart.AnonBorderradiusbottomright
import typingsSlinky.zingchart.AnonCalloutextension
import typingsSlinky.zingchart.AnonCalloutheight
import typingsSlinky.zingchart.AnonCallouthook
import typingsSlinky.zingchart.AnonCenter
import typingsSlinky.zingchart.AnonColumns
import typingsSlinky.zingchart.AnonDecimalsseparator
import typingsSlinky.zingchart.AnonExact
import typingsSlinky.zingchart.AnonFormat
import typingsSlinky.zingchart.AnonGuide
import typingsSlinky.zingchart.AnonHandle
import typingsSlinky.zingchart.AnonMaxheight
import typingsSlinky.zingchart.AnonPreservezoom
import typingsSlinky.zingchart.AnonSizefactor
import typingsSlinky.zingchart.AnonTypeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait graphset extends js.Object {
  var `3d-aspect`: js.UndefOr[AnonAngle] = js.native
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  var arrows: js.UndefOr[js.Array[AnonAlpha]] = js.native
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  /**
    * Sets the border radius (rounded corners) of the object. "3px" | "10px"
    */
  var `border-radius`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the border width of the object. 1 | 3 | | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.native
  var crosshair: js.UndefOr[AnonExact] = js.native
  var csv: js.UndefOr[AnonColumns] = js.native
  var heatmap: js.UndefOr[AnonAsync] = js.native
  /**
    * Sets the height of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Double] = js.native
  var images: js.UndefOr[js.Array[AnonBackgroundimage]] = js.native
  var labels: js.UndefOr[js.Array[AnonAnchor]] = js.native
  var legend: js.UndefOr[AnonAdjustlayout] = js.native
  /**
    * Sets the line style of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.native
  var `media-rules`: js.UndefOr[js.Array[AnonMaxheight]] = js.native
  var `no-data`: js.UndefOr[AnonAlign] = js.native
  var options: js.UndefOr[AnonAspect] = js.native
  var plot: js.UndefOr[AnonAnimation] = js.native
  var plotarea: js.UndefOr[AnonBorderradiusbottomright] = js.native
  var preview: js.UndefOr[AnonActive] = js.native
  var scale: js.UndefOr[AnonSizefactor] = js.native
  var `scale-k`: js.UndefOr[AnonFormat] = js.native
  var `scale-r`: js.UndefOr[AnonCenter] = js.native
  var `scale-v`: js.UndefOr[AnonGuide] = js.native
  var `scale-x`: js.UndefOr[AnonAutofit] = js.native
  var `scale-y`: js.UndefOr[AnonDecimalsseparator] = js.native
  var `scroll-x-scroll-y`: js.UndefOr[AnonHandle] = js.native
  var series: js.UndefOr[js.Array[typingsSlinky.zingchart.mod.series]] = js.native
  var shapes: js.UndefOr[js.Array[AnonAngleend]] = js.native
  var source: js.UndefOr[AnonCalloutextension] = js.native
  var subtitle: js.UndefOr[AnonCalloutextension] = js.native
  var title: js.UndefOr[AnonCalloutheight] = js.native
  var tooltip: js.UndefOr[AnonCallouthook] = js.native
  /**
    * The type of the chart "line" | "bar"...
    */
  var `type`: js.UndefOr[String] = js.native
  var widget: js.UndefOr[AnonTypeString] = js.native
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Double] = js.native
  var zoom: js.UndefOr[AnonPreservezoom] = js.native
}

object graphset {
  @scala.inline
  def apply(): graphset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[graphset]
  }
  @scala.inline
  implicit class graphsetOps[Self <: graphset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with3d-aspect`(value: AnonAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3d-aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without3d-aspect`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3d-aspect")(js.undefined)
        ret
    }
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withArrows(value: js.Array[AnonAlpha]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def `withBackground-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBackground-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-radius`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-radius`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withBorder-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBorder-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-width")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshair(value: AnonExact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(js.undefined)
        ret
    }
    @scala.inline
    def withCsv(value: AnonColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(js.undefined)
        ret
    }
    @scala.inline
    def withHeatmap(value: AnonAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeatmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[AnonBackgroundimage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[AnonAnchor]): Self = {
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
    def withLegend(value: AnonAdjustlayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-style`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-rules`(value: js.Array[AnonMaxheight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-rules`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-rules")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-data`(value: AnonAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-data`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-data")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonAspect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPlot(value: AnonAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plot")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotarea(value: AnonBorderradiusbottomright): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotarea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotarea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotarea")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: AnonActive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: AnonSizefactor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def `withScale-k`(value: AnonFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScale-k`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-k")(js.undefined)
        ret
    }
    @scala.inline
    def `withScale-r`(value: AnonCenter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScale-r`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-r")(js.undefined)
        ret
    }
    @scala.inline
    def `withScale-v`(value: AnonGuide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScale-v`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-v")(js.undefined)
        ret
    }
    @scala.inline
    def `withScale-x`(value: AnonAutofit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScale-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-x")(js.undefined)
        ret
    }
    @scala.inline
    def `withScale-y`(value: AnonDecimalsseparator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScale-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-y")(js.undefined)
        ret
    }
    @scala.inline
    def `withScroll-x-scroll-y`(value: AnonHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll-x-scroll-y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScroll-x-scroll-y`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll-x-scroll-y")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[series]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withShapes(value: js.Array[AnonAngleend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: AnonCalloutextension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: AnonCalloutextension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: AnonCalloutheight): Self = {
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
    @scala.inline
    def withTooltip(value: AnonCallouthook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidget(value: AnonTypeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: AnonPreservezoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

