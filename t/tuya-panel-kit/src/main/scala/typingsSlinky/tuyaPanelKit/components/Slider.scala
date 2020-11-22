package typingsSlinky.tuyaPanelKit.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.DebugThumbTouchArea
import typingsSlinky.tuyaPanelKit.anon.Duration
import typingsSlinky.tuyaPanelKit.anon.Height
import typingsSlinky.tuyaPanelKit.anon.MaximumTrackTintColor
import typingsSlinky.tuyaPanelKit.mod.SliderProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.spring
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.timing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("tuya-panel-kit", "Slider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Slider] {
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animateTransitions(value: Boolean): this.type = set("animateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationConfig(value: Duration): this.type = set("animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationType(value: spring | timing): this.type = set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canTouchTrack(value: Boolean): this.type = set("canTouchTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debugTouchArea(value: Boolean): this.type = set("debugTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maximumTrackTintColor(value: String): this.type = set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maximumValue(value: Double): this.type = set("maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimumTrackTintColor(value: String): this.type = set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimumValue(value: Double): this.type = set("minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLayout(value: /* x */ Double => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScrollEvent(value: /* value */ Double => Unit): this.type = set("onScrollEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSlidingComplete(value: /* newValue */ Double => Unit): this.type = set("onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSlidingStart(value: /* newValue */ Double => Unit): this.type = set("onSlidingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValueChange(value: /* newValue */ Double => Unit): this.type = set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onlyMaximumTrack(value: Boolean): this.type = set("onlyMaximumTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderMaximumTrack(value: () => ReactElement): this.type = set("renderMaximumTrack", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderMinimumTrack(value: () => ReactElement): this.type = set("renderMinimumTrack", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderThumb(value: () => ReactElement): this.type = set("renderThumb", js.Any.fromFunction0(value))
    
    @scala.inline
    def reverseValue(value: Boolean): this.type = set("reverseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepValue(value: Double): this.type = set("stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: DebugThumbTouchArea): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: MaximumTrackTintColor): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbStyle(value: StyleProp[ViewStyle]): this.type = set("thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbStyleNull: this.type = set("thumbStyle", null)
    
    @scala.inline
    def thumbTintColor(value: String): this.type = set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbTouchSize(value: Height): this.type = set("thumbTouchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackStyle(value: StyleProp[ViewStyle]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackStyleNull: this.type = set("trackStyle", null)
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
