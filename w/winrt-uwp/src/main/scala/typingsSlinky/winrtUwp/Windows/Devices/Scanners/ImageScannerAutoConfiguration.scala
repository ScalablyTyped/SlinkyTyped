package typingsSlinky.winrtUwp.Windows.Devices.Scanners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the auto-configured scan source of the scanner. */
@js.native
trait ImageScannerAutoConfiguration extends StObject {
  
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
  implicit class ImageScannerAutoConfigurationMutableBuilder[Self <: ImageScannerAutoConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultFormat(value: ImageScannerFormat): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ImageScannerFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFormatSupported(value: ImageScannerFormat => Boolean): Self = StObject.set(x, "isFormatSupported", js.Any.fromFunction1(value))
  }
}
