package typingsSlinky.sharepoint.SP

import typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthResult
import typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthStatusType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.SiteHealth")
@js.native
object SiteHealth extends js.Object {
  @js.native
  class SiteHealthResult () extends ClientValueObject {
    def get_messageAsText(): String = js.native
    def get_ruleHelpLink(): String = js.native
    def get_ruleId(): Guid = js.native
    def get_ruleIsRepairable(): Boolean = js.native
    def get_ruleName(): String = js.native
    def get_status(): SiteHealthStatusType = js.native
    def get_timeStamp(): js.Date = js.native
    def set_status(value: SiteHealthStatusType): Unit = js.native
    def set_timeStamp(value: js.Date): Unit = js.native
  }
  
  @js.native
  sealed trait SiteHealthStatusType extends js.Object
  
  @js.native
  class SiteHealthSummary () extends ClientObject {
    def get_failedErrorCount(): Double = js.native
    def get_failedWarningCount(): Double = js.native
    def get_passedCount(): Double = js.native
    def get_results(): js.Array[SiteHealthResult] = js.native
  }
  
  @js.native
  object SiteHealthStatusType extends js.Object {
    @js.native
    sealed trait failedError extends SiteHealthStatusType
    
    @js.native
    sealed trait failedWarning extends SiteHealthStatusType
    
    @js.native
    sealed trait passed extends SiteHealthStatusType
    
    /* 2 */ val failedError: typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedError with Double = js.native
    /* 1 */ val failedWarning: typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedWarning with Double = js.native
    /* 0 */ val passed: typingsSlinky.sharepoint.SP.SiteHealth.SiteHealthStatusType.passed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SiteHealthStatusType with Double] = js.native
  }
  
}

