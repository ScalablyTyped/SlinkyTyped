package typingsSlinky.sipml.SIPml

import typingsSlinky.sipml.SIPml.Session.Configuration
import typingsSlinky.sipml.SIPml.Session.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session_
  extends EventTarget[EventSubscriptionType, typingsSlinky.sipml.SIPml.Session.Event] {
  
  def accept(): Double = js.native
  def accept(configuration: Configuration): Double = js.native
  
  def getId(): Double = js.native
  
  def getRemoteFriendlyName(): String = js.native
  
  def getRemoteUri(): String = js.native
  
  def reject(): Double = js.native
  def reject(configuration: Configuration): Double = js.native
  
  def setConfiguration(): Unit = js.native
  def setConfiguration(configuration: Configuration): Unit = js.native
}
