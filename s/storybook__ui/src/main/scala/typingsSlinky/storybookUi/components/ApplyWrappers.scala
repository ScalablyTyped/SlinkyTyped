package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookUi.typesMod.ApplyWrappersProps
import typingsSlinky.storybookUi.typesMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplyWrappers {
  
  @scala.inline
  def apply(
    active: Boolean,
    id: String,
    storyId: String,
    viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any,
    wrappers: js.Array[Wrapper]
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any], wrappers = wrappers.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ApplyWrappersProps]))
  }
  
  @JSImport("@storybook/ui/dist/components/preview/wrappers", "ApplyWrappers")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ApplyWrappersProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
