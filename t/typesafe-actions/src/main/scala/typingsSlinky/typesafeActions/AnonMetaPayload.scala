package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMetaPayload[T /* <: TypeConstant */, P, M] extends PayloadMetaAction[T, P, M] {
  var meta: M = js.native
  var payload: P = js.native
  var `type`: T = js.native
}

object AnonMetaPayload {
  @scala.inline
  def apply[T, P, M](meta: M, payload: P, `type`: T): AnonMetaPayload[T, P, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetaPayload[T, P, M]]
  }
  @scala.inline
  implicit class AnonMetaPayloadOps[Self[t, p, m] <: AnonMetaPayload[t, p, m], T, P, M] (val x: Self[T, P, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, P, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, P, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, P, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, P, M]) with Other]
    @scala.inline
    def withMeta(value: M): Self[T, P, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: P): Self[T, P, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, P, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

