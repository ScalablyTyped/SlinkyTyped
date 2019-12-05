package typingsSlinky.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("Srch.EventType")
@js.native
object EventType extends js.Object {
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
  
  /* 3 */ val batchQueryIssuing: typingsSlinky.sharepoint.Srch.EventType.batchQueryIssuing with Double = js.native
  /* 5 */ val batchResultReady: typingsSlinky.sharepoint.Srch.EventType.batchResultReady with Double = js.native
  /* 9 */ val load: typingsSlinky.sharepoint.Srch.EventType.load with Double = js.native
  /* 0 */ val none: typingsSlinky.sharepoint.Srch.EventType.none with Double = js.native
  /* 10 */ val postLoad: typingsSlinky.sharepoint.Srch.EventType.postLoad with Double = js.native
  /* 8 */ val preLoad: typingsSlinky.sharepoint.Srch.EventType.preLoad with Double = js.native
  /* 2 */ val queryIssuing: typingsSlinky.sharepoint.Srch.EventType.queryIssuing with Double = js.native
  /* 1 */ val queryReady: typingsSlinky.sharepoint.Srch.EventType.queryReady with Double = js.native
  /* 6 */ val queryStateChanged: typingsSlinky.sharepoint.Srch.EventType.queryStateChanged with Double = js.native
  /* 4 */ val resultReady: typingsSlinky.sharepoint.Srch.EventType.resultReady with Double = js.native
  /* 7 */ val resultRendered: typingsSlinky.sharepoint.Srch.EventType.resultRendered with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

