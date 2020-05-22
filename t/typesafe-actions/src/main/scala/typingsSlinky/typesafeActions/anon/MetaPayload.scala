package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaPayload[T /* <: TypeConstant */, P, M] extends PayloadMetaAction[T, P, M] {
  var meta: M
  var payload: P
  var `type`: T
}

object MetaPayload {
  @scala.inline
  def apply[T, P, M](meta: M, payload: P, `type`: T): MetaPayload[T, P, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaPayload[T, P, M]]
  }
}

