package typingsSlinky.stompit.socketMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends EventEmitter {
  def createApplicationError(): SocketError = js.native
  def createApplicationError(message: String): SocketError = js.native
  def createApplicationError(message: Error): SocketError = js.native
  def createProtocolError(): SocketError = js.native
  def createProtocolError(message: String): SocketError = js.native
  def createProtocolError(message: Error): SocketError = js.native
  def createTransportError(): SocketError = js.native
  def createTransportError(message: String): SocketError = js.native
  def createTransportError(message: Error): SocketError = js.native
  def destroy(exception: js.Error): Unit = js.native
  def getHeartbeat(): Heartbeat = js.native
  def getTransportSocket(): Duplex = js.native
  def hasFinishedOutput(): Boolean = js.native
  def sendFrame(command: String): Writable = js.native
  def sendFrame(command: String, headers: js.Any): Writable = js.native
  def sendFrame(command: String, headers: js.Any, streamOptions: WritableOptions): Writable = js.native
  def setCommandHandler(command: String, handler: commandHandler): Unit = js.native
  def setCommandHandlers(handlers: CommandHandlers): Unit = js.native
  def setHeartbeat(heartbeat: Heartbeat): Unit = js.native
  def setUnknownCommandHandler(handler: js.Function0[Unit]): Unit = js.native
  def setVersion(version: String): Unit = js.native
}

