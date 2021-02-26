package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends TextColorProps[ThemeType, TVal]
     with BackgroundColorProps[ThemeType, TVal]
     with OpacityProps[RequiredTheme]
object ColorProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): ColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProps[ThemeType, TVal]]
  }
}
