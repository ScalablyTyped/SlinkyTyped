package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Media.FaceAnalysis.DetectedFace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video frame that includes a list of faces detected by the FaceDetectionEffect . */
@js.native
trait FaceDetectionEffectFrame extends js.Object {
  /** Gets the list of objects representing the faces detected in the frame. */
  var detectedFaces: IVectorView[DetectedFace] = js.native
  /** Gets or sets the duration of the face detection effect frame. */
  var duration: Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: IPropertySet = js.native
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

object FaceDetectionEffectFrame {
  @scala.inline
  def apply(
    close: () => Unit,
    detectedFaces: IVectorView[DetectedFace],
    duration: Double,
    extendedProperties: IPropertySet,
    isDiscontinuous: Boolean,
    isReadOnly: Boolean,
    relativeTime: Double,
    systemRelativeTime: Double,
    `type`: String
  ): FaceDetectionEffectFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detectedFaces = detectedFaces.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], isDiscontinuous = isDiscontinuous.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any], systemRelativeTime = systemRelativeTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetectionEffectFrame]
  }
  @scala.inline
  implicit class FaceDetectionEffectFrameOps[Self <: FaceDetectionEffectFrame] (val x: Self) extends AnyVal {
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
    def withDetectedFaces(value: IVectorView[DetectedFace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectedFaces")(value.asInstanceOf[js.Any])
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

