package typingsSlinky.tapable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TapFunction[T /* <: typingsSlinky.tapable.mod.TapType */, TArg1, TArg2, TArg3, TResult] = js.Function4[
    /* arg1 */ TArg1, 
    /* arg2 */ TArg2, 
    /* arg3 */ TArg3, 
    /* repeated */ js.Any, 
    js.Promise[TResult] | TResult | scala.Unit
  ]
  type TapOptions[TTapType /* <: typingsSlinky.tapable.mod.TapType */, TArg1, TArg2, TArg3, THookResult] = typingsSlinky.tapable.anon.Before with ((typingsSlinky.tapable.anon.`0`[TTapType, TArg1, TArg2, TArg3, THookResult]) | (typingsSlinky.tapable.anon.FnType[TArg1, TArg2, TArg3, THookResult]) | (typingsSlinky.tapable.anon.Type[TArg1, TArg2, TArg3, THookResult]) | (typingsSlinky.tapable.anon.Fn[TArg1, TArg2, TArg3, THookResult]))
  type Tapable = typingsSlinky.tapable.mod.Tapable_
}
