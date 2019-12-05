package typingsSlinky.storybookDashAddonDashJsx.storybookDashAddonDashJsxMod.atStorybookAddonsMod

import typingsSlinky.atStorybookAddons.distTypesMod.DecoratorFunction
import typingsSlinky.atStorybookAddons.distTypesMod.Parameters
import typingsSlinky.atStorybookAddons.distTypesMod.StoryApi
import typingsSlinky.node.NodeModule
import typingsSlinky.storybookDashAddonDashJsx.Anon_AddWithJSX
import typingsSlinky.storybookDashAddonDashJsx.Anon_Jsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStoryApi[StoryFnReturnType] extends js.Object {
  def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType]
  def addParameters(parameter: Parameters with Anon_Jsx): StoryApi[StoryFnReturnType]
  def storiesOf(kind: String, module: NodeModule): StoryApi[StoryFnReturnType] with Anon_AddWithJSX[StoryFnReturnType]
}

object ClientStoryApi {
  @scala.inline
  def apply[StoryFnReturnType](
    addDecorator: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType],
    addParameters: Parameters with Anon_Jsx => StoryApi[StoryFnReturnType],
    storiesOf: (String, NodeModule) => StoryApi[StoryFnReturnType] with Anon_AddWithJSX[StoryFnReturnType]
  ): ClientStoryApi[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), storiesOf = js.Any.fromFunction2(storiesOf))
  
    __obj.asInstanceOf[ClientStoryApi[StoryFnReturnType]]
  }
}

