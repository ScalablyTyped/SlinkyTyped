package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[T /* <: TypeConstant */, P, M, E] extends js.Object {
  var error: E = js.native
  var meta: M = js.native
  var payload: P = js.native
  var `type`: T = js.native
}

object Type {
  @scala.inline
  def apply[T, P, M, E](error: E, meta: M, payload: P, `type`: T): Type[T, P, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T, P, M, E]]
  }
  @scala.inline
  implicit class TypeOps[Self[t, p, m, e] <: Type[t, p, m, e], T, P, M, E] (val x: Self[T, P, M, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, P, M, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, P, M, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, P, M, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, P, M, E]) with Other]
    @scala.inline
    def withError(value: E): Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: M): Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: P): Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

