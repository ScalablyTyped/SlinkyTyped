package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaddirOptions
  extends BaseOptions[js.Any, js.Any] {
  var dirPath: String = js.native
   // 要读取的目录路径
  @JSName("success")
  var success_ReaddirOptions: js.UndefOr[js.Function1[/* res */ Files, Unit]] = js.native
}

object ReaddirOptions {
  @scala.inline
  def apply(dirPath: String): ReaddirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirOptions]
  }
  @scala.inline
  implicit class ReaddirOptionsOps[Self <: ReaddirOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ Files => Unit): Self = {
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

