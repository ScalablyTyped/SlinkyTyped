package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.SyntaxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndentationNodeContextPool extends StObject {
  
  def getNode(
    parent: IndentationNodeContext,
    node: SyntaxNode,
    fullStart: Double,
    indentationLevel: Double,
    childIndentationLevelDelta: Double
  ): IndentationNodeContext = js.native
  
  var nodes: js.Any = js.native
  
  def releaseNode(node: IndentationNodeContext): Unit = js.native
  def releaseNode(node: IndentationNodeContext, recursive: Boolean): Unit = js.native
}
