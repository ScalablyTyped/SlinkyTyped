package typingsSlinky.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemColor extends js.Object {
  var itemColor: String = js.native
  var itemList: js.Array[String] = js.native
}

object ItemColor {
  @scala.inline
  def apply(itemColor: String, itemList: js.Array[String]): ItemColor = {
    val __obj = js.Dynamic.literal(itemColor = itemColor.asInstanceOf[js.Any], itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemColor]
  }
  @scala.inline
  implicit class ItemColorOps[Self <: ItemColor] (val x: Self) extends AnyVal {
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

