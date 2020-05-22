package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.mod.PageAttributesParent.^
import typingsSlinky.wordpressEditor.parentMod.PageAttributesParent.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageAttributesParent {
  @JSImport("@wordpress/editor", "PageAttributesParent")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props4091634[^] = new SharedBuilder_Props4091634[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PageAttributesParent.type): SharedBuilder_Props4091634[^] = new SharedBuilder_Props4091634[^](js.Array(this.component, js.Dictionary.empty))()
}

