package typingsSlinky.typesafeActions.typeHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaAction[TType /* <: TypeConstant */, TMeta] extends js.Object {
  var meta: TMeta = js.native
  var `type`: TType = js.native
}

object MetaAction {
  @scala.inline
  def apply[TType, TMeta](meta: TMeta, `type`: TType): MetaAction[TType, TMeta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaAction[TType, TMeta]]
  }
  @scala.inline
  implicit class MetaActionOps[Self[ttype, tmeta] <: MetaAction[ttype, tmeta], TType, TMeta] (val x: Self[TType, TMeta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TType, TMeta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TType, TMeta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TType, TMeta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TType, TMeta]) with Other]
    @scala.inline
    def withMeta(value: TMeta): Self[TType, TMeta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TType): Self[TType, TMeta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

