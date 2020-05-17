package typingsSlinky.storybookAddonActions

import typingsSlinky.storybookAddonActions.actionOptionsMod.ActionOptions
import typingsSlinky.storybookAddonActions.anon.Action
import typingsSlinky.storybookAddonActions.decoratorFunctionMod.DecoratorFunction
import typingsSlinky.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-actions/dist/preview/decorateAction", JSImport.Namespace)
@js.native
object decorateActionMod extends js.Object {
  def decorate(decorators: js.Array[DecoratorFunction]): Action = js.native
  def decorateAction(decorators: js.Array[DecoratorFunction]): js.Function2[/* name */ String, /* options */ js.UndefOr[ActionOptions], HandlerFunction] = js.native
}

