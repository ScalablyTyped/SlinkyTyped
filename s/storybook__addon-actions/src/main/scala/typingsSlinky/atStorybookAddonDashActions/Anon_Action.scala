package typingsSlinky.atStorybookAddonDashActions

import typingsSlinky.atStorybookAddonDashActions.distModelsActionOptionsMod.ActionOptions
import typingsSlinky.atStorybookAddonDashActions.distModelsHandlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Action extends js.Object {
  def action(name: String): HandlerFunction = js.native
  def action(name: String, options: ActionOptions): HandlerFunction = js.native
  def actions(args: js.Any*): js.Any = js.native
  def withActions(args: js.Any*): js.Function1[/* storyFn */ js.Function0[_], _] = js.native
}

