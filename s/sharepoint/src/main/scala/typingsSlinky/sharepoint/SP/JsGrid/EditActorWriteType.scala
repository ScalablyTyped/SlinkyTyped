package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorWriteType extends js.Object

@JSGlobal("SP.JsGrid.EditActorWriteType")
@js.native
object EditActorWriteType extends js.Object {
   // 1,
  @js.native
  sealed trait Both extends EditActorWriteType
  
   // 3,
  @js.native
  sealed trait DataOnly extends EditActorWriteType
  
  @js.native
  sealed trait Either extends EditActorWriteType
  
   // 2,
  @js.native
  sealed trait LocalizedOnly extends EditActorWriteType
  
  /* 0 */ val Both: typingsSlinky.sharepoint.SP.JsGrid.EditActorWriteType.Both with Double = js.native
  /* 2 */ val DataOnly: typingsSlinky.sharepoint.SP.JsGrid.EditActorWriteType.DataOnly with Double = js.native
  /* 3 */ val Either: typingsSlinky.sharepoint.SP.JsGrid.EditActorWriteType.Either with Double = js.native
  /* 1 */ val LocalizedOnly: typingsSlinky.sharepoint.SP.JsGrid.EditActorWriteType.LocalizedOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditActorWriteType with Double] = js.native
}

