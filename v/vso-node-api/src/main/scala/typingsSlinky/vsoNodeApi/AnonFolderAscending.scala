package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFolderAscending extends js.Object {
  var folderAscending: Double = js.native
  var folderDescending: Double = js.native
  var none: Double = js.native
}

object AnonFolderAscending {
  @scala.inline
  def apply(folderAscending: Double, folderDescending: Double, none: Double): AnonFolderAscending = {
    val __obj = js.Dynamic.literal(folderAscending = folderAscending.asInstanceOf[js.Any], folderDescending = folderDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFolderAscending]
  }
  @scala.inline
  implicit class AnonFolderAscendingOps[Self <: AnonFolderAscending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolderAscending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderDescending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

