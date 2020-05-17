package typingsSlinky.sparqljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermBrand extends js.Object {
  var __termBrand: String = js.native
}

object TermBrand {
  @scala.inline
  def apply(__termBrand: String): TermBrand = {
    val __obj = js.Dynamic.literal(__termBrand = __termBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermBrand]
  }
  @scala.inline
  implicit class TermBrandOps[Self <: TermBrand] (val x: Self) extends AnyVal {
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

