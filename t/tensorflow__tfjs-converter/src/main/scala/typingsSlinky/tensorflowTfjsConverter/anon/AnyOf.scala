package typingsSlinky.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyOf extends js.Object {
  var anyOf: js.Array[ItemsType | TypeString] = js.native
}

object AnyOf {
  @scala.inline
  def apply(anyOf: js.Array[ItemsType | TypeString]): AnyOf = {
    val __obj = js.Dynamic.literal(anyOf = anyOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOf]
  }
  @scala.inline
  implicit class AnyOfOps[Self <: AnyOf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyOf(value: js.Array[ItemsType | TypeString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyOf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

