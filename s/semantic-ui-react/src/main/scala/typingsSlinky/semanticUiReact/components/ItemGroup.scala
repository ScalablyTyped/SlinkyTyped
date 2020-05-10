package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.itemGroupMod.ItemGroupProps
import typingsSlinky.semanticUiReact.itemItemMod.ItemProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ItemGroup {
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def divided(value: Boolean): this.type = set("divided", value.asInstanceOf[js.Any])
    @scala.inline
    def items(value: SemanticShorthandCollection[ItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def relaxed(value: Boolean | very): this.type = set("relaxed", value.asInstanceOf[js.Any])
    @scala.inline
    def unstackable(value: Boolean): this.type = set("unstackable", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ItemGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ItemGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

