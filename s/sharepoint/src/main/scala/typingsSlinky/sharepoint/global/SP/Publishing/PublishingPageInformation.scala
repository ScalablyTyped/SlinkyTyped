package typingsSlinky.sharepoint.global.SP.Publishing

import typingsSlinky.sharepoint.SP.Folder
import typingsSlinky.sharepoint.SP.ListItem
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingPageInformation")
@js.native
class PublishingPageInformation ()
  extends typingsSlinky.sharepoint.SP.Publishing.PublishingPageInformation {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_folder(): Folder = js.native
  /* CompleteClass */
  override def get_name(): String = js.native
  /* CompleteClass */
  override def get_pageLayoutListItem(): ListItem[_] = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_folder(value: Folder): Folder = js.native
  /* CompleteClass */
  override def set_name(value: String): String = js.native
  /* CompleteClass */
  override def set_pageLayoutListItem(value: ListItem[_]): ListItem[_] = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

