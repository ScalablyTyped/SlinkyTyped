package typingsSlinky.winrtUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the auto-configured scan source of the scanner. */
@js.native
trait ImageScannerAutoConfiguration extends js.Object {
  /** The default file format for the scan source at the beginning of a new scan session. */
  var defaultFormat: ImageScannerFormat = js.native
  /** Gets or sets the current file transfer format for image data acquisition from the device to the client app. */
  var format: ImageScannerFormat = js.native
  /**
    * Determines if the input scanner supports the specified file format.
    * @param value The file type.
    * @return True if the specified file type is supported; otherwise False.
    */
  def isFormatSupported(value: ImageScannerFormat): Boolean = js.native
}

object ImageScannerAutoConfiguration {
  @scala.inline
  def apply(
    defaultFormat: ImageScannerFormat,
    format: ImageScannerFormat,
    isFormatSupported: ImageScannerFormat => Boolean
  ): ImageScannerAutoConfiguration = {
    val __obj = js.Dynamic.literal(defaultFormat = defaultFormat.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isFormatSupported = js.Any.fromFunction1(isFormatSupported))
    __obj.asInstanceOf[ImageScannerAutoConfiguration]
  }
  @scala.inline
  implicit class ImageScannerAutoConfigurationOps[Self <: ImageScannerAutoConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultFormat(value: ImageScannerFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ImageScannerFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFormatSupported(value: ImageScannerFormat => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFormatSupported")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

