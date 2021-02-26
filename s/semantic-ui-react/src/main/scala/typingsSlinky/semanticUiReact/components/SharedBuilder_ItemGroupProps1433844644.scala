package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.itemItemMod.ItemProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ItemGroupProps1433844644 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def divided(value: Boolean): this.type = set("divided", value.asInstanceOf[js.Any])
  
  @scala.inline
  def items(value: SemanticShorthandCollection[ItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemsVarargs(value: SemanticShorthandItem[ItemProps]*): this.type = set("items", js.Array(value :_*))
  
  @scala.inline
  def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
  
  @scala.inline
  def relaxed(value: Boolean | very): this.type = set("relaxed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def unstackable(value: Boolean): this.type = set("unstackable", value.asInstanceOf[js.Any])
}
