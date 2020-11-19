package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ISyntaxTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Indentation")
@js.native
object Indentation extends js.Object {
  
  def columnForEndOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  def columnForPositionInString(input: String, position: Double, options: FormattingOptions): Double = js.native
  
  def columnForStartOfFirstTokenInLineContainingToken(
    token: ISyntaxToken,
    syntaxInformationMap: typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  def columnForStartOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  def firstNonWhitespacePosition(value: String): Double = js.native
  
  def indentationString(column: Double, options: FormattingOptions): String = js.native
  
  def indentationTrivia(column: Double, options: FormattingOptions): ISyntaxTrivia = js.native
}
