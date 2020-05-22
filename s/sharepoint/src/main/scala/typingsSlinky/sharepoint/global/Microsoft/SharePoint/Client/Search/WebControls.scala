package typingsSlinky.sharepoint.global.Microsoft.SharePoint.Client.Search

import typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.WebControls")
@js.native
object WebControls extends js.Object {
  @js.native
  class ControlMessage ()
    extends typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage {
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    /* CompleteClass */
    override def get_code(): Double = js.native
    /* CompleteClass */
    override def get_correlationID(): String = js.native
    /* CompleteClass */
    override def get_encodeDetails(): Boolean = js.native
    /* CompleteClass */
    override def get_header(): String = js.native
    /* CompleteClass */
    override def get_level(): MessageLevel = js.native
    /* CompleteClass */
    override def get_messageDetails(): String = js.native
    /* CompleteClass */
    override def get_messageDetailsForViewers(): String = js.native
    /* CompleteClass */
    override def get_serverTypeId(): String = js.native
    /* CompleteClass */
    override def get_showForViewerUsers(): Boolean = js.native
    /* CompleteClass */
    override def get_showInEditModeOnly(): Boolean = js.native
    /* CompleteClass */
    override def get_stackTrace(): String = js.native
    /* CompleteClass */
    override def get_type(): String = js.native
    /* CompleteClass */
    override def get_typeId(): String = js.native
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @js.native
  object MessageLevel extends js.Object {
    /* 2 */ val error: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.error with Double = js.native
    /* 0 */ val information: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.information with Double = js.native
    /* 1 */ val warning: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel with Double
      ] = js.native
  }
  
}

