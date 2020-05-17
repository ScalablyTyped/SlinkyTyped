package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the scene mode settings on a capture device. */
@js.native
trait SceneModeControl extends js.Object {
  /** Gets the scene modes supported on the capture device. */
  var supportedModes: IVectorView[CaptureSceneMode] = js.native
  /** Gets the current scene mod ethe capture device is set to. */
  var value: CaptureSceneMode = js.native
  /**
    * Asynchronously sets the color temperature Value .
    * @param sceneMode The scene mode to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(sceneMode: CaptureSceneMode): IPromiseWithIAsyncAction = js.native
}

object SceneModeControl {
  @scala.inline
  def apply(
    setValueAsync: CaptureSceneMode => IPromiseWithIAsyncAction,
    supportedModes: IVectorView[CaptureSceneMode],
    value: CaptureSceneMode
  ): SceneModeControl = {
    val __obj = js.Dynamic.literal(setValueAsync = js.Any.fromFunction1(setValueAsync), supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneModeControl]
  }
  @scala.inline
  implicit class SceneModeControlOps[Self <: SceneModeControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetValueAsync(value: CaptureSceneMode => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSupportedModes(value: IVectorView[CaptureSceneMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: CaptureSceneMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

