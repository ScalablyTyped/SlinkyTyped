package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
class SyntaxInformationMap protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap {
  def this(trackParents: Boolean, trackPreviousToken: Boolean) = this()
}
/* static members */
@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
object SyntaxInformationMap extends js.Object {
  
  def create(
    node: typingsSlinky.typescriptServices.TypeScript.SyntaxNode,
    trackParents: Boolean,
    trackPreviousToken: Boolean
  ): typingsSlinky.typescriptServices.TypeScript.SyntaxInformationMap = js.native
}
