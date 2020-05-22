package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditor.documentOutlineMod.DocumentOutline.Props
import typingsSlinky.wordpressEditor.mod.DocumentOutline.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentOutline {
  @JSImport("@wordpress/editor", "DocumentOutline")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def hasOutlineItemsDisabled(value: Boolean): this.type = set("hasOutlineItemsDisabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onSelect: () => Unit): Builder = {
    val __props = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

