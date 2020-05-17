package typingsSlinky.uuidApikey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<uuid-apikey.uuid-apikey.UUIDOptions> */
@js.native
trait PartialUUIDOptions extends js.Object {
  var noDashes: js.UndefOr[Boolean] = js.native
}

object PartialUUIDOptions {
  @scala.inline
  def apply(): PartialUUIDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUUIDOptions]
  }
  @scala.inline
  implicit class PartialUUIDOptionsOps[Self <: PartialUUIDOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutNoDashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDashes")(js.undefined)
        ret
    }
  }
  
}

