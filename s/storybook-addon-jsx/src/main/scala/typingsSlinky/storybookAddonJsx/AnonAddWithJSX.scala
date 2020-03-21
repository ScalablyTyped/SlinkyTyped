package typingsSlinky.storybookAddonJsx

import slinky.core.TagMod
import typingsSlinky.storybookAddonJsx.mod.AddWithJSXFunc
import typingsSlinky.storybookAddonJsx.mod.AddonParameters
import typingsSlinky.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddWithJSX[StoryFnReturnType] extends js.Object {
  var addWithJSX: AddWithJSXFunc[StoryFnReturnType]
}

object AnonAddWithJSX {
  @scala.inline
  def apply[StoryFnReturnType](
    addWithJSX: (/* kind */ String, /* fn */ js.Function0[TagMod[Any]], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
  ): AnonAddWithJSX[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addWithJSX = js.Any.fromFunction3(addWithJSX))
  
    __obj.asInstanceOf[AnonAddWithJSX[StoryFnReturnType]]
  }
}

