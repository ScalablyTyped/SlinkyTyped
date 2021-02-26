package typingsSlinky.storybookClientApi

import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.StoryContext
import typingsSlinky.storybookAddons.typesMod.StoryFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("@storybook/client-api/dist/decorators", "decorateStory")
  @js.native
  def decorateStory(storyFn: StoryFn[_], decorator: DecoratorFunction[_]): js.Function1[/* context */ js.UndefOr[StoryContext], _] = js.native
  
  @JSImport("@storybook/client-api/dist/decorators", "defaultDecorateStory")
  @js.native
  def defaultDecorateStory(storyFn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Function1[/* context */ js.UndefOr[StoryContext], _] = js.native
}
