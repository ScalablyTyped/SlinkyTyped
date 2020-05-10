package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTempThumbPath extends js.Object {
  /**
    * 临时视频路径
    */
  var tempThumbPath: String = js.native
  /**
    * 临时封面路径
    */
  var tempVideoPath: String = js.native
}

object AnonTempThumbPath {
  @scala.inline
  def apply(tempThumbPath: String, tempVideoPath: String): AnonTempThumbPath = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTempThumbPath]
  }
  @scala.inline
  implicit class AnonTempThumbPathOps[Self <: AnonTempThumbPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempThumbPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempThumbPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempVideoPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempVideoPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

