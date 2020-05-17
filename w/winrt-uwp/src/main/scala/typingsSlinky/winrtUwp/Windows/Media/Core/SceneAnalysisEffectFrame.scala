package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrtUwp.Windows.Media.Capture.CapturedFrameControlValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video frame that includes the results of the scene analysis operation. */
@js.native
trait SceneAnalysisEffectFrame extends js.Object {
  /** Gets or sets the duration of the scene analysis effect frame. */
  var duration: Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: IPropertySet = js.native
  /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the frame. */
  var frameControlValues: CapturedFrameControlValues = js.native
  /** Gets a HighDynamicRangeOutput object that provides recommended FrameController objects and a value indicating the certainty of the HDR analysis. */
  var highDynamicRange: HighDynamicRangeOutput = js.native
  /** Gets or sets a value that indicates whether a video frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean = js.native
  /** Gets a value indicating whether the frame is read-only. */
  var isReadOnly: Boolean = js.native
  /** Gets or sets the relative time of the frame within the video stream. */
  var relativeTime: Double = js.native
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double = js.native
  /** Gets a string indicating the type of data the frame contains. */
  var `type`: String = js.native
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
}

object SceneAnalysisEffectFrame {
  @scala.inline
  def apply(
    close: () => Unit,
    duration: Double,
    extendedProperties: IPropertySet,
    frameControlValues: CapturedFrameControlValues,
    highDynamicRange: HighDynamicRangeOutput,
    isDiscontinuous: Boolean,
    isReadOnly: Boolean,
    relativeTime: Double,
    systemRelativeTime: Double,
    `type`: String
  ): SceneAnalysisEffectFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), duration = duration.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], frameControlValues = frameControlValues.asInstanceOf[js.Any], highDynamicRange = highDynamicRange.asInstanceOf[js.Any], isDiscontinuous = isDiscontinuous.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any], systemRelativeTime = systemRelativeTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAnalysisEffectFrame]
  }
  @scala.inline
  implicit class SceneAnalysisEffectFrameOps[Self <: SceneAnalysisEffectFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameControlValues(value: CapturedFrameControlValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameControlValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighDynamicRange(value: HighDynamicRangeOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highDynamicRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDiscontinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDiscontinuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemRelativeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemRelativeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

