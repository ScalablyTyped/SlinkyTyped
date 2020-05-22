package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.BoxShadowProperty
import typingsSlinky.csstype.mod.TextShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends BoxShadowProps[ThemeType]
     with TextShadowProps[ThemeType]

object ShadowProps {
  @scala.inline
  def apply[ThemeType](
    boxShadow: js.UndefOr[Null | (ResponsiveValue[BoxShadowProperty | Double, ThemeType])] = js.undefined,
    textShadow: js.UndefOr[Null | (ResponsiveValue[TextShadowProperty | Double, ThemeType])] = js.undefined
  ): ShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boxShadow)) __obj.updateDynamic("boxShadow")(boxShadow.asInstanceOf[js.Any])
    if (!js.isUndefined(textShadow)) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowProps[ThemeType]]
  }
}

