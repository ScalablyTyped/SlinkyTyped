package typingsSlinky.storybookAddonInfo.mod

import typingsSlinky.storybookAddons.typesMod.StoryContext
import typingsSlinky.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapStoryProps extends js.Object {
  var context: js.UndefOr[js.Object] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var storyFn: js.UndefOr[StoryFn[_]] = js.native
}

object WrapStoryProps {
  @scala.inline
  def apply(): WrapStoryProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapStoryProps]
  }
  @scala.inline
  implicit class WrapStoryPropsOps[Self <: WrapStoryProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withStoryFn(value: /* p */ js.UndefOr[StoryContext] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStoryFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyFn")(js.undefined)
        ret
    }
  }
  
}

