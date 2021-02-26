package typingsSlinky.winrtUwp.global.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.anon.MediaTypeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Type HTTP header on the HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue")
@js.native
class HttpMediaTypeHeaderValue protected ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue {
  /**
    * Initializes a new instance of the HttpMediaTypeHeaderValue class.
    * @param mediaType The media-type of the entity-body used in the Content-Type HTTP header.
    */
  def this(mediaType: String) = this()
}
object HttpMediaTypeHeaderValue {
  
  /**
    * Converts a string to an HttpMediaTypeHeaderValue instance.
    * @param input A string that represents the media-type and character set information used in the Content-Type HTTP header.
    * @return An HttpMediaTypeHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue.parse")
  @js.native
  def parse(input: String): typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpMediaTypeHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): MediaTypeHeaderValue = js.native
}
