package typingsSlinky.sugarCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjs {
  type SugarDefaultChainable[RawValue] = (typingsSlinky.sugarCore.sugarjs.Array.Chainable[_, RawValue]) with typingsSlinky.sugarCore.sugarjs.Date.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.Function.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.Number.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.Object.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.RegExp.Chainable[RawValue] with typingsSlinky.sugarCore.sugarjs.String.Chainable[RawValue]
}
