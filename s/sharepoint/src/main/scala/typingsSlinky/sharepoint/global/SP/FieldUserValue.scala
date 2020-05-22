package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FieldUserValue")
@js.native
class FieldUserValue ()
  extends typingsSlinky.sharepoint.SP.FieldUserValue {
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
  override def get_lookupId(): Double = js.native
  /* CompleteClass */
  override def get_lookupValue(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_lookupId(value: Double): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

/* static members */
@JSGlobal("SP.FieldUserValue")
@js.native
object FieldUserValue extends js.Object {
  def fromUser(userName: String): typingsSlinky.sharepoint.SP.FieldUserValue = js.native
}

