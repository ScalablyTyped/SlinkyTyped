package typingsSlinky.storybookClientApi.typesMod

import typingsSlinky.storybookClientApi.storyStoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApiParams extends js.Object {
  var decorateStory: js.UndefOr[js.Function2[/* storyFn */ js.Any, /* decorators */ js.Any, _]] = js.native
  var storyStore: default = js.native
}

object ClientApiParams {
  @scala.inline
  def apply(storyStore: default): ClientApiParams = {
    val __obj = js.Dynamic.literal(storyStore = storyStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApiParams]
  }
  @scala.inline
  implicit class ClientApiParamsOps[Self <: ClientApiParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStoryStore(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorateStory(value: (/* storyFn */ js.Any, /* decorators */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorateStory")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDecorateStory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorateStory")(js.undefined)
        ret
    }
  }
  
}

