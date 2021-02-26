package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Parser {
  
  @JSGlobal("TypeScript.Parser.incrementalParse")
  @js.native
  def incrementalParse(
    oldSyntaxTree: typingsSlinky.typescriptServices.TypeScript.SyntaxTree,
    textChangeRange: typingsSlinky.typescriptServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typingsSlinky.typescriptServices.TypeScript.SyntaxTree = js.native
  
  @JSGlobal("TypeScript.Parser.parse")
  @js.native
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typingsSlinky.typescriptServices.TypeScript.ParseOptions
  ): typingsSlinky.typescriptServices.TypeScript.SyntaxTree = js.native
}
