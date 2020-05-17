package typingsSlinky.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempFilePath extends js.Object {
  var tempFilePath: String = js.native
}

object TempFilePath {
  @scala.inline
  def apply(tempFilePath: String): TempFilePath = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilePath]
  }
  @scala.inline
  implicit class TempFilePathOps[Self <: TempFilePath] (val x: Self) extends AnyVal {
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
  }
  
}

