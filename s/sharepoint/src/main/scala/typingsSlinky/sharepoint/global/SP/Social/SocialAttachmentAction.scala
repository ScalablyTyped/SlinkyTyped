package typingsSlinky.sharepoint.global.SP.Social

import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the user actions that are allowed for the attachment object. */
@JSGlobal("SP.Social.SocialAttachmentAction")
@js.native
class SocialAttachmentAction ()
  extends typingsSlinky.sharepoint.SP.Social.SocialAttachmentAction {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
  /* CompleteClass */
  override def get_actionKind(): typingsSlinky.sharepoint.SP.Social.SocialAttachmentActionKind = js.native
  /** Specifies the URI associated with the action. */
  /* CompleteClass */
  override def get_actionUri(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
  /* CompleteClass */
  override def set_actionKind(value: typingsSlinky.sharepoint.SP.Social.SocialAttachmentActionKind): typingsSlinky.sharepoint.SP.Social.SocialAttachmentActionKind = js.native
  /** Specifies the URI associated with the action. */
  /* CompleteClass */
  override def set_actionUri(value: String): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

