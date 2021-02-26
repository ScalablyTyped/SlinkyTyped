package typingsSlinky.typeorm

import typingsSlinky.typeorm.metadataEntityMetadataMod.EntityMetadata
import typingsSlinky.typeorm.typeormStrings.from
import typingsSlinky.typeorm.typeormStrings.join
import typingsSlinky.typeorm.typeormStrings.other
import typingsSlinky.typeorm.typeormStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderAliasMod {
  
  @JSImport("typeorm/query-builder/Alias", "Alias")
  @js.native
  class Alias () extends StObject {
    def this(alias: Alias) = this()
    
    var _metadata: js.Any = js.native
    
    val hasMetadata: Boolean = js.native
    
    var metadata: EntityMetadata = js.native
    
    var name: String = js.native
    
    /**
      * If this alias is for sub query.
      */
    var subQuery: js.UndefOr[String] = js.native
    
    /**
      * Table on which this alias is applied.
      * Used only for aliases which select custom tables.
      */
    var tablePath: js.UndefOr[String] = js.native
    
    val target: js.Function | String = js.native
    
    var `type`: from | select | join | other = js.native
  }
}
