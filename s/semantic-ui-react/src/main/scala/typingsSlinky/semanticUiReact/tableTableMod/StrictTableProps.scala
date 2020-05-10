package typingsSlinky.semanticUiReact.tableTableMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.center
import typingsSlinky.semanticUiReact.semanticUiReactStrings.internally
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import typingsSlinky.semanticUiReact.tableRowMod.TableRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictTableProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Attach table to other content */
  var attached: js.UndefOr[Boolean | top | bottom] = js.native
  /** A table can reduce its complexity to increase readability. */
  var basic: js.UndefOr[Boolean | very] = js.native
  /** A table may be divided each row into separate cells. */
  var celled: js.UndefOr[Boolean | internally] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A table can be collapsing, taking up only as much space as its rows. */
  var collapsing: js.UndefOr[Boolean] = js.native
  /** A table can be given a color to distinguish it from other tables. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** A table can specify its column count to divide its content evenly. */
  var columns: js.UndefOr[SemanticWIDTHS] = js.native
  /** A table may sometimes need to be more compact to make more rows visible at a time. */
  var compact: js.UndefOr[Boolean | very] = js.native
  /** A table may be formatted to emphasize a first column that defines a rows content. */
  var definition: js.UndefOr[Boolean] = js.native
  /**
    * A table can use fixed a special faster form of table rendering that does not resize table cells based on content.
    */
  var fixed: js.UndefOr[Boolean] = js.native
  /** Shorthand for a TableRow to be placed within Table.Footer. */
  var footerRow: js.UndefOr[SemanticShorthandItem[TableRowProps]] = js.native
  /** Shorthand for a TableRow to be placed within Table.Header. */
  var headerRow: js.UndefOr[SemanticShorthandItem[TableRowProps]] = js.native
  /** Shorthand for multiple TableRows to be placed within Table.Header. */
  var headerRows: js.UndefOr[SemanticShorthandCollection[TableRowProps]] = js.native
  /** A table's colors can be inverted. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** A table may sometimes need to be more padded for legibility. */
  var padded: js.UndefOr[Boolean | very] = js.native
  /**
    * Mapped over `tableData` and should return shorthand for each Table.Row to be placed within Table.Body.
    *
    * @param {*} data - An element in the `tableData` array.
    * @param {number} index - The index of the current element in `tableData`.
    * @returns {*} Shorthand for a Table.Row.
    */
  var renderBodyRow: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, _]] = js.native
  /** A table can have its rows appear selectable. */
  var selectable: js.UndefOr[Boolean] = js.native
  /** A table can specify that its cell contents should remain on a single line and not wrap. */
  var singleLine: js.UndefOr[Boolean] = js.native
  /** A table can also be small or large. */
  var size: js.UndefOr[small | large] = js.native
  /** A table may allow a user to sort contents by clicking on a table header. */
  var sortable: js.UndefOr[Boolean] = js.native
  /** A table can specify how it stacks table content responsively. */
  var stackable: js.UndefOr[Boolean] = js.native
  /** A table can stripe alternate rows of content with a darker color to increase contrast. */
  var striped: js.UndefOr[Boolean] = js.native
  /** A table can be formatted to display complex structured data. */
  var structured: js.UndefOr[Boolean] = js.native
  /** Data to be passed to the renderBodyRow function. */
  var tableData: js.UndefOr[js.Array[_]] = js.native
  /** A table can adjust its text alignment. */
  var textAlign: js.UndefOr[center | left | right] = js.native
  /** A table can specify how it stacks table content responsively. */
  var unstackable: js.UndefOr[Boolean] = js.native
  /** A table can adjust its text alignment. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
}

object StrictTableProps {
  @scala.inline
  def apply(): StrictTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTableProps]
  }
  @scala.inline
  implicit class StrictTablePropsOps[Self <: StrictTableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withAttached(value: Boolean | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.undefined)
        ret
    }
    @scala.inline
    def withBasic(value: Boolean | very): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(js.undefined)
        ret
    }
    @scala.inline
    def withCelled(value: Boolean | internally): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("celled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("celled")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: SemanticCOLORS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: SemanticWIDTHS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean | very): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterRowReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterRowFunction3(
      value: (/* component */ ReactComponentClass[TableRowProps], TableRowProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFooterRow(value: SemanticShorthandItem[TableRowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRowReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderRowFunction3(
      value: (/* component */ ReactComponentClass[TableRowProps], TableRowProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHeaderRow(value: SemanticShorthandItem[TableRowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRows(value: SemanticShorthandCollection[TableRowProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRows")(js.undefined)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withPadded(value: Boolean | very): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padded")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBodyRow(value: (/* data */ js.Any, /* index */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBodyRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderBodyRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBodyRow")(js.undefined)
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
    def withSingleLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withStackable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackable")(js.undefined)
        ret
    }
    @scala.inline
    def withStriped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStriped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(js.undefined)
        ret
    }
    @scala.inline
    def withStructured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structured")(js.undefined)
        ret
    }
    @scala.inline
    def withTableData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableData")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: center | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withUnstackable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstackable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnstackable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstackable")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
  }
  
}

