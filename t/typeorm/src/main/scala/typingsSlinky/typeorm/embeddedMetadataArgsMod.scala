package typingsSlinky.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/metadata-args/EmbeddedMetadataArgs", JSImport.Namespace)
@js.native
object embeddedMetadataArgsMod extends js.Object {
  
  @js.native
  trait EmbeddedMetadataArgs extends js.Object {
    
    /**
      * Indicates if this embedded is array or not.
      */
    var isArray: Boolean = js.native
    
    /**
      * Prefix of the embedded, used instead of propertyName.
      * If set to empty string, then prefix is not set at all.
      */
    var prefix: js.UndefOr[String | Boolean] = js.native
    
    /**
      * Class's property name to which this column is applied.
      */
    var propertyName: String = js.native
    
    /**
      * Class to which this column is applied.
      */
    var target: js.Function = js.native
    
    /**
      * Type of the class to be embedded.
      */
    def `type`(): js.Function = js.native
    def `type`(`type`: js.Any): js.Function = js.native
  }
}
