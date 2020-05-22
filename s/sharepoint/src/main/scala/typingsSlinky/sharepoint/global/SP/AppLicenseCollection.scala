package typingsSlinky.sharepoint.global.SP

import typingsSlinky.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppLicenseCollection")
@js.native
class AppLicenseCollection ()
  extends typingsSlinky.sharepoint.SP.AppLicenseCollection {
  /* CompleteClass */
  override def add(item: typingsSlinky.sharepoint.SP.AppLicense): Unit = js.native
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
  override def getEnumerator(): IEnumerator[typingsSlinky.sharepoint.SP.AppLicense] = js.native
  /* CompleteClass */
  override def get_count(): Double = js.native
  /* CompleteClass */
  override def get_item(index: Double): typingsSlinky.sharepoint.SP.AppLicense = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typingsSlinky.sharepoint.SP.XmlWriter,
    serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

