package typingsSlinky.storybookAddonInfo.mod.storybookAddonsAugmentingMod

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddonInfo.anon.ParametersinfoOptions
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientStoryApi[StoryFnReturnType] extends js.Object {
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType] = js.native
  def addParameters(parameter: ParametersinfoOptions): StoryApi[StoryFnReturnType] = js.native
  def storiesOf(kind: String, module: NodeModule): StoryApi[StoryFnReturnType] = js.native
}

object ClientStoryApi {
  @scala.inline
  def apply[StoryFnReturnType](
    addDecorator: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType],
    addParameters: ParametersinfoOptions => StoryApi[StoryFnReturnType],
    storiesOf: (String, NodeModule) => StoryApi[StoryFnReturnType]
  ): ClientStoryApi[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), storiesOf = js.Any.fromFunction2(storiesOf))
    __obj.asInstanceOf[ClientStoryApi[StoryFnReturnType]]
  }
  @scala.inline
  implicit class ClientStoryApiOps[Self[storyfnreturntype] <: ClientStoryApi[storyfnreturntype], StoryFnReturnType] (val x: Self[StoryFnReturnType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StoryFnReturnType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StoryFnReturnType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StoryFnReturnType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StoryFnReturnType] with Other]
    @scala.inline
    def withAddDecorator(value: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType]): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDecorator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddParameters(value: ParametersinfoOptions => StoryApi[StoryFnReturnType]): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addParameters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStoriesOf(value: (String, NodeModule) => StoryApi[StoryFnReturnType]): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storiesOf")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

