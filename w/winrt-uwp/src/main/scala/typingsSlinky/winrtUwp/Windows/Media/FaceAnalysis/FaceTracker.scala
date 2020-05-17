package typingsSlinky.winrtUwp.Windows.Media.FaceAnalysis

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapSize
import typingsSlinky.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
@js.native
trait FaceTracker extends js.Object {
  /** Gets or sets the maximum detectable face size, in pixels. */
  var maxDetectableFaceSize: BitmapSize = js.native
  /** Gets or sets the minimum detectable face size, in pixels. */
  var minDetectableFaceSize: BitmapSize = js.native
  /**
    * Asynchronously processes a VideoFrame for face detection.
    * @param videoFrame The VideoFrame in which faces are detected or tracked.
    * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
    */
  def processNextFrameAsync(videoFrame: VideoFrame): IPromiseWithIAsyncOperation[IVector[_]] = js.native
}

object FaceTracker {
  @scala.inline
  def apply(
    maxDetectableFaceSize: BitmapSize,
    minDetectableFaceSize: BitmapSize,
    processNextFrameAsync: VideoFrame => IPromiseWithIAsyncOperation[IVector[_]]
  ): FaceTracker = {
    val __obj = js.Dynamic.literal(maxDetectableFaceSize = maxDetectableFaceSize.asInstanceOf[js.Any], minDetectableFaceSize = minDetectableFaceSize.asInstanceOf[js.Any], processNextFrameAsync = js.Any.fromFunction1(processNextFrameAsync))
    __obj.asInstanceOf[FaceTracker]
  }
  @scala.inline
  implicit class FaceTrackerOps[Self <: FaceTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDetectableFaceSize(value: BitmapSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDetectableFaceSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDetectableFaceSize(value: BitmapSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDetectableFaceSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessNextFrameAsync(value: VideoFrame => IPromiseWithIAsyncOperation[IVector[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processNextFrameAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

