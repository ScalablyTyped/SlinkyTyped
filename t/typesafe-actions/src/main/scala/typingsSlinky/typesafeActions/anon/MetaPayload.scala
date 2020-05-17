package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaPayload[T /* <: TypeConstant */, P, M] extends PayloadMetaAction[T, P, M] {
  var meta: M = js.native
  var payload: P = js.native
  var `type`: T = js.native
}

object MetaPayload {
  @scala.inline
  def apply[T, P, M](meta: M, payload: P, `type`: T): MetaPayload[T, P, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaPayload[T, P, M]]
  }
  @scala.inline
  implicit class MetaPayloadOps[Self[t, p, m] <: MetaPayload[t, p, m], T, P, M] (val x: Self[T, P, M]) extends AnyVal {
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

