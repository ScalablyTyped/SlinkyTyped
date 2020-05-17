package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaType[T /* <: TypeConstant */, M]
  extends PayloadMetaAction[T, js.Any, M] {
  var meta: M = js.native
  var `type`: T = js.native
}

object MetaType {
  @scala.inline
  def apply[T, M](meta: M, `type`: T): MetaType[T, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaType[T, M]]
  }
  @scala.inline
  implicit class MetaTypeOps[Self[t, m] <: MetaType[t, m], T, M] (val x: Self[T, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, M]) with Other]
    @scala.inline
    def withMeta(value: M): Self[T, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

