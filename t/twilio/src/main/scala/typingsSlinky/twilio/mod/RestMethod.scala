package typingsSlinky.twilio.mod

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestMethod extends js.Object {
  
  def apply(args: js.Any): Promise[_] = js.native
  def apply(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def apply(callback: RequestCallback): Promise[_] = js.native
}
