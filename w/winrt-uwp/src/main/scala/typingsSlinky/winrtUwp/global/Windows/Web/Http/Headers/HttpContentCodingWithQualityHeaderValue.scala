package typingsSlinky.winrtUwp.global.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.anon.ContentCodingWithQualityHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents accept encoding information used in the Accept-Encoding HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue")
@js.native
class HttpContentCodingWithQualityHeaderValue protected ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue {
  /**
    * Initializes a new instance of the HttpContentCodingHeaderValue class with content-coding information.
    * @param contentCoding The value of the content-coding to use.
    */
  def this(contentCoding: String) = this()
  /**
    * Initializes a new instance of the HttpContentCodingHeaderValue class with content-coding information and a qvalue.
    * @param contentCoding The value of the content-coding information to use.
    * @param quality The value of the qvalue to use.
    */
  def this(contentCoding: String, quality: Double) = this()
}
object HttpContentCodingWithQualityHeaderValue {
  
  /**
    * Converts a string to an HttpContentCodingWithQualityHeaderValue instance.
    * @param input A string that represents the content coding information in the Accept-Encoding HTTP header.
    * @return An HttpContentCodingWithQualityHeaderValue instance.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue.parse")
  @js.native
  def parse(input: String): typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpContentCodingWithQualityHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  @JSGlobal("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue.tryParse")
  @js.native
  def tryParse(input: String): ContentCodingWithQualityHeaderValue = js.native
}
