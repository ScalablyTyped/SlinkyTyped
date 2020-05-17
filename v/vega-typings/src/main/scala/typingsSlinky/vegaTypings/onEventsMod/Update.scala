package typingsSlinky.vegaTypings.onEventsMod

import typingsSlinky.vegaTypings.anon.ValueSignalValue
import typingsSlinky.vegaTypings.exprMod.Expr
import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.exprMod.Expr
  - typingsSlinky.vegaTypings.exprMod.ExprRef
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.anon.ValueSignalValue
*/
trait Update extends js.Object

object Update {
  @scala.inline
  implicit def apply(value: Expr): Update = value.asInstanceOf[Update]
  @scala.inline
  implicit def apply(value: ExprRef): Update = value.asInstanceOf[Update]
  @scala.inline
  implicit def apply(value: SignalRef): Update = value.asInstanceOf[Update]
  @scala.inline
  implicit def apply(value: ValueSignalValue): Update = value.asInstanceOf[Update]
}

