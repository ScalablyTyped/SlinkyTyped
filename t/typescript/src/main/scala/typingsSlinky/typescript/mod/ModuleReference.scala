package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.EntityName
  - typingsSlinky.typescript.mod.ExternalModuleReference
*/
trait ModuleReference extends js.Object

object ModuleReference {
  @scala.inline
  implicit def apply(value: EntityName): ModuleReference = value.asInstanceOf[ModuleReference]
  @scala.inline
  implicit def apply(value: ExternalModuleReference): ModuleReference = value.asInstanceOf[ModuleReference]
}

