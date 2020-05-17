package typingsSlinky.storybookAddons.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.storybookAddons.typesMod.RequireContext
  - js.Array[typingsSlinky.storybookAddons.typesMod.RequireContext]
  - typingsSlinky.storybookAddons.typesMod.LoadFn
*/
trait Loadable extends js.Object

object Loadable {
  @scala.inline
  implicit def apply(value: js.Array[RequireContext]): Loadable = value.asInstanceOf[Loadable]
  @scala.inline
  implicit def apply(value: LoadFn): Loadable = value.asInstanceOf[Loadable]
  @scala.inline
  implicit def apply(value: RequireContext): Loadable = value.asInstanceOf[Loadable]
}

