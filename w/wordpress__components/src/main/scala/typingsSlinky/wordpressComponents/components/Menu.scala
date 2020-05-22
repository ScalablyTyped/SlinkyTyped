package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.menuMod.NavigableMenu.Props
import typingsSlinky.wordpressComponents.menuMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu {
  @JSImport("@wordpress/components/navigable-container/menu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1836833239[^] = new SharedBuilder_Props_1836833239[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Menu.type): SharedBuilder_Props_1836833239[^] = new SharedBuilder_Props_1836833239[^](js.Array(this.component, js.Dictionary.empty))()
}

