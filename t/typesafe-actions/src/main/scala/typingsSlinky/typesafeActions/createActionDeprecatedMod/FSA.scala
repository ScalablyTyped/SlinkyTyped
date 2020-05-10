package typingsSlinky.typesafeActions.createActionDeprecatedMod

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSA[T /* <: TypeConstant */, P, M, E] extends js.Object {
  var error: js.UndefOr[E] = js.native
  var meta: js.UndefOr[M] = js.native
  var payload: js.UndefOr[P] = js.native
  var `type`: T = js.native
}

object FSA {
  @scala.inline
  def apply[T, P, M, E](`type`: T): FSA[T, P, M, E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSA[T, P, M, E]]
  }
  @scala.inline
  implicit class FSAOps[Self[t, p, m, e] <: FSA[t, p, m, e], T, P, M, E] (val x: Self[T, P, M, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, P, M, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, P, M, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, P, M, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, P, M, E]) with Other]
    @scala.inline
    def withType(value: T): Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: E): Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: M): Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: P): Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self[T, P, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

