package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressImageSuccessData extends js.Object {
  /**
    * 压缩后图片的临时文件路径
    */
  var tempFilePath: js.UndefOr[String] = js.native
}

object CompressImageSuccessData {
  @scala.inline
  def apply(): CompressImageSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressImageSuccessData]
  }
  @scala.inline
  implicit class CompressImageSuccessDataOps[Self <: CompressImageSuccessData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePath")(js.undefined)
        ret
    }
  }
  
}

