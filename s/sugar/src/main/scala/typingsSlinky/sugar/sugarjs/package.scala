package typingsSlinky.sugar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sugarjs {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sugar.ArrayConstructor
    - typingsSlinky.sugar.DateConstructor
    - typingsSlinky.std.FunctionConstructor
    - typingsSlinky.sugar.NumberConstructor
    - typingsSlinky.sugar.ObjectConstructor
    - typingsSlinky.sugar.RegExpConstructor
    - typingsSlinky.sugar.StringConstructor
    - typingsSlinky.std.BooleanConstructor
    - typingsSlinky.std.ErrorConstructor
  */
  type NativeConstructor = typingsSlinky.sugar.sugarjs._NativeConstructor | typingsSlinky.std.FunctionConstructor | typingsSlinky.std.BooleanConstructor | typingsSlinky.std.ErrorConstructor
  
  type SugarDefaultChainable[RawValue] = (typingsSlinky.sugar.sugarjs.Array.Chainable[_, RawValue]) with typingsSlinky.sugar.sugarjs.Date.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.Function.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.Number.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.Object.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.RegExp.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.String.Chainable[RawValue]
}
