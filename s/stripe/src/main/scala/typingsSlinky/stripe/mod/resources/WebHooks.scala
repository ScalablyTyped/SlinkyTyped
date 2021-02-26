package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.events.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.WebHooks")
@js.native
class WebHooks () extends StObject {
  
  def constructEvent(requestBody: js.Any, signature: String, endpointSecret: String): IEvent = js.native
  def constructEvent(requestBody: js.Any, signature: String, endpointSecret: String, tolerance: Double): IEvent = js.native
  def constructEvent(requestBody: js.Any, signature: js.Array[String], endpointSecret: String): IEvent = js.native
  def constructEvent(requestBody: js.Any, signature: js.Array[String], endpointSecret: String, tolerance: Double): IEvent = js.native
  
  /**
    * Generates a header to be used for webhook mocking
    */
  def generateTestHeaderString(options: IWebHookGenerateTestHeaderStringOptions): String = js.native
}
