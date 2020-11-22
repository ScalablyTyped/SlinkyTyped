package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.EntityMetadataEntityMetadata
import typingsSlinky.typeorm.entityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.namingStrategyInterfaceMod.NamingStrategyInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/metadata/ExclusionMetadata", JSImport.Namespace)
@js.native
object exclusionMetadataMod extends js.Object {
  
  @js.native
  class ExclusionMetadata protected () extends js.Object {
    def this(options: EntityMetadataEntityMetadata) = this()
    
    /**
      * Builds some depend exclusion constraint properties.
      * Must be called after all entity metadata's properties map, columns and relations are built.
      */
    def build(namingStrategy: NamingStrategyInterface): this.type = js.native
    
    /**
      * Entity metadata of the class to which this exclusion constraint is applied.
      */
    var entityMetadata: EntityMetadata = js.native
    
    /**
      * Exclusion expression.
      */
    var expression: String = js.native
    
    /**
      * User specified exclusion constraint name.
      */
    var givenName: js.UndefOr[String] = js.native
    
    /**
      * Final exclusion constraint name.
      * If exclusion constraint name was given by a user then it stores normalized (by naming strategy) givenName.
      * If exclusion constraint name was not given then its generated.
      */
    var name: String = js.native
    
    /**
      * Target class to which metadata is applied.
      */
    var target: js.UndefOr[js.Function | String] = js.native
  }
}
