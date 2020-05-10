package typingsSlinky.storybookClientApi.typesMod

import slinky.core.facade.ReactElement
import typingsSlinky.storybookAddons.distMod.Addon
import typingsSlinky.storybookAddons.distMod.RenderOptions
import typingsSlinky.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApiAddon[StoryFnReturnType] extends Addon {
  @JSName("apply")
  def apply(a: StoryApi[StoryFnReturnType], b: js.Array[_]): js.Any = js.native
}

object ClientApiAddon {
  @scala.inline
  def apply[StoryFnReturnType](
    apply: (StoryApi[StoryFnReturnType], js.Array[_]) => js.Any,
    render: RenderOptions => ReactElement,
    title: String
  ): ClientApiAddon[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), render = js.Any.fromFunction1(render), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApiAddon[StoryFnReturnType]]
  }
  @scala.inline
  implicit class ClientApiAddonOps[Self[storyfnreturntype] <: ClientApiAddon[storyfnreturntype], StoryFnReturnType] (val x: Self[StoryFnReturnType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StoryFnReturnType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StoryFnReturnType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StoryFnReturnType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StoryFnReturnType] with Other]
    @scala.inline
    def withApply(value: (StoryApi[StoryFnReturnType], js.Array[_]) => js.Any): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

