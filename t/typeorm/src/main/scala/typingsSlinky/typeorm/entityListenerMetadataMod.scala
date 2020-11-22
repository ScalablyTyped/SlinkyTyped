package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.EmbeddedMetadata
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.eventListenerTypesMod.EventListenerType
import typingsSlinky.typeorm.objectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/metadata/EntityListenerMetadata", JSImport.Namespace)
@js.native
object entityListenerMetadataMod extends js.Object {
  
  @js.native
  class EntityListenerMetadata protected () extends js.Object {
    def this(options: EmbeddedMetadata) = this()
    
    /**
      * Calls embedded entity listener method no matter how nested it is.
      */
    /* protected */ def callEntityEmbeddedMethod(entity: ObjectLiteral, propertyPaths: js.Array[String]): Unit = js.native
    
    /**
      * Embedded metadata of the listener, in the case if listener is in embedded.
      */
    var embeddedMetadata: js.UndefOr[typingsSlinky.typeorm.embeddedMetadataMod.EmbeddedMetadata] = js.native
    
    /**
      * Entity metadata of the listener.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * Executes listener method of the given entity.
      */
    def execute(entity: ObjectLiteral): js.Any = js.native
    
    /**
      * Checks if entity listener is allowed to be executed on the given entity.
      */
    def isAllowed(entity: ObjectLiteral): Boolean = js.native
    
    /**
      * Target's property name to which this metadata is applied.
      */
    var propertyName: String = js.native
    
    /**
      * Target class to which metadata is applied.
      * This can be different then entityMetadata.target in the case if listener is in the embedded.
      */
    var target: js.Function | String = js.native
    
    /**
      * The type of the listener.
      */
    var `type`: EventListenerType = js.native
  }
}
