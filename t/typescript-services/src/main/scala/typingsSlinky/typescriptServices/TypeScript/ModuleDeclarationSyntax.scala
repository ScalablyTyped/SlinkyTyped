package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleDeclarationSyntax extends SyntaxNode {
  
  var closeBraceToken: ISyntaxToken = js.native
  
  var modifiers: ISyntaxList = js.native
  
  var moduleElements: ISyntaxList = js.native
  
  var moduleKeyword: ISyntaxToken = js.native
  
  var name: INameSyntax = js.native
  
  var openBraceToken: ISyntaxToken = js.native
  
  var stringLiteral: ISyntaxToken = js.native
  
  def update(
    modifiers: ISyntaxList,
    moduleKeyword: ISyntaxToken,
    name: INameSyntax,
    stringLiteral: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    moduleElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ModuleDeclarationSyntax = js.native
  
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): ModuleDeclarationSyntax = js.native
  
  def withModifier(modifier: ISyntaxToken): ModuleDeclarationSyntax = js.native
  
  def withModifiers(modifiers: ISyntaxList): ModuleDeclarationSyntax = js.native
  
  def withModuleElement(moduleElement: IModuleElementSyntax): ModuleDeclarationSyntax = js.native
  
  def withModuleElements(moduleElements: ISyntaxList): ModuleDeclarationSyntax = js.native
  
  def withModuleKeyword(moduleKeyword: ISyntaxToken): ModuleDeclarationSyntax = js.native
  
  def withName(name: INameSyntax): ModuleDeclarationSyntax = js.native
  
  def withOpenBraceToken(openBraceToken: ISyntaxToken): ModuleDeclarationSyntax = js.native
  
  def withStringLiteral(stringLiteral: ISyntaxToken): ModuleDeclarationSyntax = js.native
}
