package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import typingsSlinky.typescriptServices.anon.AllSignatures
import typingsSlinky.typescriptServices.anon.Getter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullHelpers")
@js.native
object PullHelpers extends js.Object {
  @js.native
  class OtherPullDeclsWalker ()
    extends typingsSlinky.typescriptServices.TypeScript.PullHelpers.OtherPullDeclsWalker {
    /* CompleteClass */
    override var currentlyWalkingOtherDecls: js.Any = js.native
    /* CompleteClass */
    override def walkOtherPullDecls(
      currentDecl: typingsSlinky.typescriptServices.TypeScript.PullDecl,
      otherDecls: js.Array[typingsSlinky.typescriptServices.TypeScript.PullDecl],
      callBack: js.Function1[/* otherDecl */ typingsSlinky.typescriptServices.TypeScript.PullDecl, Unit]
    ): Unit = js.native
  }
  
  def diagnosticFromDecl(decl: typingsSlinky.typescriptServices.TypeScript.PullDecl, diagnosticKey: String): typingsSlinky.typescriptServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typingsSlinky.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ): typingsSlinky.typescriptServices.TypeScript.Diagnostic = js.native
  def diagnosticFromDecl(
    decl: typingsSlinky.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typingsSlinky.typescriptServices.TypeScript.Location]
  ): typingsSlinky.typescriptServices.TypeScript.Diagnostic = js.native
  def getAccessorSymbol(
    getterOrSetter: typingsSlinky.typescriptServices.TypeScript.AST,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain
  ): typingsSlinky.typescriptServices.TypeScript.PullAccessorSymbol = js.native
  def getGetterAndSetterFunction(
    funcDecl: typingsSlinky.typescriptServices.TypeScript.AST,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain
  ): Getter = js.native
  def getRootType(`type`: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol): typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol = js.native
  def getSignatureForFuncDecl(functionDecl: typingsSlinky.typescriptServices.TypeScript.PullDecl): AllSignatures = js.native
  def isExportedSymbolInClodule(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def isNameNumeric(name: String): Boolean = js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol,
    scopeSymbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol
  ): Boolean = js.native
  def isSymbolLocal(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def resolveDeclaredSymbolToUseType(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  def symbolIsEnum(source: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def symbolIsModule(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  def typeSymbolsAreIdentical(
    a: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    b: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = js.native
}

