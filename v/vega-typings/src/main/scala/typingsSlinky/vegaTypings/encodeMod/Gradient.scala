package typingsSlinky.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.encodeMod.LinearGradient
  - typingsSlinky.vegaTypings.encodeMod.RadialGradient
*/
trait Gradient extends js.Object

object Gradient {
  @scala.inline
  implicit def apply(value: LinearGradient): Gradient = value.asInstanceOf[Gradient]
  @scala.inline
  implicit def apply(value: RadialGradient): Gradient = value.asInstanceOf[Gradient]
}

