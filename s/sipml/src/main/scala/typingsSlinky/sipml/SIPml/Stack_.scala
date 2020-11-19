package typingsSlinky.sipml.SIPml

import typingsSlinky.sipml.SIPml.Session.Configuration
import typingsSlinky.sipml.SIPml.Stack.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stack_
  extends EventTarget[EventSubscriptionType, typingsSlinky.sipml.SIPml.Stack.Event] {
  
  def newSession(`type`: String): js.Any = js.native
  def newSession(`type`: String, configuration: Configuration): js.Any = js.native
  
  def setConfiguration(configuration: typingsSlinky.sipml.SIPml.Stack.Configuration): Double = js.native
  
  def start(): Double = js.native
  
  def stop(): Double = js.native
  def stop(timeout: Double): Double = js.native
}
