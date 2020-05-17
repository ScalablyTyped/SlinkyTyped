package typingsSlinky.whichPm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.whichPm.mod.NPM
  - typingsSlinky.whichPm.mod.YARN
  - typingsSlinky.whichPm.mod.PNPM
  - typingsSlinky.whichPm.mod.Other
*/
trait Result extends js.Object

object Result {
  @scala.inline
  implicit def apply(value: NPM): Result = value.asInstanceOf[Result]
  @scala.inline
  implicit def apply(value: Other): Result = value.asInstanceOf[Result]
  @scala.inline
  implicit def apply(value: PNPM): Result = value.asInstanceOf[Result]
  @scala.inline
  implicit def apply(value: YARN): Result = value.asInstanceOf[Result]
}

