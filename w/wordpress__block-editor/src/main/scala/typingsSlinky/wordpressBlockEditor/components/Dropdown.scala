package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown.Props
import typingsSlinky.wordpressBlockEditor.dropdownMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown {
  @JSImport("@wordpress/block-editor/components/block-navigation/dropdown", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1102568829[^] = new SharedBuilder_Props_1102568829[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Dropdown.type): SharedBuilder_Props_1102568829[^] = new SharedBuilder_Props_1102568829[^](js.Array(this.component, js.Dictionary.empty))()
}

