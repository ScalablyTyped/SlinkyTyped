package typingsSlinky.stompjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends Frame {
  
  def ack(): js.Any = js.native
  def ack(headers: js.Object): js.Any = js.native
  
  def nack(): js.Any = js.native
  def nack(headers: js.Object): js.Any = js.native
}
