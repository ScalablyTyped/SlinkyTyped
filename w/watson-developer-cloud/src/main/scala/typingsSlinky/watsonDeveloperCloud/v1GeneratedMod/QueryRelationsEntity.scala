package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryRelationsEntity. */
@js.native
trait QueryRelationsEntity extends StObject {
  
  /** If false, implicit querying is performed. The default is `false`. */
  var exact: js.UndefOr[Boolean] = js.native
  
  /** Entity text content. */
  var text: js.UndefOr[String] = js.native
  
  /** The type of the specified entity. */
  var `type`: js.UndefOr[String] = js.native
}
object QueryRelationsEntity {
  
  @scala.inline
  def apply(): QueryRelationsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsEntity]
  }
  
  @scala.inline
  implicit class QueryRelationsEntityMutableBuilder[Self <: QueryRelationsEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
