package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.typeormStrings.from
import typingsSlinky.typeorm.typeormStrings.join
import typingsSlinky.typeorm.typeormStrings.other
import typingsSlinky.typeorm.typeormStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends StObject {
  
  var metadata: js.UndefOr[typingsSlinky.typeorm.entityMetadataMod.EntityMetadata] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var subQuery: js.UndefOr[String] = js.native
  
  var tablePath: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[js.Function | String] = js.native
  
  var `type`: from | select | join | other = js.native
}
object Metadata {
  
  @scala.inline
  def apply(`type`: from | select | join | other): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: typingsSlinky.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubQuery(value: String): Self = StObject.set(x, "subQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubQueryUndefined: Self = StObject.set(x, "subQuery", js.undefined)
    
    @scala.inline
    def setTablePath(value: String): Self = StObject.set(x, "tablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablePathUndefined: Self = StObject.set(x, "tablePath", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: from | select | join | other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
