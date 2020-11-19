package typingsSlinky.systemService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("system-service", "SystemService")
@js.native
class SystemService () extends js.Object {
  def this(config: ServiceConfiguration) = this()
  def this(config: js.UndefOr[scala.Nothing], messageConsumer: MessageConsumer) = this()
  def this(config: ServiceConfiguration, messageConsumer: MessageConsumer) = this()
  
  var config: ServiceConfiguration = js.native
  
  var logger: typingsSlinky.systemLogger.mod.Logger = js.native
  
  var messageConsumer: MessageConsumer = js.native
  
  def processMessage(message: js.Any): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
  
  def validateMessage(message: js.Any): Unit = js.native
}
