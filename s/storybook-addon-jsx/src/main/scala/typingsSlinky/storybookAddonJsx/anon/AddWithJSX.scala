package typingsSlinky.storybookAddonJsx.anon

import slinky.core.TagMod
import typingsSlinky.storybookAddonJsx.mod.AddWithJSXFunc
import typingsSlinky.storybookAddonJsx.mod.AddonParameters
import typingsSlinky.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddWithJSX[StoryFnReturnType] extends js.Object {
  var addWithJSX: AddWithJSXFunc[StoryFnReturnType] = js.native
}

object AddWithJSX {
  @scala.inline
  def apply[StoryFnReturnType](
    addWithJSX: (/* kind */ String, /* fn */ js.Function0[TagMod[Any]], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
  ): AddWithJSX[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(addWithJSX = js.Any.fromFunction3(addWithJSX))
    __obj.asInstanceOf[AddWithJSX[StoryFnReturnType]]
  }
  @scala.inline
  implicit class AddWithJSXOps[Self[storyfnreturntype] <: AddWithJSX[storyfnreturntype], StoryFnReturnType] (val x: Self[StoryFnReturnType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StoryFnReturnType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StoryFnReturnType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StoryFnReturnType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StoryFnReturnType] with Other]
    @scala.inline
    def withAddWithJSX(
      value: (/* kind */ String, /* fn */ js.Function0[TagMod[Any]], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
    ): Self[StoryFnReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWithJSX")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

