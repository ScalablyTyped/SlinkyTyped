package typingsSlinky.sharepoint.SP.Publishing

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.Folder
import typingsSlinky.sharepoint.SP.ListItem
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishingPageInformation extends ClientValueObject {
  def get_folder(): Folder = js.native
  def get_name(): String = js.native
  def get_pageLayoutListItem(): ListItem[_] = js.native
  def set_folder(value: Folder): Folder = js.native
  def set_name(value: String): String = js.native
  def set_pageLayoutListItem(value: ListItem[_]): ListItem[_] = js.native
}

object PublishingPageInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_folder: () => Folder,
    get_name: () => String,
    get_pageLayoutListItem: () => ListItem[_],
    get_typeId: () => String,
    set_folder: Folder => Folder,
    set_name: String => String,
    set_pageLayoutListItem: ListItem[_] => ListItem[_],
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): PublishingPageInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_folder = js.Any.fromFunction0(get_folder), get_name = js.Any.fromFunction0(get_name), get_pageLayoutListItem = js.Any.fromFunction0(get_pageLayoutListItem), get_typeId = js.Any.fromFunction0(get_typeId), set_folder = js.Any.fromFunction1(set_folder), set_name = js.Any.fromFunction1(set_name), set_pageLayoutListItem = js.Any.fromFunction1(set_pageLayoutListItem), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[PublishingPageInformation]
  }
  @scala.inline
  implicit class PublishingPageInformationOps[Self <: PublishingPageInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_folder(value: () => Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_folder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_name(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_pageLayoutListItem(value: () => ListItem[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_pageLayoutListItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_folder(value: Folder => Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_folder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_name(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_pageLayoutListItem(value: ListItem[_] => ListItem[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_pageLayoutListItem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

