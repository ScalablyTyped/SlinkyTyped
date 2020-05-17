package typingsSlinky.vision.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vision.mod.ServerViewCompileSync
  - typingsSlinky.vision.mod.ServerViewCompileAsync
*/
trait ServerViewCompile extends js.Object

object ServerViewCompile {
  @scala.inline
  implicit def apply(value: ServerViewCompileAsync): ServerViewCompile = value.asInstanceOf[ServerViewCompile]
  @scala.inline
  implicit def apply(value: ServerViewCompileSync): ServerViewCompile = value.asInstanceOf[ServerViewCompile]
}

