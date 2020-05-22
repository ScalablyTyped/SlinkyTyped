package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressEditor.checkMod.DocumentOutlineCheck.Props
import typingsSlinky.wordpressEditor.mod.DocumentOutlineCheck.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentOutlineCheck {
  @JSImport("@wordpress/editor", "DocumentOutlineCheck")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DocumentOutlineCheck.type): Default[tag.type, ^] = new Default[tag.type, ^](js.Array(this.component, js.Dictionary.empty))()
}

