package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLookupValue extends ClientValueObject {
  def get_lookupId(): Double = js.native
  def get_lookupValue(): String = js.native
  def set_lookupId(value: Double): Unit = js.native
}

object FieldLookupValue {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_lookupId: () => Double,
    get_lookupValue: () => String,
    get_typeId: () => String,
    set_lookupId: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldLookupValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_lookupId = js.Any.fromFunction0(get_lookupId), get_lookupValue = js.Any.fromFunction0(get_lookupValue), get_typeId = js.Any.fromFunction0(get_typeId), set_lookupId = js.Any.fromFunction1(set_lookupId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldLookupValue]
  }
  @scala.inline
  implicit class FieldLookupValueOps[Self <: FieldLookupValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_lookupId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_lookupId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_lookupValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_lookupValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_lookupId(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_lookupId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

