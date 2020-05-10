package typingsSlinky.semanticUiReact.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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
import typingsSlinky.semanticUiReact.tableTableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def attached(value: Boolean | top | bottom): this.type = set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def basic(value: Boolean | very): this.type = set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def celled(value: Boolean | internally): this.type = set("celled", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsing(value: Boolean): this.type = set("collapsing", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def columns(value: SemanticWIDTHS): this.type = set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def compact(value: Boolean | very): this.type = set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def definition(value: Boolean): this.type = set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def footerRowReactElement(value: ReactElement): this.type = set("footerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def footerRowFunction3(
      value: (/* component */ ReactComponentClass[TableRowProps], TableRowProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("footerRow", js.Any.fromFunction3(value))
    @scala.inline
    def footerRow(value: SemanticShorthandItem[TableRowProps]): this.type = set("footerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRowReactElement(value: ReactElement): this.type = set("headerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRowFunction3(
      value: (/* component */ ReactComponentClass[TableRowProps], TableRowProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("headerRow", js.Any.fromFunction3(value))
    @scala.inline
    def headerRow(value: SemanticShorthandItem[TableRowProps]): this.type = set("headerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRows(value: SemanticShorthandCollection[TableRowProps]): this.type = set("headerRows", value.asInstanceOf[js.Any])
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def padded(value: Boolean | very): this.type = set("padded", value.asInstanceOf[js.Any])
    @scala.inline
    def renderBodyRow(value: (/* data */ js.Any, /* index */ Double) => _): this.type = set("renderBodyRow", js.Any.fromFunction2(value))
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def singleLine(value: Boolean): this.type = set("singleLine", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: small | large): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def sortable(value: Boolean): this.type = set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def stackable(value: Boolean): this.type = set("stackable", value.asInstanceOf[js.Any])
    @scala.inline
    def striped(value: Boolean): this.type = set("striped", value.asInstanceOf[js.Any])
    @scala.inline
    def structured(value: Boolean): this.type = set("structured", value.asInstanceOf[js.Any])
    @scala.inline
    def tableData(value: js.Array[_]): this.type = set("tableData", value.asInstanceOf[js.Any])
    @scala.inline
    def textAlign(value: center | left | right): this.type = set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def unstackable(value: Boolean): this.type = set("unstackable", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

