package typingsSlinky.tuyaPanelKit.stackTypesMod

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.tuyaPanelKit.anon.Left
import typingsSlinky.tuyaPanelKit.anon.Progress
import typingsSlinky.tuyaPanelKit.anon.Screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackCardInterpolationProps extends js.Object {
  
  /**
    * Animated node representing whether the card is closing (1 - closing, 0 - not closing).
    */
  var closing: AnimatedInterpolation = js.native
  
  /**
    * Values for the current screen.
    */
  var current: Progress = js.native
  
  /**
    * The index of the card in the stack.
    */
  var index: Double = js.native
  
  /**
    * Safe area insets
    */
  var insets: Left = js.native
  
  /**
    * Animated node representing multiplier when direction is inverted (-1 - inverted, 1 - normal).
    */
  var inverted: AnimatedInterpolation = js.native
  
  /**
    * Layout measurements for various items we use for animation.
    */
  var layouts: Screen = js.native
  
  /**
    * Values for the current screen the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[Progress] = js.native
  
  /**
    * Animated node representing whether the card is being swiped (1 - swiping, 0 - not swiping).
    */
  var swiping: AnimatedInterpolation = js.native
}
object StackCardInterpolationProps {
  
  @scala.inline
  def apply(
    closing: AnimatedInterpolation,
    current: Progress,
    index: Double,
    insets: Left,
    inverted: AnimatedInterpolation,
    layouts: Screen,
    swiping: AnimatedInterpolation
  ): StackCardInterpolationProps = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackCardInterpolationProps]
  }
  
  @scala.inline
  implicit class StackCardInterpolationPropsOps[Self <: StackCardInterpolationProps] (val x: Self) extends AnyVal {
    
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
    def setClosing(value: AnimatedInterpolation): Self = this.set("closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent(value: Progress): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsets(value: Left): Self = this.set("insets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverted(value: AnimatedInterpolation): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayouts(value: Screen): Self = this.set("layouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwiping(value: AnimatedInterpolation): Self = this.set("swiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Progress): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
}
