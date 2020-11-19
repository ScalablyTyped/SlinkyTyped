package typingsSlinky.storybookAddonInfo.mod

import slinky.core.facade.ReactElement
import typingsSlinky.std.ReturnType
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.StoryContext
import typingsSlinky.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-info", "withInfo")
@js.native
object withInfo extends js.Object {
  
  def apply(): js.Function1[
    /* storyFn */ StoryFn[_], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = js.native
  def apply(textOrOptions: String): js.Function1[
    /* storyFn */ StoryFn[_], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = js.native
  def apply(textOrOptions: Options): js.Function1[
    /* storyFn */ StoryFn[_], 
    js.Function1[/* context */ js.UndefOr[js.Object], ReactElement]
  ] = js.native
  def apply[A](story: StoryFn[A], context: StoryContext): ReturnType[DecoratorFunction[A]] = js.native
}
