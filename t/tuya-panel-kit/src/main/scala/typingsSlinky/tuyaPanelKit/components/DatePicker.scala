package typingsSlinky.tuyaPanelKit.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactText
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.Am
import typingsSlinky.tuyaPanelKit.anon.DividerColor
import typingsSlinky.tuyaPanelKit.mod.DatePickerProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`flex-end`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`flex-start`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.baseline
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.button
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.date
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.datetime
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.month
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.no
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.none_
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.polite
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_checked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_unchecked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.stretch
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.time
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.year
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("tuya-panel-kit", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.DatePicker] {
    
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def accessibilityComponentType(value: none_ | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLiveRegion(value: none_ | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateSortKeys(value: js.Array[String]): this.type = set("dateSortKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateSortKeysVarargs(value: String*): this.type = set("dateSortKeys", js.Array(value :_*))
    
    @scala.inline
    def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dividerColor(value: String): this.type = set("dividerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isAmpmFirst(value: Boolean): this.type = set("isAmpmFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isPlusZero(value: Boolean): this.type = set("isPlusZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isTimeFirst(value: Boolean): this.type = set("isTimeFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemAlign(value: `flex-end` | center | `flex-start` | baseline | stretch): this.type = set("itemAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemStyle(value: StyleProp[TextStyle]): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemStyleNull: this.type = set("itemStyle", null)
    
    @scala.inline
    def itemTextColor(value: String): this.type = set("itemTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: String | Am): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: datetime | date | time | month | year): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDateChange(value: /* value */ js.UndefOr[js.Date] => Unit): this.type = set("onDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValueChange(value: (/* value */ js.UndefOr[ReactText], /* index */ js.UndefOr[Double]) => Unit): this.type = set("onValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def pickerFontColor(value: String): this.type = set("pickerFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: `box-none` | none_ | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prompt(value: String): this.type = set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedItemTextColor(value: String): this.type = set("selectedItemTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedValue(value: String | Double | Boolean): this.type = set("selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textSize(value: Double): this.type = set("textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: DividerColor): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleItemCount(value: Double): this.type = set("visibleItemCount", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
