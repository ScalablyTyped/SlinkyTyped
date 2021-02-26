package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.typedocStrings.keyof
import typingsSlinky.typedoc.typedocStrings.readonly
import typingsSlinky.typedoc.typedocStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMod {
  
  @JSImport("typedoc/dist/lib/models", "ArrayType")
  @js.native
  class ArrayType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.ArrayType {
    def this(elementType: typingsSlinky.typedoc.modelsTypesMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "Comment")
  @js.native
  class Comment ()
    extends typingsSlinky.typedoc.commentsMod.Comment {
    def this(shortText: String) = this()
    def this(shortText: js.UndefOr[scala.Nothing], text: String) = this()
    def this(shortText: String, text: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "CommentTag")
  @js.native
  class CommentTag protected ()
    extends typingsSlinky.typedoc.commentsMod.CommentTag {
    def this(tagName: String) = this()
    def this(tagName: String, paramName: String) = this()
    def this(tagName: String, paramName: js.UndefOr[scala.Nothing], text: String) = this()
    def this(tagName: String, paramName: String, text: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ConditionalType")
  @js.native
  class ConditionalType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.ConditionalType {
    def this(
      checkType: typingsSlinky.typedoc.typesAbstractMod.Type,
      extendsType: typingsSlinky.typedoc.typesAbstractMod.Type,
      trueType: typingsSlinky.typedoc.typesAbstractMod.Type,
      falseType: typingsSlinky.typedoc.typesAbstractMod.Type
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ContainerReflection")
  @js.native
  class ContainerReflection protected ()
    extends typingsSlinky.typedoc.reflectionsMod.ContainerReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typingsSlinky.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "DeclarationReflection")
  @js.native
  class DeclarationReflection protected ()
    extends typingsSlinky.typedoc.reflectionsMod.DeclarationReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typingsSlinky.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "IndexedAccessType")
  @js.native
  class IndexedAccessType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.IndexedAccessType {
    def this(
      objectType: typingsSlinky.typedoc.modelsTypesMod.Type,
      indexType: typingsSlinky.typedoc.modelsTypesMod.Type
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "InferredType")
  @js.native
  class InferredType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.InferredType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "IntersectionType")
  @js.native
  class IntersectionType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.IntersectionType {
    def this(types: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "IntrinsicType")
  @js.native
  class IntrinsicType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.IntrinsicType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "NamedTupleMember")
  @js.native
  class NamedTupleMember protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.NamedTupleMember {
    def this(name: String, isOptional: Boolean, element: typingsSlinky.typedoc.typesAbstractMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ParameterReflection")
  @js.native
  class ParameterReflection protected ()
    extends typingsSlinky.typedoc.reflectionsMod.ParameterReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typingsSlinky.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "PredicateType")
  @js.native
  class PredicateType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.PredicateType {
    def this(name: String, asserts: Boolean) = this()
    def this(name: String, asserts: Boolean, targetType: typingsSlinky.typedoc.typesAbstractMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ProjectReflection")
  @js.native
  class ProjectReflection protected ()
    extends typingsSlinky.typedoc.reflectionsMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "QueryType")
  @js.native
  class QueryType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.QueryType {
    def this(reference: typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReferenceReflection")
  @js.native
  class ReferenceReflection protected ()
    extends typingsSlinky.typedoc.reflectionsMod.ReferenceReflection {
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_state'] */ js.Any
    ) = this()
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_state'] */ js.Any,
      parent: typingsSlinky.typedoc.abstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReferenceType")
  @js.native
  class ReferenceType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.ReferenceType {
    def this(name: String, symbolFQN: String) = this()
    def this(name: String, symbolFQN: String, reflection: typingsSlinky.typedoc.abstractMod.Reflection) = this()
  }
  /* static members */
  object ReferenceType {
    
    @JSImport("typedoc/dist/lib/models", "ReferenceType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/models", "ReferenceType.SYMBOL_FQN_RESOLVED")
    @js.native
    def SYMBOL_FQN_RESOLVED: String = js.native
    @scala.inline
    def SYMBOL_FQN_RESOLVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVED")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/models", "ReferenceType.SYMBOL_FQN_RESOLVE_BY_NAME")
    @js.native
    def SYMBOL_FQN_RESOLVE_BY_NAME: String = js.native
    @scala.inline
    def SYMBOL_FQN_RESOLVE_BY_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVE_BY_NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/models", "Reflection")
  @js.native
  abstract class Reflection protected ()
    extends typingsSlinky.typedoc.reflectionsMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typingsSlinky.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionCategory")
  @js.native
  class ReflectionCategory protected ()
    extends typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory {
    def this(title: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionFlag")
  @js.native
  object ReflectionFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.abstractMod.ReflectionFlag with Double] = js.native
    
    /* 2048 */ val Abstract: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Abstract with Double = js.native
    
    /* 4096 */ val Const: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Const with Double = js.native
    
    /* 1024 */ val ConstructorProperty: typingsSlinky.typedoc.abstractMod.ReflectionFlag.ConstructorProperty with Double = js.native
    
    /* 256 */ val DefaultValue: typingsSlinky.typedoc.abstractMod.ReflectionFlag.DefaultValue with Double = js.native
    
    /* 32 */ val ExportAssignment: typingsSlinky.typedoc.abstractMod.ReflectionFlag.ExportAssignment with Double = js.native
    
    /* 16 */ val Exported: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Exported with Double = js.native
    
    /* 64 */ val External: typingsSlinky.typedoc.abstractMod.ReflectionFlag.External with Double = js.native
    
    /* 8192 */ val Let: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Let with Double = js.native
    
    /* 0 */ val None: typingsSlinky.typedoc.abstractMod.ReflectionFlag.None with Double = js.native
    
    /* 128 */ val Optional: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Optional with Double = js.native
    
    /* 1 */ val Private: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Private with Double = js.native
    
    /* 2 */ val Protected: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Protected with Double = js.native
    
    /* 4 */ val Public: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Public with Double = js.native
    
    /* 16384 */ val Readonly: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Readonly with Double = js.native
    
    /* 512 */ val Rest: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Rest with Double = js.native
    
    /* 8 */ val Static: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Static with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionFlags")
  @js.native
  class ReflectionFlags ()
    extends typingsSlinky.typedoc.reflectionsMod.ReflectionFlags
  
  @JSImport("typedoc/dist/lib/models", "ReflectionGroup")
  @js.native
  class ReflectionGroup protected ()
    extends typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup {
    def this(title: String, kind: ReflectionKind) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionKind")
  @js.native
  object ReflectionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.abstractMod.ReflectionKind with Double] = js.native
    
    /* 262144 */ val Accessor: typingsSlinky.typedoc.abstractMod.ReflectionKind.Accessor with Double = js.native
    
    /* 4096 */ val CallSignature: typingsSlinky.typedoc.abstractMod.ReflectionKind.CallSignature with Double = js.native
    
    /* 128 */ val Class: typingsSlinky.typedoc.abstractMod.ReflectionKind.Class with Double = js.native
    
    /* 8654336 */ val ClassMember: typingsSlinky.typedoc.abstractMod.ReflectionKind.ClassMember with Double = js.native
    
    /* 384 */ val ClassOrInterface: typingsSlinky.typedoc.abstractMod.ReflectionKind.ClassOrInterface with Double = js.native
    
    /* 512 */ val Constructor: typingsSlinky.typedoc.abstractMod.ReflectionKind.Constructor with Double = js.native
    
    /* 16384 */ val ConstructorSignature: typingsSlinky.typedoc.abstractMod.ReflectionKind.ConstructorSignature with Double = js.native
    
    /* 4 */ val Enum: typingsSlinky.typedoc.abstractMod.ReflectionKind.Enum with Double = js.native
    
    /* 16 */ val EnumMember: typingsSlinky.typedoc.abstractMod.ReflectionKind.EnumMember with Double = js.native
    
    /* 8388608 */ val Event: typingsSlinky.typedoc.abstractMod.ReflectionKind.Event with Double = js.native
    
    /* 64 */ val Function: typingsSlinky.typedoc.abstractMod.ReflectionKind.Function with Double = js.native
    
    /* 2112 */ val FunctionOrMethod: typingsSlinky.typedoc.abstractMod.ReflectionKind.FunctionOrMethod with Double = js.native
    
    /* 524288 */ val GetSignature: typingsSlinky.typedoc.abstractMod.ReflectionKind.GetSignature with Double = js.native
    
    /* 0 */ val Global: typingsSlinky.typedoc.abstractMod.ReflectionKind.Global with Double = js.native
    
    /* 8192 */ val IndexSignature: typingsSlinky.typedoc.abstractMod.ReflectionKind.IndexSignature with Double = js.native
    
    /* 256 */ val Interface: typingsSlinky.typedoc.abstractMod.ReflectionKind.Interface with Double = js.native
    
    /* 2048 */ val Method: typingsSlinky.typedoc.abstractMod.ReflectionKind.Method with Double = js.native
    
    /* 1 */ val Module: typingsSlinky.typedoc.abstractMod.ReflectionKind.Module with Double = js.native
    
    /* 2 */ val Namespace: typingsSlinky.typedoc.abstractMod.ReflectionKind.Namespace with Double = js.native
    
    /* 2097152 */ val ObjectLiteral: typingsSlinky.typedoc.abstractMod.ReflectionKind.ObjectLiteral with Double = js.native
    
    /* 32768 */ val Parameter: typingsSlinky.typedoc.abstractMod.ReflectionKind.Parameter with Double = js.native
    
    /* 1024 */ val Property: typingsSlinky.typedoc.abstractMod.ReflectionKind.Property with Double = js.native
    
    /* 16777216 */ val Reference: typingsSlinky.typedoc.abstractMod.ReflectionKind.Reference with Double = js.native
    
    /* 1048576 */ val SetSignature: typingsSlinky.typedoc.abstractMod.ReflectionKind.SetSignature with Double = js.native
    
    /* 3 */ val SomeModule: typingsSlinky.typedoc.abstractMod.ReflectionKind.SomeModule with Double = js.native
    
    /* 1601536 */ val SomeSignature: typingsSlinky.typedoc.abstractMod.ReflectionKind.SomeSignature with Double = js.native
    
    /* 4391168 */ val SomeType: typingsSlinky.typedoc.abstractMod.ReflectionKind.SomeType with Double = js.native
    
    /* 2097248 */ val SomeValue: typingsSlinky.typedoc.abstractMod.ReflectionKind.SomeValue with Double = js.native
    
    /* 4194304 */ val TypeAlias: typingsSlinky.typedoc.abstractMod.ReflectionKind.TypeAlias with Double = js.native
    
    /* 65536 */ val TypeLiteral: typingsSlinky.typedoc.abstractMod.ReflectionKind.TypeLiteral with Double = js.native
    
    /* 131072 */ val TypeParameter: typingsSlinky.typedoc.abstractMod.ReflectionKind.TypeParameter with Double = js.native
    
    /* 32 */ val Variable: typingsSlinky.typedoc.abstractMod.ReflectionKind.Variable with Double = js.native
    
    /* 1056 */ val VariableOrProperty: typingsSlinky.typedoc.abstractMod.ReflectionKind.VariableOrProperty with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionType")
  @js.native
  class ReflectionType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.ReflectionType {
    def this(declaration: typingsSlinky.typedoc.reflectionsDeclarationMod.DeclarationReflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "SignatureReflection")
  @js.native
  class SignatureReflection protected ()
    extends typingsSlinky.typedoc.reflectionsMod.SignatureReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typingsSlinky.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "SourceDirectory")
  @js.native
  class SourceDirectory ()
    extends typingsSlinky.typedoc.sourcesMod.SourceDirectory {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], parent: typingsSlinky.typedoc.directoryMod.SourceDirectory) = this()
    def this(name: String, parent: typingsSlinky.typedoc.directoryMod.SourceDirectory) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "SourceFile")
  @js.native
  class SourceFile protected ()
    extends typingsSlinky.typedoc.sourcesMod.SourceFile {
    def this(fullFileName: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "StringLiteralType")
  @js.native
  class StringLiteralType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.StringLiteralType {
    def this(value: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "TraverseProperty")
  @js.native
  object TraverseProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.abstractMod.TraverseProperty with Double] = js.native
    
    /* 0 */ val Children: typingsSlinky.typedoc.abstractMod.TraverseProperty.Children with Double = js.native
    
    /* 6 */ val GetSignature: typingsSlinky.typedoc.abstractMod.TraverseProperty.GetSignature with Double = js.native
    
    /* 5 */ val IndexSignature: typingsSlinky.typedoc.abstractMod.TraverseProperty.IndexSignature with Double = js.native
    
    /* 1 */ val Parameters: typingsSlinky.typedoc.abstractMod.TraverseProperty.Parameters with Double = js.native
    
    /* 7 */ val SetSignature: typingsSlinky.typedoc.abstractMod.TraverseProperty.SetSignature with Double = js.native
    
    /* 4 */ val Signatures: typingsSlinky.typedoc.abstractMod.TraverseProperty.Signatures with Double = js.native
    
    /* 2 */ val TypeLiteral: typingsSlinky.typedoc.abstractMod.TraverseProperty.TypeLiteral with Double = js.native
    
    /* 3 */ val TypeParameter: typingsSlinky.typedoc.abstractMod.TraverseProperty.TypeParameter with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models", "TupleType")
  @js.native
  class TupleType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.TupleType {
    def this(elements: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "Type")
  @js.native
  abstract class Type ()
    extends typingsSlinky.typedoc.modelsTypesMod.Type
  /* static members */
  object Type {
    
    @JSImport("typedoc/dist/lib/models", "Type.isTypeListEqual")
    @js.native
    def isTypeListEqual(
      a: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type],
      b: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
    
    @JSImport("typedoc/dist/lib/models", "Type.isTypeListSimilar")
    @js.native
    def isTypeListSimilar(
      a: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type],
      b: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
  }
  
  @JSImport("typedoc/dist/lib/models", "TypeOperatorType")
  @js.native
  class TypeOperatorType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.TypeOperatorType {
    def this(target: typingsSlinky.typedoc.typesAbstractMod.Type, operator: keyof) = this()
    def this(target: typingsSlinky.typedoc.typesAbstractMod.Type, operator: readonly) = this()
    def this(target: typingsSlinky.typedoc.typesAbstractMod.Type, operator: unique) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "TypeParameterReflection")
  @js.native
  class TypeParameterReflection protected ()
    extends typingsSlinky.typedoc.reflectionsMod.TypeParameterReflection {
    def this(`type`: typingsSlinky.typedoc.modelsTypesMod.TypeParameterType) = this()
    def this(
      `type`: typingsSlinky.typedoc.modelsTypesMod.TypeParameterType,
      parent: typingsSlinky.typedoc.abstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "TypeParameterType")
  @js.native
  class TypeParameterType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.TypeParameterType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "UnionType")
  @js.native
  class UnionType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.UnionType {
    def this(types: js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "UnknownType")
  @js.native
  class UnknownType protected ()
    extends typingsSlinky.typedoc.modelsTypesMod.UnknownType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "splitUnquotedString")
  @js.native
  def splitUnquotedString(input: String, delimiter: String): js.Array[String] = js.native
}
