package typingsSlinky.storybookDashAddonDashJsx

import slinky.core.TagMod
import typingsSlinky.atStorybookAddons.distTypesMod.StoryApi
import typingsSlinky.storybookDashAddonDashJsx.storybookDashAddonDashJsxMod.AddWithJSXFunc
import typingsSlinky.storybookDashAddonDashJsx.storybookDashAddonDashJsxMod.AddonParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddWithJSX[StoryFnReturnType] extends js.Object {
  var addWithJSX: AddWithJSXFunc[StoryFnReturnType]
}

object Anon_AddWithJSX {
  @scala.inline
  def apply[StoryFnReturnType](
    addWithJSX: (/* kind */ String, /* fn */ js.Function0[TagMod[Any]], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
  ): Anon_AddWithJSX[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addWithJSX = js.Any.fromFunction3(addWithJSX))
  
    __obj.asInstanceOf[Anon_AddWithJSX[StoryFnReturnType]]
  }
}

