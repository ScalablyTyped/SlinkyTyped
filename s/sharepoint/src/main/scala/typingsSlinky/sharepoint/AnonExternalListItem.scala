package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExternalListItem extends js.Object {
  var ExternalListItem: Boolean = js.native
  var FsObjType: Double = js.native
  var Id: Double = js.native
  var Url: String = js.native
}

object AnonExternalListItem {
  @scala.inline
  def apply(ExternalListItem: Boolean, FsObjType: Double, Id: Double, Url: String): AnonExternalListItem = {
    val __obj = js.Dynamic.literal(ExternalListItem = ExternalListItem.asInstanceOf[js.Any], FsObjType = FsObjType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExternalListItem]
  }
  @scala.inline
  implicit class AnonExternalListItemOps[Self <: AnonExternalListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalListItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalListItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsObjType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FsObjType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

