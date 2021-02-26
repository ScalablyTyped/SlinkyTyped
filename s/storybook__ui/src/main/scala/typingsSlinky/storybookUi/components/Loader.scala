package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.loaderMod.LoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Loader {
  
  @scala.inline
  def apply(size: Double): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[LoaderProps]))
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Loader", "Loader")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoaderProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
