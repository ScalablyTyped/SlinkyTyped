package typingsSlinky.storybookComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.zoomElementMod.ZoomProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Element {
  
  @scala.inline
  def apply(children: ReactElement | js.Array[ReactElement], scale: Double): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ZoomProps]))
  }
  
  @JSImport("@storybook/components", "Zoom.Element")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ZoomProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
