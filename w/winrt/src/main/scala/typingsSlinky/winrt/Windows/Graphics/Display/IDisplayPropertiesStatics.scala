package typingsSlinky.winrt.Windows.Graphics.Display

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisplayPropertiesStatics extends js.Object {
  var autoRotationPreferences: DisplayOrientations = js.native
  var currentOrientation: DisplayOrientations = js.native
  var logicalDpi: Double = js.native
  var nativeOrientation: DisplayOrientations = js.native
  var oncolorprofilechanged: js.Any = js.native
  var ondisplaycontentsinvalidated: js.Any = js.native
  var onlogicaldpichanged: js.Any = js.native
  var onorientationchanged: js.Any = js.native
  var onstereoenabledchanged: js.Any = js.native
  var resolutionScale: ResolutionScale = js.native
  var stereoEnabled: Boolean = js.native
  def getColorProfileAsync(): IAsyncOperation[IRandomAccessStream] = js.native
}

object IDisplayPropertiesStatics {
  @scala.inline
  def apply(
    autoRotationPreferences: DisplayOrientations,
    currentOrientation: DisplayOrientations,
    getColorProfileAsync: () => IAsyncOperation[IRandomAccessStream],
    logicalDpi: Double,
    nativeOrientation: DisplayOrientations,
    oncolorprofilechanged: js.Any,
    ondisplaycontentsinvalidated: js.Any,
    onlogicaldpichanged: js.Any,
    onorientationchanged: js.Any,
    onstereoenabledchanged: js.Any,
    resolutionScale: ResolutionScale,
    stereoEnabled: Boolean
  ): IDisplayPropertiesStatics = {
    val __obj = js.Dynamic.literal(autoRotationPreferences = autoRotationPreferences.asInstanceOf[js.Any], currentOrientation = currentOrientation.asInstanceOf[js.Any], getColorProfileAsync = js.Any.fromFunction0(getColorProfileAsync), logicalDpi = logicalDpi.asInstanceOf[js.Any], nativeOrientation = nativeOrientation.asInstanceOf[js.Any], oncolorprofilechanged = oncolorprofilechanged.asInstanceOf[js.Any], ondisplaycontentsinvalidated = ondisplaycontentsinvalidated.asInstanceOf[js.Any], onlogicaldpichanged = onlogicaldpichanged.asInstanceOf[js.Any], onorientationchanged = onorientationchanged.asInstanceOf[js.Any], onstereoenabledchanged = onstereoenabledchanged.asInstanceOf[js.Any], resolutionScale = resolutionScale.asInstanceOf[js.Any], stereoEnabled = stereoEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayPropertiesStatics]
  }
  @scala.inline
  implicit class IDisplayPropertiesStaticsOps[Self <: IDisplayPropertiesStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRotationPreferences(value: DisplayOrientations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRotationPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentOrientation(value: DisplayOrientations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColorProfileAsync(value: () => IAsyncOperation[IRandomAccessStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorProfileAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogicalDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalDpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeOrientation(value: DisplayOrientations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncolorprofilechanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncolorprofilechanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndisplaycontentsinvalidated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondisplaycontentsinvalidated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlogicaldpichanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlogicaldpichanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnorientationchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onorientationchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnstereoenabledchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onstereoenabledchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutionScale(value: ResolutionScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStereoEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stereoEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

