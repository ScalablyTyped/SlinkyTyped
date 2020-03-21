package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.exprMod.Expr
import typingsSlinky.vegaTypings.selectorMod.EventSelector
import typingsSlinky.vegaTypings.streamMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/spec/on-events", JSImport.Namespace)
@js.native
object onEventsMod extends js.Object {
  trait _EventListener extends js.Object
  
  trait _Update extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.AnonScaleString
    - typingsSlinky.vegaTypings.streamMod.Stream
  */
  type EventListener = _EventListener | EventStream
  type Events = EventSelector | EventListener
  type OnEvent = (AnonEncode | AnonUpdate) with AnonEvents
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.exprMod.Expr
    - typingsSlinky.vegaTypings.exprMod.ExprRef
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.AnonValueSignalValue
  */
  type Update = _Update | Expr
}

