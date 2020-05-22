package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaType[T /* <: TypeConstant */, M]
  extends PayloadMetaAction[T, js.Any, M] {
  var meta: M
  var `type`: T
}

object MetaType {
  @scala.inline
  def apply[T, M](meta: M, `type`: T): MetaType[T, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaType[T, M]]
  }
}

