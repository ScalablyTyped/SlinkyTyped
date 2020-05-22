package typingsSlinky.sharepoint.global.SP

import typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthStatusType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.SiteHealth")
@js.native
object SiteHealth extends js.Object {
  @js.native
  class SiteHealthResult ()
    extends typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthResult {
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
    override def get_messageAsText(): String = js.native
    /* CompleteClass */
    override def get_ruleHelpLink(): String = js.native
    /* CompleteClass */
    override def get_ruleId(): typingsSlinky.sharepoint.SP.Guid = js.native
    /* CompleteClass */
    override def get_ruleIsRepairable(): Boolean = js.native
    /* CompleteClass */
    override def get_ruleName(): String = js.native
    /* CompleteClass */
    override def get_status(): SiteHealthStatusType = js.native
    /* CompleteClass */
    override def get_timeStamp(): js.Date = js.native
    /* CompleteClass */
    override def get_typeId(): String = js.native
    /* CompleteClass */
    override def set_status(value: SiteHealthStatusType): Unit = js.native
    /* CompleteClass */
    override def set_timeStamp(value: js.Date): Unit = js.native
    /* CompleteClass */
    override def writeToXml(
      writer: typingsSlinky.sharepoint.SP.XmlWriter,
      serializationContext: typingsSlinky.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @js.native
  class SiteHealthSummary ()
    extends typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthSummary
  
  @js.native
  object SiteHealthStatusType extends js.Object {
    /* 2 */ val failedError: typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedError with Double = js.native
    /* 1 */ val failedWarning: typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedWarning with Double = js.native
    /* 0 */ val passed: typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthStatusType.passed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthStatusType with Double] = js.native
  }
  
}

