package typingsSlinky.storybookPreact.typesMod

import typingsSlinky.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderMainArgs extends js.Object {
  var forceRender: Boolean = js.native
  var selectedKind: String = js.native
  var selectedStory: String = js.native
  def showError(args: ShowErrorArgs): Unit = js.native
  def showMain(): Unit = js.native
  def storyFn(): StoryFn[StoryFnPreactReturnType] = js.native
}

object RenderMainArgs {
  @scala.inline
  def apply(
    forceRender: Boolean,
    selectedKind: String,
    selectedStory: String,
    showError: ShowErrorArgs => Unit,
    showMain: () => Unit,
    storyFn: () => StoryFn[StoryFnPreactReturnType]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any], showError = js.Any.fromFunction1(showError), showMain = js.Any.fromFunction0(showMain), storyFn = js.Any.fromFunction0(storyFn))
    __obj.asInstanceOf[RenderMainArgs]
  }
  @scala.inline
  implicit class RenderMainArgsOps[Self <: RenderMainArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedStory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowError(value: ShowErrorArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowMain(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStoryFn(value: () => StoryFn[StoryFnPreactReturnType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyFn")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

