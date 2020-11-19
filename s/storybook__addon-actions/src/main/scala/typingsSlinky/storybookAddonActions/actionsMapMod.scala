package typingsSlinky.storybookAddonActions

import typingsSlinky.std.Record
import typingsSlinky.storybookAddonActions.handlerFunctionMod.HandlerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-actions/dist/models/ActionsMap", JSImport.Namespace)
@js.native
object actionsMapMod extends js.Object {
  
  type ActionsMap[T /* <: String */] = Record[T, HandlerFunction]
}
