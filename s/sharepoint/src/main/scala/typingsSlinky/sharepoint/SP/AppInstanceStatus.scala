package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppInstanceStatus extends js.Object

@JSGlobal("SP.AppInstanceStatus")
@js.native
object AppInstanceStatus extends js.Object {
  @js.native
  sealed trait canceling extends AppInstanceStatus
  
  @js.native
  sealed trait disabled extends AppInstanceStatus
  
  @js.native
  sealed trait disabling extends AppInstanceStatus
  
  @js.native
  sealed trait initialized extends AppInstanceStatus
  
  @js.native
  sealed trait installed extends AppInstanceStatus
  
  @js.native
  sealed trait installing extends AppInstanceStatus
  
  @js.native
  sealed trait invalidStatus extends AppInstanceStatus
  
  @js.native
  sealed trait uninstalling extends AppInstanceStatus
  
  @js.native
  sealed trait upgradeCanceling extends AppInstanceStatus
  
  @js.native
  sealed trait upgrading extends AppInstanceStatus
  
  /* 2 */ val canceling: typingsSlinky.sharepoint.SP.AppInstanceStatus.canceling with Double = js.native
  /* 9 */ val disabled: typingsSlinky.sharepoint.SP.AppInstanceStatus.disabled with Double = js.native
  /* 8 */ val disabling: typingsSlinky.sharepoint.SP.AppInstanceStatus.disabling with Double = js.native
  /* 6 */ val initialized: typingsSlinky.sharepoint.SP.AppInstanceStatus.initialized with Double = js.native
  /* 4 */ val installed: typingsSlinky.sharepoint.SP.AppInstanceStatus.installed with Double = js.native
  /* 1 */ val installing: typingsSlinky.sharepoint.SP.AppInstanceStatus.installing with Double = js.native
  /* 0 */ val invalidStatus: typingsSlinky.sharepoint.SP.AppInstanceStatus.invalidStatus with Double = js.native
  /* 3 */ val uninstalling: typingsSlinky.sharepoint.SP.AppInstanceStatus.uninstalling with Double = js.native
  /* 7 */ val upgradeCanceling: typingsSlinky.sharepoint.SP.AppInstanceStatus.upgradeCanceling with Double = js.native
  /* 5 */ val upgrading: typingsSlinky.sharepoint.SP.AppInstanceStatus.upgrading with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstanceStatus with Double] = js.native
}

