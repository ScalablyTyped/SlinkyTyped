package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.PropsMobileProps
import typingsSlinky.storybookUi.mobileMod.MobileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitialAddons {
  
  @scala.inline
  def apply(props: MobileProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PropsMobileProps]))
  }
  
  @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "InitialAddons")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsMobileProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
