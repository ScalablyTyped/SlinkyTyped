package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types", JSImport.Namespace)
@js.native
object serializersTypesMod extends js.Object {
  
  @js.native
  class ArrayTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesArrayMod.ArrayTypeSerializer
  
  @js.native
  class ConditionalTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesConditionalMod.ConditionalTypeSerializer
  
  @js.native
  class IndexedAccessTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesIndexedAccessMod.IndexedAccessTypeSerializer
  
  @js.native
  class InferredTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesInferredMod.InferredTypeSerializer
  
  @js.native
  class IntersectionTypeSerializer ()
    extends typingsSlinky.typedoc.typesIntersectionMod.IntersectionTypeSerializer
  
  @js.native
  class IntrinsicTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesIntrinsicMod.IntrinsicTypeSerializer
  
  @js.native
  class NamedTupleMemberTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesTupleMod.NamedTupleMemberTypeSerializer
  
  @js.native
  class PredicateTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesPredicateMod.PredicateTypeSerializer
  
  @js.native
  class QueryTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesQueryMod.QueryTypeSerializer
  
  @js.native
  class ReferenceTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesReferenceMod.ReferenceTypeSerializer
  
  @js.native
  class ReflectionTypeSerializer ()
    extends typingsSlinky.typedoc.typesReflectionMod.ReflectionTypeSerializer
  
  @js.native
  class StringLiteralTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesStringLiteralMod.StringLiteralTypeSerializer
  
  @js.native
  class TupleTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesTupleMod.TupleTypeSerializer
  
  @js.native
  class TypeOperatorTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesTypeOperatorMod.TypeOperatorTypeSerializer
  
  @js.native
  class TypeParameterTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesTypeParameterMod.TypeParameterTypeSerializer
  
  @js.native
  class TypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesAbstractMod.TypeSerializer
  /* static members */
  @js.native
  object TypeSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class UnionTypeSerializer ()
    extends typingsSlinky.typedoc.typesUnionMod.UnionTypeSerializer
  
  @js.native
  class UnknownTypeSerializer ()
    extends typingsSlinky.typedoc.serializersTypesUnknownMod.UnknownTypeSerializer
}
