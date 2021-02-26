package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockNavigationDropdown {
  
  @JSImport("@wordpress/block-editor", "BlockNavigationDropdown")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BlockNavigationDropdown.type): SharedBuilder_Props_764346026 = new SharedBuilder_Props_764346026(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_764346026 = new SharedBuilder_Props_764346026(js.Array(this.component, p.asInstanceOf[js.Any]))
}
