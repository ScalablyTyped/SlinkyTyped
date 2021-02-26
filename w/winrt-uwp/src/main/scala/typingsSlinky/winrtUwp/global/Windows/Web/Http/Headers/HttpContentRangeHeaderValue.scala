package typingsSlinky.winrtUwp.global.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.anon.ContentRangeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Range HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentRangeHeaderValue")
@js.native
class HttpContentRangeHeaderValue protected ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue {
  /**
    * Initializes a new instance of the HttpContentRangeHeaderValue class with a content length.
    * @param length The length, in bytes, of the full content entity body.
    */
  def this(length: Double) = this()
  /**
    * Initializes a new instance of the HttpContentRangeHeaderValue class with a start and stop position.
    * @param from The position, in bytes, at which to start sending data.
    * @param to The position, in bytes, at which to stop sending data.
    */
  def this(from: Double, to: Double) = this()
  /**
    * Initializes a new instance of the HttpContentRangeHeaderValue class with a start and stop position and a content length.
    * @param from The position, in bytes, at which to start sending data.
    * @param to The position, in bytes, at which to stop sending data.
    * @param length The length, in bytes, of the full content entity body.
    */
  def this(from: Double, to: Double, length: Double) = this()
}
object HttpContentRangeHeaderValue {
  
  /**
    * Converts a string to an HttpContentRangeHeaderValue instance.
    * @param input A string that represents the content range information in the Content-Range HTTP header.
    * @return An HttpContentRangeHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpContentRangeHeaderValue.parse")
  @js.native
  def parse(input: String): typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentRangeHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpContentRangeHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpContentRangeHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): ContentRangeHeaderValue = js.native
}
