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

trait Cell extends js.Object {
  var Cell: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Cell
  var GridPane: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.GridPane
  var Header: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Header
  var RowHeaderStyle: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.RowHeaderStyle
  var Splitter: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Splitter
  var SplitterHandle: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
  var TimescaleTier: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.TimescaleTier
  var Widget: typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Widget
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
}

