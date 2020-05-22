package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.menuMod.NavigableMenu.Props
import typingsSlinky.wordpressComponents.navigableContainerMod.NavigableMenu.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigableMenu {
  @JSImport("@wordpress/components/navigable-container", "NavigableMenu")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_1836833239[^] = new SharedBuilder_Props_1836833239[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NavigableMenu.type): SharedBuilder_Props_1836833239[^] = new SharedBuilder_Props_1836833239[^](js.Array(this.component, js.Dictionary.empty))()
}

