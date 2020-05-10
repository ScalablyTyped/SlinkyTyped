package typingsSlinky.typesafeActions.typeHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayloadMetaAction[TType /* <: TypeConstant */, TPayload, TMeta] extends js.Object {
  var meta: TMeta = js.native
  var payload: TPayload = js.native
  var `type`: TType = js.native
}

object PayloadMetaAction {
  @scala.inline
  def apply[TType, TPayload, TMeta](meta: TMeta, payload: TPayload, `type`: TType): PayloadMetaAction[TType, TPayload, TMeta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadMetaAction[TType, TPayload, TMeta]]
  }
  @scala.inline
  implicit class PayloadMetaActionOps[Self[ttype, tpayload, tmeta] <: PayloadMetaAction[ttype, tpayload, tmeta], TType, TPayload, TMeta] (val x: Self[TType, TPayload, TMeta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TType, TPayload, TMeta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TType, TPayload, TMeta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TType, TPayload, TMeta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TType, TPayload, TMeta]) with Other]
    @scala.inline
    def withMeta(value: TMeta): Self[TType, TPayload, TMeta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: TPayload): Self[TType, TPayload, TMeta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TType): Self[TType, TPayload, TMeta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

