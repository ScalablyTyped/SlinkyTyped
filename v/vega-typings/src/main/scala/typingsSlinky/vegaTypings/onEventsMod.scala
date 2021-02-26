package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.anon.Encode
import typingsSlinky.vegaTypings.exprMod.Expr
import typingsSlinky.vegaTypings.selectorMod.EventSelector
import typingsSlinky.vegaTypings.signalMod.SignalValue
import typingsSlinky.vegaTypings.streamMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onEventsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.anon.ScaleString
    - typingsSlinky.vegaTypings.streamMod.Stream
  */
  type EventListener = _EventListener | EventStream
  
  type Events = EventSelector | EventListener
  
  type OnEvent = (Encode | typingsSlinky.vegaTypings.anon.Update) with typingsSlinky.vegaTypings.anon.Events
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.exprMod.Expr
    - typingsSlinky.vegaTypings.exprMod.ExprRef
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.anon.ValueSignalValue
  */
  type Update = _Update | Expr
  
  trait _EventListener extends StObject
  
  trait _Update extends StObject
  object _Update {
    
    @scala.inline
    def ExprRef(expr: Expr): typingsSlinky.vegaTypings.exprMod.ExprRef = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.exprMod.ExprRef]
    }
    
    @scala.inline
    def SignalRef(signal: String): typingsSlinky.vegaTypings.signalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.signalMod.SignalRef]
    }
    
    @scala.inline
    def ValueSignalValue(value: SignalValue): typingsSlinky.vegaTypings.anon.ValueSignalValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.ValueSignalValue]
    }
  }
}
