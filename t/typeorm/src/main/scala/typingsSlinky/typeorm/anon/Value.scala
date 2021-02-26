package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.commonObjectLiteralMod.ObjectLiteral
import typingsSlinky.typeorm.metadataRelationMetadataMod.RelationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends StObject {
  
  var relation: RelationMetadata = js.native
  
  var value: ObjectLiteral = js.native
}
object Value {
  
  @scala.inline
  def apply(relation: RelationMetadata, value: ObjectLiteral): Value = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelation(value: RelationMetadata): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ObjectLiteral): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
