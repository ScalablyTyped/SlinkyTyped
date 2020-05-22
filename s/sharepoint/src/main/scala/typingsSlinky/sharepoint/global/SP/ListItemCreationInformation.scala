package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the properties of the new list item. */
@JSGlobal("SP.ListItemCreationInformation")
@js.native
class ListItemCreationInformation ()
  extends typingsSlinky.sharepoint.SP.ListItemCreationInformation {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_folderUrl(): String = js.native
  /* CompleteClass */
  override def get_leafName(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def get_underlyingObjectType(): typingsSlinky.sharepoint.SP.FileSystemObjectType = js.native
  /** Sets a value that specifies the folder for the new list item. */
  /* CompleteClass */
  override def set_folderUrl(value: String): Unit = js.native
  /** Sets a value that specifies the name of the new list item. It must be the name of the file if the parent list of the list item is a document library. */
  /* CompleteClass */
  override def set_leafName(value: String): Unit = js.native
  /** Sets a value that specifies whether the new list item is a file or a folder. */
  /* CompleteClass */
  override def set_underlyingObjectType(value: typingsSlinky.sharepoint.SP.FileSystemObjectType): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

