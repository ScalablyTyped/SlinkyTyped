package typingsSlinky.storybookAddonStoryshots

import typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import typingsSlinky.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRenderTree extends js.Object {
  var context: js.Any = js.native
  var renderTree: RenderTree = js.native
  var stories2snapsConverter: Stories2SnapsConverter = js.native
  var story: js.Any = js.native
}

object AnonRenderTree {
  @scala.inline
  def apply(
    context: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    stories2snapsConverter: Stories2SnapsConverter,
    story: js.Any
  ): AnonRenderTree = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), stories2snapsConverter = stories2snapsConverter.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRenderTree]
  }
  @scala.inline
  implicit class AnonRenderTreeOps[Self <: AnonRenderTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
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
    def withStories2snapsConverter(value: Stories2SnapsConverter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories2snapsConverter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

