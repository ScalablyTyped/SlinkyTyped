package typingsSlinky.xstate

import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.xstate.anon.Initial
import typingsSlinky.xstate.anon.TypeTEventType
import typingsSlinky.xstate.typesMod.AtomicStateNodeConfig
import typingsSlinky.xstate.typesMod.Event
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.StateSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternsMod {
  
  @JSImport("xstate/lib/patterns", "sequence")
  @js.native
  def sequence_states[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    items: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ]
  ): Initial[TStateSchema, TEvent] = js.native
  @JSImport("xstate/lib/patterns", "sequence")
  @js.native
  def sequence_states[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    items: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ],
    options: Partial[SequencePatternOptions[TEvent]]
  ): Initial[TStateSchema, TEvent] = js.native
  
  @JSImport("xstate/lib/patterns", "toggle")
  @js.native
  def toggle[TEventType /* <: String */](onState: String, offState: String, eventType: TEventType): Record[String, AtomicStateNodeConfig[_, TypeTEventType[TEventType]]] = js.native
  
  @js.native
  trait SequencePatternOptions[TEvent /* <: EventObject */] extends StObject {
    
    var nextEvent: js.UndefOr[Event[TEvent]] = js.native
    
    var prevEvent: js.UndefOr[Event[TEvent]] = js.native
  }
  object SequencePatternOptions {
    
    @scala.inline
    def apply[TEvent /* <: EventObject */](): SequencePatternOptions[TEvent] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequencePatternOptions[TEvent]]
    }
    
    @scala.inline
    implicit class SequencePatternOptionsMutableBuilder[Self <: SequencePatternOptions[_], TEvent /* <: EventObject */] (val x: Self with SequencePatternOptions[TEvent]) extends AnyVal {
      
      @scala.inline
      def setNextEvent(value: Event[TEvent]): Self = StObject.set(x, "nextEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextEventUndefined: Self = StObject.set(x, "nextEvent", js.undefined)
      
      @scala.inline
      def setPrevEvent(value: Event[TEvent]): Self = StObject.set(x, "prevEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevEventUndefined: Self = StObject.set(x, "prevEvent", js.undefined)
    }
  }
}
