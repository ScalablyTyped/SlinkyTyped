package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.storybookApi.storiesMod.Group
import typingsSlinky.storybookApi.storiesMod.Story
import typingsSlinky.storybookUi.typesMod.FramesRendererProps
import typingsSlinky.storybookUi.typesMod.ViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FramesRenderer {
  
  @scala.inline
  def apply(
    baseUrl: String,
    queryParams: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['customQueryParams'] */ js.Any,
    refId: String,
    refs: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any,
    scale: Double,
    story: Story | Group,
    storyId: String,
    viewMode: ViewMode
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[FramesRendererProps]))
  }
  
  @JSImport("@storybook/ui/dist/components/preview/FramesRenderer", "FramesRenderer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FramesRendererProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
