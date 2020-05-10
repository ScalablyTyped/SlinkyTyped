package typingsSlinky.vis.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph2dOptions extends js.Object {
  var autoResize: js.UndefOr[Boolean] = js.native
  var barChart: js.UndefOr[Graph2dOptionBarChart] = js.native
  var clickToUse: js.UndefOr[Boolean] = js.native
  var configure: js.UndefOr[TimelineOptionsConfigureType] = js.native
  var dataAxis: js.UndefOr[Graph2dOptionDataAxis] = js.native
  var defaultGroup: js.UndefOr[String] = js.native
  var drawPoints: js.UndefOr[Graph2dOptionDrawPoints] = js.native
  var end: js.UndefOr[DateType] = js.native
  var format: js.UndefOr[js.Any] = js.native
   // TODO
  var graphHeight: js.UndefOr[HeightWidthType] = js.native
  var height: js.UndefOr[HeightWidthType] = js.native
  var hiddenDates: js.UndefOr[js.Any] = js.native
   // TODO
  var legend: js.UndefOr[Graph2dLegendOption] = js.native
  var locale: js.UndefOr[String] = js.native
  var locales: js.UndefOr[js.Any] = js.native
  var max: js.UndefOr[DateType] = js.native
  var maxHeight: js.UndefOr[HeightWidthType] = js.native
  var maxMinorChars: js.UndefOr[Double] = js.native
  var min: js.UndefOr[DateType] = js.native
  var minHeight: js.UndefOr[HeightWidthType] = js.native
   // TODO
  var moment: js.UndefOr[MomentConstructor] = js.native
  var moveable: js.UndefOr[Boolean] = js.native
  var multiselect: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[String] = js.native
  var sampling: js.UndefOr[Boolean] = js.native
  var showCurrentTime: js.UndefOr[Boolean] = js.native
  var showMajorLabels: js.UndefOr[Boolean] = js.native
  var showMinorLabels: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[Boolean] = js.native
  var stack: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[DateType] = js.native
  var style: js.UndefOr[Graph2dStyleType] = js.native
  var throttleRedraw: js.UndefOr[Double] = js.native
  var timeAxis: js.UndefOr[TimelineTimeAxisOption] = js.native
  var width: js.UndefOr[HeightWidthType] = js.native
  var yAxisOrientation: js.UndefOr[RightLeftEnumType] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zoomKey: js.UndefOr[String] = js.native
  var zoomMax: js.UndefOr[Double] = js.native
  var zoomMin: js.UndefOr[Double] = js.native
  var zoomable: js.UndefOr[Boolean] = js.native
}

object Graph2dOptions {
  @scala.inline
  def apply(): Graph2dOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dOptions]
  }
  @scala.inline
  implicit class Graph2dOptionsOps[Self <: Graph2dOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withBarChart(value: Graph2dOptionBarChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barChart")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToUse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToUse")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigureFunction2(value: (/* option */ String, /* path */ js.Array[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConfigure(value: TimelineOptionsConfigureType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAxis(value: Graph2dOptionDataAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawPoints(value: Graph2dOptionDrawPoints): Self = {
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
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: DateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphHeight(value: HeightWidthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: HeightWidthType): Self = {
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
    def withHiddenDates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenDates")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: Graph2dLegendOption): Self = {
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
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocales(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: DateType): Self = {
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
    def withMaxHeight(value: HeightWidthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMinorChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMinorChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMinorChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMinorChars")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: DateType): Self = {
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
    def withMinHeight(value: HeightWidthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMomentFunction4(
      value: (/* inp */ js.UndefOr[MomentInput], /* format */ js.UndefOr[MomentFormatSpecification], /* language */ js.UndefOr[String], /* strict */ js.UndefOr[Boolean]) => Moment
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moment")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMomentFunction3(
      value: (/* inp */ js.UndefOr[MomentInput], /* format */ js.UndefOr[MomentFormatSpecification], /* strict */ js.UndefOr[Boolean]) => Moment
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moment")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMoment(value: MomentConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moment")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveable")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withSampling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampling")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCurrentTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCurrentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCurrentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMajorLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMajorLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMajorLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMajorLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinorLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinorLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinorLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinorLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: DateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Graph2dStyleType): Self = {
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
    def withThrottleRedraw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleRedraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleRedraw")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeAxis(value: TimelineTimeAxisOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: HeightWidthType): Self = {
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
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomKey")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomable")(js.undefined)
        ret
    }
  }
  
}

