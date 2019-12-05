package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorReadType extends js.Object

@JSGlobal("SP.JsGrid.EditActorReadType")
@js.native
object EditActorReadType extends js.Object {
   // 1,
  @js.native
  sealed trait Both extends EditActorReadType
  
  @js.native
  sealed trait DataOnly extends EditActorReadType
  
   // 2,
  @js.native
  sealed trait LocalizedOnly extends EditActorReadType
  
  /* 0 */ val Both: typingsSlinky.sharepoint.SP.JsGrid.EditActorReadType.Both with Double = js.native
  /* 2 */ val DataOnly: typingsSlinky.sharepoint.SP.JsGrid.EditActorReadType.DataOnly with Double = js.native
  /* 1 */ val LocalizedOnly: typingsSlinky.sharepoint.SP.JsGrid.EditActorReadType.LocalizedOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditActorReadType with Double] = js.native
}

