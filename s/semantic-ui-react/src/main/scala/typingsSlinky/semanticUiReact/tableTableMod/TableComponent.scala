package typingsSlinky.semanticUiReact.tableTableMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.tableBodyMod.TableBodyProps
import typingsSlinky.semanticUiReact.tableCellMod.TableCellProps
import typingsSlinky.semanticUiReact.tableFooterMod.TableFooterProps
import typingsSlinky.semanticUiReact.tableHeaderCellMod.TableHeaderCellProps
import typingsSlinky.semanticUiReact.tableHeaderMod.TableHeaderProps
import typingsSlinky.semanticUiReact.tableRowMod.TableRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponent extends FunctionComponent[TableProps] {
  var Body: ReactComponentClass[TableBodyProps] = js.native
  var Cell: ReactComponentClass[TableCellProps] = js.native
  var Footer: ReactComponentClass[TableFooterProps] = js.native
  var Header: ReactComponentClass[TableHeaderProps] = js.native
  var HeaderCell: ReactComponentClass[TableHeaderCellProps] = js.native
  var Row: ReactComponentClass[TableRowProps] = js.native
}

