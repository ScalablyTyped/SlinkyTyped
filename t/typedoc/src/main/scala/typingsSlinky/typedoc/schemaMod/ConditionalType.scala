package typingsSlinky.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ConditionalType, 'type' | 'checkType' | 'extendsType' | 'trueType' | 'falseType'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait ConditionalType extends SomeType {
  
  var checkType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type = js.native
  
  var extendsType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type = js.native
  
  var falseType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type = js.native
  
  var trueType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type = js.native
  
  var `type`: ModelToObject[String] | String = js.native
}
object ConditionalType {
  
  @scala.inline
  def apply(
    checkType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    extendsType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    falseType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    trueType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[String] | String
  ): ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalType]
  }
  
  @scala.inline
  implicit class ConditionalTypeMutableBuilder[Self <: ConditionalType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckType(
      value: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "checkType", js.Array(value :_*))
    
    @scala.inline
    def setExtendsType(
      value: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "extendsType", js.Array(value :_*))
    
    @scala.inline
    def setFalseType(
      value: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "falseType", js.Array(value :_*))
    
    @scala.inline
    def setTrueType(
      value: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "trueType", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ModelToObject[String] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
