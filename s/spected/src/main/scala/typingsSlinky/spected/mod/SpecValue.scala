package typingsSlinky.spected.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spected.mod.SpecArray[INPUT, ROOTINPUT]
  - typingsSlinky.spected.mod.SpecFunction[INPUT, ROOTINPUT]
  - typingsSlinky.spected.mod.SpecObject[INPUT, ROOTINPUT]
*/
trait SpecValue[INPUT, ROOTINPUT] extends js.Object

object SpecValue {
  @scala.inline
  implicit def apply[INPUT, ROOTINPUT](value: SpecArray[INPUT, ROOTINPUT]): SpecValue[INPUT, ROOTINPUT] = value.asInstanceOf[SpecValue[INPUT, ROOTINPUT]]
  @scala.inline
  implicit def apply[INPUT, ROOTINPUT](value: SpecFunction[INPUT, ROOTINPUT]): SpecValue[INPUT, ROOTINPUT] = value.asInstanceOf[SpecValue[INPUT, ROOTINPUT]]
  @scala.inline
  implicit def apply[INPUT, ROOTINPUT](value: SpecObject[INPUT, ROOTINPUT]): SpecValue[INPUT, ROOTINPUT] = value.asInstanceOf[SpecValue[INPUT, ROOTINPUT]]
}

