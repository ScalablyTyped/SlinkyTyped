package typingsSlinky.sharepoint.global.SP.UserProfiles

import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns information about a request to follow an item. */
@JSGlobal("SP.UserProfiles.FollowResult")
@js.native
class FollowResult ()
  extends typingsSlinky.sharepoint.SP.UserProfiles.FollowResult {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Contains the item being followed. */
  /* CompleteClass */
  override def get_item(): typingsSlinky.sharepoint.SP.UserProfiles.FollowedItem = js.native
  /** Provides information about the attempt to follow an item. */
  /* CompleteClass */
  override def get_resultType(): typingsSlinky.sharepoint.SP.UserProfiles.FollowResultType = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

