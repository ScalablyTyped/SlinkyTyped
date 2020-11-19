package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.semanticUiReactStrings.center
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.tableCellMod.TableCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TableRowProps1849714678 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def cellAs(value: js.Any): this.type = set("cellAs", value.asInstanceOf[js.Any])
  
  @scala.inline
  def cellsVarargs(value: SemanticShorthandItem[TableCellProps]*): this.type = set("cells", js.Array(value :_*))
  
  @scala.inline
  def cells(value: SemanticShorthandCollection[TableCellProps]): this.type = set("cells", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
  
  @scala.inline
  def negative(value: Boolean): this.type = set("negative", value.asInstanceOf[js.Any])
  
  @scala.inline
  def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
  
  @scala.inline
  def textAlign(value: center | left | right): this.type = set("textAlign", value.asInstanceOf[js.Any])
  
  @scala.inline
  def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  
  @scala.inline
  def warning(value: Boolean): this.type = set("warning", value.asInstanceOf[js.Any])
}
