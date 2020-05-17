package typingsSlinky.vegaTypings.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.transformMod.ForceCenter
  - typingsSlinky.vegaTypings.transformMod.ForceCollide
  - typingsSlinky.vegaTypings.transformMod.ForceLink
  - typingsSlinky.vegaTypings.transformMod.ForceNBody
  - typingsSlinky.vegaTypings.transformMod.ForceX
  - typingsSlinky.vegaTypings.transformMod.ForceY
*/
trait Force extends js.Object

object Force {
  @scala.inline
  implicit def apply(value: ForceCenter): Force = value.asInstanceOf[Force]
  @scala.inline
  implicit def apply(value: ForceCollide): Force = value.asInstanceOf[Force]
  @scala.inline
  implicit def apply(value: ForceLink): Force = value.asInstanceOf[Force]
  @scala.inline
  implicit def apply(value: ForceNBody): Force = value.asInstanceOf[Force]
  @scala.inline
  implicit def apply(value: ForceX): Force = value.asInstanceOf[Force]
  @scala.inline
  implicit def apply(value: ForceY): Force = value.asInstanceOf[Force]
}

