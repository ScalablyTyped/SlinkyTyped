package typingsSlinky.winrtUwp.global.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.anon.DateOrDeltaHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Retry-After HTTP header on an HTTP response. */
@JSGlobal("Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue")
@js.native
abstract class HttpDateOrDeltaHeaderValue ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue
/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue")
@js.native
object HttpDateOrDeltaHeaderValue extends js.Object {
  
  /**
    * Converts a string to an HttpDateOrDeltaHeaderValue instance.
    * @param input A string that represents the HTTP-date or delta-seconds information in the Retry-After HTTP header.
    * @return An HttpDateOrDeltaHeaderValue instance.
    */
  def parse(input: String): typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpDateOrDeltaHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): DateOrDeltaHeaderValue = js.native
}
