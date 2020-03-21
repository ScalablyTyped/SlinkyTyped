package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetaType[T /* <: TypeConstant */, M]
  extends PayloadMetaAction[T, js.Any, M] {
  var meta: M
  var `type`: T
}

object AnonMetaType {
  @scala.inline
  def apply[T /* <: TypeConstant */, M](meta: M, `type`: T): AnonMetaType[T, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetaType[T, M]]
  }
}

