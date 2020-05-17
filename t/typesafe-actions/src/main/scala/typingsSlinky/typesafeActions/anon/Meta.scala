package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meta[T /* <: TypeConstant */, M, E] extends js.Object {
  var error: E = js.native
  var meta: M = js.native
  var `type`: T = js.native
}

object Meta {
  @scala.inline
  def apply[T, M, E](error: E, meta: M, `type`: T): Meta[T, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta[T, M, E]]
  }
  @scala.inline
  implicit class MetaOps[Self[t, m, e] <: Meta[t, m, e], T, M, E] (val x: Self[T, M, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, M, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, M, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, M, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, M, E]) with Other]
    @scala.inline
    def withError(value: E): Self[T, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: M): Self[T, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, M, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

