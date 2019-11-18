package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeBuilderFlags extends js.Object

@JSImport("typescript", "NodeBuilderFlags")
@js.native
object NodeBuilderFlags extends js.Object {
  @js.native
  sealed trait AllowAnonymousIdentifier extends NodeBuilderFlags
  
  @js.native
  sealed trait AllowEmptyIndexInfoType extends NodeBuilderFlags
  
  @js.native
  sealed trait AllowEmptyTuple extends NodeBuilderFlags
  
  @js.native
  sealed trait AllowEmptyUnionOrIntersection extends NodeBuilderFlags
  
  @js.native
  sealed trait AllowNodeModulesRelativePaths extends NodeBuilderFlags
  
  @js.native
  sealed trait AllowQualifedNameInPlaceOfIdentifier extends NodeBuilderFlags
  
  @js.native
  sealed trait AllowThisInObjectLiteral extends NodeBuilderFlags
  
  @js.native
  sealed trait AllowUniqueESSymbolType extends NodeBuilderFlags
  
  @js.native
  sealed trait ForbidIndexedAccessSymbolReferences extends NodeBuilderFlags
  
  @js.native
  sealed trait GenerateNamesForShadowedTypeParams extends NodeBuilderFlags
  
  @js.native
  sealed trait IgnoreErrors extends NodeBuilderFlags
  
  @js.native
  sealed trait InInitialEntityName extends NodeBuilderFlags
  
  @js.native
  sealed trait InObjectTypeLiteral extends NodeBuilderFlags
  
  @js.native
  sealed trait InReverseMappedType extends NodeBuilderFlags
  
  @js.native
  sealed trait InTypeAlias extends NodeBuilderFlags
  
  @js.native
  sealed trait MultilineObjectLiterals extends NodeBuilderFlags
  
  @js.native
  sealed trait NoTruncation extends NodeBuilderFlags
  
  @js.native
  sealed trait None extends NodeBuilderFlags
  
  @js.native
  sealed trait OmitParameterModifiers extends NodeBuilderFlags
  
  @js.native
  sealed trait SuppressAnyReturnType extends NodeBuilderFlags
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope extends NodeBuilderFlags
  
  @js.native
  sealed trait UseFullyQualifiedType extends NodeBuilderFlags
  
  @js.native
  sealed trait UseOnlyExternalAliasing extends NodeBuilderFlags
  
  @js.native
  sealed trait UseStructuralFallback extends NodeBuilderFlags
  
  @js.native
  sealed trait UseTypeOfFunction extends NodeBuilderFlags
  
  @js.native
  sealed trait WriteArrayAsGenericType extends NodeBuilderFlags
  
  @js.native
  sealed trait WriteClassExpressionAsTypeLiteral extends NodeBuilderFlags
  
  @js.native
  sealed trait WriteTypeArgumentsOfSignature extends NodeBuilderFlags
  
  @js.native
  sealed trait WriteTypeParametersInQualifiedName extends NodeBuilderFlags
  
  /* 131072 */ val AllowAnonymousIdentifier: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.AllowAnonymousIdentifier with Double = js.native
  /* 2097152 */ val AllowEmptyIndexInfoType: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.AllowEmptyIndexInfoType with Double = js.native
  /* 524288 */ val AllowEmptyTuple: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.AllowEmptyTuple with Double = js.native
  /* 262144 */ val AllowEmptyUnionOrIntersection: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.AllowEmptyUnionOrIntersection with Double = js.native
  /* 67108864 */ val AllowNodeModulesRelativePaths: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.AllowNodeModulesRelativePaths with Double = js.native
  /* 65536 */ val AllowQualifedNameInPlaceOfIdentifier: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.AllowQualifedNameInPlaceOfIdentifier with Double = js.native
  /* 32768 */ val AllowThisInObjectLiteral: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.AllowThisInObjectLiteral with Double = js.native
  /* 1048576 */ val AllowUniqueESSymbolType: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.AllowUniqueESSymbolType with Double = js.native
  /* 16 */ val ForbidIndexedAccessSymbolReferences: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.ForbidIndexedAccessSymbolReferences with Double = js.native
  /* 4 */ val GenerateNamesForShadowedTypeParams: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.GenerateNamesForShadowedTypeParams with Double = js.native
  /* 70221824 */ val IgnoreErrors: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.IgnoreErrors with Double = js.native
  /* 16777216 */ val InInitialEntityName: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.InInitialEntityName with Double = js.native
  /* 4194304 */ val InObjectTypeLiteral: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.InObjectTypeLiteral with Double = js.native
  /* 33554432 */ val InReverseMappedType: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.InReverseMappedType with Double = js.native
  /* 8388608 */ val InTypeAlias: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.InTypeAlias with Double = js.native
  /* 1024 */ val MultilineObjectLiterals: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.MultilineObjectLiterals with Double = js.native
  /* 1 */ val NoTruncation: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.NoTruncation with Double = js.native
  /* 0 */ val None: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.None with Double = js.native
  /* 8192 */ val OmitParameterModifiers: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.OmitParameterModifiers with Double = js.native
  /* 256 */ val SuppressAnyReturnType: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.SuppressAnyReturnType with Double = js.native
  /* 16384 */ val UseAliasDefinedOutsideCurrentScope: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.UseAliasDefinedOutsideCurrentScope with Double = js.native
  /* 64 */ val UseFullyQualifiedType: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.UseFullyQualifiedType with Double = js.native
  /* 128 */ val UseOnlyExternalAliasing: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.UseOnlyExternalAliasing with Double = js.native
  /* 8 */ val UseStructuralFallback: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.UseStructuralFallback with Double = js.native
  /* 4096 */ val UseTypeOfFunction: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.UseTypeOfFunction with Double = js.native
  /* 2 */ val WriteArrayAsGenericType: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.WriteArrayAsGenericType with Double = js.native
  /* 2048 */ val WriteClassExpressionAsTypeLiteral: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.WriteClassExpressionAsTypeLiteral with Double = js.native
  /* 32 */ val WriteTypeArgumentsOfSignature: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.WriteTypeArgumentsOfSignature with Double = js.native
  /* 512 */ val WriteTypeParametersInQualifiedName: typingsSlinky.typescript.typescriptMod.NodeBuilderFlags.WriteTypeParametersInQualifiedName with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeBuilderFlags with Double] = js.native
}

