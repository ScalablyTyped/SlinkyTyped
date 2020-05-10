package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITappedEventArgs extends js.Object {
  var pointerDeviceType: PointerDeviceType = js.native
  var position: Point = js.native
  var tapCount: Double = js.native
}

object ITappedEventArgs {
  @scala.inline
  def apply(pointerDeviceType: PointerDeviceType, position: Point, tapCount: Double): ITappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITappedEventArgs]
  }
  @scala.inline
  implicit class ITappedEventArgsOps[Self <: ITappedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointerDeviceType(value: PointerDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTapCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

