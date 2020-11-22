package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.CellRadius
import typingsSlinky.tuyaPanelKit.anon.DebugThumbTouchArea
import typingsSlinky.tuyaPanelKit.anon.Duration
import typingsSlinky.tuyaPanelKit.anon.Height
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.iconfont
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.image
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.spring
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.text
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.timing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.SliderProps, 'theme'> */
@js.native
trait TYSectionSliderProps extends js.Object {
  
  var Action: js.UndefOr[js.Any] = js.native
  
  var Icon: js.UndefOr[js.Any] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var animateTransitions: js.UndefOr[Boolean] = js.native
  
  var animationConfig: js.UndefOr[Duration] = js.native
  
  var animationType: js.UndefOr[spring | timing] = js.native
  
  var canTouchTrack: js.UndefOr[Boolean] = js.native
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var debugTouchArea: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var imageFollowIconColor: js.UndefOr[Boolean] = js.native
  
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  
  var maximumValue: js.UndefOr[Double] = js.native
  
  var minimumTrackTintColor: js.UndefOr[String] = js.native
  
  var minimumValue: js.UndefOr[Double] = js.native
  
  var onLayout: js.UndefOr[js.Function1[/* x */ Double, Unit]] = js.native
  
  var onScrollEvent: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  
  var onSlidingStart: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  
  var onValueChange: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  
  var onlyMaximumTrack: js.UndefOr[Boolean] = js.native
  
  var renderMaximumTrack: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var renderMinimumTrack: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var renderThumb: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var reverseValue: js.UndefOr[Boolean] = js.native
  
  var sliderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var stepValue: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var styles: js.UndefOr[DebugThumbTouchArea] = js.native
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var theme: CellRadius = js.native
  
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var thumbTintColor: js.UndefOr[String] = js.native
  
  var thumbTouchSize: js.UndefOr[Height] = js.native
  
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object TYSectionSliderProps {
  
  @scala.inline
  def apply(theme: CellRadius): TYSectionSliderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYSectionSliderProps]
  }
  
  @scala.inline
  implicit class TYSectionSliderPropsOps[Self <: TYSectionSliderProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: CellRadius): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: js.Any): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("Icon", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setActionType(value: auto | image | iconfont | text): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setAnimateTransitions(value: Boolean): Self = this.set("animateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateTransitions: Self = this.set("animateTransitions", js.undefined)
    
    @scala.inline
    def setAnimationConfig(value: Duration): Self = this.set("animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationConfig: Self = this.set("animationConfig", js.undefined)
    
    @scala.inline
    def setAnimationType(value: spring | timing): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    
    @scala.inline
    def setCanTouchTrack(value: Boolean): Self = this.set("canTouchTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanTouchTrack: Self = this.set("canTouchTrack", js.undefined)
    
    @scala.inline
    def setContentStyle(value: StyleProp[ViewStyle]): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setContentStyleNull: Self = this.set("contentStyle", null)
    
    @scala.inline
    def setDebugTouchArea(value: Boolean): Self = this.set("debugTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugTouchArea: Self = this.set("debugTouchArea", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setIconType(value: auto | image | iconfont | text): Self = this.set("iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    
    @scala.inline
    def setImageFollowIconColor(value: Boolean): Self = this.set("imageFollowIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageFollowIconColor: Self = this.set("imageFollowIconColor", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = this.set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumTrackTintColor: Self = this.set("minimumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* x */ Double => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnScrollEvent(value: /* value */ Double => Unit): Self = this.set("onScrollEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollEvent: Self = this.set("onScrollEvent", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* newValue */ Double => Unit): Self = this.set("onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlidingComplete: Self = this.set("onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnSlidingStart(value: /* newValue */ Double => Unit): Self = this.set("onSlidingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlidingStart: Self = this.set("onSlidingStart", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* newValue */ Double => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setOnlyMaximumTrack(value: Boolean): Self = this.set("onlyMaximumTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyMaximumTrack: Self = this.set("onlyMaximumTrack", js.undefined)
    
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
    def setReverseValue(value: Boolean): Self = this.set("reverseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseValue: Self = this.set("reverseValue", js.undefined)
    
    @scala.inline
    def setSliderStyle(value: StyleProp[ViewStyle]): Self = this.set("sliderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliderStyle: Self = this.set("sliderStyle", js.undefined)
    
    @scala.inline
    def setSliderStyleNull: Self = this.set("sliderStyle", null)
    
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
    def setTextStyle(value: StyleProp[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
    
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
    def setTrackStyle(value: StyleProp[ViewStyle]): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    
    @scala.inline
    def setTrackStyleNull: Self = this.set("trackStyle", null)
    
    @scala.inline
    def setUseART(value: Boolean): Self = this.set("useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseART: Self = this.set("useART", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
