package typingsSlinky.sparqljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTermBrand extends js.Object {
  var __termBrand: String = js.native
}

object AnonTermBrand {
  @scala.inline
  def apply(__termBrand: String): AnonTermBrand = {
    val __obj = js.Dynamic.literal(__termBrand = __termBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTermBrand]
  }
  @scala.inline
  implicit class AnonTermBrandOps[Self <: AnonTermBrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__termBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__termBrand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

