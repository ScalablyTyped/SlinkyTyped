package typingsSlinky.storybookAddonActions

import typingsSlinky.storybookAddonActions.actionOptionsMod.ActionOptions
import typingsSlinky.storybookAddonActions.actionsFunctionMod.ActionsFunction
import typingsSlinky.storybookAddonActions.anon.Action
import typingsSlinky.storybookAddonActions.decoratorFunctionMod.DecoratorFunction
import typingsSlinky.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-actions/dist/preview", JSImport.Namespace)
@js.native
object previewMod extends js.Object {
  
  def action(name: String): HandlerFunction = js.native
  def action(name: String, options: ActionOptions): HandlerFunction = js.native
  
  val actions: ActionsFunction = js.native
  
  val config: ActionOptions = js.native
  
  def configureActions(): Unit = js.native
  def configureActions(options: ActionOptions): Unit = js.native
  
  def createDecorator(actionsFn: js.Any): js.Function1[/* repeated */ js.Any, js.Function1[/* storyFn */ js.Function0[_], _]] = js.native
  
  def decorate(decorators: js.Array[DecoratorFunction]): Action = js.native
  
  def decorateAction(decorators: js.Array[DecoratorFunction]): js.Function2[/* name */ String, /* options */ js.UndefOr[ActionOptions], HandlerFunction] = js.native
  
  def withActions(args: js.Any*): js.Function1[/* storyFn */ js.Function0[_], _] = js.native
}
