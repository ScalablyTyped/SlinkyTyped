package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayloadType[T /* <: TypeConstant */, P]
  extends PayloadMetaAction[T, P, js.Any] {
  var payload: P = js.native
  var `type`: T = js.native
}

object PayloadType {
  @scala.inline
  def apply[T, P](payload: P, `type`: T): PayloadType[T, P] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadType[T, P]]
  }
  @scala.inline
  implicit class PayloadTypeOps[Self[t, p] <: PayloadType[t, p], T, P] (val x: Self[T, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, P]) with Other]
    @scala.inline
    def withPayload(value: P): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

