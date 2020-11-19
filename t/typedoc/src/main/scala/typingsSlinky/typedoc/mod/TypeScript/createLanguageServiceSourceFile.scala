package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.IScriptSnapshot
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createLanguageServiceSourceFile")
@js.native
object createLanguageServiceSourceFile extends js.Object {
  
  def apply(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: typingsSlinky.typescript.mod.ScriptTarget,
    version: String,
    setNodeParents: Boolean
  ): SourceFile = js.native
  def apply(
    fileName: String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: typingsSlinky.typescript.mod.ScriptTarget,
    version: String,
    setNodeParents: Boolean,
    scriptKind: typingsSlinky.typescript.mod.ScriptKind
  ): SourceFile = js.native
}
