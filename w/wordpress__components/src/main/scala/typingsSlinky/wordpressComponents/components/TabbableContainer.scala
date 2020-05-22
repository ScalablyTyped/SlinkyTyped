package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.navigableContainerMod.TabbableContainer.^
import typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabbableContainer {
  @JSImport("@wordpress/components/navigable-container", "TabbableContainer")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1526208399[^] = new SharedBuilder_Props1526208399[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabbableContainer.type): SharedBuilder_Props1526208399[^] = new SharedBuilder_Props1526208399[^](js.Array(this.component, js.Dictionary.empty))()
}

