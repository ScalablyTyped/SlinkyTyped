package typingsSlinky.typedoc.schemaMod

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.typedocStrings.keyof
import typingsSlinky.typedoc.typedocStrings.readonly
import typingsSlinky.typedoc.typedocStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait __ModelToObject[T] extends StObject
object __ModelToObject {
  
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
  def Comment(): typingsSlinky.typedoc.schemaMod.Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.Comment]
  }
  
  @scala.inline
  def CommentTag(tag: String, text: ModelToObject[String] | String): typingsSlinky.typedoc.schemaMod.CommentTag = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.CommentTag]
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
  def ContainerReflection(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): typingsSlinky.typedoc.schemaMod.ContainerReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ContainerReflection]
  }
  
  @scala.inline
  def DeclarationReflection(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): typingsSlinky.typedoc.schemaMod.DeclarationReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.DeclarationReflection]
  }
  
  @scala.inline
  def Decorator(name: ModelToObject[String] | String): typingsSlinky.typedoc.schemaMod.Decorator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.Decorator]
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
  def ParameterReflection(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): typingsSlinky.typedoc.schemaMod.ParameterReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ParameterReflection]
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
  def ReferenceReflection(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String,
    target: Double
  ): typingsSlinky.typedoc.schemaMod.ReferenceReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ReferenceReflection]
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
  def Reflection(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): typingsSlinky.typedoc.schemaMod.Reflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.Reflection]
  }
  
  @scala.inline
  def ReflectionCategory(title: ModelToObject[String] | String): typingsSlinky.typedoc.schemaMod.ReflectionCategory = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ReflectionCategory]
  }
  
  @scala.inline
  def ReflectionGroup(kind: ModelToObject[ReflectionKind] | ReflectionKind, title: ModelToObject[String] | String): typingsSlinky.typedoc.schemaMod.ReflectionGroup = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ReflectionGroup]
  }
  
  @scala.inline
  def ReflectionPointer(id: ModelToObject[Double] | Double): typingsSlinky.typedoc.schemaMod.ReflectionPointer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ReflectionPointer]
  }
  
  @scala.inline
  def ReflectionType(`type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): typingsSlinky.typedoc.schemaMod.ReflectionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.ReflectionType]
  }
  
  @scala.inline
  def SignatureReflection(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): typingsSlinky.typedoc.schemaMod.SignatureReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.SignatureReflection]
  }
  
  @scala.inline
  def SourceReference(
    character: ModelToObject[Double] | Double,
    fileName: ModelToObject[String] | String,
    line: ModelToObject[Double] | Double
  ): typingsSlinky.typedoc.schemaMod.SourceReference = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.SourceReference]
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
  def TypeParameterReflection(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): typingsSlinky.typedoc.schemaMod.TypeParameterReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedoc.schemaMod.TypeParameterReflection]
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
