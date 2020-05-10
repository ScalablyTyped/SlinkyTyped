package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelOffsetSupport extends js.Object {
  /**
    * The client supports processing label offsets instead of a
    * simple label string.
    */
  var labelOffsetSupport: js.UndefOr[Boolean] = js.native
}

object AnonLabelOffsetSupport {
  @scala.inline
  def apply(): AnonLabelOffsetSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLabelOffsetSupport]
  }
  @scala.inline
  implicit class AnonLabelOffsetSupportOps[Self <: AnonLabelOffsetSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelOffsetSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffsetSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOffsetSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffsetSupport")(js.undefined)
        ret
    }
  }
  
}

