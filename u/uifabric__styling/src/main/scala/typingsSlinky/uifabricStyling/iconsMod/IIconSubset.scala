package typingsSlinky.uifabricStyling.iconsMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.IFontFace
import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconSubset extends js.Object {
  var fontFace: js.UndefOr[IFontFace] = js.native
  var icons: StringDictionary[String | ReactElement] = js.native
  var style: js.UndefOr[IRawStyle] = js.native
}

object IIconSubset {
  @scala.inline
  def apply(icons: StringDictionary[String | ReactElement]): IIconSubset = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconSubset]
  }
  @scala.inline
  implicit class IIconSubsetOps[Self <: IIconSubset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcons(value: StringDictionary[String | ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFace(value: IFontFace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFace")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: IRawStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

