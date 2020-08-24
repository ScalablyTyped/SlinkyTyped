package typingsSlinky.uifabricStyling

import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricStyling.uifabricStylingStrings.horizontal
import typingsSlinky.uifabricStyling.uifabricStylingStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/getFadedOverflowStyle", JSImport.Namespace)
@js.native
object getFadedOverflowStyleMod extends js.Object {
  def getFadedOverflowStyle(
    theme: ITheme,
    color: js.UndefOr[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154 */ js.Any
    ],
    direction: js.UndefOr[horizontal | vertical],
    width: js.UndefOr[String | Double],
    height: js.UndefOr[String | Double]
  ): IRawStyle = js.native
}

