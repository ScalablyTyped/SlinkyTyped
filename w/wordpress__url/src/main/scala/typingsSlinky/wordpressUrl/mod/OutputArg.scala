package typingsSlinky.wordpressUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.wordpressUrl.mod.OutputArgObject
  - typingsSlinky.wordpressUrl.mod.OutputArgArray
*/
trait OutputArg extends js.Object

object OutputArg {
  @scala.inline
  implicit def apply(value: OutputArgArray): OutputArg = value.asInstanceOf[OutputArg]
  @scala.inline
  implicit def apply(value: OutputArgObject): OutputArg = value.asInstanceOf[OutputArg]
  @scala.inline
  implicit def apply(value: String): OutputArg = value.asInstanceOf[OutputArg]
}

