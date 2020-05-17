package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemFormUpdateValue extends ClientValueObject {
  def get_errorMessage(): String = js.native
  def get_fieldName(): String = js.native
  def get_fieldValue(): String = js.native
  def get_hasException(): Boolean = js.native
  def set_errorMessage(value: String): Unit = js.native
  def set_fieldName(value: String): Unit = js.native
  def set_fieldValue(value: String): Unit = js.native
  def set_hasException(value: Boolean): Unit = js.native
}

object ListItemFormUpdateValue {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_errorMessage: () => String,
    get_fieldName: () => String,
    get_fieldValue: () => String,
    get_hasException: () => Boolean,
    get_typeId: () => String,
    set_errorMessage: String => Unit,
    set_fieldName: String => Unit,
    set_fieldValue: String => Unit,
    set_hasException: Boolean => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListItemFormUpdateValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_fieldName = js.Any.fromFunction0(get_fieldName), get_fieldValue = js.Any.fromFunction0(get_fieldValue), get_hasException = js.Any.fromFunction0(get_hasException), get_typeId = js.Any.fromFunction0(get_typeId), set_errorMessage = js.Any.fromFunction1(set_errorMessage), set_fieldName = js.Any.fromFunction1(set_fieldName), set_fieldValue = js.Any.fromFunction1(set_fieldValue), set_hasException = js.Any.fromFunction1(set_hasException), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListItemFormUpdateValue]
  }
  @scala.inline
  implicit class ListItemFormUpdateValueOps[Self <: ListItemFormUpdateValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_errorMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errorMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_fieldName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_fieldName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_fieldValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_fieldValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_hasException(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_hasException")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_errorMessage(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_errorMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_fieldName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_fieldName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_fieldValue(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_fieldValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_hasException(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_hasException")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

