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
  
  def decorate(_decorators: js.Array[DecoratorFunction]): js.Function0[Action] = js.native
  
  def decorateAction(_decorators: js.Array[DecoratorFunction]): js.Function0[Unit] = js.native
  
  def withActions(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}
