package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.Props
import typingsSlinky.storybookUi.desktopMod.DesktopProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fullscreen {
  
  @scala.inline
  def apply(props: DesktopProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "Fullscreen")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
