package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxTree")
@js.native
class SyntaxTree protected ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxTree {
  def this(
    sourceUnit: typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax,
    isDeclaration: Boolean,
    diagnostics: js.Array[typingsSlinky.typescriptServices.TypeScript.Diagnostic],
    fileName: String,
    lineMap: typingsSlinky.typescriptServices.TypeScript.LineMap,
    parseOtions: typingsSlinky.typescriptServices.TypeScript.ParseOptions
  ) = this()
  /* CompleteClass */
  override var _allDiagnostics: js.Any = js.native
  /* CompleteClass */
  override var _fileName: js.Any = js.native
  /* CompleteClass */
  override var _isDeclaration: js.Any = js.native
  /* CompleteClass */
  override var _lineMap: js.Any = js.native
  /* CompleteClass */
  override var _parseOptions: js.Any = js.native
  /* CompleteClass */
  override var _parserDiagnostics: js.Any = js.native
  /* CompleteClass */
  override var _sourceUnit: js.Any = js.native
  /* CompleteClass */
  /* private */ override def computeDiagnostics(): js.Any = js.native
  /* CompleteClass */
  override def diagnostics(): js.Array[typingsSlinky.typescriptServices.TypeScript.Diagnostic] = js.native
  /* CompleteClass */
  override def fileName(): String = js.native
  /* CompleteClass */
  override def isDeclaration(): Boolean = js.native
  /* CompleteClass */
  override def lineMap(): typingsSlinky.typescriptServices.TypeScript.LineMap = js.native
  /* CompleteClass */
  override def parseOptions(): typingsSlinky.typescriptServices.TypeScript.ParseOptions = js.native
  /* CompleteClass */
  override def sourceUnit(): typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax = js.native
  /* CompleteClass */
  override def structuralEquals(tree: typingsSlinky.typescriptServices.TypeScript.SyntaxTree): Boolean = js.native
  /* CompleteClass */
  override def toJSON(key: js.Any): js.Any = js.native
}

