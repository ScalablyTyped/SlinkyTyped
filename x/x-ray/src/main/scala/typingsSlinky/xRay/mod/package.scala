package typingsSlinky.xRay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AbortHandler = js.Function2[/* data */ js.Array[js.Any], /* url */ java.lang.String, scala.Boolean]
  type Callback = js.Function2[/* err */ js.Error, /* data */ js.Any, scala.Unit]
  type Filter = js.Function2[/* value */ js.Any, /* repeated */ java.lang.String, js.Any]
}
