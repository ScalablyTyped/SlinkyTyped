package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempFilesData extends js.Object {
  /** 文件的临时路径 */
  var tempFilePaths: String = js.native
}

object TempFilesData {
  @scala.inline
  def apply(tempFilePaths: String): TempFilesData = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilesData]
  }
  @scala.inline
  implicit class TempFilesDataOps[Self <: TempFilesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempFilePaths(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePaths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

