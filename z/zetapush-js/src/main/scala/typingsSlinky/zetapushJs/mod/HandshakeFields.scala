package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandshakeFields extends js.Object {
  var ext: js.Any = js.native
}

object HandshakeFields {
  @scala.inline
  def apply(ext: js.Any): HandshakeFields = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandshakeFields]
  }
  @scala.inline
  implicit class HandshakeFieldsOps[Self <: HandshakeFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

