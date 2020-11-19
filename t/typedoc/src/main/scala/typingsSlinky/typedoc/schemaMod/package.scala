package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object schemaMod {
  
  type ModelToObject[T] = typingsSlinky.typedoc.schemaMod._ModelToObject[T] | js.Array[typingsSlinky.typedoc.schemaMod._ModelToObject[js.Any]]
  
  type Primitive = js.UndefOr[java.lang.String | scala.Double | scala.Null | scala.Boolean]
  
  type ProjectReflection = typingsSlinky.typedoc.schemaMod.ContainerReflection
  
  type S[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ K2 in K ]: T[K2] extends typedoc.typedoc/dist/lib/serialization/schema.Primitive? T[K2] : typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<T[K2]>}
    */ typingsSlinky.typedoc.typedocStrings.S with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typedoc.schemaMod.SourceReference
    - typingsSlinky.typedoc.schemaMod.Decorator
    - typingsSlinky.typedoc.schemaMod.CommentTag
    - typingsSlinky.typedoc.schemaMod.Comment
    - typingsSlinky.typedoc.schemaMod.SomeType
    - typingsSlinky.typedoc.schemaMod.UnknownType
    - typingsSlinky.typedoc.schemaMod.TupleType
    - typingsSlinky.typedoc.schemaMod.StringLiteralType
    - typingsSlinky.typedoc.schemaMod.ReflectionType
    - typingsSlinky.typedoc.schemaMod.ReferenceType
    - typingsSlinky.typedoc.schemaMod.PredicateType
    - typingsSlinky.typedoc.schemaMod.IntrinsicType
    - typingsSlinky.typedoc.schemaMod.IntersectionType
    - typingsSlinky.typedoc.schemaMod.InferredType
    - typingsSlinky.typedoc.schemaMod.IndexedAccessType
    - typingsSlinky.typedoc.schemaMod.ConditionalType
    - typingsSlinky.typedoc.schemaMod.ArrayType
    - typingsSlinky.typedoc.schemaMod.Reflection
    - typingsSlinky.typedoc.schemaMod.ReferenceReflection
    - typingsSlinky.typedoc.schemaMod.ContainerReflection
    - typingsSlinky.typedoc.schemaMod.ProjectReflection
    - typingsSlinky.typedoc.schemaMod.TypeParameterReflection
    - typingsSlinky.typedoc.schemaMod.DeclarationReflection
    - typingsSlinky.typedoc.schemaMod.ReflectionPointer
    - typingsSlinky.typedoc.schemaMod.ParameterReflection
    - typingsSlinky.typedoc.schemaMod.SignatureReflection
    - typingsSlinky.typedoc.schemaMod.ReflectionCategory
    - typingsSlinky.typedoc.schemaMod.ReflectionGroup
  */
  type _ModelToObject[T] = typingsSlinky.typedoc.schemaMod.__ModelToObject[T] | typingsSlinky.typedoc.schemaMod.ProjectReflection
}
