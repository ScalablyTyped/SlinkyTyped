package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.TypePredicateKind.This
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThisTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_ThisTypePredicate: This = js.native
  var parameterIndex: js.UndefOr[scala.Nothing] = js.native
  var parameterName: js.UndefOr[scala.Nothing] = js.native
  @JSName("type")
  var type_ThisTypePredicate: Type = js.native
}

object ThisTypePredicate {
  @scala.inline
  def apply(kind: This, `type`: Type): ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThisTypePredicate]
  }
  @scala.inline
  implicit class ThisTypePredicateOps[Self <: ThisTypePredicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: This): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

