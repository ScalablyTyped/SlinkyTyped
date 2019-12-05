package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSymbol")
@js.native
class PullSymbol protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.PullSymbol {
  def this(name: String, declKind: typingsSlinky.typescriptDashServices.TypeScript.PullElementKind) = this()
}

/* static members */
@JSImport("typescript-services", "PullSymbol")
@js.native
object PullSymbol extends js.Object {
  def _isExternalModuleReferenceAlias(aliasSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullTypeAliasSymbol): Boolean = js.native
  /* private */ def getDefaultConstructorSymbolForDocComments(classSymbol: js.Any): js.Any = js.native
  def getIsExternallyVisible(
    symbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    fromIsExternallyVisibleSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullSymbol]
  ): Boolean = js.native
  def getTypeParameterString(typars: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol]): String = js.native
  def getTypeParameterString(
    typars: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol
  ): String = js.native
  def getTypeParameterString(
    typars: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    useContraintInName: Boolean
  ): String = js.native
  def getTypeParameterStringEx(typeParameters: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol]): typingsSlinky.typescriptDashServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol
  ): typingsSlinky.typescriptDashServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean
  ): typingsSlinky.typescriptDashServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typingsSlinky.typescriptDashServices.TypeScript.MemberNameArray = js.native
  /* private */ def unqualifiedNameReferencesDifferentSymbolInScope(symbol: js.Any, scopePath: js.Any, endScopePathIndex: js.Any): js.Any = js.native
}

