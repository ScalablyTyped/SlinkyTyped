package typingsSlinky.tuyaPanelKit.mod

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import typingsSlinky.tuyaPanelKit.anon.DebugThumbTouchArea
import typingsSlinky.tuyaPanelKit.anon.Duration
import typingsSlinky.tuyaPanelKit.anon.Height
import typingsSlinky.tuyaPanelKit.anon.`21`
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
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.basic
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.both
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.button
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.center
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
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.slider
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.spring
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.timing
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.top
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.PopupProps, 'onLayout' | 'animationType'> */
/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.SliderProps, 'theme'> */
@js.native
trait PopupNumberSelectorProps extends js.Object {
  
  var _onDataChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  
  var accessibilityComponentType: js.UndefOr[none_ | button | radiobutton_checked | radiobutton_unchecked] = js.native
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  
  var accessibilityHint: js.UndefOr[String] = js.native
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var accessibilityLiveRegion: js.UndefOr[none_ | polite | assertive] = js.native
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  
  var accessible: js.UndefOr[Boolean] = js.native
  
  var activeIdx: js.UndefOr[Double] = js.native
  
  var alignContainer: js.UndefOr[top | center | bottom] = js.native
  
  var animateTransitions: js.UndefOr[Boolean] = js.native
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var animationConfig: js.UndefOr[Duration] = js.native
  
  var animationType: js.UndefOr[spring | timing] = js.native
  
  var backIconColor: js.UndefOr[String] = js.native
  
  var backText: js.UndefOr[String] = js.native
  
  var canTouchTrack: js.UndefOr[Boolean] = js.native
  
  var cancelText: js.UndefOr[String] = js.native
  
  var cancelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var collapsable: js.UndefOr[Boolean] = js.native
  
  var confirmText: js.UndefOr[String] = js.native
  
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var debugTouchArea: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var focusable: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[ReactElement] = js.native
  
  var footerType: js.UndefOr[both | singleConfirm | singleCancel] = js.native
  
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  
  var hitSlop: js.UndefOr[Insets] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  
  var isAlign: js.UndefOr[Boolean] = js.native
  
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  
  var isValueChangeUniform: js.UndefOr[Boolean] = js.native
  
  var mask: js.UndefOr[Boolean] = js.native
  
  var maskStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  
  var maximumValue: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var minimumTrackTintColor: js.UndefOr[String] = js.native
  
  var minimumValue: js.UndefOr[Double] = js.native
  
  var modalChildStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var motionConfig: js.UndefOr[
    MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps
  ] = js.native
  
  var motionType: js.UndefOr[none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown] = js.native
  
  var nativeID: js.UndefOr[String] = js.native
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
  
