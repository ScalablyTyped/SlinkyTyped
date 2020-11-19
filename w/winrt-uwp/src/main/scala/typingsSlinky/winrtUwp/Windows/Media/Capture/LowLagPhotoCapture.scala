package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for taking a low shutter lag photo. */
@js.native
trait LowLagPhotoCapture extends js.Object {
  
  /**
    * Asynchronously captures a low shutter lag photo.
    * @return When this method completes, a CapturedPhoto object is returned which contains the captured photo.
    */
  def captureAsync(): IPromiseWithIAsyncOperation[CapturedPhoto] = js.native
  
  /**
    * Asynchronously releases the LowLagPhotoCapture object and resources used by the capture photo operation.
    * @return Object that is used to control the asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncAction = js.native
}
object LowLagPhotoCapture {
  
  @scala.inline
  def apply(
    captureAsync: () => IPromiseWithIAsyncOperation[CapturedPhoto],
    finishAsync: () => IPromiseWithIAsyncAction
  ): LowLagPhotoCapture = {
    val __obj = js.Dynamic.literal(captureAsync = js.Any.fromFunction0(captureAsync), finishAsync = js.Any.fromFunction0(finishAsync))
    __obj.asInstanceOf[LowLagPhotoCapture]
  }
  
  @scala.inline
  implicit class LowLagPhotoCaptureOps[Self <: LowLagPhotoCapture] (val x: Self) extends AnyVal {
    
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
    def setCaptureAsync(value: () => IPromiseWithIAsyncOperation[CapturedPhoto]): Self = this.set("captureAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinishAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("finishAsync", js.Any.fromFunction0(value))
  }
}
