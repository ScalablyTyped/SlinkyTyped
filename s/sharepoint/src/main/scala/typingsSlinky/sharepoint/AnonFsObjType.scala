package typingsSlinky.sharepoint

import typingsSlinky.sharepoint.SP.FileSystemObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFsObjType extends js.Object {
  var fsObjType: FileSystemObjectType = js.native
  var id: Double = js.native
}

object AnonFsObjType {
  @scala.inline
  def apply(fsObjType: FileSystemObjectType, id: Double): AnonFsObjType = {
    val __obj = js.Dynamic.literal(fsObjType = fsObjType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFsObjType]
  }
  @scala.inline
  implicit class AnonFsObjTypeOps[Self <: AnonFsObjType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFsObjType(value: FileSystemObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsObjType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

