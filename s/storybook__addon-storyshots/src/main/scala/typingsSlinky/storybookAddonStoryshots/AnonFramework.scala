package typingsSlinky.storybookAddonStoryshots

import typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.ClientApi
import typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import typingsSlinky.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFramework extends js.Object {
  var framework: SupportedFramework = js.native
  var renderShallowTree: js.Any = js.native
  var renderTree: RenderTree = js.native
  var storybook: ClientApi = js.native
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
  @scala.inline
  implicit class AnonFrameworkOps[Self <: AnonFramework] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFramework(value: SupportedFramework): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderShallowTree(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderShallowTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTree(
      value: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTree")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStorybook(value: ClientApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storybook")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

