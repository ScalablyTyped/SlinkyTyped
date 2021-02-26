package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.storybookUi.anon.IsFullscreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Main {
  
  @scala.inline
  def apply(isFullscreen: Boolean, position: CSSProperties): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IsFullscreen]))
  }
  
  @JSImport("@storybook/ui/dist/components/layout/container", "Main")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IsFullscreen): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
