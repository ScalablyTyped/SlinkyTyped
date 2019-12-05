package typingsSlinky.sugarDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjs {
  import typingsSlinky.std.ArrayConstructor
  import typingsSlinky.std.BooleanConstructor
  import typingsSlinky.std.DateConstructor
  import typingsSlinky.std.ErrorConstructor
  import typingsSlinky.std.FunctionConstructor
  import typingsSlinky.std.NumberConstructor
  import typingsSlinky.std.ObjectConstructor
  import typingsSlinky.std.RegExpConstructor
  import typingsSlinky.std.StringConstructor
  import typingsSlinky.sugarDashCore.sugarjs.Array.Chainable

  type NativeConstructor = ArrayConstructor | DateConstructor | FunctionConstructor | NumberConstructor | ObjectConstructor | RegExpConstructor | StringConstructor | BooleanConstructor | ErrorConstructor
  type SugarDefaultChainable[RawValue] = (Chainable[_, RawValue]) with typingsSlinky.sugarDashCore.sugarjs.Date.Chainable[RawValue] with typingsSlinky.sugarDashCore.sugarjs.Function.Chainable[RawValue] with typingsSlinky.sugarDashCore.sugarjs.Number.Chainable[RawValue] with typingsSlinky.sugarDashCore.sugarjs.Object.Chainable[RawValue] with typingsSlinky.sugarDashCore.sugarjs.RegExp.Chainable[RawValue] with typingsSlinky.sugarDashCore.sugarjs.String.Chainable[RawValue]
}
