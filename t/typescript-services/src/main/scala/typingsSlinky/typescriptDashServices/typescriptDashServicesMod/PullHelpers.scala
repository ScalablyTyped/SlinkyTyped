package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.Anon_AllSignatures
import typingsSlinky.typescriptDashServices.Anon_Getter
import typingsSlinky.typescriptDashServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullHelpers")
@js.native
object PullHelpers extends js.Object {
  @js.native
  class OtherPullDeclsWalker ()
    extends typingsSlinky.typescriptDashServices.TypeScript.PullHelpers.OtherPullDeclsWalker
  
  def diagnosticFromDecl(decl: typingsSlinky.typescriptDashServices.TypeScript.PullDecl, diagnosticKey: String): typingsSlinky.typescriptDashServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typingsSlinky.typescriptDashServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ): typingsSlinky.typescriptDashServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typingsSlinky.typescriptDashServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typingsSlinky.typescriptDashServices.TypeScript.Location]
  ): typingsSlinky.typescriptDashServices.TypeScript.Diagnostic = js.native
  def getAccessorSymbol(
    getterOrSetter: typingsSlinky.typescriptDashServices.TypeScript.AST,
    semanticInfoChain: typingsSlinky.typescriptDashServices.TypeScript.SemanticInfoChain
  ): typingsSlinky.typescriptDashServices.TypeScript.PullAccessorSymbol = js.native
  def getGetterAndSetterFunction(
    funcDecl: typingsSlinky.typescriptDashServices.TypeScript.AST,
    semanticInfoChain: typingsSlinky.typescriptDashServices.TypeScript.SemanticInfoChain
  ): Anon_Getter = js.native
  def getRootType(`type`: typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol): typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol = js.native
  def getSignatureForFuncDecl(functionDecl: typingsSlinky.typescriptDashServices.TypeScript.PullDecl): Anon_AllSignatures = js.native
  def isExportedSymbolInClodule(symbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol): Boolean = js.native
  def isNameNumeric(name: String): Boolean = js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    scopeSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol
  ): Boolean = js.native
  def isSymbolLocal(symbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol): Boolean = js.native
  def resolveDeclaredSymbolToUseType(symbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol): Unit = js.native
  def symbolIsEnum(source: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol): Boolean = js.native
  def symbolIsModule(symbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol): Boolean = js.native
  def typeSymbolsAreIdentical(
    a: typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol,
    b: typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = js.native
}

