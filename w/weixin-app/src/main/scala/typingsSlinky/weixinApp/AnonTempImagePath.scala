package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTempImagePath extends js.Object {
  var tempImagePath: String = js.native
}

object AnonTempImagePath {
  @scala.inline
  def apply(tempImagePath: String): AnonTempImagePath = {
    val __obj = js.Dynamic.literal(tempImagePath = tempImagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTempImagePath]
  }
  @scala.inline
  implicit class AnonTempImagePathOps[Self <: AnonTempImagePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempImagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempImagePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

