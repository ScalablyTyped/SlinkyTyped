package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.modelsTypesMod.TypeParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections", JSImport.Namespace)
@js.native
object reflectionsMod extends js.Object {
  @js.native
  class ContainerReflection ()
    extends typingsSlinky.typedoc.containerMod.ContainerReflection
  
  @js.native
  class DeclarationReflection ()
    extends typingsSlinky.typedoc.reflectionsDeclarationMod.DeclarationReflection
  
  @js.native
  class ParameterReflection ()
    extends typingsSlinky.typedoc.reflectionsParameterMod.ParameterReflection
  
  @js.native
  class ProjectReflection protected ()
    extends typingsSlinky.typedoc.projectMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @js.native
  abstract class Reflection protected ()
    extends typingsSlinky.typedoc.abstractMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typingsSlinky.typedoc.abstractMod.Reflection) = this()
  }
  
  @js.native
  class SignatureReflection ()
    extends typingsSlinky.typedoc.reflectionsSignatureMod.SignatureReflection
  
  @js.native
  class TypeParameterReflection protected ()
    extends typingsSlinky.typedoc.reflectionsTypeParameterMod.TypeParameterReflection {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: typingsSlinky.typedoc.abstractMod.Reflection) = this()
  }
  
  def splitUnquotedString(input: String, delimiter: String): js.Array[String] = js.native
  @js.native
  object ReflectionFlag extends js.Object {
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
    /* 512 */ val Rest: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Rest with Double = js.native
    /* 8 */ val Static: typingsSlinky.typedoc.abstractMod.ReflectionFlag.Static with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.abstractMod.ReflectionFlag with Double] = js.native
  }
  
  @js.native
  object ReflectionKind extends js.Object {
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
    /* 1 */ val ExternalModule: typingsSlinky.typedoc.abstractMod.ReflectionKind.ExternalModule with Double = js.native
    /* 64 */ val Function: typingsSlinky.typedoc.abstractMod.ReflectionKind.Function with Double = js.native
    /* 2112 */ val FunctionOrMethod: typingsSlinky.typedoc.abstractMod.ReflectionKind.FunctionOrMethod with Double = js.native
    /* 524288 */ val GetSignature: typingsSlinky.typedoc.abstractMod.ReflectionKind.GetSignature with Double = js.native
    /* 0 */ val Global: typingsSlinky.typedoc.abstractMod.ReflectionKind.Global with Double = js.native
    /* 8192 */ val IndexSignature: typingsSlinky.typedoc.abstractMod.ReflectionKind.IndexSignature with Double = js.native
    /* 256 */ val Interface: typingsSlinky.typedoc.abstractMod.ReflectionKind.Interface with Double = js.native
    /* 2048 */ val Method: typingsSlinky.typedoc.abstractMod.ReflectionKind.Method with Double = js.native
    /* 2 */ val Module: typingsSlinky.typedoc.abstractMod.ReflectionKind.Module with Double = js.native
    /* 2097152 */ val ObjectLiteral: typingsSlinky.typedoc.abstractMod.ReflectionKind.ObjectLiteral with Double = js.native
    /* 32768 */ val Parameter: typingsSlinky.typedoc.abstractMod.ReflectionKind.Parameter with Double = js.native
    /* 1024 */ val Property: typingsSlinky.typedoc.abstractMod.ReflectionKind.Property with Double = js.native
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
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.abstractMod.ReflectionKind with Double] = js.native
  }
  
  @js.native
  object TraverseProperty extends js.Object {
    /* 0 */ val Children: typingsSlinky.typedoc.abstractMod.TraverseProperty.Children with Double = js.native
    /* 6 */ val GetSignature: typingsSlinky.typedoc.abstractMod.TraverseProperty.GetSignature with Double = js.native
    /* 5 */ val IndexSignature: typingsSlinky.typedoc.abstractMod.TraverseProperty.IndexSignature with Double = js.native
    /* 1 */ val Parameters: typingsSlinky.typedoc.abstractMod.TraverseProperty.Parameters with Double = js.native
    /* 7 */ val SetSignature: typingsSlinky.typedoc.abstractMod.TraverseProperty.SetSignature with Double = js.native
    /* 4 */ val Signatures: typingsSlinky.typedoc.abstractMod.TraverseProperty.Signatures with Double = js.native
    /* 2 */ val TypeLiteral: typingsSlinky.typedoc.abstractMod.TraverseProperty.TypeLiteral with Double = js.native
    /* 3 */ val TypeParameter: typingsSlinky.typedoc.abstractMod.TraverseProperty.TypeParameter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.typedoc.abstractMod.TraverseProperty with Double] = js.native
  }
  
}

