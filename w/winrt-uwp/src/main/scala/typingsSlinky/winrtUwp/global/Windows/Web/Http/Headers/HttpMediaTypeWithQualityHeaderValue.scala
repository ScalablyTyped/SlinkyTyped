package typingsSlinky.winrtUwp.global.Windows.Web.Http.Headers

import typingsSlinky.winrtUwp.anon.MediaTypeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents accept information used in the Accept HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue")
@js.native
class HttpMediaTypeWithQualityHeaderValue protected ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue {
  /**
    * Initializes a new instance of the HttpMediaTypeHeaderValue class with a media type.
    * @param mediaType The media-type of the entity-body to accept that is used in the Accept HTTP header.
    */
  def this(mediaType: String) = this()
  /**
    * Initializes a new instance of the HttpMediaTypeHeaderValue class with a media type and quality.
    * @param mediaType The media-type of the entity-body to accept that is used in the Accept HTTP header.
    * @param quality The qvalue or quality.
    */
  def this(mediaType: String, quality: Double) = this()
}
/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue")
@js.native
object HttpMediaTypeWithQualityHeaderValue extends js.Object {
  
  /**
    * Converts a string to an HttpMediaTypeWithQualityHeaderValue instance.
    * @param input A string that represents the media-type, character set, and quality information used in the Accept HTTP header.
    * @return An HttpMediaTypeWithQualityHeaderValue instance.
    */
  def parse(input: String): typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue = js.native
  
  /**
    * Determines whether a string is valid HttpMediaTypeWithQualityHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): MediaTypeWithQualityHeaderValue = js.native
}
