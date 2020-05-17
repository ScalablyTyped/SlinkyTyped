package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadDriver extends js.Object {
  var html5: js.Any = js.native
}

object UploadDriver {
  @scala.inline
  def apply(html5: js.Any): UploadDriver = {
    val __obj = js.Dynamic.literal(html5 = html5.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadDriver]
  }
  @scala.inline
  implicit class UploadDriverOps[Self <: UploadDriver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml5(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

