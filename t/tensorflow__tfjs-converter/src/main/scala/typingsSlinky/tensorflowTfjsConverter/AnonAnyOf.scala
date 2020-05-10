package typingsSlinky.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnyOf extends js.Object {
  var anyOf: js.Array[AnonItemsType | AnonItemsAnonType] = js.native
}

object AnonAnyOf {
  @scala.inline
  def apply(anyOf: js.Array[AnonItemsType | AnonItemsAnonType]): AnonAnyOf = {
    val __obj = js.Dynamic.literal(anyOf = anyOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnyOf]
  }
  @scala.inline
  implicit class AnonAnyOfOps[Self <: AnonAnyOf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyOf(value: js.Array[AnonItemsType | AnonItemsAnonType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyOf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

