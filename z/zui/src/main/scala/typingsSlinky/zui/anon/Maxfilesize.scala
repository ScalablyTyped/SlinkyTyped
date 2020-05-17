package typingsSlinky.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maxfilesize extends js.Object {
  var max_file_size: js.UndefOr[String] = js.native
  var mime_type: js.Array[Extensions] = js.native
  var prevent_duplicates: js.UndefOr[String] = js.native
}

object Maxfilesize {
  @scala.inline
  def apply(mime_type: js.Array[Extensions]): Maxfilesize = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxfilesize]
  }
  @scala.inline
  implicit class MaxfilesizeOps[Self <: Maxfilesize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMime_type(value: js.Array[Extensions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_file_size(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_file_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_file_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_file_size")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevent_duplicates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent_duplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevent_duplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevent_duplicates")(js.undefined)
        ret
    }
  }
  
}

