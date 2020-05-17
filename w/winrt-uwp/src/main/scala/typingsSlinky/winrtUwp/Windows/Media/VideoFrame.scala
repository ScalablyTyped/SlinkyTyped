package typingsSlinky.winrtUwp.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single frame of video data. */
@js.native
trait VideoFrame extends js.Object {
  /** Gets the IDirect3DSurface object containing the pixel data of the video frame, when one is present. */
  var direct3DSurface: IDirect3DSurface = js.native
  /** Gets or sets the duration of the video frame. */
  var duration: Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: IPropertySet = js.native
  /** Gets or sets a value that indicates whether an video frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean = js.native
  /** Gets a value indicating whether the video frame is read-only. */
  var isReadOnly: Boolean = js.native
  /** Gets or sets the relative time of the frame within the video stream. */
  var relativeTime: Double = js.native
  /** Gets the SoftwareBitmap object containing the pixel data of the video frame, when one is present. */
  var softwareBitmap: SoftwareBitmap = js.native
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double = js.native
  /** Gets a string indicating the type of video data the video frame contains. */
  var `type`: String = js.native
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
  /**
    * Copies the current VideoFrame into a provided VideoFrame object.
    * @param frame The target video frame into which the current frame will be copied.
    * @return An asynchronous action.
    */
  def copyToAsync(frame: VideoFrame): IPromiseWithIAsyncAction = js.native
}

object VideoFrame {
  @scala.inline
  def apply(
    close: () => Unit,
    copyToAsync: VideoFrame => IPromiseWithIAsyncAction,
    direct3DSurface: IDirect3DSurface,
    duration: Double,
    extendedProperties: IPropertySet,
    isDiscontinuous: Boolean,
    isReadOnly: Boolean,
    relativeTime: Double,
    softwareBitmap: SoftwareBitmap,
    systemRelativeTime: Double,
    `type`: String
  ): VideoFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), copyToAsync = js.Any.fromFunction1(copyToAsync), direct3DSurface = direct3DSurface.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], isDiscontinuous = isDiscontinuous.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any], softwareBitmap = softwareBitmap.asInstanceOf[js.Any], systemRelativeTime = systemRelativeTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFrame]
  }
  @scala.inline
  implicit class VideoFrameOps[Self <: VideoFrame] (val x: Self) extends AnyVal {
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
    def withCopyToAsync(value: VideoFrame => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyToAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDirect3DSurface(value: IDirect3DSurface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct3DSurface")(value.asInstanceOf[js.Any])
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
    def withSoftwareBitmap(value: SoftwareBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareBitmap")(value.asInstanceOf[js.Any])
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

