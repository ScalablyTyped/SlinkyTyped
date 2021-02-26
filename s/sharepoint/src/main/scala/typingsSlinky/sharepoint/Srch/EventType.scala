package typingsSlinky.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
@JSGlobal("Srch.EventType")
@js.native
object EventType extends StObject {
  
  @js.native
  sealed trait batchQueryIssuing extends EventType
  
  @js.native
  sealed trait batchResultReady extends EventType
  
  @js.native
  sealed trait load extends EventType
  
  @js.native
  sealed trait none extends EventType
  
  @js.native
  sealed trait postLoad extends EventType
  
  @js.native
  sealed trait preLoad extends EventType
  
  @js.native
  sealed trait queryIssuing extends EventType
  
  @js.native
  sealed trait queryReady extends EventType
  
  @js.native
  sealed trait queryStateChanged extends EventType
  
  @js.native
  sealed trait resultReady extends EventType
  
  @js.native
  sealed trait resultRendered extends EventType
}
