package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typingsSlinky.typedoc.distLibModelsTypesMod.TypeParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections", JSImport.Namespace)
@js.native
object distLibModelsReflectionsMod extends js.Object {
  @js.native
  class ContainerReflection ()
    extends typingsSlinky.typedoc.distLibModelsReflectionsContainerMod.ContainerReflection
  
  @js.native
  class DeclarationReflection ()
    extends typingsSlinky.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
  
  @js.native
  class ParameterReflection ()
    extends typingsSlinky.typedoc.distLibModelsReflectionsParameterMod.ParameterReflection
  
  @js.native
  class ProjectReflection protected ()
    extends typingsSlinky.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @js.native
  abstract class Reflection protected ()
    extends typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @js.native
  class SignatureReflection ()
    extends typingsSlinky.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection
  
  @js.native
  class TypeParameterReflection protected ()
    extends typingsSlinky.typedoc.distLibModelsReflectionsTypeDashParameterMod.TypeParameterReflection {
    def this(`type`: TypeParameterType) = this()
    def this(
      `type`: TypeParameterType,
      parent: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  def splitUnquotedString(input: String, delimiter: String): js.Array[String] = js.native
  @js.native
  object ReflectionFlag extends js.Object {
    /* 2048 */ val Abstract: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Abstract with Double = js.native
    /* 4096 */ val Const: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Const with Double = js.native
    /* 1024 */ val ConstructorProperty: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.ConstructorProperty with Double = js.native
    /* 256 */ val DefaultValue: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.DefaultValue with Double = js.native
    /* 32 */ val ExportAssignment: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.ExportAssignment with Double = js.native
    /* 16 */ val Exported: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Exported with Double = js.native
    /* 64 */ val External: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.External with Double = js.native
    /* 8192 */ val Let: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Let with Double = js.native
    /* 0 */ val None: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.None with Double = js.native
    /* 128 */ val Optional: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Optional with Double = js.native
    /* 1 */ val Private: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Private with Double = js.native
    /* 2 */ val Protected: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Protected with Double = js.native
    /* 4 */ val Public: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Public with Double = js.native
    /* 512 */ val Rest: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Rest with Double = js.native
    /* 8 */ val Static: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Static with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag with Double
      ] = js.native
  }
  
  @js.native
  object ReflectionKind extends js.Object {
    /* 262144 */ val Accessor: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Accessor with Double = js.native
    /* 4096 */ val CallSignature: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.CallSignature with Double = js.native
    /* 128 */ val Class: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Class with Double = js.native
    /* 8654336 */ val ClassMember: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.ClassMember with Double = js.native
    /* 384 */ val ClassOrInterface: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.ClassOrInterface with Double = js.native
    /* 512 */ val Constructor: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Constructor with Double = js.native
    /* 16384 */ val ConstructorSignature: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.ConstructorSignature with Double = js.native
    /* 4 */ val Enum: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Enum with Double = js.native
    /* 16 */ val EnumMember: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.EnumMember with Double = js.native
    /* 8388608 */ val Event: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Event with Double = js.native
    /* 1 */ val ExternalModule: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.ExternalModule with Double = js.native
    /* 64 */ val Function: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Function with Double = js.native
    /* 2112 */ val FunctionOrMethod: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.FunctionOrMethod with Double = js.native
    /* 524288 */ val GetSignature: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.GetSignature with Double = js.native
    /* 0 */ val Global: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Global with Double = js.native
    /* 8192 */ val IndexSignature: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.IndexSignature with Double = js.native
    /* 256 */ val Interface: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Interface with Double = js.native
    /* 2048 */ val Method: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Method with Double = js.native
    /* 2 */ val Module: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Module with Double = js.native
    /* 2097152 */ val ObjectLiteral: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.ObjectLiteral with Double = js.native
    /* 32768 */ val Parameter: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Parameter with Double = js.native
    /* 1024 */ val Property: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Property with Double = js.native
    /* 1048576 */ val SetSignature: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SetSignature with Double = js.native
    /* 3 */ val SomeModule: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SomeModule with Double = js.native
    /* 1601536 */ val SomeSignature: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SomeSignature with Double = js.native
    /* 4391168 */ val SomeType: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SomeType with Double = js.native
    /* 2097248 */ val SomeValue: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SomeValue with Double = js.native
    /* 4194304 */ val TypeAlias: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.TypeAlias with Double = js.native
    /* 65536 */ val TypeLiteral: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.TypeLiteral with Double = js.native
    /* 131072 */ val TypeParameter: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.TypeParameter with Double = js.native
    /* 32 */ val Variable: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Variable with Double = js.native
    /* 1056 */ val VariableOrProperty: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.VariableOrProperty with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind with Double
      ] = js.native
  }
  
  @js.native
  object TraverseProperty extends js.Object {
    /* 0 */ val Children: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Children with Double = js.native
    /* 6 */ val GetSignature: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.GetSignature with Double = js.native
    /* 5 */ val IndexSignature: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.IndexSignature with Double = js.native
    /* 1 */ val Parameters: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Parameters with Double = js.native
    /* 7 */ val SetSignature: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.SetSignature with Double = js.native
    /* 4 */ val Signatures: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Signatures with Double = js.native
    /* 2 */ val TypeLiteral: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeLiteral with Double = js.native
    /* 3 */ val TypeParameter: typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeParameter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty with Double
      ] = js.native
  }
  
}

