package typingsSlinky.wordpressComponents.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabbableContainer {
  @JSImport("@wordpress/components/navigable-container", "TabbableContainer")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props651459230[HTMLDivElement] = new SharedBuilder_Props651459230[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabbableContainer.type): SharedBuilder_Props651459230[HTMLDivElement] = new SharedBuilder_Props651459230[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
}

