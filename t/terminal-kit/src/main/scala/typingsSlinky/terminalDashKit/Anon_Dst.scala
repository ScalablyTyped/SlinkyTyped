package typingsSlinky.terminalDashKit

import typingsSlinky.terminalDashKit.screenBufferMod.ScreenBuffer
import typingsSlinky.terminalDashKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dst extends js.Object {
  var dst: Terminal | ScreenBuffer
}

object Anon_Dst {
  @scala.inline
  def apply(dst: Terminal | ScreenBuffer): Anon_Dst = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dst]
  }
}

