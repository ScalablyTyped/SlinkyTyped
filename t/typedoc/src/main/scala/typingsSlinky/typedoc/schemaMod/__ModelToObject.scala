package typingsSlinky.typedoc.schemaMod

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.typedocStrings.keyof
import typingsSlinky.typedoc.typedocStrings.readonly
import typingsSlinky.typedoc.typedocStrings.unique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait __ModelToObject[T] extends js.Object
object __ModelToObject {
  
  @scala.inline
  def ContainerReflection[T](
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def SourceReference[T](
    character: ModelToObject[Double] | Double,
    fileName: ModelToObject[String] | String,
    line: ModelToObject[Double] | Double
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def IntersectionType[T](
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]] | js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def CommentTag[T](tag: String, text: ModelToObject[String] | String): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def UnionType[T](
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]] | js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def ReferenceType[T](
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def ReflectionPointer[T](id: ModelToObject[Double] | Double): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def Comment[T](): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def InferredType[T](name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def IntrinsicType[T](
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def IndexedAccessType[T](
    indexType: ModelToObject[typingsSlinky.typedoc.modelsTypesMod.Type] | typingsSlinky.typedoc.modelsTypesMod.Type,
    objectType: ModelToObject[typingsSlinky.typedoc.modelsTypesMod.Type] | typingsSlinky.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def TupleType[T](`type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def ReferenceReflection[T](
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String,
    target: Double
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def ArrayType[T](
    elementType: ModelToObject[typingsSlinky.typedoc.modelsTypesMod.Type] | typingsSlinky.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def ConditionalType[T](
    checkType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    extendsType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    falseType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    trueType: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[String] | String
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def ParameterReflection[T](
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def ReflectionType[T](`type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def DeclarationReflection[T](
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def TypeParameterType[T](name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def PredicateType[T](
    asserts: ModelToObject[Boolean] | Boolean,
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String)
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def Reflection[T](
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def UnknownType[T](
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def SignatureReflection[T](
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def ReflectionCategory[T](title: ModelToObject[String] | String): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def Decorator[T](name: ModelToObject[String] | String): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def StringLiteralType[T](
    `type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String),
    value: ModelToObject[String] | String
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def TypeOperatorType[T](
    operator: (ModelToObject[keyof | unique | readonly]) | keyof | unique | readonly,
    target: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] | typingsSlinky.typedoc.typesAbstractMod.Type,
    `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def TypeParameterReflection[T](
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
  
  @scala.inline
  def ReflectionGroup[T](kind: ModelToObject[ReflectionKind] | ReflectionKind, title: ModelToObject[String] | String): __ModelToObject[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[__ModelToObject[T]]
  }
}
