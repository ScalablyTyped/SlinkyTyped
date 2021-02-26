package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperatorACDStatuses extends StObject
@JSImport("voximplant-websdk", "OperatorACDStatuses")
@js.native
object OperatorACDStatuses extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperatorACDStatuses with Double] = js.native
  
  @js.native
  sealed trait AfterService extends OperatorACDStatuses
  /* 0 */ val AfterService: typingsSlinky.voximplantWebsdk.mod.OperatorACDStatuses.AfterService with Double = js.native
  
  @js.native
  sealed trait DND extends OperatorACDStatuses
  /* 1 */ val DND: typingsSlinky.voximplantWebsdk.mod.OperatorACDStatuses.DND with Double = js.native
  
  @js.native
  sealed trait InService extends OperatorACDStatuses
  /* 2 */ val InService: typingsSlinky.voximplantWebsdk.mod.OperatorACDStatuses.InService with Double = js.native
  
  @js.native
  sealed trait Offline extends OperatorACDStatuses
  /* 3 */ val Offline: typingsSlinky.voximplantWebsdk.mod.OperatorACDStatuses.Offline with Double = js.native
  
  @js.native
  sealed trait Online extends OperatorACDStatuses
  /* 4 */ val Online: typingsSlinky.voximplantWebsdk.mod.OperatorACDStatuses.Online with Double = js.native
  
  @js.native
  sealed trait Ready extends OperatorACDStatuses
  /* 5 */ val Ready: typingsSlinky.voximplantWebsdk.mod.OperatorACDStatuses.Ready with Double = js.native
  
  @js.native
  sealed trait Timeout extends OperatorACDStatuses
  /* 6 */ val Timeout: typingsSlinky.voximplantWebsdk.mod.OperatorACDStatuses.Timeout with Double = js.native
}
