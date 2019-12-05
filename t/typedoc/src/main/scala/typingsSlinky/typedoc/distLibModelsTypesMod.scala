package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typingsSlinky.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typingsSlinky.typedoc.distLibModelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types", JSImport.Namespace)
@js.native
object distLibModelsTypesMod extends js.Object {
  @js.native
  class ArrayType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesArrayMod.ArrayType {
    def this(elementType: Type) = this()
  }
  
  @js.native
  class IntersectionType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesIntersectionMod.IntersectionType {
    def this(types: js.Array[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type]) = this()
  }
  
  @js.native
  class IntrinsicType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesIntrinsicMod.IntrinsicType {
    def this(name: String) = this()
  }
  
  @js.native
  class PredicateType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesPredicateMod.PredicateType {
    def this(name: String, asserts: Boolean) = this()
    def this(
      name: String,
      asserts: Boolean,
      targetType: typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type
    ) = this()
  }
  
  @js.native
  class ReferenceType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesReferenceMod.ReferenceType {
    def this(name: String, symbolID: Double) = this()
    def this(name: String, symbolID: Double, reflection: Reflection) = this()
  }
  
  @js.native
  class ReflectionType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesReflectionMod.ReflectionType {
    def this(declaration: DeclarationReflection) = this()
  }
  
  @js.native
  class StringLiteralType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesStringDashLiteralMod.StringLiteralType {
    def this(value: String) = this()
  }
  
  @js.native
  class TupleType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesTupleMod.TupleType {
    def this(elements: js.Array[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type]) = this()
  }
  
  @js.native
  abstract class Type ()
    extends typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type
  
  @js.native
  class TypeOperatorType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesTypeDashOperatorMod.TypeOperatorType {
    def this(target: typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type) = this()
  }
  
  @js.native
  class TypeParameterType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesTypeDashParameterMod.TypeParameterType {
    def this(name: String) = this()
  }
  
  @js.native
  class UnionType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesUnionMod.UnionType {
    def this(types: js.Array[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type]) = this()
  }
  
  @js.native
  class UnknownType protected ()
    extends typingsSlinky.typedoc.distLibModelsTypesUnknownMod.UnknownType {
    def this(name: String) = this()
  }
  
  /* static members */
  @js.native
  object ReferenceType extends js.Object {
    var SYMBOL_ID_RESOLVED: Double = js.native
    var SYMBOL_ID_RESOLVE_BY_NAME: Double = js.native
  }
  
  /* static members */
  @js.native
  object Type extends js.Object {
    def isTypeListEqual(
      a: js.Array[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type],
      b: js.Array[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type]
    ): Boolean = js.native
    def isTypeListSimilar(
      a: js.Array[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type],
      b: js.Array[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type]
    ): Boolean = js.native
  }
  
}

