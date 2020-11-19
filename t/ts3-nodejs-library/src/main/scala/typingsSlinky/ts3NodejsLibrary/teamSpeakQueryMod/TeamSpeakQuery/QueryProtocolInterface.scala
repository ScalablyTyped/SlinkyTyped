package typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryProtocolInterface extends EventEmitter {
  
  val chunk: String = js.native
  
  /** forcefully closes the socket */
  def close(): Unit = js.native
  
  /**
    * sends the data in the first argument, appends a newline
    * @param {string} str the data which should be sent
    */
  def send(data: String): Unit = js.native
  
  /** sends a keepalive to the TeamSpeak Server */
  def sendKeepAlive(): Unit = js.native
}
