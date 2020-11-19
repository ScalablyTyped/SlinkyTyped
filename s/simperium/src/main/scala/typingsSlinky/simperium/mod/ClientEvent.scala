package typingsSlinky.simperium.mod

import typingsSlinky.simperium.simperiumNumbers.`0`
import typingsSlinky.simperium.simperiumNumbers.`1`
import typingsSlinky.simperium.simperiumNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientEvent extends SimperiumEvent {
  
  def `access-token`(token: String): Unit = js.native
  
  def close(): Unit = js.native
  
  def connect(): Unit = js.native
  
  def disconnect(): Unit = js.native
  
  def error(error: js.Error): Unit = js.native
  
  def message(message: String): Unit = js.native
  
  @JSName("message:h")
  def messageColonh(count: Double): Unit = js.native
  
  @JSName("message:log")
  def messageColonlog_0(logLevel: `0`): Unit = js.native
  @JSName("message:log")
  def messageColonlog_1(logLevel: `1`): Unit = js.native
  @JSName("message:log")
  def messageColonlog_2(logLevel: `2`): Unit = js.native
  
  def reconnect(attempt: Double): Unit = js.native
  
  def send(msg: String): Unit = js.native
  
  def unauthorized(details: FailedAuthDetails): Unit = js.native
}
