package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseImageSuccessCallbackResult extends js.Object {
  /**
    * 图片的本地文件路径列表
    */
  var tempFilePaths: js.UndefOr[String | js.Array[_]] = js.native
  /**
    * 图片的本地文件列表，每一项是一个 File 对象
    */
  var tempFiles: js.UndefOr[
    ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile]
  ] = js.native
}

object ChooseImageSuccessCallbackResult {
  @scala.inline
  def apply(): ChooseImageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageSuccessCallbackResult]
  }
  @scala.inline
  implicit class ChooseImageSuccessCallbackResultOps[Self <: ChooseImageSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempFilePaths(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempFilePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withTempFiles(value: ChooseImageSuccessCallbackResultFile | js.Array[ChooseImageSuccessCallbackResultFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFiles")(js.undefined)
        ret
    }
  }
  
}

