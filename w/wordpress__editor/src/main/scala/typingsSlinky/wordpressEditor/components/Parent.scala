package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.parentMod.PageAttributesParent.Props
import typingsSlinky.wordpressEditor.parentMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Parent {
  @JSImport("@wordpress/editor/components/page-attributes/parent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props4091634[^] = new SharedBuilder_Props4091634[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Parent.type): SharedBuilder_Props4091634[^] = new SharedBuilder_Props4091634[^](js.Array(this.component, js.Dictionary.empty))()
}

