package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameOptions
  extends BaseOptions[js.Any, js.Any] {
   // 源文件路径，可以是普通文件或目录
  var newPath: String = js.native
  var oldPath: String = js.native
}

object RenameOptions {
  @scala.inline
  def apply(newPath: String, oldPath: String): RenameOptions = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOptions]
  }
  @scala.inline
  implicit class RenameOptionsOps[Self <: RenameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

