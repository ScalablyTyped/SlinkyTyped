package typingsSlinky.typedoc.schemaMod

import typingsSlinky.typedoc.typedocStrings.keyof
import typingsSlinky.typedoc.typedocStrings.readonly
import typingsSlinky.typedoc.typedocStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedoc.schemaMod.ArrayType
  - typingsSlinky.typedoc.schemaMod.ConditionalType
  - typingsSlinky.typedoc.schemaMod.IndexedAccessType
  - typingsSlinky.typedoc.schemaMod.InferredType
  - typingsSlinky.typedoc.schemaMod.IntersectionType
  - typingsSlinky.typedoc.schemaMod.IntrinsicType
  - typingsSlinky.typedoc.schemaMod.PredicateType
  - typingsSlinky.typedoc.schemaMod.ReferenceType
  - typingsSlinky.typedoc.schemaMod.ReflectionType
  - typingsSlinky.typedoc.schemaMod.StringLiteralType
  - typingsSlinky.typedoc.schemaMod.TupleType
  - typingsSlinky.typedoc.schemaMod.TypeOperatorType
  - typingsSlinky.typedoc.schemaMod.TypeParameterType
  - typingsSlinky.typedoc.schemaMod.UnionType
  - typingsSlinky.typedoc.schemaMod.UnknownType
*/
trait SomeType
  extends __ModelToObject[js.Any]
object SomeType {
  
  @scala.inline
  def ArrayType(
    elementType: ModelToObject[typingsSlinky.typedoc.modelsTypesMod.Type] | typingsSlinky.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)
  ): typingsSlinky.typedoc.schemaMod.ArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ArrayType]
  }
  
  @scala.inline
  def ConditionalType(
    checkType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    extendsType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    falseType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    trueType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[String] | String
  ): typingsSlinky.typedoc.schemaMod.ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ConditionalType]
  }
  
  @scala.inline
  def IndexedAccessType(
    indexType: ModelToObject[typingsSlinky.typedoc.modelsTypesMod.Type] | typingsSlinky.typedoc.modelsTypesMod.Type,
    objectType: ModelToObject[typingsSlinky.typedoc.modelsTypesMod.Type] | typingsSlinky.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)
  ): typingsSlinky.typedoc.schemaMod.IndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.IndexedAccessType]
  }
  
  @scala.inline
  def InferredType(name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): typingsSlinky.typedoc.schemaMod.InferredType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.InferredType]
  }
  
  @scala.inline
  def IntersectionType(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]] | js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
  ): typingsSlinky.typedoc.schemaMod.IntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.IntersectionType]
  }
  
  @scala.inline
  def IntrinsicType(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)
  ): typingsSlinky.typedoc.schemaMod.IntrinsicType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.IntrinsicType]
  }
  
  @scala.inline
  def PredicateType(
    asserts: ModelToObject[Boolean] | Boolean,
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String)
  ): typingsSlinky.typedoc.schemaMod.PredicateType = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.PredicateType]
  }
  
  @scala.inline
  def ReferenceType(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)
  ): typingsSlinky.typedoc.schemaMod.ReferenceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ReferenceType]
  }
  
  @scala.inline
  def ReflectionType(`type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): typingsSlinky.typedoc.schemaMod.ReflectionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ReflectionType]
  }
  
  @scala.inline
  def StringLiteralType(
    `type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String),
    value: ModelToObject[String] | String
  ): typingsSlinky.typedoc.schemaMod.StringLiteralType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.StringLiteralType]
  }
  
  @scala.inline
  def TupleType(`type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)): typingsSlinky.typedoc.schemaMod.TupleType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.TupleType]
  }
  
  @scala.inline
  def TypeOperatorType(
    operator: (ModelToObject[keyof | unique | readonly]) | keyof | unique | readonly,
    target: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)
  ): typingsSlinky.typedoc.schemaMod.TypeOperatorType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.TypeOperatorType]
  }
  
  @scala.inline
  def TypeParameterType(name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): typingsSlinky.typedoc.schemaMod.TypeParameterType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.TypeParameterType]
  }
  
  @scala.inline
  def UnionType(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]] | js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
  ): typingsSlinky.typedoc.schemaMod.UnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.UnionType]
  }
  
  @scala.inline
  def UnknownType(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)
  ): typingsSlinky.typedoc.schemaMod.UnknownType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.UnknownType]
  }
}
