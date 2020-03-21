package typingsSlinky.webpack.mod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A hack around circular type referencing
@js.native
trait RuleSetConditions
  extends Array[RuleSetCondition]
     with _RuleSetCondition

