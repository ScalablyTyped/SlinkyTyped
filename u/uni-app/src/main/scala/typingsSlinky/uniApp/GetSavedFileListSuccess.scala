package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavedFileListSuccess extends js.Object {
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[Double] = js.native
  /**
    * 文件列表
    */
  var fileList: js.UndefOr[String] = js.native
}

object GetSavedFileListSuccess {
  @scala.inline
  def apply(): GetSavedFileListSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileListSuccess]
  }
  @scala.inline
  implicit class GetSavedFileListSuccessOps[Self <: GetSavedFileListSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrMsg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withFileList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(js.undefined)
        ret
    }
  }
  
}

