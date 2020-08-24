package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.Reflection
import typingsSlinky.typedoc.reflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types", JSImport.Namespace)
@js.native
object modelsTypesMod extends js.Object {
  @js.native
  class ArrayType protected ()
    extends typingsSlinky.typedoc.typesArrayMod.ArrayType {
    def this(elementType: Type) = this()
  }
  
  @js.native
  class ConditionalType protected ()
    extends typingsSlinky.typedoc.typesConditionalMod.ConditionalType {
    def this(
      checkType: typingsSlinky.typedoc.typesAbstractMod.Type,
      extendsType: typingsSlinky.typedoc.typesAbstractMod.Type,
      trueType: typingsSlinky.typedoc.typesAbstractMod.Type,
      falseType: typingsSlinky.typedoc.typesAbstractMod.Type
    ) = this()
  }
  
  @js.native
  class IndexedAccessType protected ()
    extends typingsSlinky.typedoc.typesIndexedAccessMod.IndexedAccessType {
    def this(objectType: Type, indexType: Type) = this()
  }
  
  @js.native
  class InferredType protected ()
    extends typingsSlinky.typedoc.typesInferredMod.InferredType {
    def this(name: String) = this()
  }
  
  @js.native
  class IntersectionType protected ()
    extends typingsSlinky.typedoc.intersectionMod.IntersectionType {
    def this(types: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @js.native
  class IntrinsicType protected ()
    extends typingsSlinky.typedoc.typesIntrinsicMod.IntrinsicType {
    def this(name: String) = this()
  }
  
  @js.native
  class PredicateType protected ()
    extends typingsSlinky.typedoc.typesPredicateMod.PredicateType {
    def this(name: String, asserts: Boolean) = this()
    def this(name: String, asserts: Boolean, targetType: typingsSlinky.typedoc.typesAbstractMod.Type) = this()
  }
  
  @js.native
  class QueryType protected ()
    extends typingsSlinky.typedoc.typesQueryMod.QueryType {
    def this(reference: typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType) = this()
  }
  
  @js.native
  class ReferenceType protected ()
    extends typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType {
    def this(name: String, symbolFQN: String) = this()
    def this(name: String, symbolFQN: String, reflection: Reflection) = this()
  }
  
  @js.native
  class ReflectionType protected ()
    extends typingsSlinky.typedoc.reflectionMod.ReflectionType {
    def this(declaration: DeclarationReflection) = this()
  }
  
  @js.native
  class StringLiteralType protected ()
    extends typingsSlinky.typedoc.typesStringLiteralMod.StringLiteralType {
    def this(value: String) = this()
  }
  
  @js.native
  class TupleType protected ()
    extends typingsSlinky.typedoc.typesTupleMod.TupleType {
    def this(elements: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @js.native
  abstract class Type ()
    extends typingsSlinky.typedoc.typesAbstractMod.Type
  
  @js.native
  class TypeOperatorType protected ()
    extends typingsSlinky.typedoc.typesTypeOperatorMod.TypeOperatorType {
    def this(target: typingsSlinky.typedoc.typesAbstractMod.Type) = this()
  }
  
  @js.native
  class TypeParameterType protected ()
    extends typingsSlinky.typedoc.modelsTypesTypeParameterMod.TypeParameterType {
    def this(name: String) = this()
  }
  
  @js.native
  class UnionType protected ()
    extends typingsSlinky.typedoc.unionMod.UnionType {
    def this(types: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @js.native
  class UnknownType protected ()
    extends typingsSlinky.typedoc.typesUnknownMod.UnknownType {
    def this(name: String) = this()
  }
  
  /* static members */
  @js.native
  object ReferenceType extends js.Object {
    var SYMBOL_FQN_RESOLVED: String = js.native
    var SYMBOL_FQN_RESOLVE_BY_NAME: String = js.native
  }
  
  /* static members */
  @js.native
  object Type extends js.Object {
    def isTypeListEqual(
      a: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type],
      b: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
    def isTypeListSimilar(
      a: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type],
      b: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
  }
  
}

