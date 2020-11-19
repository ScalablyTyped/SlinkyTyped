package typingsSlinky.winrtUwp.Windows.Media.Capture.Core

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.photocaptured
import typingsSlinky.winrtUwp.winrtUwpStrings.stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods and events that enable the capture of variable photo sequences. */
@js.native
trait VariablePhotoSequenceCapture extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_photocaptured(
    `type`: photocaptured,
    listener: TypedEventHandler[VariablePhotoSequenceCapture, VariablePhotoCapturedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[VariablePhotoSequenceCapture, _]): Unit = js.native
  
  /**
    * Asynchronously releases the VariablePhotoSequenceCapture object and resources used by the capture operation.
    * @return An asynchronous action.
    */
  def finishAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Occurs when a frame of a variable photo sequence is captured. */
  def onphotocaptured(ev: VariablePhotoCapturedEventArgs with WinRTEvent[VariablePhotoSequenceCapture]): Unit = js.native
  /** Occurs when a frame of a variable photo sequence is captured. */
  @JSName("onphotocaptured")
  var onphotocaptured_Original: TypedEventHandler[VariablePhotoSequenceCapture, VariablePhotoCapturedEventArgs] = js.native
  
  /** Occurs when the VariablePhotoSequenceCapture object stops capturing frames for a variable photo sequence. */
  def onstopped(ev: js.Any with WinRTEvent[VariablePhotoSequenceCapture]): Unit = js.native
  /** Occurs when the VariablePhotoSequenceCapture object stops capturing frames for a variable photo sequence. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[VariablePhotoSequenceCapture, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_photocaptured(
    `type`: photocaptured,
    listener: TypedEventHandler[VariablePhotoSequenceCapture, VariablePhotoCapturedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[VariablePhotoSequenceCapture, _]): Unit = js.native
  
  /**
    * Starts the capturing of variable photo sequence frames.
    * @return An asynchronous action.
    */
  def startAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Stops the capturing of variable photo sequence frames.
    * @return An asynchronous action.
    */
  def stopAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Updates the frame control values of the variable photo sequence.
    * @return An asynchronous action.
    */
  def updateSettingsAsync(): IPromiseWithIAsyncAction = js.native
}
