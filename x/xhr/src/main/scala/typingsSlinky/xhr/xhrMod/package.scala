package typingsSlinky.xhr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xhrMod {
  import org.scalablytyped.runtime.StringDictionary

  type XhrCallback = js.Function3[/* error */ js.Error, /* response */ XhrResponse, /* body */ js.Any, Unit]
  type XhrHeaders = StringDictionary[String]
}
