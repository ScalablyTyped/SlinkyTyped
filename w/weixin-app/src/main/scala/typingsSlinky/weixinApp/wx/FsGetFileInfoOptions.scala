package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsGetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String = js.native
   // 要读取的文件路径
  @JSName("success")
  var success_FsGetFileInfoOptions: js.UndefOr[js.Function1[/* res */ AnonSize, Unit]] = js.native
}

object FsGetFileInfoOptions {
  @scala.inline
  def apply(filePath: String): FsGetFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsGetFileInfoOptions]
  }
  @scala.inline
  implicit class FsGetFileInfoOptionsOps[Self <: FsGetFileInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AnonSize => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

