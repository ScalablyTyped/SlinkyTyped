package typingsSlinky.winrtUwp.global.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an image stream. */
@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
/** Creates a new instance of the ImageEncodingProperties class. */
class ImageEncodingProperties ()
  extends typingsSlinky.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties

/* static members */
@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
object ImageEncodingProperties extends js.Object {
  /**
    * Creates an instance of ImageEncodingProperties for a BMP image.
    * @return The image encoding properties.
    */
  def createBmp(): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
  /**
    * Creates an instance of ImageEncodingProperties for a JPEG image.
    * @return The properties for the image stream.
    */
  def createJpeg(): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
  /**
    * Creates an instance of ImageEncodingProperties for a JPEG XR image.
    * @return The properties for the image stream.
    */
  def createJpegXR(): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
  /**
    * Creates an instance of ImageEncodingProperties for a PNG image.
    * @return The properties for the image stream.
    */
  def createPng(): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
  /**
    * Creates an instance of ImageEncodingProperties for an uncompressed image.
    * @param format The media pixel format.
    * @return The image encoding properties.
    */
  def createUncompressed(format: typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaPixelFormat): typingsSlinky.winrtUwp.Windows.Media.MediaProperties.ImageEncodingProperties = js.native
}

