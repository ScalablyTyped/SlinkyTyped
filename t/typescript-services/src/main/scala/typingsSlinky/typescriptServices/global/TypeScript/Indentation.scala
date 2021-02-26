package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.FormattingOptions
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.ISyntaxTrivia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Indentation {
  
  @JSGlobal("TypeScript.Indentation.columnForEndOfToken")
  @js.native
  def columnForEndOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  @JSGlobal("TypeScript.Indentation.columnForPositionInString")
  @js.native
  def columnForPositionInString(input: String, position: Double, options: FormattingOptions): Double = js.native
  
  @JSGlobal("TypeScript.Indentation.columnForStartOfFirstTokenInLineContainingToken")
  @js.native
  def columnForStartOfFirstTokenInLineContainingToken(
    token: ISyntaxToken,
    syntaxInformationMap: typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  @JSGlobal("TypeScript.Indentation.columnForStartOfToken")
  @js.native
  def columnForStartOfToken(
    token: ISyntaxToken,
    syntaxInformationMap: typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap,
    options: FormattingOptions
  ): Double = js.native
  
  @JSGlobal("TypeScript.Indentation.firstNonWhitespacePosition")
  @js.native
  def firstNonWhitespacePosition(value: String): Double = js.native
  
  @JSGlobal("TypeScript.Indentation.indentationString")
  @js.native
  def indentationString(column: Double, options: FormattingOptions): String = js.native
  
  @JSGlobal("TypeScript.Indentation.indentationTrivia")
  @js.native
  def indentationTrivia(column: Double, options: FormattingOptions): ISyntaxTrivia = js.native
}
