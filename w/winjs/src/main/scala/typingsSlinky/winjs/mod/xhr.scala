package typingsSlinky.winjs.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.winjs.WinJS.IXHROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("winjs", "xhr")
@js.native
object xhr extends js.Object {
  
  /**
    * Wraps calls to XMLHttpRequest in a promise.
    * @param options The options that are applied to the XMLHttpRequest object, as follows: type, url, user, password, responseType, headers, data, customRequestInitializer.
    * @returns A promise that returns the XMLHttpRequest object when it completes.
    **/
  def apply(options: IXHROptions): typingsSlinky.winjs.WinJS.Promise[XMLHttpRequest] = js.native
}
