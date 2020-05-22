package typingsSlinky.uifabricStyling.iconsMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.IFontFace
import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconSubset extends js.Object {
  var fontFace: js.UndefOr[IFontFace] = js.undefined
  var icons: StringDictionary[String | ReactElement]
  var style: js.UndefOr[IRawStyle] = js.undefined
}

object IIconSubset {
  @scala.inline
  def apply(
    icons: StringDictionary[String | ReactElement],
    fontFace: IFontFace = null,
    style: IRawStyle = null
  ): IIconSubset = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
    if (fontFace != null) __obj.updateDynamic("fontFace")(fontFace.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconSubset]
  }
}

