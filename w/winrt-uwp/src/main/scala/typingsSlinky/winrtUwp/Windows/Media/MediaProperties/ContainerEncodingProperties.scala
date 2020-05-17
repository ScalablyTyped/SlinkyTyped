package typingsSlinky.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a media container format. */
@js.native
trait ContainerEncodingProperties extends js.Object {
  /** Gets additional format properties for the media container. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets the subtype of the media container. */
  var subtype: String = js.native
  /** Gets the format type. */
  var `type`: String = js.native
}

object ContainerEncodingProperties {
  @scala.inline
  def apply(properties: MediaPropertySet, subtype: String, `type`: String): ContainerEncodingProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerEncodingProperties]
  }
  @scala.inline
  implicit class ContainerEncodingPropertiesOps[Self <: ContainerEncodingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

