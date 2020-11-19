package typingsSlinky.winrtUwp.global.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.anon.CredentialsHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Authorization or Proxy-Authorization HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpCredentialsHeaderValue")
@js.native
class HttpCredentialsHeaderValue protected ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue {
  /**
    * Initializes a new instance of the HttpCredentialsHeaderValue class with the scheme to use for authentication.
    * @param scheme The scheme to use for authentication.
    */
  def this(scheme: String) = this()
  /**
    * Initializes a new instance of the HttpCredentialsHeaderValue class with the scheme and user token information to use for authentication.
    * @param scheme The scheme to use for authentication.
    * @param token The user token information to use for authentication.
    */
  def this(scheme: String, token: String) = this()
}
/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpCredentialsHeaderValue")
@js.native
object HttpCredentialsHeaderValue extends js.Object {
  
  /**
    * Converts a string to an HttpCredentialsHeaderValue instance.
    * @param input A string that represents the credential information in the Authorization or Proxy-Authorization HTTP header.
    * @return An HttpCredentialsHeaderValue instance.
    */
  def parse(input: String): typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpCredentialsHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpCredentialsHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): CredentialsHeaderValue = js.native
}
