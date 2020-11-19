package typingsSlinky.signalr.SignalR

import typingsSlinky.signalr.signalrNumbers.`0`
import typingsSlinky.signalr.signalrNumbers.`1`
import typingsSlinky.signalr.signalrNumbers.`2`
import typingsSlinky.signalr.signalrNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.signalr.signalrNumbers.`0`
  - typingsSlinky.signalr.signalrNumbers.`1`
  - typingsSlinky.signalr.signalrNumbers.`2`
  - typingsSlinky.signalr.signalrNumbers.`4`
*/
trait ConnectionState extends js.Object
object ConnectionState {
  
  @scala.inline
  def Connected: `1` = 1.asInstanceOf[`1`]
  
  @scala.inline
  def Connecting: `0` = 0.asInstanceOf[`0`]
  
  @scala.inline
  def Disconnected: `4` = 4.asInstanceOf[`4`]
  
  @scala.inline
  def Reconnecting: `2` = 2.asInstanceOf[`2`]
}
