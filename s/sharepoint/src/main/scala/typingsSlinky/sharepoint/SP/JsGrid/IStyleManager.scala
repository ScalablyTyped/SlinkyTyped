package typingsSlinky.sharepoint.SP.JsGrid

import typingsSlinky.sharepoint.AnonAllSelected
import typingsSlinky.sharepoint.AnonDra
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Cell
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.GridPane
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Header
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IStyleManager extends js.Object {
  var columnHeaderStyleCollection: AnonAllSelected = js.native
  var defaultCellStyle: Cell = js.native
  var gridPaneStyle: GridPane = js.native
  var groupingStyles: js.Array[_] = js.native
  var readOnlyCellStyle: Cell = js.native
  var readOnlyFocusedCellStyle: Cell = js.native
  var rowHeaderStyleCollection: AnonAllSelected = js.native
  var splitterStyleCollection: AnonDra = js.native
  var timescaleTierStyle: TimescaleTier = js.native
  var widgetDockHoverStyle: Widget = js.native
  var widgetDockPressedStyle: Widget = js.native
  var widgetDockStyle: Widget = js.native
  def GetCellStyle(styleId: String): Cell = js.native
  def RegisterCellStyle(styleId: String, cellStyle: Cell): Unit = js.native
  def UpdateDefaultCellStyleFromCss(styleObject: Cell, cssClass: String): Unit = js.native
  def UpdateGridPaneStyleFromCss(styleObject: GridPane, gridStyleNameCollection: js.Any): Unit = js.native
  def UpdateGroupStylesFromCss(styleObject: Cell, prefix: String): Unit = js.native
  def UpdateHeaderStyleFromCss(styleObject: Header, headerStyleNameCol: js.Any): Unit = js.native
  def UpdateSplitterStyleFromCss(styleObject: Splitter, splitterStyleNameCollection: js.Any): Unit = js.native
}

object IStyleManager {
  @scala.inline
  def apply(
    GetCellStyle: String => Cell,
    RegisterCellStyle: (String, Cell) => Unit,
    UpdateDefaultCellStyleFromCss: (Cell, String) => Unit,
    UpdateGridPaneStyleFromCss: (GridPane, js.Any) => Unit,
    UpdateGroupStylesFromCss: (Cell, String) => Unit,
    UpdateHeaderStyleFromCss: (Header, js.Any) => Unit,
    UpdateSplitterStyleFromCss: (Splitter, js.Any) => Unit,
    columnHeaderStyleCollection: AnonAllSelected,
    defaultCellStyle: Cell,
    gridPaneStyle: GridPane,
    groupingStyles: js.Array[_],
    readOnlyCellStyle: Cell,
    readOnlyFocusedCellStyle: Cell,
    rowHeaderStyleCollection: AnonAllSelected,
    splitterStyleCollection: AnonDra,
    timescaleTierStyle: TimescaleTier,
    widgetDockHoverStyle: Widget,
    widgetDockPressedStyle: Widget,
    widgetDockStyle: Widget
  ): IStyleManager = {
    val __obj = js.Dynamic.literal(GetCellStyle = js.Any.fromFunction1(GetCellStyle), RegisterCellStyle = js.Any.fromFunction2(RegisterCellStyle), UpdateDefaultCellStyleFromCss = js.Any.fromFunction2(UpdateDefaultCellStyleFromCss), UpdateGridPaneStyleFromCss = js.Any.fromFunction2(UpdateGridPaneStyleFromCss), UpdateGroupStylesFromCss = js.Any.fromFunction2(UpdateGroupStylesFromCss), UpdateHeaderStyleFromCss = js.Any.fromFunction2(UpdateHeaderStyleFromCss), UpdateSplitterStyleFromCss = js.Any.fromFunction2(UpdateSplitterStyleFromCss), columnHeaderStyleCollection = columnHeaderStyleCollection.asInstanceOf[js.Any], defaultCellStyle = defaultCellStyle.asInstanceOf[js.Any], gridPaneStyle = gridPaneStyle.asInstanceOf[js.Any], groupingStyles = groupingStyles.asInstanceOf[js.Any], readOnlyCellStyle = readOnlyCellStyle.asInstanceOf[js.Any], readOnlyFocusedCellStyle = readOnlyFocusedCellStyle.asInstanceOf[js.Any], rowHeaderStyleCollection = rowHeaderStyleCollection.asInstanceOf[js.Any], splitterStyleCollection = splitterStyleCollection.asInstanceOf[js.Any], timescaleTierStyle = timescaleTierStyle.asInstanceOf[js.Any], widgetDockHoverStyle = widgetDockHoverStyle.asInstanceOf[js.Any], widgetDockPressedStyle = widgetDockPressedStyle.asInstanceOf[js.Any], widgetDockStyle = widgetDockStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleManager]
  }
  @scala.inline
  implicit class IStyleManagerOps[Self <: IStyleManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCellStyle(value: String => Cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCellStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterCellStyle(value: (String, Cell) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisterCellStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateDefaultCellStyleFromCss(value: (Cell, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDefaultCellStyleFromCss")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateGridPaneStyleFromCss(value: (GridPane, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateGridPaneStyleFromCss")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateGroupStylesFromCss(value: (Cell, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateGroupStylesFromCss")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateHeaderStyleFromCss(value: (Header, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateHeaderStyleFromCss")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateSplitterStyleFromCss(value: (Splitter, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateSplitterStyleFromCss")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withColumnHeaderStyleCollection(value: AnonAllSelected): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderStyleCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCellStyle(value: Cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridPaneStyle(value: GridPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridPaneStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupingStyles(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnlyCellStyle(value: Cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyCellStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnlyFocusedCellStyle(value: Cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyFocusedCellStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeaderStyleCollection(value: AnonAllSelected): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderStyleCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitterStyleCollection(value: AnonDra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitterStyleCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimescaleTierStyle(value: TimescaleTier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timescaleTierStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetDockHoverStyle(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetDockHoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetDockPressedStyle(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetDockPressedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetDockStyle(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetDockStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

