package typingsSlinky.sharepoint.anon

import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.GridPane
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Header
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Splitter
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cell extends js.Object {
  
  var Cell: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Cell = js.native
  
  var GridPane: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.GridPane = js.native
  
  var Header: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Header = js.native
  
  var RowHeaderStyle: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle = js.native
  
  var Splitter: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Splitter = js.native
  
  var SplitterHandle: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.SplitterHandle = js.native
  
  var TimescaleTier: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.TimescaleTier = js.native
  
  var Widget: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Widget = js.native
}
object Cell {
  
  @scala.inline
  def apply(
    Cell: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Cell,
    GridPane: GridPane,
    Header: Header,
    RowHeaderStyle: RowHeaderStyle,
    Splitter: Splitter,
    SplitterHandle: SplitterHandle,
    TimescaleTier: TimescaleTier,
    Widget: Widget
  ): Cell = {
    val __obj = js.Dynamic.literal(Cell = Cell.asInstanceOf[js.Any], GridPane = GridPane.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], RowHeaderStyle = RowHeaderStyle.asInstanceOf[js.Any], Splitter = Splitter.asInstanceOf[js.Any], SplitterHandle = SplitterHandle.asInstanceOf[js.Any], TimescaleTier = TimescaleTier.asInstanceOf[js.Any], Widget = Widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCell(value: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Cell): Self = this.set("Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridPane(value: GridPane): Self = this.set("GridPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: Header): Self = this.set("Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeaderStyle(value: RowHeaderStyle): Self = this.set("RowHeaderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitter(value: Splitter): Self = this.set("Splitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitterHandle(value: SplitterHandle): Self = this.set("SplitterHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimescaleTier(value: TimescaleTier): Self = this.set("TimescaleTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidget(value: Widget): Self = this.set("Widget", value.asInstanceOf[js.Any])
  }
}
