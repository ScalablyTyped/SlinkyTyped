package typingsSlinky.zingchart.mod

import typingsSlinky.zingchart.anon.Active
import typingsSlinky.zingchart.anon.Adjustlayout
import typingsSlinky.zingchart.anon.Align
import typingsSlinky.zingchart.anon.Alpha
import typingsSlinky.zingchart.anon.Anchor
import typingsSlinky.zingchart.anon.Angle
import typingsSlinky.zingchart.anon.Angleend
import typingsSlinky.zingchart.anon.Animation
import typingsSlinky.zingchart.anon.Aspect
import typingsSlinky.zingchart.anon.Async
import typingsSlinky.zingchart.anon.Autofit
import typingsSlinky.zingchart.anon.Backgroundimage
import typingsSlinky.zingchart.anon.Borderradiusbottomright
import typingsSlinky.zingchart.anon.Calloutextension
import typingsSlinky.zingchart.anon.Calloutheight
import typingsSlinky.zingchart.anon.Callouthook
import typingsSlinky.zingchart.anon.Center
import typingsSlinky.zingchart.anon.Columns
import typingsSlinky.zingchart.anon.Decimalsseparator
import typingsSlinky.zingchart.anon.Exact
import typingsSlinky.zingchart.anon.Format
import typingsSlinky.zingchart.anon.Guide
import typingsSlinky.zingchart.anon.Handle
import typingsSlinky.zingchart.anon.Maxheight
import typingsSlinky.zingchart.anon.Preservezoom
import typingsSlinky.zingchart.anon.Sizefactor
import typingsSlinky.zingchart.anon.TypeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait graphset extends js.Object {
  var `3d-aspect`: js.UndefOr[Angle] = js.native
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  var arrows: js.UndefOr[js.Array[Alpha]] = js.native
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
  var crosshair: js.UndefOr[Exact] = js.native
  var csv: js.UndefOr[Columns] = js.native
  var heatmap: js.UndefOr[Async] = js.native
  /**
    * Sets the height of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Double] = js.native
  var images: js.UndefOr[js.Array[Backgroundimage]] = js.native
  var labels: js.UndefOr[js.Array[Anchor]] = js.native
  var legend: js.UndefOr[Adjustlayout] = js.native
  /**
    * Sets the line style of the object. "solid" | "dotted" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.native
  var `media-rules`: js.UndefOr[js.Array[Maxheight]] = js.native
  var `no-data`: js.UndefOr[Align] = js.native
  var options: js.UndefOr[Aspect] = js.native
  var plot: js.UndefOr[Animation] = js.native
  var plotarea: js.UndefOr[Borderradiusbottomright] = js.native
  var preview: js.UndefOr[Active] = js.native
  var scale: js.UndefOr[Sizefactor] = js.native
  var `scale-k`: js.UndefOr[Format] = js.native
  var `scale-r`: js.UndefOr[Center] = js.native
  var `scale-v`: js.UndefOr[Guide] = js.native
  var `scale-x`: js.UndefOr[Autofit] = js.native
  var `scale-y`: js.UndefOr[Decimalsseparator] = js.native
  var `scroll-x-scroll-y`: js.UndefOr[Handle] = js.native
  var series: js.UndefOr[js.Array[typingsSlinky.zingchart.mod.series]] = js.native
  var shapes: js.UndefOr[js.Array[Angleend]] = js.native
  var source: js.UndefOr[Calloutextension] = js.native
  var subtitle: js.UndefOr[Calloutextension] = js.native
  var title: js.UndefOr[Calloutheight] = js.native
  var tooltip: js.UndefOr[Callouthook] = js.native
  /**
    * The type of the chart "line" | "bar"...
    */
  var `type`: js.UndefOr[String] = js.native
  var widget: js.UndefOr[TypeString] = js.native
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Double] = js.native
  var zoom: js.UndefOr[Preservezoom] = js.native
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
    def `with3d-aspect`(value: Angle): Self = {
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
    def withArrows(value: js.Array[Alpha]): Self = {
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
    def withCrosshair(value: Exact): Self = {
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
    def withCsv(value: Columns): Self = {
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
    def withHeatmap(value: Async): Self = {
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
    def withImages(value: js.Array[Backgroundimage]): Self = {
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
    def withLabels(value: js.Array[Anchor]): Self = {
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
    def withLegend(value: Adjustlayout): Self = {
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
    def `withMedia-rules`(value: js.Array[Maxheight]): Self = {
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
    def `withNo-data`(value: Align): Self = {
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
    def withOptions(value: Aspect): Self = {
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
    def withPlot(value: Animation): Self = {
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
    def withPlotarea(value: Borderradiusbottomright): Self = {
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
    def withPreview(value: Active): Self = {
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
    def withScale(value: Sizefactor): Self = {
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
    def `withScale-k`(value: Format): Self = {
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
    def `withScale-r`(value: Center): Self = {
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
    def `withScale-v`(value: Guide): Self = {
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
    def `withScale-x`(value: Autofit): Self = {
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
    def `withScale-y`(value: Decimalsseparator): Self = {
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
    def `withScroll-x-scroll-y`(value: Handle): Self = {
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
    def withShapes(value: js.Array[Angleend]): Self = {
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
    def withSource(value: Calloutextension): Self = {
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
    def withSubtitle(value: Calloutextension): Self = {
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
    def withTitle(value: Calloutheight): Self = {
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
    def withTooltip(value: Callouthook): Self = {
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
    def withWidget(value: TypeString): Self = {
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
    def withZoom(value: Preservezoom): Self = {
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

