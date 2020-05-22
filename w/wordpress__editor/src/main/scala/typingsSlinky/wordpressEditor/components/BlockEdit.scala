package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.blockEditMod.BlockEdit.Props
import typingsSlinky.wordpressEditor.mod.BlockEdit.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object BlockEdit {
  @JSImport("@wordpress/editor", "BlockEdit")
  @js.native
  object component extends js.Object
  
  def apply(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BlockEdit.type): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, js.Dictionary.empty))()
}

