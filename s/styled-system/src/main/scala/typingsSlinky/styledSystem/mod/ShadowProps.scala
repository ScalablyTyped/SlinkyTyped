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
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    boxShadow: ResponsiveValue[BoxShadowProperty | Double, ThemeType] = null,
    textShadow: ResponsiveValue[TextShadowProperty | Double, ThemeType] = null
  ): ShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (boxShadow != null) __obj.updateDynamic("boxShadow")(boxShadow.asInstanceOf[js.Any])
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowProps[ThemeType]]
  }
}

