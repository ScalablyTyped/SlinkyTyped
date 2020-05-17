package typingsSlinky.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object terminalMod {
  type CTerminal = typingsSlinky.terminalKit.terminalMod.Terminal with (js.Function1[/* repeated */ js.Any, typingsSlinky.terminalKit.terminalMod.Terminal])
  type Callback[T] = js.Function2[/* err */ js.Any, /* arg */ T, scala.Unit]
  type Chainable[T] = T with typingsSlinky.terminalKit.terminalMod.ChainableInterface[T]
  type Palette = js.Array[typingsSlinky.terminalKit.anon.G]
  type Terminal = typingsSlinky.terminalKit.terminalMod.Impl with typingsSlinky.nextgenEvents.mod.^ 
}
