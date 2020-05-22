package typingsSlinky.winrtUwp.global.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the scene mode settings on a capture device. */
@JSGlobal("Windows.Media.Devices.SceneModeControl")
@js.native
abstract class SceneModeControl ()
  extends typingsSlinky.winrtUwp.Windows.Media.Devices.SceneModeControl {
  /** Gets the scene modes supported on the capture device. */
  /* CompleteClass */
  override var supportedModes: IVectorView[typingsSlinky.winrtUwp.Windows.Media.Devices.CaptureSceneMode] = js.native
  /** Gets the current scene mod ethe capture device is set to. */
  /* CompleteClass */
  override var value: typingsSlinky.winrtUwp.Windows.Media.Devices.CaptureSceneMode = js.native
  /**
    * Asynchronously sets the color temperature Value .
    * @param sceneMode The scene mode to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setValueAsync(sceneMode: typingsSlinky.winrtUwp.Windows.Media.Devices.CaptureSceneMode): IPromiseWithIAsyncAction = js.native
}

