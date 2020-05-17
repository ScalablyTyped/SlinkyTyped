package typingsSlinky.sharepoint.SP.Publishing

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageRendition extends ClientValueObject {
  def get_height(): Double = js.native
  def get_id(): Double = js.native
  def get_name(): String = js.native
  def get_version(): Double = js.native
  def get_width(): Double = js.native
  def set_height(value: Double): Double = js.native
  def set_name(value: String): String = js.native
  def set_width(value: Double): Double = js.native
}

object ImageRendition {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_height: () => Double,
    get_id: () => Double,
    get_name: () => String,
    get_typeId: () => String,
    get_version: () => Double,
    get_width: () => Double,
    set_height: Double => Double,
    set_name: String => String,
    set_width: Double => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ImageRendition = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_height = js.Any.fromFunction0(get_height), get_id = js.Any.fromFunction0(get_id), get_name = js.Any.fromFunction0(get_name), get_typeId = js.Any.fromFunction0(get_typeId), get_version = js.Any.fromFunction0(get_version), get_width = js.Any.fromFunction0(get_width), set_height = js.Any.fromFunction1(set_height), set_name = js.Any.fromFunction1(set_name), set_width = js.Any.fromFunction1(set_width), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ImageRendition]
  }
  @scala.inline
  implicit class ImageRenditionOps[Self <: ImageRendition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_height(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_height")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_id(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_id")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_name(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_version(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_version")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_width(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_width")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_height(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_height")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_name(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_width(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_width")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

