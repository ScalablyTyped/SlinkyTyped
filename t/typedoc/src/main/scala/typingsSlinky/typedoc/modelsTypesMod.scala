package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.Reflection
import typingsSlinky.typedoc.reflectionsDeclarationMod.DeclarationReflection
import typingsSlinky.typedoc.typedocStrings.keyof
import typingsSlinky.typedoc.typedocStrings.readonly
import typingsSlinky.typedoc.typedocStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsTypesMod {
  
  @JSImport("typedoc/dist/lib/models/types", "ArrayType")
  @js.native
  class ArrayType protected ()
    extends typingsSlinky.typedoc.typesArrayMod.ArrayType {
    def this(elementType: Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "ConditionalType")
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
  
  @JSImport("typedoc/dist/lib/models/types", "IndexedAccessType")
  @js.native
  class IndexedAccessType protected ()
    extends typingsSlinky.typedoc.typesIndexedAccessMod.IndexedAccessType {
    def this(objectType: Type, indexType: Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "InferredType")
  @js.native
  class InferredType protected ()
    extends typingsSlinky.typedoc.typesInferredMod.InferredType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "IntersectionType")
  @js.native
  class IntersectionType protected ()
    extends typingsSlinky.typedoc.intersectionMod.IntersectionType {
    def this(types: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "IntrinsicType")
  @js.native
  class IntrinsicType protected ()
    extends typingsSlinky.typedoc.typesIntrinsicMod.IntrinsicType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "NamedTupleMember")
  @js.native
  class NamedTupleMember protected ()
    extends typingsSlinky.typedoc.typesTupleMod.NamedTupleMember {
    def this(name: String, isOptional: Boolean, element: typingsSlinky.typedoc.typesAbstractMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "PredicateType")
  @js.native
  class PredicateType protected ()
    extends typingsSlinky.typedoc.typesPredicateMod.PredicateType {
    def this(name: String, asserts: Boolean) = this()
    def this(name: String, asserts: Boolean, targetType: typingsSlinky.typedoc.typesAbstractMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "QueryType")
  @js.native
  class QueryType protected ()
    extends typingsSlinky.typedoc.typesQueryMod.QueryType {
    def this(reference: typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "ReferenceType")
  @js.native
  class ReferenceType protected ()
    extends typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType {
    def this(name: String, symbolFQN: String) = this()
    def this(name: String, symbolFQN: String, reflection: Reflection) = this()
  }
  /* static members */
  object ReferenceType {
    
    @JSImport("typedoc/dist/lib/models/types", "ReferenceType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "ReferenceType.SYMBOL_FQN_RESOLVED")
    @js.native
    def SYMBOL_FQN_RESOLVED: String = js.native
    @scala.inline
    def SYMBOL_FQN_RESOLVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVED")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/models/types", "ReferenceType.SYMBOL_FQN_RESOLVE_BY_NAME")
    @js.native
    def SYMBOL_FQN_RESOLVE_BY_NAME: String = js.native
    @scala.inline
    def SYMBOL_FQN_RESOLVE_BY_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVE_BY_NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/models/types", "ReflectionType")
  @js.native
  class ReflectionType protected ()
    extends typingsSlinky.typedoc.reflectionMod.ReflectionType {
    def this(declaration: DeclarationReflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "StringLiteralType")
  @js.native
  class StringLiteralType protected ()
    extends typingsSlinky.typedoc.typesStringLiteralMod.StringLiteralType {
    def this(value: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "TupleType")
  @js.native
  class TupleType protected ()
    extends typingsSlinky.typedoc.typesTupleMod.TupleType {
    def this(elements: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "Type")
  @js.native
  abstract class Type ()
    extends typingsSlinky.typedoc.typesAbstractMod.Type
  /* static members */
  object Type {
    
    @JSImport("typedoc/dist/lib/models/types", "Type.isTypeListEqual")
    @js.native
    def isTypeListEqual(
      a: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type],
      b: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "Type.isTypeListSimilar")
    @js.native
    def isTypeListSimilar(
      a: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type],
      b: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "TypeOperatorType")
  @js.native
  class TypeOperatorType protected ()
    extends typingsSlinky.typedoc.typesTypeOperatorMod.TypeOperatorType {
    def this(target: typingsSlinky.typedoc.typesAbstractMod.Type, operator: keyof) = this()
    def this(target: typingsSlinky.typedoc.typesAbstractMod.Type, operator: readonly) = this()
    def this(target: typingsSlinky.typedoc.typesAbstractMod.Type, operator: unique) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "TypeParameterType")
  @js.native
  class TypeParameterType protected ()
    extends typingsSlinky.typedoc.modelsTypesTypeParameterMod.TypeParameterType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "UnionType")
  @js.native
  class UnionType protected ()
    extends typingsSlinky.typedoc.unionMod.UnionType {
    def this(types: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "UnknownType")
  @js.native
  class UnknownType protected ()
    extends typingsSlinky.typedoc.typesUnknownMod.UnknownType {
    def this(name: String) = this()
  }
}
