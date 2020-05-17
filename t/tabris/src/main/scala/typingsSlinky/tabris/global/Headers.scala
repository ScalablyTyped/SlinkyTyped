package typingsSlinky.tabris.global

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Headers
/**
  * Represents a set of HTTP headers as used by `fetch()`.
  */
@JSGlobal("Headers")
@js.native
class Headers ()
  extends typingsSlinky.tabris.Headers {
  def this(headers: js.Array[js.Tuple2[String, String]]) = this()
  def this(headers: StringDictionary[String]) = this()
  def this(headers: typingsSlinky.tabris.Headers) = this()
}

