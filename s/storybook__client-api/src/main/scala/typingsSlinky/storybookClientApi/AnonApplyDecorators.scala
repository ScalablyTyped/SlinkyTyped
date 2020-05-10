package typingsSlinky.storybookClientApi

import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApplyDecorators extends js.Object {
  def applyDecorators(fn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Any = js.native
  def getDecorators(): js.Array[DecoratorFunction[_]] = js.native
}

object AnonApplyDecorators {
  @scala.inline
  def apply(
    applyDecorators: (StoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any,
    getDecorators: () => js.Array[DecoratorFunction[_]]
  ): AnonApplyDecorators = {
    val __obj = js.Dynamic.literal(applyDecorators = js.Any.fromFunction2(applyDecorators), getDecorators = js.Any.fromFunction0(getDecorators))
    __obj.asInstanceOf[AnonApplyDecorators]
  }
  @scala.inline
  implicit class AnonApplyDecoratorsOps[Self <: AnonApplyDecorators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyDecorators(value: (StoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyDecorators")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDecorators(value: () => js.Array[DecoratorFunction[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecorators")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

