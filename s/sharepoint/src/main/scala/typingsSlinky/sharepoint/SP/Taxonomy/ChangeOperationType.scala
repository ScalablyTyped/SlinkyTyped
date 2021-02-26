package typingsSlinky.sharepoint.SP.Taxonomy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeOperationType extends StObject
@JSGlobal("SP.Taxonomy.ChangeOperationType")
@js.native
object ChangeOperationType extends StObject {
  
  @js.native
  sealed trait add extends ChangeOperationType
  
  @js.native
  sealed trait copy extends ChangeOperationType
  
  @js.native
  sealed trait deleteObject extends ChangeOperationType
  
  @js.native
  sealed trait edit extends ChangeOperationType
  
  @js.native
  sealed trait importObject extends ChangeOperationType
  
  @js.native
  sealed trait merge extends ChangeOperationType
  
  @js.native
  sealed trait move extends ChangeOperationType
  
  @js.native
  sealed trait pathChange extends ChangeOperationType
  
  @js.native
  sealed trait restore extends ChangeOperationType
  
  @js.native
  sealed trait unknown extends ChangeOperationType
}
