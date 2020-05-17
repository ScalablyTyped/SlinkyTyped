package typingsSlinky.storybookAddonStoryshots.anon

import typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.ClientApi
import typingsSlinky.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Framework extends js.Object {
  var framework: SupportedFramework = js.native
  var renderShallowTree: js.Any = js.native
  var renderTree: typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.RenderTree = js.native
  var storybook: ClientApi = js.native
}

object Framework {
  @scala.inline
  def apply(
    framework: SupportedFramework,
    renderShallowTree: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    storybook: ClientApi
  ): Framework = {
    val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any], renderShallowTree = renderShallowTree.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), storybook = storybook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Framework]
  }
  @scala.inline
  implicit class FrameworkOps[Self <: Framework] (val x: Self) extends AnyVal {
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

