package typingsSlinky.uifabricStyling.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/interfaces/IEffects.IEffects> */
@js.native
trait PartialIEffects extends js.Object {
  var elevation16: js.UndefOr[String] = js.native
  var elevation4: js.UndefOr[String] = js.native
  var elevation64: js.UndefOr[String] = js.native
  var elevation8: js.UndefOr[String] = js.native
  var roundedCorner2: js.UndefOr[String] = js.native
}

object PartialIEffects {
  @scala.inline
  def apply(): PartialIEffects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIEffects]
  }
  @scala.inline
  implicit class PartialIEffectsOps[Self <: PartialIEffects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElevation16(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation16: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation16")(js.undefined)
        ret
    }
    @scala.inline
    def withElevation4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation4")(js.undefined)
        ret
    }
    @scala.inline
    def withElevation64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation64")(js.undefined)
        ret
    }
    @scala.inline
    def withElevation8(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation8")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundedCorner2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedCorner2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundedCorner2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedCorner2")(js.undefined)
        ret
    }
  }
  
}

