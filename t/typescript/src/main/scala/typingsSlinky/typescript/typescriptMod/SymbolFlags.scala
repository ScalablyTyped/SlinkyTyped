package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolFlags extends js.Object

@JSImport("typescript", "SymbolFlags")
@js.native
object SymbolFlags extends js.Object {
  @js.native
  sealed trait Accessor extends SymbolFlags
  
  @js.native
  sealed trait Alias extends SymbolFlags
  
  @js.native
  sealed trait AliasExcludes extends SymbolFlags
  
  @js.native
  sealed trait Assignment extends SymbolFlags
  
  @js.native
  sealed trait BlockScoped extends SymbolFlags
  
  @js.native
  sealed trait BlockScopedVariable extends SymbolFlags
  
  @js.native
  sealed trait BlockScopedVariableExcludes extends SymbolFlags
  
  @js.native
  sealed trait Class extends SymbolFlags
  
  @js.native
  sealed trait ClassExcludes extends SymbolFlags
  
  @js.native
  sealed trait ClassMember extends SymbolFlags
  
  @js.native
  sealed trait ConstEnum extends SymbolFlags
  
  @js.native
  sealed trait ConstEnumExcludes extends SymbolFlags
  
  @js.native
  sealed trait Constructor extends SymbolFlags
  
  @js.native
  sealed trait Enum extends SymbolFlags
  
  @js.native
  sealed trait EnumMember extends SymbolFlags
  
  @js.native
  sealed trait EnumMemberExcludes extends SymbolFlags
  
  @js.native
  sealed trait ExportHasLocal extends SymbolFlags
  
  @js.native
  sealed trait ExportStar extends SymbolFlags
  
  @js.native
  sealed trait ExportValue extends SymbolFlags
  
  @js.native
  sealed trait Function extends SymbolFlags
  
  @js.native
  sealed trait FunctionExcludes extends SymbolFlags
  
  @js.native
  sealed trait FunctionScopedVariable extends SymbolFlags
  
  @js.native
  sealed trait FunctionScopedVariableExcludes extends SymbolFlags
  
  @js.native
  sealed trait GetAccessor extends SymbolFlags
  
  @js.native
  sealed trait GetAccessorExcludes extends SymbolFlags
  
  @js.native
  sealed trait Interface extends SymbolFlags
  
  @js.native
  sealed trait InterfaceExcludes extends SymbolFlags
  
  @js.native
  sealed trait Method extends SymbolFlags
  
  @js.native
  sealed trait MethodExcludes extends SymbolFlags
  
  @js.native
  sealed trait Module extends SymbolFlags
  
  @js.native
  sealed trait ModuleExports extends SymbolFlags
  
  @js.native
  sealed trait ModuleMember extends SymbolFlags
  
  @js.native
  sealed trait Namespace extends SymbolFlags
  
  @js.native
  sealed trait NamespaceModule extends SymbolFlags
  
  @js.native
  sealed trait NamespaceModuleExcludes extends SymbolFlags
  
  @js.native
  sealed trait None extends SymbolFlags
  
  @js.native
  sealed trait ObjectLiteral extends SymbolFlags
  
  @js.native
  sealed trait Optional extends SymbolFlags
  
  @js.native
  sealed trait ParameterExcludes extends SymbolFlags
  
  @js.native
  sealed trait Property extends SymbolFlags
  
  @js.native
  sealed trait PropertyExcludes extends SymbolFlags
  
  @js.native
  sealed trait PropertyOrAccessor extends SymbolFlags
  
  @js.native
  sealed trait Prototype extends SymbolFlags
  
  @js.native
  sealed trait RegularEnum extends SymbolFlags
  
  @js.native
  sealed trait RegularEnumExcludes extends SymbolFlags
  
  @js.native
  sealed trait SetAccessor extends SymbolFlags
  
  @js.native
  sealed trait SetAccessorExcludes extends SymbolFlags
  
  @js.native
  sealed trait Signature extends SymbolFlags
  
  @js.native
  sealed trait Transient extends SymbolFlags
  
  @js.native
  sealed trait Type extends SymbolFlags
  
