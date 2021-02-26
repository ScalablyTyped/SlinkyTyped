package typingsSlinky.sharepoint.SP.JsGrid

import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Cell
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.GridPane
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Header
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Widget
import typingsSlinky.sharepoint.anon.AllSelected
import typingsSlinky.sharepoint.anon.Dra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyleManager extends StObject {
  
  def GetCellStyle(styleId: String): Cell = js.native
  
  def RegisterCellStyle(styleId: String, cellStyle: Cell): Unit = js.native
  
  def UpdateDefaultCellStyleFromCss(styleObject: Cell, cssClass: String): Unit = js.native
  
  def UpdateGridPaneStyleFromCss(styleObject: GridPane, gridStyleNameCollection: js.Any): Unit = js.native
  
  def UpdateGroupStylesFromCss(styleObject: Cell, prefix: String): Unit = js.native
  
  def UpdateHeaderStyleFromCss(styleObject: Header, headerStyleNameCol: js.Any): Unit = js.native
  
  def UpdateSplitterStyleFromCss(styleObject: Splitter, splitterStyleNameCollection: js.Any): Unit = js.native
  
  var columnHeaderStyleCollection: AllSelected = js.native
  
  var defaultCellStyle: Cell = js.native
  
  var gridPaneStyle: GridPane = js.native
  
  var groupingStyles: js.Array[_] = js.native
  
  var readOnlyCellStyle: Cell = js.native
  
  var readOnlyFocusedCellStyle: Cell = js.native
  
  var rowHeaderStyleCollection: AllSelected = js.native
  
  var splitterStyleCollection: Dra = js.native
  
  var timescaleTierStyle: TimescaleTier = js.native
  
  var widgetDockHoverStyle: Widget = js.native
  
  var widgetDockPressedStyle: Widget = js.native
  
  var widgetDockStyle: Widget = js.native
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
    columnHeaderStyleCollection: AllSelected,
    defaultCellStyle: Cell,
    gridPaneStyle: GridPane,
    groupingStyles: js.Array[_],
    readOnlyCellStyle: Cell,
    readOnlyFocusedCellStyle: Cell,
    rowHeaderStyleCollection: AllSelected,
    splitterStyleCollection: Dra,
    timescaleTierStyle: TimescaleTier,
    widgetDockHoverStyle: Widget,
    widgetDockPressedStyle: Widget,
    widgetDockStyle: Widget
  ): IStyleManager = {
    val __obj = js.Dynamic.literal(GetCellStyle = js.Any.fromFunction1(GetCellStyle), RegisterCellStyle = js.Any.fromFunction2(RegisterCellStyle), UpdateDefaultCellStyleFromCss = js.Any.fromFunction2(UpdateDefaultCellStyleFromCss), UpdateGridPaneStyleFromCss = js.Any.fromFunction2(UpdateGridPaneStyleFromCss), UpdateGroupStylesFromCss = js.Any.fromFunction2(UpdateGroupStylesFromCss), UpdateHeaderStyleFromCss = js.Any.fromFunction2(UpdateHeaderStyleFromCss), UpdateSplitterStyleFromCss = js.Any.fromFunction2(UpdateSplitterStyleFromCss), columnHeaderStyleCollection = columnHeaderStyleCollection.asInstanceOf[js.Any], defaultCellStyle = defaultCellStyle.asInstanceOf[js.Any], gridPaneStyle = gridPaneStyle.asInstanceOf[js.Any], groupingStyles = groupingStyles.asInstanceOf[js.Any], readOnlyCellStyle = readOnlyCellStyle.asInstanceOf[js.Any], readOnlyFocusedCellStyle = readOnlyFocusedCellStyle.asInstanceOf[js.Any], rowHeaderStyleCollection = rowHeaderStyleCollection.asInstanceOf[js.Any], splitterStyleCollection = splitterStyleCollection.asInstanceOf[js.Any], timescaleTierStyle = timescaleTierStyle.asInstanceOf[js.Any], widgetDockHoverStyle = widgetDockHoverStyle.asInstanceOf[js.Any], widgetDockPressedStyle = widgetDockPressedStyle.asInstanceOf[js.Any], widgetDockStyle = widgetDockStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleManager]
  }
  
  @scala.inline
  implicit class IStyleManagerMutableBuilder[Self <: IStyleManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnHeaderStyleCollection(value: AllSelected): Self = StObject.set(x, "columnHeaderStyleCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCellStyle(value: Cell): Self = StObject.set(x, "defaultCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCellStyle(value: String => Cell): Self = StObject.set(x, "GetCellStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGridPaneStyle(value: GridPane): Self = StObject.set(x, "gridPaneStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingStyles(value: js.Array[_]): Self = StObject.set(x, "groupingStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingStylesVarargs(value: js.Any*): Self = StObject.set(x, "groupingStyles", js.Array(value :_*))
    
    @scala.inline
    def setReadOnlyCellStyle(value: Cell): Self = StObject.set(x, "readOnlyCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyFocusedCellStyle(value: Cell): Self = StObject.set(x, "readOnlyFocusedCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterCellStyle(value: (String, Cell) => Unit): Self = StObject.set(x, "RegisterCellStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowHeaderStyleCollection(value: AllSelected): Self = StObject.set(x, "rowHeaderStyleCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitterStyleCollection(value: Dra): Self = StObject.set(x, "splitterStyleCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimescaleTierStyle(value: TimescaleTier): Self = StObject.set(x, "timescaleTierStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDefaultCellStyleFromCss(value: (Cell, String) => Unit): Self = StObject.set(x, "UpdateDefaultCellStyleFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateGridPaneStyleFromCss(value: (GridPane, js.Any) => Unit): Self = StObject.set(x, "UpdateGridPaneStyleFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateGroupStylesFromCss(value: (Cell, String) => Unit): Self = StObject.set(x, "UpdateGroupStylesFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateHeaderStyleFromCss(value: (Header, js.Any) => Unit): Self = StObject.set(x, "UpdateHeaderStyleFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateSplitterStyleFromCss(value: (Splitter, js.Any) => Unit): Self = StObject.set(x, "UpdateSplitterStyleFromCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWidgetDockHoverStyle(value: Widget): Self = StObject.set(x, "widgetDockHoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetDockPressedStyle(value: Widget): Self = StObject.set(x, "widgetDockPressedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetDockStyle(value: Widget): Self = StObject.set(x, "widgetDockStyle", value.asInstanceOf[js.Any])
  }
}
