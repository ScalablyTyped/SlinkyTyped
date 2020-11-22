package typingsSlinky.storybookComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookComponents.zoomElementMod.ZoomProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Element {
  
  @JSImport("@storybook/components", "Zoom.Element")
  @js.native
  object component extends js.Object
  
  def withProps(p: /* hasScaleChildren */ ZoomProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: ReactElement | js.Array[ReactElement], scale: Double): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[/* hasScaleChildren */ ZoomProps]))
  }
}
