package typingsSlinky.uifabricStyling.anon

import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/interfaces/IFontStyles.IFontStyles> */
@js.native
trait PartialIFontStyles extends js.Object {
  var large: js.UndefOr[IRawStyle] = js.native
  var medium: js.UndefOr[IRawStyle] = js.native
  var mediumPlus: js.UndefOr[IRawStyle] = js.native
  var mega: js.UndefOr[IRawStyle] = js.native
  var small: js.UndefOr[IRawStyle] = js.native
  var smallPlus: js.UndefOr[IRawStyle] = js.native
  var superLarge: js.UndefOr[IRawStyle] = js.native
  var tiny: js.UndefOr[IRawStyle] = js.native
  var xLarge: js.UndefOr[IRawStyle] = js.native
  var xLargePlus: js.UndefOr[IRawStyle] = js.native
  var xSmall: js.UndefOr[IRawStyle] = js.native
  var xxLarge: js.UndefOr[IRawStyle] = js.native
  var xxLargePlus: js.UndefOr[IRawStyle] = js.native
}

object PartialIFontStyles {
  @scala.inline
  def apply(): PartialIFontStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIFontStyles]
  }
  @scala.inline
  implicit class PartialIFontStylesOps[Self <: PartialIFontStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLarge(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withMedium(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(js.undefined)
        ret
    }
    @scala.inline
    def withMediumPlus(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumPlus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediumPlus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumPlus")(js.undefined)
        ret
    }
    @scala.inline
    def withMega(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mega")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMega: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mega")(js.undefined)
        ret
    }
    @scala.inline
    def withSmall(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallPlus(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallPlus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallPlus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallPlus")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperLarge(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withTiny(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiny")(js.undefined)
        ret
    }
    @scala.inline
    def withXLarge(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withXLargePlus(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLargePlus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXLargePlus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLargePlus")(js.undefined)
        ret
    }
    @scala.inline
    def withXSmall(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xSmall")(js.undefined)
        ret
    }
    @scala.inline
    def withXxLarge(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXxLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withXxLargePlus(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxLargePlus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXxLargePlus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxLargePlus")(js.undefined)
        ret
    }
  }
  
}

