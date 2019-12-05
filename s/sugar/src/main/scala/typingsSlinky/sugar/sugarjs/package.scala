package typingsSlinky.sugar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjs {
  import typingsSlinky.std.BooleanConstructor
  import typingsSlinky.std.ErrorConstructor
  import typingsSlinky.std.FunctionConstructor
  import typingsSlinky.sugar.sugarjs.Array.Chainable

  /* Rewritten from type alias, can be one of: 
    - typings.sugar.ArrayConstructor
    - typings.sugar.DateConstructor
    - typings.std.FunctionConstructor
    - typings.sugar.NumberConstructor
    - typings.sugar.ObjectConstructor
    - typings.sugar.RegExpConstructor
    - typings.sugar.StringConstructor
    - typings.std.BooleanConstructor
    - typings.std.ErrorConstructor
  */
  type NativeConstructor = _NativeConstructor | FunctionConstructor | BooleanConstructor | ErrorConstructor
  type SugarDefaultChainable[RawValue] = (Chainable[_, RawValue]) with typingsSlinky.sugar.sugarjs.Date.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.Function.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.Number.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.Object.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.RegExp.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.String.Chainable[RawValue]
}
