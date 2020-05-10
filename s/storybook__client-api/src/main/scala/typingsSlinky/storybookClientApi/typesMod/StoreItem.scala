package typingsSlinky.storybookClientApi.typesMod

import typingsSlinky.storybookAddons.typesMod.Parameters
import typingsSlinky.storybookAddons.typesMod.StoryContext
import typingsSlinky.storybookAddons.typesMod.StoryFn
import typingsSlinky.storybookClientApi.hooksMod.HooksContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreItem extends StoryContext {
  @JSName("hooks")
  var hooks_StoreItem: HooksContext = js.native
  var story: String = js.native
  var storyFn: StoryFn[_] = js.native
  def getDecorated(): StoryFn[_] = js.native
  def getOriginal(): StoryFn[_] = js.native
}

object StoreItem {
  @scala.inline
  def apply(
    getDecorated: () => StoryFn[_],
    getOriginal: () => StoryFn[_],
    hooks: HooksContext,
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    story: String,
    storyFn: /* p */ js.UndefOr[StoryContext] => _
  ): StoreItem = {
    val __obj = js.Dynamic.literal(getDecorated = js.Any.fromFunction0(getDecorated), getOriginal = js.Any.fromFunction0(getOriginal), hooks = hooks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], storyFn = js.Any.fromFunction1(storyFn))
    __obj.asInstanceOf[StoreItem]
  }
  @scala.inline
  implicit class StoreItemOps[Self <: StoreItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDecorated(value: () => StoryFn[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecorated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOriginal(value: () => StoryFn[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOriginal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHooks(value: HooksContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryFn(value: /* p */ js.UndefOr[StoryContext] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyFn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

