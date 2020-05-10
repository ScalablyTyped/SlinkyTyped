package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.Dimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when the soft keyboard is presented, on and off the screen.
	 */
@js.native
trait AppKeyboardframechangedEvent extends AppBaseEvent {
  /**
  		 * The duration of the keyboard animation. This parameter is only available on Titanium SDK 4.0.0 and later.
  		 */
  var animationDuration: Double = js.native
  /**
  		 * A dictionary with keys x, y, width and height representing the frame of keyboard on screen.
  		 */
  var keyboardFrame: Dimension = js.native
}

object AppKeyboardframechangedEvent {
  @scala.inline
  def apply(animationDuration: Double, keyboardFrame: Dimension, source: App): AppKeyboardframechangedEvent = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], keyboardFrame = keyboardFrame.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppKeyboardframechangedEvent]
  }
  @scala.inline
  implicit class AppKeyboardframechangedEventOps[Self <: AppKeyboardframechangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardFrame(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardFrame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

