package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentifierTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  
  @JSName("kind")
  var kind_IdentifierTypePredicate: typingsSlinky.typescript.mod.TypePredicateKind.Identifier = js.native
  
  var parameterIndex: Double = js.native
  
  var parameterName: java.lang.String = js.native
  
  @JSName("type")
  var type_IdentifierTypePredicate: Type = js.native
}
object IdentifierTypePredicate {
  
  @scala.inline
  def apply(
    kind: typingsSlinky.typescript.mod.TypePredicateKind.Identifier,
    parameterIndex: Double,
    parameterName: java.lang.String,
    `type`: Type
  ): IdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierTypePredicate]
  }
  
  @scala.inline
  implicit class IdentifierTypePredicateMutableBuilder[Self <: IdentifierTypePredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: typingsSlinky.typescript.mod.TypePredicateKind.Identifier): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterIndex(value: Double): Self = StObject.set(x, "parameterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterName(value: java.lang.String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
