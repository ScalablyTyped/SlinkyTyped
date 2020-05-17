package typingsSlinky.winrtUwp.Windows.Media.Capture.Core

import typingsSlinky.winrtUwp.Windows.Media.Capture.CapturedFrame
import typingsSlinky.winrtUwp.Windows.Media.Capture.CapturedFrameControlValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoCaptured event. */
@js.native
trait VariablePhotoCapturedEventArgs extends js.Object {
  /** Gets the time offset of the capture of the associated frame in a variable photo sequence. */
  var captureTimeOffset: Double = js.native
  /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the associated frame in a variable photo sequence. */
  var capturedFrameControlValues: CapturedFrameControlValues = js.native
  /** Gets a CapturedFrame object representing a captured frame of a variable photo sequence. */
  var frame: CapturedFrame = js.native
  /** Gets an index value that indicates which element of the DesiredFrameControllers vector was used to specify the requested control values for the associated frame of a variable photo sequence. */
  var usedFrameControllerIndex: Double = js.native
}

object VariablePhotoCapturedEventArgs {
  @scala.inline
  def apply(
    captureTimeOffset: Double,
    capturedFrameControlValues: CapturedFrameControlValues,
    frame: CapturedFrame,
    usedFrameControllerIndex: Double
  ): VariablePhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], capturedFrameControlValues = capturedFrameControlValues.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], usedFrameControllerIndex = usedFrameControllerIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablePhotoCapturedEventArgs]
  }
  @scala.inline
  implicit class VariablePhotoCapturedEventArgsOps[Self <: VariablePhotoCapturedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureTimeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapturedFrameControlValues(value: CapturedFrameControlValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capturedFrameControlValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: CapturedFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedFrameControllerIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedFrameControllerIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

