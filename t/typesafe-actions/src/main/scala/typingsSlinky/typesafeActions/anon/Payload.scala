package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payload[T /* <: TypeConstant */, P, E] extends js.Object {
  var error: E = js.native
  var payload: P = js.native
  var `type`: T = js.native
}

object Payload {
  @scala.inline
  def apply[T, P, E](error: E, payload: P, `type`: T): Payload[T, P, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload[T, P, E]]
  }
  @scala.inline
  implicit class PayloadOps[Self[t, p, e] <: Payload[t, p, e], T, P, E] (val x: Self[T, P, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, P, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, P, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, P, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, P, E]) with Other]
    @scala.inline
    def withError(value: E): Self[T, P, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: P): Self[T, P, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, P, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

