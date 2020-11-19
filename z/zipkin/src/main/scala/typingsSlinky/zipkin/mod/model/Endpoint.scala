package typingsSlinky.zipkin.mod.model

import typingsSlinky.zipkin.anon.Ipv4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "model.Endpoint")
@js.native
class Endpoint protected () extends js.Object {
  def this(args: Ipv4) = this()
  
  def isEmpty(): Boolean = js.native
  
  def setIpv4(ipv4: String): Unit = js.native
  
  def setPort(port: Double): Unit = js.native
  
  def setServiceName(serviceName: String): Unit = js.native
}
