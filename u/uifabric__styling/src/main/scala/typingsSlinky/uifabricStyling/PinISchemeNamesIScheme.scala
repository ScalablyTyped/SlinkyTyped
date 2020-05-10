package typingsSlinky.uifabricStyling

import typingsSlinky.uifabricStyling.ithemeMod.IScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme} */
@js.native
trait PinISchemeNamesIScheme extends js.Object {
  var default: js.UndefOr[IScheme] = js.native
  var neutral: js.UndefOr[IScheme] = js.native
  var soft: js.UndefOr[IScheme] = js.native
  var strong: js.UndefOr[IScheme] = js.native
}

object PinISchemeNamesIScheme {
  @scala.inline
  def apply(): PinISchemeNamesIScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinISchemeNamesIScheme]
  }
  @scala.inline
  implicit class PinISchemeNamesISchemeOps[Self <: PinISchemeNamesIScheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: IScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutral(value: IScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutral")(js.undefined)
        ret
    }
    @scala.inline
    def withSoft(value: IScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soft")(js.undefined)
        ret
    }
    @scala.inline
    def withStrong(value: IScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(js.undefined)
        ret
    }
  }
  
}

