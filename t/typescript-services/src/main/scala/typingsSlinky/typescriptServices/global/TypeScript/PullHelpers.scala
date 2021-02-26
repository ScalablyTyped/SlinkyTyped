package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.PullHelpers.PullTypeSymbolStructureWalker
import typingsSlinky.typescriptServices.anon.AllSignatures
import typingsSlinky.typescriptServices.anon.Getter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullHelpers {
  
  @JSGlobal("TypeScript.PullHelpers.OtherPullDeclsWalker")
  @js.native
  class OtherPullDeclsWalker ()
    extends typingsSlinky.typescriptServices.TypeScript.PullHelpers.OtherPullDeclsWalker
  
  @JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(decl: typingsSlinky.typescriptServices.TypeScript.PullDecl, diagnosticKey: String): typingsSlinky.typescriptServices.TypeScript.Diagnostic = js.native
  @JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(
    decl: typingsSlinky.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.UndefOr[scala.Nothing],
    additionalLocations: js.Array[typingsSlinky.typescriptServices.TypeScript.Location]
  ): typingsSlinky.typescriptServices.TypeScript.Diagnostic = js.native
  @JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(
    decl: typingsSlinky.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ): typingsSlinky.typescriptServices.TypeScript.Diagnostic = js.native
  @JSGlobal("TypeScript.PullHelpers.diagnosticFromDecl")
  @js.native
  def diagnosticFromDecl(
    decl: typingsSlinky.typescriptServices.TypeScript.PullDecl,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typingsSlinky.typescriptServices.TypeScript.Location]
  ): typingsSlinky.typescriptServices.TypeScript.Diagnostic = js.native
  
  @JSGlobal("TypeScript.PullHelpers.getAccessorSymbol")
  @js.native
  def getAccessorSymbol(
    getterOrSetter: typingsSlinky.typescriptServices.TypeScript.AST,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain
  ): typingsSlinky.typescriptServices.TypeScript.PullAccessorSymbol = js.native
  
  @JSGlobal("TypeScript.PullHelpers.getGetterAndSetterFunction")
  @js.native
  def getGetterAndSetterFunction(
    funcDecl: typingsSlinky.typescriptServices.TypeScript.AST,
    semanticInfoChain: typingsSlinky.typescriptServices.TypeScript.SemanticInfoChain
  ): Getter = js.native
  
  @JSGlobal("TypeScript.PullHelpers.getRootType")
  @js.native
  def getRootType(`type`: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol): typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol = js.native
  
  @JSGlobal("TypeScript.PullHelpers.getSignatureForFuncDecl")
  @js.native
  def getSignatureForFuncDecl(functionDecl: typingsSlinky.typescriptServices.TypeScript.PullDecl): AllSignatures = js.native
  
  @JSGlobal("TypeScript.PullHelpers.isExportedSymbolInClodule")
  @js.native
  def isExportedSymbolInClodule(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.isNameNumeric")
  @js.native
  def isNameNumeric(name: String): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.isSymbolDeclaredInScopeChain")
  @js.native
  def isSymbolDeclaredInScopeChain(
    symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol,
    scopeSymbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol
  ): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.isSymbolLocal")
  @js.native
  def isSymbolLocal(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.resolveDeclaredSymbolToUseType")
  @js.native
  def resolveDeclaredSymbolToUseType(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  
  @JSGlobal("TypeScript.PullHelpers.symbolIsEnum")
  @js.native
  def symbolIsEnum(source: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.symbolIsModule")
  @js.native
  def symbolIsModule(symbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.typeSymbolsAreIdentical")
  @js.native
  def typeSymbolsAreIdentical(
    a: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    b: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  
  @JSGlobal("TypeScript.PullHelpers.walkPullTypeSymbolStructure")
  @js.native
  def walkPullTypeSymbolStructure(
    typeSymbol: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol,
    walker: PullTypeSymbolStructureWalker
  ): Unit = js.native
}
