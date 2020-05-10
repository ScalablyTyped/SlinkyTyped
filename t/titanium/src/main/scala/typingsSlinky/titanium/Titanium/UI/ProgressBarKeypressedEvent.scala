package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a hardware key is pressed in the view.
		 */
@js.native
trait ProgressBarKeypressedEvent extends ProgressBarBaseEvent {
  /**
  			 * The code for the physical key that was pressed. For more details, see [KeyEvent](https://developer.android.com/reference/android/view/KeyEvent.html). This API is experimental and subject to change.
  			 */
  var keyCode: Double = js.native
}

object ProgressBarKeypressedEvent {
  @scala.inline
  def apply(keyCode: Double, source: ProgressBar): ProgressBarKeypressedEvent = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarKeypressedEvent]
  }
  @scala.inline
  implicit class ProgressBarKeypressedEventOps[Self <: ProgressBarKeypressedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

