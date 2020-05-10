package typingsSlinky.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArchive extends js.Object {
  var _archive: String = js.native
}

object AnonArchive {
  @scala.inline
  def apply(_archive: String): AnonArchive = {
    val __obj = js.Dynamic.literal(_archive = _archive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArchive]
  }
  @scala.inline
  implicit class AnonArchiveOps[Self <: AnonArchive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_archive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_archive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

