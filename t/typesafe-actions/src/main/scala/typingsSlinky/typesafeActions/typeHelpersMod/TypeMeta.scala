package typingsSlinky.typesafeActions.typeHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeMeta[TType /* <: TypeConstant */] extends js.Object {
  var getType: js.UndefOr[js.Function0[TType]] = js.native
}

object TypeMeta {
  @scala.inline
  def apply[TType](): TypeMeta[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeMeta[TType]]
  }
  @scala.inline
  implicit class TypeMetaOps[Self[ttype] <: TypeMeta[ttype], TType] (val x: Self[TType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TType] with Other]
    @scala.inline
    def withGetType(value: () => TType): Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetType: Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.undefined)
        ret
    }
  }
  
}

