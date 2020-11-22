package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.commonEntityTargetMod._EntityTarget
import typingsSlinky.typeorm.entitySchemaEntitySchemaOptionsMod.EntitySchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "EntitySchema")
@js.native
class EntitySchema[T] protected ()
  extends typingsSlinky.typeorm.entitySchemaEntitySchemaMod.EntitySchema[T]
     with _EntityTarget[T] {
  def this(options: EntitySchemaOptions[T]) = this()
}
