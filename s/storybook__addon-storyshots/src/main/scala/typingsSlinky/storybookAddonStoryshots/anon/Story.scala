package typingsSlinky.storybookAddonStoryshots.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Story extends js.Object {
  var context: js.Any = js.native
  var renderTree: typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod.RenderTree = js.native
  var story: js.Any = js.native
}

object Story {
  @scala.inline
  def apply(
    context: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    story: js.Any
  ): Story = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[Story]
  }
  @scala.inline
  implicit class StoryOps[Self <: Story] (val x: Self) extends AnyVal {
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
    def withStory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

