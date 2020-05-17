package typingsSlinky.victory.anon

import typingsSlinky.victory.mod.CategoryPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XArray extends CategoryPropType {
  var x: js.Array[String] = js.native
}

object XArray {
  @scala.inline
  def apply(x: js.Array[String]): XArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[XArray]
  }
  @scala.inline
  implicit class XArrayOps[Self <: XArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

