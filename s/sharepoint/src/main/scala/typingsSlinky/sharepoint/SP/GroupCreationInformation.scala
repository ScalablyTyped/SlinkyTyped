package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupCreationInformation extends ClientValueObject {
  def get_description(): String = js.native
  def get_title(): String = js.native
  def set_description(value: String): Unit = js.native
  def set_title(value: String): Unit = js.native
}

object GroupCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_description: () => String,
    get_title: () => String,
    get_typeId: () => String,
    set_description: String => Unit,
    set_title: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): GroupCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_description = js.Any.fromFunction0(get_description), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), set_description = js.Any.fromFunction1(set_description), set_title = js.Any.fromFunction1(set_title), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[GroupCreationInformation]
  }
  @scala.inline
  implicit class GroupCreationInformationOps[Self <: GroupCreationInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_description(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_description")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_title(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_title")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_description(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_description")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_title(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_title")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

