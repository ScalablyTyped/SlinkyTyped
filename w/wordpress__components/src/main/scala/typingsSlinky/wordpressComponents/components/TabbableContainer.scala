package typingsSlinky.wordpressComponents.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabbableContainer {
  
  @JSImport("@wordpress/components/navigable-container", "TabbableContainer")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabbableContainer.type): SharedBuilder_Props651459230[HTMLDivElement] = new SharedBuilder_Props651459230[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props651459230[HTMLDivElement] = new SharedBuilder_Props651459230[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
