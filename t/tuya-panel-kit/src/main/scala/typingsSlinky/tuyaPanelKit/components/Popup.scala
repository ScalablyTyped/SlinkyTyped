package typingsSlinky.tuyaPanelKit.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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
import typingsSlinky.tuyaPanelKit.anon.BackIconColor
import typingsSlinky.tuyaPanelKit.anon.`21`
import typingsSlinky.tuyaPanelKit.mod.MotionFadeProps
import typingsSlinky.tuyaPanelKit.mod.MotionPullUpProps
import typingsSlinky.tuyaPanelKit.mod.MotionScaleFadeInProps
import typingsSlinky.tuyaPanelKit.mod.MotionScalePullDownProps
import typingsSlinky.tuyaPanelKit.mod.PopupProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`landscape-left`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`landscape-right`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`portrait-upside-down`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.both
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.button
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.fade_
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.formSheet
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.fullScreen
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.landscape
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.no
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.none_
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.overFullScreen
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.pageSheet
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.polite
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.portrait
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_checked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.radiobutton_unchecked
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.singleCancel
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.singleConfirm
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.top
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popup {
  
  @JSImport("tuya-panel-kit", "Popup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Popup] {
    
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
    def activeIdx(value: Double): this.type = set("activeIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignContainer(value: top | center | bottom): this.type = set("alignContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationType(value: fade_ | none_): this.type = set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backIconColor(value: String): this.type = set("backIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backText(value: String): this.type = set("backText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText(value: String): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelTextStyle(value: StyleProp[TextStyle]): this.type = set("cancelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelTextStyleNull: this.type = set("cancelTextStyle", null)
    
    @scala.inline
    def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmText(value: String): this.type = set("confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmTextStyle(value: StyleProp[TextStyle]): this.type = set("confirmTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmTextStyleNull: this.type = set("confirmTextStyle", null)
    
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerType(value: both | singleConfirm | singleCancel): this.type = set("footerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("footerWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerWrapperStyleNull: this.type = set("footerWrapperStyle", null)
    
    @scala.inline
    def hardwareAccelerated(value: Boolean): this.type = set("hardwareAccelerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isAlign(value: Boolean): this.type = set("isAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskStyle(value: StyleProp[ViewStyle]): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskStyleNull: this.type = set("maskStyle", null)
    
    @scala.inline
    def modalChildStyle(value: StyleProp[ViewStyle]): this.type = set("modalChildStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modalChildStyleNull: this.type = set("modalChildStyle", null)
    
    @scala.inline
    def motionConfig(value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def motionType(value: none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown): this.type = set("motionType", value.asInstanceOf[js.Any])
    
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
    def onBack(value: /* args */ `21` => Unit): this.type = set("onBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCancel(value: () => Unit): this.type = set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def onConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): this.type = set("onConfirm", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMaskPress(value: /* args */ `21` => Unit): this.type = set("onMaskPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOrientationChange(value: SyntheticEvent[NodeHandle, _] => Unit): this.type = set("onOrientationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRequestClose(value: () => Unit): this.type = set("onRequestClose", js.Any.fromFunction0(value))
    
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
    def onShow(value: SyntheticEvent[NodeHandle, _] => Unit): this.type = set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwitchValueChange(value: /* value */ Boolean => Unit): this.type = set("onSwitchValueChange", js.Any.fromFunction1(value))
    
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
    def onlyLastModalVisible(value: Boolean): this.type = set("onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: `box-none` | none_ | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def presentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): this.type = set("presentationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showBack(value: Boolean): this.type = set("showBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def statusBarTranslucent(value: Boolean): this.type = set("statusBarTranslucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def subTitle(value: String): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def supportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): this.type = set("supportedOrientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def supportedOrientationsVarargs(value: (portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`)*): this.type = set("supportedOrientations", js.Array(value :_*))
    
    @scala.inline
    def switchValue(value: Boolean): this.type = set("switchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: BackIconColor): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String | js.Array[String] | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleTextStyle(value: StyleProp[TextStyle]): this.type = set("titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleTextStyleNull: this.type = set("titleTextStyle", null)
    
    @scala.inline
    def titleVarargs(value: String*): this.type = set("title", js.Array(value :_*))
    
    @scala.inline
    def titleWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("titleWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleWrapperStyleNull: this.type = set("titleWrapperStyle", null)
    
    @scala.inline
    def transparent(value: Boolean): this.type = set("transparent", value.asInstanceOf[js.Any])
    
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
    def useKeyboardView(value: Boolean): this.type = set("useKeyboardView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: StyleProp[TextStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  implicit def make(companion: Popup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
