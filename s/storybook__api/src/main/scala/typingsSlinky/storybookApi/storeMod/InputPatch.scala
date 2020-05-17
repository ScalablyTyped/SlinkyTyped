package typingsSlinky.storybookApi.storeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.storybookApi.storeMod.Patch
  - typingsSlinky.storybookApi.storeMod.InputFnPatch
*/
trait InputPatch extends js.Object

object InputPatch {
  @scala.inline
  implicit def apply(value: InputFnPatch): InputPatch = value.asInstanceOf[InputPatch]
  @scala.inline
  implicit def apply(value: Patch): InputPatch = value.asInstanceOf[InputPatch]
}

