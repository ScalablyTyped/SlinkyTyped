package typingsSlinky.typesafeActions.typeHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayloadAction[TType /* <: TypeConstant */, TPayload] extends js.Object {
  var payload: TPayload = js.native
  var `type`: TType = js.native
}

object PayloadAction {
  @scala.inline
  def apply[TType, TPayload](payload: TPayload, `type`: TType): PayloadAction[TType, TPayload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadAction[TType, TPayload]]
  }
  @scala.inline
  implicit class PayloadActionOps[Self[ttype, tpayload] <: PayloadAction[ttype, tpayload], TType, TPayload] (val x: Self[TType, TPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TType, TPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TType, TPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TType, TPayload]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TType, TPayload]) with Other]
    @scala.inline
    def withPayload(value: TPayload): Self[TType, TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TType): Self[TType, TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