  var numberSelectorWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onBack: js.UndefOr[js.Function1[/* args */ `21`, Unit]] = js.native
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onConfirm: js.UndefOr[js.Function2[/* data */ js.Any, /* args */ `21`, Unit]] = js.native
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLayout: js.UndefOr[js.Function1[/* x */ Double, Unit]] = js.native
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onMaskPress: js.UndefOr[js.Function1[/* args */ `21`, Unit]] = js.native
  
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onOrientationChange: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]] = js.native
  
  var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onResponderEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderGrant: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderReject: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderRelease: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderTerminate: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onResponderTerminationRequest: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onScrollEvent: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]] = js.native
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  
  var onSlidingStart: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  
  var onStartShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  
  var onSwitchValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.native
  
  var onTouchCancel: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchEndCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onlyLastModalVisible: js.UndefOr[Boolean] = js.native
  
  var onlyMaximumTrack: js.UndefOr[Boolean] = js.native
  
  var pointerEvents: js.UndefOr[`box-none` | none_ | `box-only` | auto] = js.native
  
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.native
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  
  var renderMaximumTrack: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var renderMinimumTrack: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var renderThumb: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
  
  var reverseValue: js.UndefOr[Boolean] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
  
  var showBack: js.UndefOr[Boolean] = js.native
  
  var statusBarTranslucent: js.UndefOr[Boolean] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var stepValue: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var styles: js.UndefOr[DebugThumbTouchArea] = js.native
  
  var subTitle: js.UndefOr[String] = js.native
  
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.native
  
  var switchValue: js.UndefOr[Boolean] = js.native
  
  var testID: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[BackIconColor] = js.native
  
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var thumbTintColor: js.UndefOr[String] = js.native
  
  var thumbTouchSize: js.UndefOr[Height] = js.native
  
  var title: js.UndefOr[String | js.Array[String] | ReactElement] = js.native
  
  var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var titleWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var tvParallaxMagnification: js.UndefOr[Double] = js.native
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
  
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[basic | slider] = js.native
  
  var useKeyboardView: js.UndefOr[Boolean] = js.native
  
  var value: Double = js.native
  
  var valueChangeTime: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object PopupNumberSelectorProps {
  
  @scala.inline
  def apply(value: Double): PopupNumberSelectorProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupNumberSelectorProps]
  }
  
  @scala.inline
  implicit class PopupNumberSelectorPropsOps[Self <: PopupNumberSelectorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onDataChange(value: /* value */ Double => Unit): Self = this.set("_onDataChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete_onDataChange: Self = this.set("_onDataChange", js.undefined)
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = this.set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: none_ | button | radiobutton_checked | radiobutton_unchecked): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none_ | polite | assertive): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setActiveIdx(value: Double): Self = this.set("activeIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIdx: Self = this.set("activeIdx", js.undefined)
    
    @scala.inline
    def setAlignContainer(value: top | center | bottom): Self = this.set("alignContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignContainer: Self = this.set("alignContainer", js.undefined)
    
    @scala.inline
    def setAnimateTransitions(value: Boolean): Self = this.set("animateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateTransitions: Self = this.set("animateTransitions", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setAnimationConfig(value: Duration): Self = this.set("animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationConfig: Self = this.set("animationConfig", js.undefined)
    
    @scala.inline
    def setAnimationType(value: spring | timing): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    
    @scala.inline
    def setBackIconColor(value: String): Self = this.set("backIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackIconColor: Self = this.set("backIconColor", js.undefined)
    
    @scala.inline
    def setBackText(value: String): Self = this.set("backText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackText: Self = this.set("backText", js.undefined)
    
    @scala.inline
    def setCanTouchTrack(value: Boolean): Self = this.set("canTouchTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanTouchTrack: Self = this.set("canTouchTrack", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setCancelTextStyle(value: StyleProp[TextStyle]): Self = this.set("cancelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelTextStyle: Self = this.set("cancelTextStyle", js.undefined)
    
    @scala.inline
    def setCancelTextStyleNull: Self = this.set("cancelTextStyle", null)
    
    @scala.inline
    def setCollapsable(value: Boolean): Self = this.set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsable: Self = this.set("collapsable", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmText: Self = this.set("confirmText", js.undefined)
    
    @scala.inline
    def setConfirmTextStyle(value: StyleProp[TextStyle]): Self = this.set("confirmTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmTextStyle: Self = this.set("confirmTextStyle", js.undefined)
    
    @scala.inline
    def setConfirmTextStyleNull: Self = this.set("confirmTextStyle", null)
    
    @scala.inline
    def setDebugTouchArea(value: Boolean): Self = this.set("debugTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugTouchArea: Self = this.set("debugTouchArea", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFooterType(value: both | singleConfirm | singleCancel): Self = this.set("footerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterType: Self = this.set("footerType", js.undefined)
    
    @scala.inline
    def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("footerWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterWrapperStyle: Self = this.set("footerWrapperStyle", js.undefined)
    
    @scala.inline
    def setFooterWrapperStyleNull: Self = this.set("footerWrapperStyle", null)
    
    @scala.inline
    def setHardwareAccelerated(value: Boolean): Self = this.set("hardwareAccelerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardwareAccelerated: Self = this.set("hardwareAccelerated", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setIsAlign(value: Boolean): Self = this.set("isAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlign: Self = this.set("isAlign", js.undefined)
    
    @scala.inline
    def setIsTVSelectable(value: Boolean): Self = this.set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTVSelectable: Self = this.set("isTVSelectable", js.undefined)
    
    @scala.inline
    def setIsValueChangeUniform(value: Boolean): Self = this.set("isValueChangeUniform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsValueChangeUniform: Self = this.set("isValueChangeUniform", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaskStyle(value: StyleProp[ViewStyle]): Self = this.set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskStyle: Self = this.set("maskStyle", js.undefined)
    
    @scala.inline
    def setMaskStyleNull: Self = this.set("maskStyle", null)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = this.set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumTrackTintColor: Self = this.set("minimumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    
    @scala.inline
    def setModalChildStyle(value: StyleProp[ViewStyle]): Self = this.set("modalChildStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalChildStyle: Self = this.set("modalChildStyle", js.undefined)
    
    @scala.inline
    def setModalChildStyleNull: Self = this.set("modalChildStyle", null)
    
    @scala.inline
    def setMotionConfig(value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps): Self = this.set("motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionConfig: Self = this.set("motionConfig", js.undefined)
    
    @scala.inline
    def setMotionType(value: none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown): Self = this.set("motionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionType: Self = this.set("motionType", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = this.set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsOffscreenAlphaCompositing: Self = this.set("needsOffscreenAlphaCompositing", js.undefined)
    
    @scala.inline
    def setNumberSelectorWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("numberSelectorWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberSelectorWrapperStyle: Self = this.set("numberSelectorWrapperStyle", js.undefined)
    
    @scala.inline
    def setNumberSelectorWrapperStyleNull: Self = this.set("numberSelectorWrapperStyle", null)
    
    @scala.inline
    def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBack(value: /* args */ `21` => Unit): Self = this.set("onBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBack: Self = this.set("onBack", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): Self = this.set("onConfirm", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* x */ Double => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnMaskPress(value: /* args */ `21` => Unit): Self = this.set("onMaskPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMaskPress: Self = this.set("onMaskPress", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnOrientationChange(value: SyntheticEvent[NodeHandle, _] => Unit): Self = this.set("onOrientationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOrientationChange: Self = this.set("onOrientationChange", js.undefined)
    
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRequestClose: Self = this.set("onRequestClose", js.undefined)
    
    @scala.inline
    def setOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    
    @scala.inline
    def setOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    
    @scala.inline
    def setOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    
    @scala.inline
    def setOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    
    @scala.inline
    def setOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    
    @scala.inline
    def setOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnScrollEvent(value: /* value */ Double => Unit): Self = this.set("onScrollEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollEvent: Self = this.set("onScrollEvent", js.undefined)
    
    @scala.inline
    def setOnShow(value: SyntheticEvent[NodeHandle, _] => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* newValue */ Double => Unit): Self = this.set("onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlidingComplete: Self = this.set("onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnSlidingStart(value: /* newValue */ Double => Unit): Self = this.set("onSlidingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlidingStart: Self = this.set("onSlidingStart", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnSwitchValueChange(value: /* value */ Boolean => Unit): Self = this.set("onSwitchValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSwitchValueChange: Self = this.set("onSwitchValueChange", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Double => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setOnlyLastModalVisible(value: Boolean): Self = this.set("onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyLastModalVisible: Self = this.set("onlyLastModalVisible", js.undefined)
    
    @scala.inline
    def setOnlyMaximumTrack(value: Boolean): Self = this.set("onlyMaximumTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyMaximumTrack: Self = this.set("onlyMaximumTrack", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none_ | `box-only` | auto): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setPresentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): Self = this.set("presentationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentationStyle: Self = this.set("presentationStyle", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderMaximumTrack(value: () => ReactElement): Self = this.set("renderMaximumTrack", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderMaximumTrack: Self = this.set("renderMaximumTrack", js.undefined)
    
    @scala.inline
    def setRenderMinimumTrack(value: () => ReactElement): Self = this.set("renderMinimumTrack", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderMinimumTrack: Self = this.set("renderMinimumTrack", js.undefined)
    
    @scala.inline
    def setRenderThumb(value: () => ReactElement): Self = this.set("renderThumb", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderThumb: Self = this.set("renderThumb", js.undefined)
    
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: Boolean): Self = this.set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderToHardwareTextureAndroid: Self = this.set("renderToHardwareTextureAndroid", js.undefined)
    
    @scala.inline
    def setReverseValue(value: Boolean): Self = this.set("reverseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseValue: Self = this.set("reverseValue", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOS(value: Boolean): Self = this.set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRasterizeIOS: Self = this.set("shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setShowBack(value: Boolean): Self = this.set("showBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBack: Self = this.set("showBack", js.undefined)
    
    @scala.inline
    def setStatusBarTranslucent(value: Boolean): Self = this.set("statusBarTranslucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBarTranslucent: Self = this.set("statusBarTranslucent", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStepValue(value: Double): Self = this.set("stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepValue: Self = this.set("stepValue", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setStyles(value: DebugThumbTouchArea): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setSupportedOrientationsVarargs(value: (portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`)*): Self = this.set("supportedOrientations", js.Array(value :_*))
    
    @scala.inline
    def setSupportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedOrientations: Self = this.set("supportedOrientations", js.undefined)
    
    @scala.inline
    def setSwitchValue(value: Boolean): Self = this.set("switchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitchValue: Self = this.set("switchValue", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTheme(value: BackIconColor): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setThumbStyle(value: StyleProp[ViewStyle]): Self = this.set("thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbStyle: Self = this.set("thumbStyle", js.undefined)
    
    @scala.inline
    def setThumbStyleNull: Self = this.set("thumbStyle", null)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setThumbTouchSize(value: Height): Self = this.set("thumbTouchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTouchSize: Self = this.set("thumbTouchSize", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleVarargs(value: String*): Self = this.set("title", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String | js.Array[String] | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: StyleProp[TextStyle]): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleTextStyleNull: Self = this.set("titleTextStyle", null)
    
    @scala.inline
    def setTitleWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("titleWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleWrapperStyle: Self = this.set("titleWrapperStyle", js.undefined)
    
    @scala.inline
    def setTitleWrapperStyleNull: Self = this.set("titleWrapperStyle", null)
    
    @scala.inline
    def setTrackStyle(value: StyleProp[ViewStyle]): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    
    @scala.inline
    def setTrackStyleNull: Self = this.set("trackStyle", null)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnification(value: Double): Self = this.set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxMagnification: Self = this.set("tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Double): Self = this.set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceX: Self = this.set("tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Double): Self = this.set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceY: Self = this.set("tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngle(value: Double): Self = this.set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxTiltAngle: Self = this.set("tvParallaxTiltAngle", js.undefined)
    
    @scala.inline
    def setType(value: basic | slider): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseKeyboardView(value: Boolean): Self = this.set("useKeyboardView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseKeyboardView: Self = this.set("useKeyboardView", js.undefined)
    
    @scala.inline
    def setValueChangeTime(value: Double): Self = this.set("valueChangeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueChangeTime: Self = this.set("valueChangeTime", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[TextStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
}
