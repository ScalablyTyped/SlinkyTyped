package typingsSlinky.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
class SyntaxInformationMap protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap {
  def this(trackParents: Boolean, trackPreviousToken: Boolean) = this()
}
object SyntaxInformationMap {
  
  /* static member */
  @JSImport("typescript-services", "SyntaxInformationMap.create")
  @js.native
  def create(
    node: typingsSlinky.typescriptServices.TypeScript.SyntaxNode,
    trackParents: Boolean,
    trackPreviousToken: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap = js.native
}
