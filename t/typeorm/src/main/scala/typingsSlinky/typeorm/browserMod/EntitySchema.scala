package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.entitySchemaOptionsMod.EntitySchemaOptions
import typingsSlinky.typeorm.entityTargetMod._EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "EntitySchema")
@js.native
class EntitySchema[T] protected ()
  extends typingsSlinky.typeorm.entitySchemaMod.EntitySchema[T]
     with _EntityTarget[T] {
  def this(options: EntitySchemaOptions[T]) = this()
}
