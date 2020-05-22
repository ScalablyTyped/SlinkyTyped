package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BasePermissions")
@js.native
class BasePermissions ()
  extends typingsSlinky.sharepoint.SP.BasePermissions {
  /* CompleteClass */
  override def clear(perm: typingsSlinky.sharepoint.SP.PermissionKind): Unit = js.native
  /* CompleteClass */
  override def clearAll(): Unit = js.native
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  /* CompleteClass */
  override def equals(perm: typingsSlinky.sharepoint.SP.BasePermissions): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def has(perm: typingsSlinky.sharepoint.SP.PermissionKind): Boolean = js.native
  /* CompleteClass */
  override def hasPermissions(high: Double, low: Double): Boolean = js.native
  /* CompleteClass */
  override def set(perm: typingsSlinky.sharepoint.SP.PermissionKind): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

