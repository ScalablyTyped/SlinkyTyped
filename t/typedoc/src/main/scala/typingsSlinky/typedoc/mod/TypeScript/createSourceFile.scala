package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createSourceFile")
@js.native
object createSourceFile extends js.Object {
  def apply(fileName: String, sourceText: String, languageVersion: typingsSlinky.typescript.mod.ScriptTarget): SourceFile = js.native
  def apply(
    fileName: String,
    sourceText: String,
    languageVersion: typingsSlinky.typescript.mod.ScriptTarget,
    setParentNodes: js.UndefOr[scala.Nothing],
    scriptKind: typingsSlinky.typescript.mod.ScriptKind
  ): SourceFile = js.native
  def apply(
    fileName: String,
    sourceText: String,
    languageVersion: typingsSlinky.typescript.mod.ScriptTarget,
    setParentNodes: Boolean
  ): SourceFile = js.native
  def apply(
    fileName: String,
    sourceText: String,
    languageVersion: typingsSlinky.typescript.mod.ScriptTarget,
    setParentNodes: Boolean,
    scriptKind: typingsSlinky.typescript.mod.ScriptKind
  ): SourceFile = js.native
}

