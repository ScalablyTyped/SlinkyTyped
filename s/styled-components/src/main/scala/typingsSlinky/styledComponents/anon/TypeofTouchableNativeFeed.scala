package typingsSlinky.styledComponents.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.RippleBackgroundPropType
import typingsSlinky.reactNative.mod.ThemeAttributeBackgroundPropType
import typingsSlinky.reactNative.mod.TouchableNativeFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTouchableNativeFeed extends Instantiable0[TouchableNativeFeedback] {
  
  /**
    * Creates an object that represents ripple drawable with specified color (as a
    * string). If property `borderless` evaluates to true the ripple will
    * render outside of the view bounds (see native actionbar buttons as an
    * example of that behavior). This background type is available on Android
    * API level 21+.
    *
    * @param color The ripple color
    * @param borderless If the ripple can render outside it's bounds
    */
  def Ripple(color: ColorValue): RippleBackgroundPropType = js.native
  def Ripple(color: ColorValue, borderless: Boolean): RippleBackgroundPropType = js.native
  
  /**
    * Creates an object that represents android theme's default background for
    * selectable elements (?android:attr/selectableItemBackground).
    */
  def SelectableBackground(): ThemeAttributeBackgroundPropType = js.native
  
  /**
    * Creates an object that represent android theme's default background for borderless
    * selectable elements (?android:attr/selectableItemBackgroundBorderless).
    * Available on android API level 21+.
    */
  def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = js.native
  
  def canUseNativeForeground(): Boolean = js.native
}
