package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.ShouldScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZoomProvider {
  
  @scala.inline
  def apply(shouldScale: Boolean): typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.zoomMod.ZoomProvider] = {
    val __props = js.Dynamic.literal(shouldScale = shouldScale.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.zoomMod.ZoomProvider](js.Array(this.component, __props.asInstanceOf[ShouldScale]))
  }
  
  @JSImport("@storybook/ui/dist/components/preview/tools/zoom", "ZoomProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ShouldScale): typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.zoomMod.ZoomProvider] = new typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.storybookUi.zoomMod.ZoomProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
}
