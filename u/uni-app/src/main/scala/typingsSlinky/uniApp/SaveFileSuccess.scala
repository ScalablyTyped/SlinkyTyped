package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveFileSuccess extends js.Object {
  /**
    * 文件的保存路径
    */
  var savedFilePath: js.UndefOr[String] = js.native
}

object SaveFileSuccess {
  @scala.inline
  def apply(): SaveFileSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveFileSuccess]
  }
  @scala.inline
  implicit class SaveFileSuccessOps[Self <: SaveFileSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSavedFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedFilePath")(js.undefined)
        ret
    }
  }
  
}

