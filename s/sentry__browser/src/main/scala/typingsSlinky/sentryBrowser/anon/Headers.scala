package typingsSlinky.sentryBrowser.anon

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.sentryTypes.requestMod.SentryRequestType
import typingsSlinky.sentryTypes.responseMod.Response
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headers extends js.Object {
  
  var headers: Record[String, String | Null] = js.native
  
  def reject(): Unit = js.native
  def reject(reason: js.Any): Unit = js.native
  
  var requestType: SentryRequestType = js.native
  
  def resolve(): Unit = js.native
  def resolve(value: js.Thenable[Response]): Unit = js.native
  def resolve(value: Response): Unit = js.native
  
  var response: org.scalajs.dom.experimental.Response | XMLHttpRequest = js.native
}
