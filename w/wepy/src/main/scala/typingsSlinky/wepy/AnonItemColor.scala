package typingsSlinky.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemColor extends js.Object {
  var itemColor: String = js.native
  var itemList: js.Array[String] = js.native
}

object AnonItemColor {
  @scala.inline
  def apply(itemColor: String, itemList: js.Array[String]): AnonItemColor = {
    val __obj = js.Dynamic.literal(itemColor = itemColor.asInstanceOf[js.Any], itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemColor]
  }
  @scala.inline
  implicit class AnonItemColorOps[Self <: AnonItemColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

