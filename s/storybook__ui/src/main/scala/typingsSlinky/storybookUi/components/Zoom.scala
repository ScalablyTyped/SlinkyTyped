package typingsSlinky.storybookUi.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.Reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Zoom {
  
  @scala.inline
  def apply(
    reset: SyntheticMouseEvent[Element] => Unit,
    zoomIn: SyntheticMouseEvent[Element] => Unit,
    zoomOut: SyntheticMouseEvent[Element] => Unit
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), zoomIn = js.Any.fromFunction1(zoomIn), zoomOut = js.Any.fromFunction1(zoomOut))
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Reset]))
  }
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "Zoom")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Reset): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
