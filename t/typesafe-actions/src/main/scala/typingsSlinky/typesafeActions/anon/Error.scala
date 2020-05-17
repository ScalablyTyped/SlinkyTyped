package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error[T /* <: TypeConstant */, E] extends js.Object {
  var error: E = js.native
  var `type`: T = js.native
}

object Error {
  @scala.inline
  def apply[T, E](error: E, `type`: T): Error[T, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error[T, E]]
  }
  @scala.inline
  implicit class ErrorOps[Self[t, e] <: Error[t, e], T, E] (val x: Self[T, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, E]) with Other]
    @scala.inline
    def withError(value: E): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

