package typingsSlinky.vis.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import typingsSlinky.vis.AnonTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineOptions extends js.Object {
  var align: js.UndefOr[TimelineAlignType] = js.native
  var autoResize: js.UndefOr[Boolean] = js.native
  var clickToUse: js.UndefOr[Boolean] = js.native
  var configure: js.UndefOr[TimelineOptionsConfigureType] = js.native
  var dataAttributes: js.UndefOr[TimelineOptionsDataAttributesType] = js.native
  var editable: js.UndefOr[TimelineOptionsEditableType] = js.native
  var end: js.UndefOr[DateType] = js.native
  var format: js.UndefOr[TimelineFormatOption] = js.native
  var groupEditable: js.UndefOr[TimelineOptionsGroupEditableType] = js.native
  var groupOrder: js.UndefOr[TimelineOptionsGroupOrderType] = js.native
  var groupOrderSwap: js.UndefOr[TimelineOptionsGroupOrderSwapFunction] = js.native
  var groupTemplate: js.UndefOr[TimelineOptionsTemplateFunction] = js.native
  var height: js.UndefOr[HeightWidthType] = js.native
  var hiddenDates: js.UndefOr[TimelineOptionsHiddenDatesType] = js.native
  var horizontalScroll: js.UndefOr[Boolean] = js.native
  var itemsAlwaysDraggable: js.UndefOr[TimelineOptionsItemsAlwaysDraggableType] = js.native
  var locale: js.UndefOr[String] = js.native
  var locales: js.UndefOr[js.Any] = js.native
  var margin: js.UndefOr[TimelineOptionsMarginType] = js.native
  var max: js.UndefOr[DateType] = js.native
  var maxHeight: js.UndefOr[HeightWidthType] = js.native
  var maxMinorChars: js.UndefOr[Double] = js.native
  var min: js.UndefOr[DateType] = js.native
  var minHeight: js.UndefOr[HeightWidthType] = js.native
   // TODO
  var moment: js.UndefOr[MomentConstructor] = js.native
  var moveable: js.UndefOr[Boolean] = js.native
  var multiselect: js.UndefOr[Boolean] = js.native
  var multiselectPerGroup: js.UndefOr[Boolean] = js.native
  var onAdd: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var onAddGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.native
  var onInitialDrawComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onMove: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var onMoveGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.native
  var onMoving: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var onRemove: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var onRemoveGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.native
  var onUpdate: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var order: js.UndefOr[TimelineOptionsComparisonFunction] = js.native
  var orientation: js.UndefOr[TimelineOptionsOrientationType] = js.native
  var rollingMode: js.UndefOr[TimelineRollingModeOption] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var showCurrentTime: js.UndefOr[Boolean] = js.native
  var showMajorLabels: js.UndefOr[Boolean] = js.native
  var showMinorLabels: js.UndefOr[Boolean] = js.native
  var showTooltips: js.UndefOr[Boolean] = js.native
  var snap: js.UndefOr[TimelineOptionsSnapFunction] = js.native
  var stack: js.UndefOr[Boolean] = js.native
  var stackSubgroups: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[DateType] = js.native
  var template: js.UndefOr[TimelineOptionsTemplateFunction] = js.native
  var throttleRedraw: js.UndefOr[Double] = js.native
  var timeAxis: js.UndefOr[TimelineTimeAxisOption] = js.native
  var tooltip: js.UndefOr[TimelineTooltipOption] = js.native
  var tooltipOnItemUpdateTime: js.UndefOr[Boolean | AnonTemplate] = js.native
  var `type`: js.UndefOr[String] = js.native
  var verticalScroll: js.UndefOr[Boolean] = js.native
  var visibleFrameTemplate: js.UndefOr[TimelineOptionsTemplateFunction] = js.native
  var width: js.UndefOr[HeightWidthType] = js.native
  var zoomKey: js.UndefOr[String] = js.native
  var zoomMax: js.UndefOr[Double] = js.native
  var zoomMin: js.UndefOr[Double] = js.native
  var zoomable: js.UndefOr[Boolean] = js.native
}

object TimelineOptions {
  @scala.inline
  def apply(): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOptions]
  }
  @scala.inline
  implicit class TimelineOptionsOps[Self <: TimelineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: TimelineAlignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
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
    def withDataAttributes(value: TimelineOptionsDataAttributesType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: TimelineOptionsEditableType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
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
    def withFormat(value: TimelineFormatOption): Self = {
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
    def withGroupEditable(value: TimelineOptionsGroupEditableType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOrderFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGroupOrder(value: TimelineOptionsGroupOrderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupOrderSwap(value: (/* fromGroup */ js.Any, /* toGroup */ js.Any, /* groups */ DataSet[DataGroup]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrderSwap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGroupOrderSwap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupOrderSwap")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupTemplate(
      value: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGroupTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(js.undefined)
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
    def withHiddenDates(value: TimelineOptionsHiddenDatesType): Self = {
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
    def withHorizontalScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsAlwaysDraggable(value: TimelineOptionsItemsAlwaysDraggableType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsAlwaysDraggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsAlwaysDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsAlwaysDraggable")(js.undefined)
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
    def withMargin(value: TimelineOptionsMarginType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
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
    def withMultiselectPerGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselectPerGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiselectPerGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiselectPerGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAddGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddGroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAddGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAddGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialDrawComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialDrawComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInitialDrawComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialDrawComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMove(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveGroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMoveGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoving(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoving")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoving")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoveGroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRemoveGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoveGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: TimelineOptionsOrientationType): Self = {
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
    def withRollingMode(value: TimelineRollingModeOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
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
    def withShowTooltips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltips")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(value: (/* date */ js.Date, /* scale */ String, /* step */ Double) => js.Date | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
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
    def withStackSubgroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackSubgroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSubgroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackSubgroups")(js.undefined)
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
    def withTemplate(
      value: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
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
    def withTooltip(value: TimelineTooltipOption): Self = {
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
    def withTooltipOnItemUpdateTime(value: Boolean | AnonTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOnItemUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipOnItemUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOnItemUpdateTime")(js.undefined)
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
    def withVerticalScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleFrameTemplate(
      value: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleFrameTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutVisibleFrameTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleFrameTemplate")(js.undefined)
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

