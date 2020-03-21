package typingsSlinky.terminalKit.mod

import typingsSlinky.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "getDetectedTerminal")
@js.native
object getDetectedTerminal extends js.Object {
  def apply(calback: js.Function2[/* error */ js.Any, /* term */ Terminal, Unit]): Unit = js.native
}

