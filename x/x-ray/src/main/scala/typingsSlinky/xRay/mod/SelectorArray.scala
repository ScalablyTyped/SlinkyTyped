package typingsSlinky.xRay.mod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorArray
  extends Array[ScalarSelector | SelectorArray]
     with Selector

