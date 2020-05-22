package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown.Props
import typingsSlinky.wordpressBlockEditor.mod.BlockNavigationDropdown.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockNavigationDropdown {
  @JSImport("@wordpress/block-editor", "BlockNavigationDropdown")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1102568829[^] = new SharedBuilder_Props_1102568829[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BlockNavigationDropdown.type): SharedBuilder_Props_1102568829[^] = new SharedBuilder_Props_1102568829[^](js.Array(this.component, js.Dictionary.empty))()
}

