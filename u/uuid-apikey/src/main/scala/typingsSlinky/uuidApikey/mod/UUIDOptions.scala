package typingsSlinky.uuidApikey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUIDOptions extends js.Object {
  var noDashes: Boolean = js.native
}

object UUIDOptions {
  @scala.inline
  def apply(noDashes: Boolean): UUIDOptions = {
    val __obj = js.Dynamic.literal(noDashes = noDashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDOptions]
  }
  @scala.inline
  implicit class UUIDOptionsOps[Self <: UUIDOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoDashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDashes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

