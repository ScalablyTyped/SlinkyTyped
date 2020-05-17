package typingsSlinky.typeCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeOf extends js.Object {
  var typeOf: String = js.native
  def validate(x: js.Any): js.Any = js.native
}

object TypeOf {
  @scala.inline
  def apply(typeOf: String, validate: js.Any => js.Any): TypeOf = {
    val __obj = js.Dynamic.literal(typeOf = typeOf.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[TypeOf]
  }
  @scala.inline
  implicit class TypeOfOps[Self <: TypeOf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeOf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

