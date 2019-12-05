package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelationshipDeleteBehaviorType extends js.Object

@JSGlobal("SP.RelationshipDeleteBehaviorType")
@js.native
object RelationshipDeleteBehaviorType extends js.Object {
  @js.native
  sealed trait cascade extends RelationshipDeleteBehaviorType
  
  @js.native
  sealed trait none extends RelationshipDeleteBehaviorType
  
  @js.native
  sealed trait restrict extends RelationshipDeleteBehaviorType
  
  /* 1 */ val cascade: typingsSlinky.sharepoint.SP.RelationshipDeleteBehaviorType.cascade with Double = js.native
  /* 0 */ val none: typingsSlinky.sharepoint.SP.RelationshipDeleteBehaviorType.none with Double = js.native
  /* 2 */ val restrict: typingsSlinky.sharepoint.SP.RelationshipDeleteBehaviorType.restrict with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelationshipDeleteBehaviorType with Double] = js.native
}

