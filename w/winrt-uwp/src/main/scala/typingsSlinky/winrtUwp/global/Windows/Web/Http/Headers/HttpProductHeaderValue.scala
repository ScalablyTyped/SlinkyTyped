package typingsSlinky.winrtUwp.global.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.anon.ProductHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents product information used by the HttpProductHeaderValue and HttpProductInfoHeaderValueCollection classes in the User-Agent HTTP header. */
@JSGlobal("Windows.Web.Http.Headers.HttpProductHeaderValue")
@js.native
class HttpProductHeaderValue protected ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpProductHeaderValue {
  /**
    * Initializes a new instance of the HttpProductHeaderValue class with a product name.
    * @param productName The name of the product token used in the User-Agent HTTP header.
    */
  def this(productName: String) = this()
  /**
    * Initializes a new instance of the HttpProductHeaderValue class with a product name and a product version.
    * @param productName The name of the product token used in the User-Agent HTTP header.
    * @param productVersion The version of the product token used in the User-Agent HTTP header.
    */
  def this(productName: String, productVersion: String) = this()
}
/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpProductHeaderValue")
@js.native
object HttpProductHeaderValue extends js.Object {
  
  /**
    * Converts a string to an HttpProductHeaderValue instance.
    * @param input A string that represents the product name and version.
    * @return An HttpProductHeaderValue instance.
    */
  def parse(input: String): typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpProductHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpProductHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): ProductHeaderValue = js.native
}
