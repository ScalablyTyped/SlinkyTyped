package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientValueObject extends js.Object {
  def customFromJson(obj: js.Any): Boolean = js.native
  def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  def fromJson(obj: js.Any): Unit = js.native
  def get_typeId(): String = js.native
  def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

object ClientValueObject {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ClientValueObject = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ClientValueObject]
  }
  @scala.inline
  implicit class ClientValueObjectOps[Self <: ClientValueObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomFromJson(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFromJson")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomWriteToXml(value: (XmlWriter, SerializationContext) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customWriteToXml")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFromJson(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJson")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_typeId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_typeId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWriteToXml(value: (XmlWriter, SerializationContext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToXml")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

