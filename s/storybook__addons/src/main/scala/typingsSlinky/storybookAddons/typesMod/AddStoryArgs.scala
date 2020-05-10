package typingsSlinky.storybookAddons.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddStoryArgs[StoryFnReturnType] extends js.Object {
  var id: String = js.native
  var kind: String = js.native
  var name: String = js.native
  var parameters: Parameters = js.native
  var storyFn: StoryFn[StoryFnReturnType] = js.native
}

object AddStoryArgs {
  @scala.inline
  def apply[StoryFnReturnType](
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    storyFn: /* p */ js.UndefOr[StoryContext] => StoryFnReturnType
  ): AddStoryArgs[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = js.Any.fromFunction1(storyFn))
    __obj.asInstanceOf[AddStoryArgs[StoryFnReturnType]]
  }
  @scala.inline
  implicit class AddStoryArgsOps[Self[storyfnreturntype] <: AddStoryArgs[storyfnreturntype], StoryFnReturnType] (val x: Self[StoryFnReturnType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StoryFnReturnType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StoryFnReturnType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StoryFnReturnType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StoryFnReturnType] with Other]
    @scala.inline
    def withId(value: String): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: Parameters): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoryFn(value: /* p */ js.UndefOr[StoryContext] => StoryFnReturnType): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storyFn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

