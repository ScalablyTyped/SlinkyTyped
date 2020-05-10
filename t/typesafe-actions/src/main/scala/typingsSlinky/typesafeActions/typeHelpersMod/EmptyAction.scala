package typingsSlinky.typesafeActions.typeHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyAction[TType /* <: TypeConstant */] extends js.Object {
  var `type`: TType = js.native
}

object EmptyAction {
  @scala.inline
  def apply[TType](`type`: TType): EmptyAction[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyAction[TType]]
  }
  @scala.inline
  implicit class EmptyActionOps[Self[ttype] <: EmptyAction[ttype], TType] (val x: Self[TType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TType] with Other]
    @scala.inline
    def withType(value: TType): Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

