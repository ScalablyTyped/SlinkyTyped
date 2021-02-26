package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AboutScreen {
  
  @scala.inline
  def apply(
    current: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['versions']['current'] */ js.Any,
    latest: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['versions']['latest'] */ js.Any
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Current]))
  }
  
  @JSImport("@storybook/ui/dist/settings/about", "AboutScreen")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Current): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