  @js.native
  sealed trait TypeAlias extends SymbolFlags
  
  @js.native
  sealed trait TypeAliasExcludes extends SymbolFlags
  
  @js.native
  sealed trait TypeLiteral extends SymbolFlags
  
  @js.native
  sealed trait TypeParameter extends SymbolFlags
  
  @js.native
  sealed trait TypeParameterExcludes extends SymbolFlags
  
  @js.native
  sealed trait Value extends SymbolFlags
  
  @js.native
  sealed trait ValueModule extends SymbolFlags
  
  @js.native
  sealed trait ValueModuleExcludes extends SymbolFlags
  
  @js.native
  sealed trait Variable extends SymbolFlags
  
  /* 98304 */ val Accessor: typingsSlinky.typescript.typescriptMod.SymbolFlags.Accessor with Double = js.native
  /* 2097152 */ val Alias: typingsSlinky.typescript.typescriptMod.SymbolFlags.Alias with Double = js.native
  /* 2097152 */ val AliasExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.AliasExcludes with Double = js.native
  /* 67108864 */ val Assignment: typingsSlinky.typescript.typescriptMod.SymbolFlags.Assignment with Double = js.native
  /* 418 */ val BlockScoped: typingsSlinky.typescript.typescriptMod.SymbolFlags.BlockScoped with Double = js.native
  /* 2 */ val BlockScopedVariable: typingsSlinky.typescript.typescriptMod.SymbolFlags.BlockScopedVariable with Double = js.native
  /* 111551 */ val BlockScopedVariableExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.BlockScopedVariableExcludes with Double = js.native
  /* 32 */ val Class: typingsSlinky.typescript.typescriptMod.SymbolFlags.Class with Double = js.native
  /* 899503 */ val ClassExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.ClassExcludes with Double = js.native
  /* 106500 */ val ClassMember: typingsSlinky.typescript.typescriptMod.SymbolFlags.ClassMember with Double = js.native
  /* 128 */ val ConstEnum: typingsSlinky.typescript.typescriptMod.SymbolFlags.ConstEnum with Double = js.native
  /* 899967 */ val ConstEnumExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.ConstEnumExcludes with Double = js.native
  /* 16384 */ val Constructor: typingsSlinky.typescript.typescriptMod.SymbolFlags.Constructor with Double = js.native
  /* 384 */ val Enum: typingsSlinky.typescript.typescriptMod.SymbolFlags.Enum with Double = js.native
  /* 8 */ val EnumMember: typingsSlinky.typescript.typescriptMod.SymbolFlags.EnumMember with Double = js.native
  /* 900095 */ val EnumMemberExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.EnumMemberExcludes with Double = js.native
  /* 944 */ val ExportHasLocal: typingsSlinky.typescript.typescriptMod.SymbolFlags.ExportHasLocal with Double = js.native
  /* 8388608 */ val ExportStar: typingsSlinky.typescript.typescriptMod.SymbolFlags.ExportStar with Double = js.native
  /* 1048576 */ val ExportValue: typingsSlinky.typescript.typescriptMod.SymbolFlags.ExportValue with Double = js.native
  /* 16 */ val Function: typingsSlinky.typescript.typescriptMod.SymbolFlags.Function with Double = js.native
  /* 110991 */ val FunctionExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.FunctionExcludes with Double = js.native
  /* 1 */ val FunctionScopedVariable: typingsSlinky.typescript.typescriptMod.SymbolFlags.FunctionScopedVariable with Double = js.native
  /* 111550 */ val FunctionScopedVariableExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.FunctionScopedVariableExcludes with Double = js.native
  /* 32768 */ val GetAccessor: typingsSlinky.typescript.typescriptMod.SymbolFlags.GetAccessor with Double = js.native
  /* 46015 */ val GetAccessorExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.GetAccessorExcludes with Double = js.native
  /* 64 */ val Interface: typingsSlinky.typescript.typescriptMod.SymbolFlags.Interface with Double = js.native
  /* 788872 */ val InterfaceExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.InterfaceExcludes with Double = js.native
  /* 8192 */ val Method: typingsSlinky.typescript.typescriptMod.SymbolFlags.Method with Double = js.native
  /* 103359 */ val MethodExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.MethodExcludes with Double = js.native
  /* 1536 */ val Module: typingsSlinky.typescript.typescriptMod.SymbolFlags.Module with Double = js.native
  /* 134217728 */ val ModuleExports: typingsSlinky.typescript.typescriptMod.SymbolFlags.ModuleExports with Double = js.native
  /* 2623475 */ val ModuleMember: typingsSlinky.typescript.typescriptMod.SymbolFlags.ModuleMember with Double = js.native
  /* 1920 */ val Namespace: typingsSlinky.typescript.typescriptMod.SymbolFlags.Namespace with Double = js.native
  /* 1024 */ val NamespaceModule: typingsSlinky.typescript.typescriptMod.SymbolFlags.NamespaceModule with Double = js.native
  /* 0 */ val NamespaceModuleExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.NamespaceModuleExcludes with Double = js.native
  /* 0 */ val None: typingsSlinky.typescript.typescriptMod.SymbolFlags.None with Double = js.native
  /* 4096 */ val ObjectLiteral: typingsSlinky.typescript.typescriptMod.SymbolFlags.ObjectLiteral with Double = js.native
  /* 16777216 */ val Optional: typingsSlinky.typescript.typescriptMod.SymbolFlags.Optional with Double = js.native
  /* 111551 */ val ParameterExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.ParameterExcludes with Double = js.native
  /* 4 */ val Property: typingsSlinky.typescript.typescriptMod.SymbolFlags.Property with Double = js.native
  /* 0 */ val PropertyExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.PropertyExcludes with Double = js.native
  /* 98308 */ val PropertyOrAccessor: typingsSlinky.typescript.typescriptMod.SymbolFlags.PropertyOrAccessor with Double = js.native
  /* 4194304 */ val Prototype: typingsSlinky.typescript.typescriptMod.SymbolFlags.Prototype with Double = js.native
  /* 256 */ val RegularEnum: typingsSlinky.typescript.typescriptMod.SymbolFlags.RegularEnum with Double = js.native
  /* 899327 */ val RegularEnumExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.RegularEnumExcludes with Double = js.native
  /* 65536 */ val SetAccessor: typingsSlinky.typescript.typescriptMod.SymbolFlags.SetAccessor with Double = js.native
  /* 78783 */ val SetAccessorExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.SetAccessorExcludes with Double = js.native
  /* 131072 */ val Signature: typingsSlinky.typescript.typescriptMod.SymbolFlags.Signature with Double = js.native
  /* 33554432 */ val Transient: typingsSlinky.typescript.typescriptMod.SymbolFlags.Transient with Double = js.native
  /* 788968 */ val Type: typingsSlinky.typescript.typescriptMod.SymbolFlags.Type with Double = js.native
  /* 524288 */ val TypeAlias: typingsSlinky.typescript.typescriptMod.SymbolFlags.TypeAlias with Double = js.native
  /* 788968 */ val TypeAliasExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.TypeAliasExcludes with Double = js.native
  /* 2048 */ val TypeLiteral: typingsSlinky.typescript.typescriptMod.SymbolFlags.TypeLiteral with Double = js.native
  /* 262144 */ val TypeParameter: typingsSlinky.typescript.typescriptMod.SymbolFlags.TypeParameter with Double = js.native
  /* 526824 */ val TypeParameterExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.TypeParameterExcludes with Double = js.native
  /* 111551 */ val Value: typingsSlinky.typescript.typescriptMod.SymbolFlags.Value with Double = js.native
  /* 512 */ val ValueModule: typingsSlinky.typescript.typescriptMod.SymbolFlags.ValueModule with Double = js.native
  /* 110735 */ val ValueModuleExcludes: typingsSlinky.typescript.typescriptMod.SymbolFlags.ValueModuleExcludes with Double = js.native
  /* 3 */ val Variable: typingsSlinky.typescript.typescriptMod.SymbolFlags.Variable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolFlags with Double] = js.native
}

