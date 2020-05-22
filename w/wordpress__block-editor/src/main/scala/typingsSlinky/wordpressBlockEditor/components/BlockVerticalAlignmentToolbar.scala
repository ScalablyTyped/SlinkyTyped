package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.blockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar.Props
import typingsSlinky.wordpressBlockEditor.blockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar.Value
import typingsSlinky.wordpressBlockEditor.mod.BlockVerticalAlignmentToolbar.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockVerticalAlignmentToolbar {
  @JSImport("@wordpress/block-editor", "BlockVerticalAlignmentToolbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def value(value: Value): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: Value => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

