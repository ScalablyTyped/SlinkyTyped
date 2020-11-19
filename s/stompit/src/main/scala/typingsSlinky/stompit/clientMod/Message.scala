package typingsSlinky.stompit.clientMod

import typingsSlinky.stompit.incomingFrameStreamMod.IncomingFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends IncomingFrame {
  
  def ack(): Unit = js.native
  
  def nack(): Unit = js.native
}
