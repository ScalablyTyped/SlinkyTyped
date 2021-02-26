package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.channeldefMod.ConditionalPredicate
import typingsSlinky.vegaLite.channeldefMod.ValueDef
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition[V /* <: (typingsSlinky.vegaLite.channeldefMod.Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */] extends StObject {
  
  var condition: (ConditionalPredicate[ValueDef[V] | ES]) | (js.Array[ConditionalPredicate[ValueDef[V] | ES]]) = js.native
}
object Condition {
  
  @scala.inline
  def apply[V /* <: (typingsSlinky.vegaLite.channeldefMod.Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */](
    condition: (ConditionalPredicate[ValueDef[V] | ES]) | (js.Array[ConditionalPredicate[ValueDef[V] | ES]])
  ): Condition[V, ES] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition[V, ES]]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition[_, _], V /* <: (typingsSlinky.vegaLite.channeldefMod.Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */] (val x: Self with (Condition[V, ES])) extends AnyVal {
    
    @scala.inline
    def setCondition(
      value: (ConditionalPredicate[ValueDef[V] | ES]) | (js.Array[ConditionalPredicate[ValueDef[V] | ES]])
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionVarargs(value: (ConditionalPredicate[ValueDef[V] | ES])*): Self = StObject.set(x, "condition", js.Array(value :_*))
  }
}
