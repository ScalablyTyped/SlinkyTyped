package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Media.Devices.MediaCapturePauseBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for taking a low lag media recording. */
@js.native
trait LowLagMediaRecording extends StObject {
  
  /**
    * Asynchronously releases the LowLagMediaRecording object and resources used by the media recording operation.
    * @return Object that is used to control the asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Pauses an ongoing low lag media record operation
    * @param behavior A value indicating whether the media capture hardware resources should be preserved or released while recording is paused.
    * @return An asynchronous action.
    */
  def pauseAsync(behavior: MediaCapturePauseBehavior): IPromiseWithIAsyncAction = js.native
  
  /**
    * Resumes a paused low lag recording operation.
    * @return An asynchronous action.
    */
  def resumeAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously starts the low lag media recording.
    * @return Object that is used to control the asynchronous operation.
    */
  def startAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously stops the low lag media recording.
    * @return Object that is used to control the asynchronous operation.
    */
  def stopAsync(): IPromiseWithIAsyncAction = js.native
}
object LowLagMediaRecording {
  
  @scala.inline
  def apply(
    finishAsync: () => IPromiseWithIAsyncAction,
    pauseAsync: MediaCapturePauseBehavior => IPromiseWithIAsyncAction,
    resumeAsync: () => IPromiseWithIAsyncAction,
    startAsync: () => IPromiseWithIAsyncAction,
    stopAsync: () => IPromiseWithIAsyncAction
  ): LowLagMediaRecording = {
    val __obj = js.Dynamic.literal(finishAsync = js.Any.fromFunction0(finishAsync), pauseAsync = js.Any.fromFunction1(pauseAsync), resumeAsync = js.Any.fromFunction0(resumeAsync), startAsync = js.Any.fromFunction0(startAsync), stopAsync = js.Any.fromFunction0(stopAsync))
    __obj.asInstanceOf[LowLagMediaRecording]
  }
  
  @scala.inline
  implicit class LowLagMediaRecordingMutableBuilder[Self <: LowLagMediaRecording] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinishAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "finishAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPauseAsync(value: MediaCapturePauseBehavior => IPromiseWithIAsyncAction): Self = StObject.set(x, "pauseAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResumeAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "resumeAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "startAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "stopAsync", js.Any.fromFunction0(value))
  }
}
