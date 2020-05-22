package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props
import typingsSlinky.wordpressComponents.tabbableMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabbable {
  @JSImport("@wordpress/components/navigable-container/tabbable", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1526208399[^] = new SharedBuilder_Props1526208399[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tabbable.type): SharedBuilder_Props1526208399[^] = new SharedBuilder_Props1526208399[^](js.Array(this.component, js.Dictionary.empty))()
}

