package typingsSlinky.uifabricStyling.ifontstylesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFontStyles extends js.Object {
  var large: IRawStyle = js.native
  var medium: IRawStyle = js.native
  var mediumPlus: IRawStyle = js.native
  var mega: IRawStyle = js.native
  var small: IRawStyle = js.native
  var smallPlus: IRawStyle = js.native
  var superLarge: IRawStyle = js.native
  var tiny: IRawStyle = js.native
  var xLarge: IRawStyle = js.native
  /**
    * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme.
    * Not recommended for use with Fabric 6.
    */
  var xLargePlus: IRawStyle = js.native
  var xSmall: IRawStyle = js.native
  var xxLarge: IRawStyle = js.native
  /**
    * @deprecated Exists for forward compatibility with Fabric 7's Fluent theme
    * Not recommended for use with Fabric 6.
    */
  var xxLargePlus: IRawStyle = js.native
}

object IFontStyles {
  @scala.inline
  def apply(
    large: IRawStyle,
    medium: IRawStyle,
    mediumPlus: IRawStyle,
    mega: IRawStyle,
    small: IRawStyle,
    smallPlus: IRawStyle,
    superLarge: IRawStyle,
    tiny: IRawStyle,
    xLarge: IRawStyle,
    xLargePlus: IRawStyle,
    xSmall: IRawStyle,
    xxLarge: IRawStyle,
    xxLargePlus: IRawStyle
  ): IFontStyles = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumPlus = mediumPlus.asInstanceOf[js.Any], mega = mega.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], smallPlus = smallPlus.asInstanceOf[js.Any], superLarge = superLarge.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any], xLarge = xLarge.asInstanceOf[js.Any], xLargePlus = xLargePlus.asInstanceOf[js.Any], xSmall = xSmall.asInstanceOf[js.Any], xxLarge = xxLarge.asInstanceOf[js.Any], xxLargePlus = xxLargePlus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontStyles]
  }
  @scala.inline
  implicit class IFontStylesOps[Self <: IFontStyles] (val x: Self) extends AnyVal {
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
    def withMedium(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediumPlus(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumPlus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMega(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mega")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmall(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallPlus(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallPlus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperLarge(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiny(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXLarge(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXLargePlus(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLargePlus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXSmall(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXxLarge(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXxLargePlus(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xxLargePlus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

