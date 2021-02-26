package typingsSlinky.storybookApi.anon

import typingsSlinky.storybookApi.refsMod.ComposedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref extends StObject {
  
  var ref: ComposedRef = js.native
  
  var refId: String = js.native
  
  var source: String = js.native
  
  var sourceLocation: String = js.native
  
  var sourceType: String = js.native
  
  var `type`: String = js.native
}
object Ref {
  
  @scala.inline
  def apply(
    ref: ComposedRef,
    refId: String,
    source: String,
    sourceLocation: String,
    sourceType: String,
    `type`: String
  ): Ref = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: ComposedRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocation(value: String): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
