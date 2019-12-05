package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpgradeType extends js.Object

@JSGlobal("SP.UpgradeType")
@js.native
object UpgradeType extends js.Object {
  @js.native
  sealed trait buildUpgrade extends UpgradeType
  
  @js.native
  sealed trait versionUpgrade extends UpgradeType
  
  /* 0 */ val buildUpgrade: typingsSlinky.sharepoint.SP.UpgradeType.buildUpgrade with Double = js.native
  /* 1 */ val versionUpgrade: typingsSlinky.sharepoint.SP.UpgradeType.versionUpgrade with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UpgradeType with Double] = js.native
}

