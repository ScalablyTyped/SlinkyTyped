package typingsSlinky.wxServerSdk.mod

import typingsSlinky.wxServerSdk.AnonStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSuccess extends js.Object {
  var fileList: js.Array[AnonStatus] = js.native
}

object DeleteFileSuccess {
  @scala.inline
  def apply(fileList: js.Array[AnonStatus]): DeleteFileSuccess = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSuccess]
  }
  @scala.inline
  implicit class DeleteFileSuccessOps[Self <: DeleteFileSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileList(value: js.Array[AnonStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

