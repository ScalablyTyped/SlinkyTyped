package typingsSlinky.wegameApi.wx.types

import typingsSlinky.wegameApi.anon.CreateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedfileList extends js.Object {
  var fileList: CreateTime = js.native
}

object SavedfileList {
  @scala.inline
  def apply(fileList: CreateTime): SavedfileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedfileList]
  }
  @scala.inline
  implicit class SavedfileListOps[Self <: SavedfileList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileList(value: CreateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

