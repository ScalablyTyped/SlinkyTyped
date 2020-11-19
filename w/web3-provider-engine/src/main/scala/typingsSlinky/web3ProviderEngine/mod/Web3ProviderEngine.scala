package typingsSlinky.web3ProviderEngine.mod

import typingsSlinky.ethereumProtocol.mod.JSONRPCRequestPayload
import typingsSlinky.ethereumProtocol.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Web3ProviderEngine extends Provider {
  
  def addProvider(provider: js.Any): Unit = js.native
  
  def on(event: String, handler: js.Function0[Unit]): Unit = js.native
  
  def send(payload: JSONRPCRequestPayload): Unit = js.native
  
  // start block polling
  def start(): Unit = js.native
  def start(callback: js.Function0[Unit]): Unit = js.native
  
  // stop block polling
  def stop(): Unit = js.native
}
