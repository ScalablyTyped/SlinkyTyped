package typingsSlinky.tsEssentials.mod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepRequiredArray[T]
  extends Array[DeepRequired[T]]
     with DeepRequired[js.Any]

