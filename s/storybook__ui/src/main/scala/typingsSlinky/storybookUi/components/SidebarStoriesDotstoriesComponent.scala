package typingsSlinky.storybookUi.components

import typingsSlinky.storybookUi.sidebarSidebarStoriesMod.StoriesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SidebarStoriesDotstoriesComponent {
  @JSImport("@storybook/ui/dist/components/sidebar/SidebarStories.stories", "default.component")
  @js.native
  object component extends js.Object
  
  def withProps(p: StoriesProps): SharedBuilder_StoriesProps_1073806594 = new SharedBuilder_StoriesProps_1073806594(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    loading: Boolean,
    stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any
  ): SharedBuilder_StoriesProps_1073806594 = {
    val __props = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    new SharedBuilder_StoriesProps_1073806594(js.Array(this.component, __props.asInstanceOf[StoriesProps]))
  }
}

