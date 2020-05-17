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
import scala.scalajs.js.annotation._

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
    def withCell(value: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridPane(value: GridPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeaderStyle(value: RowHeaderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowHeaderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitter(value: Splitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Splitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitterHandle(value: SplitterHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitterHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimescaleTier(value: TimescaleTier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimescaleTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidget(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Widget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

