package typingsSlinky.typescriptServices.global.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.Indenter")
@js.native
class Indenter ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Indenter
object Indenter {
  
  /* static member */
  @JSGlobal("TypeScript.Services.Indenter.belongsToBracket")
  @js.native
  def belongsToBracket(sourceText: js.Any, token: js.Any, position: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.Indenter.getCustomListIndentation")
  @js.native
  def getCustomListIndentation(list: js.Any, element: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.Indenter.getIndentation")
  @js.native
  def getIndentation(
    node: SourceUnitSyntax,
    soruceText: IScriptSnapshot,
    position: Double,
    editorOptions: typingsSlinky.typescriptServices.TypeScript.Services.EditorOptions
  ): Double = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.Indenter.getListItemIndentation")
  @js.native
  def getListItemIndentation(list: js.Any, elementIndex: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.Indenter.isInContainerNode")
  @js.native
  def isInContainerNode(parent: js.Any, element: js.Any): js.Any = js.native
}
