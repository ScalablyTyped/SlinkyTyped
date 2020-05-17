package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Media.Devices.MediaCapturePauseBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for taking a low lag media recording. */
@js.native
trait LowLagMediaRecording extends js.Object {
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
  implicit class LowLagMediaRecordingOps[Self <: LowLagMediaRecording] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinishAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPauseAsync(value: MediaCapturePauseBehavior => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResumeAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

