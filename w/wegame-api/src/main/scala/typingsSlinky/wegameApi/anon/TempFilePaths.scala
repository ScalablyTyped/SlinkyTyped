package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.ImageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempFilePaths extends js.Object {
  var tempFilePaths: js.Array[String] = js.native
  var tempFiles: js.Array[ImageFile] = js.native
}

object TempFilePaths {
  @scala.inline
  def apply(tempFilePaths: js.Array[String], tempFiles: js.Array[ImageFile]): TempFilePaths = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilePaths]
  }
  @scala.inline
  implicit class TempFilePathsOps[Self <: TempFilePaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempFilePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempFiles(value: js.Array[ImageFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

