package typingsSlinky.writableConsumableStream.consumerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consumer[T]
  extends typingsSlinky.consumableStream.mod.Consumer[T] {
  
  var currentNode: Node[T] = js.native
  
  def getBackpressure(): Double = js.native
  
  def getStats(): ConsumerStats = js.native
  
  var id: Double = js.native
  
  def kill(): Unit = js.native
  def kill(value: js.Any): Unit = js.native
  
  def releaseBackpressure(packet: js.Any): Unit = js.native
  
  def resetBackpressure(): Unit = js.native
  
  var stream: typingsSlinky.writableConsumableStream.mod.^[T] = js.native
  
  var timeout: Double = js.native
  
  def write(packet: js.Any): Unit = js.native
}
