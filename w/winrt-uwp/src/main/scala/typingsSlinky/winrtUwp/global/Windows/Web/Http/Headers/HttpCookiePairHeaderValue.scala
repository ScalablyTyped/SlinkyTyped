package typingsSlinky.winrtUwp.global.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.anon.CookiePairHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCookiePairHeaderValue")
@js.native
class HttpCookiePairHeaderValue protected ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue {
  /**
    * Initializes a new instance of the HttpCookiePairHeaderValue class. with a cookie name.
    * @param name A token that represents the cookie name.
    */
  def this(name: String) = this()
  /**
    * Initializes a new instance of the HttpCookiePairHeaderValue class. with a cookie name and a value for the cookie.
    * @param name A token that represents the cookie name.
    * @param value A value for the cookie.
    */
  def this(name: String, value: String) = this()
}
/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpCookiePairHeaderValue")
@js.native
object HttpCookiePairHeaderValue extends js.Object {
  
  /**
    * Converts a string to an HttpCookiePairHeaderValue instance.
    * @param input A string that represents the cookie name and value in the Cookie HTTP header.
    * @return An HttpCookiePairHeaderValue instance.
    */
  def parse(input: String): typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpCookiePairHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): CookiePairHeaderValue = js.native
}
