package typingsSlinky.storybookAddonStoryshots

import typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.ClientApi
import typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import typingsSlinky.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFramework extends js.Object {
  var framework: SupportedFramework
  var renderShallowTree: js.Any
  var renderTree: RenderTree
  var storybook: ClientApi
}

object AnonFramework {
  @scala.inline
  def apply(
    framework: SupportedFramework,
    renderShallowTree: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    storybook: ClientApi
  ): AnonFramework = {
    val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any], renderShallowTree = renderShallowTree.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), storybook = storybook.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFramework]
  }
}

