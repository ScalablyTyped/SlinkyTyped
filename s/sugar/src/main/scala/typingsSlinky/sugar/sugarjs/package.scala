package typingsSlinky.sugar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjs {
  type SugarDefaultChainable[RawValue] = (typingsSlinky.sugar.sugarjs.Array.Chainable[_, RawValue]) with typingsSlinky.sugar.sugarjs.Date.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.Function.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.Number.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.Object.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.RegExp.Chainable[RawValue] with typingsSlinky.sugar.sugarjs.String.Chainable[RawValue]
}
