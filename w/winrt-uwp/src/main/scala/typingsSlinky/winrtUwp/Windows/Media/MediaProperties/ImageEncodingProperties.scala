package typingsSlinky.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an image stream. */
@js.native
trait ImageEncodingProperties extends js.Object {
  /** Gets or sets the image height. */
  var height: Double = js.native
  /** Gets additional format properties for the image stream. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets the subtype of the format. */
  var subtype: String = js.native
  /** Gets the format type. */
  var `type`: String = js.native
  /** Gets or sets the image width. */
  var width: Double = js.native
}

object ImageEncodingProperties {
  @scala.inline
  def apply(height: Double, properties: MediaPropertySet, subtype: String, `type`: String, width: Double): ImageEncodingProperties = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageEncodingProperties]
  }
  @scala.inline
  implicit class ImageEncodingPropertiesOps[Self <: ImageEncodingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: MediaPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

