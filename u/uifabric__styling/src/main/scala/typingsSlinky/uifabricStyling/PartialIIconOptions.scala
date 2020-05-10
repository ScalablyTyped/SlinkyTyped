package typingsSlinky.uifabricStyling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/utilities/icons.IIconOptions> */
@js.native
trait PartialIIconOptions extends js.Object {
  var disableWarnings: js.UndefOr[Boolean] = js.native
  var warnOnMissingIcons: js.UndefOr[Boolean] = js.native
}

object PartialIIconOptions {
  @scala.inline
  def apply(): PartialIIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIIconOptions]
  }
  @scala.inline
  implicit class PartialIIconOptionsOps[Self <: PartialIIconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnOnMissingIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnMissingIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnOnMissingIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnMissingIcons")(js.undefined)
        ret
    }
  }
  
}

