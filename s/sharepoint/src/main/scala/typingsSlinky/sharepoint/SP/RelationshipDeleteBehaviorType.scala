package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RelationshipDeleteBehaviorType extends StObject
@JSGlobal("SP.RelationshipDeleteBehaviorType")
@js.native
object RelationshipDeleteBehaviorType extends StObject {
  
  @js.native
  sealed trait cascade extends RelationshipDeleteBehaviorType
  
  @js.native
  sealed trait none extends RelationshipDeleteBehaviorType
  
  @js.native
  sealed trait restrict extends RelationshipDeleteBehaviorType
}
