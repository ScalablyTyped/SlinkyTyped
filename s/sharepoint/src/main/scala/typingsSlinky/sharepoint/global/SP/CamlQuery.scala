package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a Collaborative Application Markup Language (CAML) query on a list. */
@JSGlobal("SP.CamlQuery")
@js.native
class CamlQuery ()
  extends typingsSlinky.sharepoint.SP.CamlQuery {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Returns true if the query returns dates in Coordinated Universal Time (UTC) format. */
  /* CompleteClass */
  override def get_datesInUtc(): Boolean = js.native
  /** Server relative URL of a list folder from which results will be returned. */
  /* CompleteClass */
  override def get_folderServerRelativeUrl(): String = js.native
  /* CompleteClass */
  override def get_listItemCollectionPosition(): typingsSlinky.sharepoint.SP.ListItemCollectionPosition = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /** Gets value that specifies the XML schema that defines the list view. */
  /* CompleteClass */
  override def get_viewXml(): String = js.native
  /** Sets a value that indicates whether the query returns dates in Coordinated Universal Time (UTC) format. */
  /* CompleteClass */
  override def set_datesInUtc(value: Boolean): Unit = js.native
  /** Sets a value that specifies the server relative URL of a list folder from which results will be returned. */
  /* CompleteClass */
  override def set_folderServerRelativeUrl(value: String): Unit = js.native
  /** Sets a value that specifies the information required to get the next page of data for the list view. */
  /* CompleteClass */
  override def set_listItemCollectionPosition(value: typingsSlinky.sharepoint.SP.ListItemCollectionPosition): Unit = js.native
  /** Sets value that specifies the XML schema that defines the list view. It must be null, empty, or an XML fragment that conforms to the ViewDefinition type.  */
  /* CompleteClass */
  override def set_viewXml(value: String): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

/* static members */
@JSGlobal("SP.CamlQuery")
@js.native
object CamlQuery extends js.Object {
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the folders in a list, including
    the subfolders. */
  def createAllFoldersQuery(): typingsSlinky.sharepoint.SP.CamlQuery = js.native
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the items in a list, including
    the items in the subfolders. */
  def createAllItemsQuery(): typingsSlinky.sharepoint.SP.CamlQuery = js.native
}

