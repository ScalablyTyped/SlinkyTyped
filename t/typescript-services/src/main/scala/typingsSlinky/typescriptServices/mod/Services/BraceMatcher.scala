package typingsSlinky.typescriptServices.mod.Services

import typingsSlinky.typescriptServices.TypeScript.SyntaxTree
import typingsSlinky.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.BraceMatcher")
@js.native
class BraceMatcher ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.BraceMatcher
object BraceMatcher {
  
  /* static member */
  @JSImport("typescript-services", "Services.BraceMatcher.getMatchSpans")
  @js.native
  def getMatchSpans(syntaxTree: SyntaxTree, position: Double): js.Array[TextSpan] = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.BraceMatcher.getMatchingCloseBrace")
  @js.native
  def getMatchingCloseBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.BraceMatcher.getMatchingCloseBraceTokenKind")
  @js.native
  def getMatchingCloseBraceTokenKind(positionedElement: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.BraceMatcher.getMatchingOpenBrace")
  @js.native
  def getMatchingOpenBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.BraceMatcher.getMatchingOpenBraceTokenKind")
  @js.native
  def getMatchingOpenBraceTokenKind(positionedElement: js.Any): js.Any = js.native
}
