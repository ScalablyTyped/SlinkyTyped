package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherStateMod {
  
  @js.native
  sealed trait PublisherState extends StObject
  @JSImport("sip.js/lib/api/publisher-state", "PublisherState")
  @js.native
  object PublisherState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PublisherState with String] = js.native
    
    @js.native
    sealed trait Initial extends PublisherState
    /* "Initial" */ val Initial: typingsSlinky.sipJs.publisherStateMod.PublisherState.Initial with String = js.native
    
    @js.native
    sealed trait Published extends PublisherState
    /* "Published" */ val Published: typingsSlinky.sipJs.publisherStateMod.PublisherState.Published with String = js.native
    
    @js.native
    sealed trait Terminated extends PublisherState
    /* "Terminated" */ val Terminated: typingsSlinky.sipJs.publisherStateMod.PublisherState.Terminated with String = js.native
    
    @js.native
    sealed trait Unpublished extends PublisherState
    /* "Unpublished" */ val Unpublished: typingsSlinky.sipJs.publisherStateMod.PublisherState.Unpublished with String = js.native
  }
}
