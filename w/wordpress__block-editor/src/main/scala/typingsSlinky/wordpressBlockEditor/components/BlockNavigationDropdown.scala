package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BlockNavigationDropdown {
  @JSImport("@wordpress/block-editor", "BlockNavigationDropdown")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_764346026 = new SharedBuilder_Props_764346026(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BlockNavigationDropdown.type): SharedBuilder_Props_764346026 = new SharedBuilder_Props_764346026(js.Array(this.component, js.Dictionary.empty))()
}

