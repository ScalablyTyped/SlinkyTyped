package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderAscending extends js.Object {
  var folderAscending: scala.Double = js.native
  var folderDescending: scala.Double = js.native
  var none: scala.Double = js.native
}

object FolderAscending {
  @scala.inline
  def apply(folderAscending: scala.Double, folderDescending: scala.Double, none: scala.Double): FolderAscending = {
    val __obj = js.Dynamic.literal(folderAscending = folderAscending.asInstanceOf[js.Any], folderDescending = folderDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderAscending]
  }
  @scala.inline
  implicit class FolderAscendingOps[Self <: FolderAscending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolderAscending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderDescending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

