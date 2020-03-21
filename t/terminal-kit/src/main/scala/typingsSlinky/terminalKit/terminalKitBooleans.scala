package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.screenBufferHDMod.IsBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object terminalKitBooleans {
  @js.native
  sealed trait `false` extends IsBlending
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

