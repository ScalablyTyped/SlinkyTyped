package typingsSlinky.typesafeActions.typeHelpersMod

import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Any
  - typingsSlinky.std.ReturnType[TActionCreatorOrMap]
*/
trait ActionType[TActionCreatorOrMap /* <: js.Any */] extends js.Object

object ActionType {
  @scala.inline
  implicit def apply[TActionCreatorOrMap](value: js.Any | ReturnType[TActionCreatorOrMap]): ActionType[TActionCreatorOrMap] = value.asInstanceOf[ActionType[TActionCreatorOrMap]]
}

