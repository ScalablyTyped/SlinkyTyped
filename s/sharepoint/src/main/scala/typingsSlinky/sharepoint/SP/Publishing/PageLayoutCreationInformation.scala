package typingsSlinky.sharepoint.SP.Publishing

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.Web
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageLayoutCreationInformation extends ClientValueObject {
  def get_associatedContentTypeId(): String = js.native
  def get_masterPageUrl(): String = js.native
  def get_newPageLayoutEditablePath(): String = js.native
  def get_newPageLayoutNameWithoutExtension(): String = js.native
  def get_web(): Web = js.native
  def set_associatedContentTypeId(value: String): String = js.native
  def set_masterPageUrl(value: String): String = js.native
  def set_newPageLayoutEditablePath(value: String): String = js.native
  def set_newPageLayoutNameWithoutExtension(value: String): String = js.native
  def set_web(value: Web): Web = js.native
}

object PageLayoutCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_associatedContentTypeId: () => String,
    get_masterPageUrl: () => String,
    get_newPageLayoutEditablePath: () => String,
    get_newPageLayoutNameWithoutExtension: () => String,
    get_typeId: () => String,
    get_web: () => Web,
    set_associatedContentTypeId: String => String,
    set_masterPageUrl: String => String,
    set_newPageLayoutEditablePath: String => String,
    set_newPageLayoutNameWithoutExtension: String => String,
    set_web: Web => Web,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): PageLayoutCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_associatedContentTypeId = js.Any.fromFunction0(get_associatedContentTypeId), get_masterPageUrl = js.Any.fromFunction0(get_masterPageUrl), get_newPageLayoutEditablePath = js.Any.fromFunction0(get_newPageLayoutEditablePath), get_newPageLayoutNameWithoutExtension = js.Any.fromFunction0(get_newPageLayoutNameWithoutExtension), get_typeId = js.Any.fromFunction0(get_typeId), get_web = js.Any.fromFunction0(get_web), set_associatedContentTypeId = js.Any.fromFunction1(set_associatedContentTypeId), set_masterPageUrl = js.Any.fromFunction1(set_masterPageUrl), set_newPageLayoutEditablePath = js.Any.fromFunction1(set_newPageLayoutEditablePath), set_newPageLayoutNameWithoutExtension = js.Any.fromFunction1(set_newPageLayoutNameWithoutExtension), set_web = js.Any.fromFunction1(set_web), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[PageLayoutCreationInformation]
  }
  @scala.inline
  implicit class PageLayoutCreationInformationOps[Self <: PageLayoutCreationInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_associatedContentTypeId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_associatedContentTypeId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_masterPageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_masterPageUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_newPageLayoutEditablePath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_newPageLayoutEditablePath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_newPageLayoutNameWithoutExtension(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_newPageLayoutNameWithoutExtension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_web(value: () => Web): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_web")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_associatedContentTypeId(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_associatedContentTypeId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_masterPageUrl(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_masterPageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_newPageLayoutEditablePath(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_newPageLayoutEditablePath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_newPageLayoutNameWithoutExtension(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_newPageLayoutNameWithoutExtension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_web(value: Web => Web): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_web")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

