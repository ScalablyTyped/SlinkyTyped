package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxTree extends js.Object {
  var _allDiagnostics: js.Any = js.native
  var _fileName: js.Any = js.native
  var _isDeclaration: js.Any = js.native
  var _lineMap: js.Any = js.native
  var _parseOptions: js.Any = js.native
  var _parserDiagnostics: js.Any = js.native
  var _sourceUnit: js.Any = js.native
  /* private */ def computeDiagnostics(): js.Any = js.native
  def diagnostics(): js.Array[Diagnostic] = js.native
  def fileName(): String = js.native
  def isDeclaration(): Boolean = js.native
  def lineMap(): LineMap = js.native
  def parseOptions(): ParseOptions = js.native
  def sourceUnit(): SourceUnitSyntax = js.native
  def structuralEquals(tree: SyntaxTree): Boolean = js.native
  def toJSON(key: js.Any): js.Any = js.native
}

object SyntaxTree {
  @scala.inline
  def apply(
    _allDiagnostics: js.Any,
    _fileName: js.Any,
    _isDeclaration: js.Any,
    _lineMap: js.Any,
    _parseOptions: js.Any,
    _parserDiagnostics: js.Any,
    _sourceUnit: js.Any,
    computeDiagnostics: () => js.Any,
    diagnostics: () => js.Array[Diagnostic],
    fileName: () => String,
    isDeclaration: () => Boolean,
    lineMap: () => LineMap,
    parseOptions: () => ParseOptions,
    sourceUnit: () => SourceUnitSyntax,
    structuralEquals: SyntaxTree => Boolean,
    toJSON: js.Any => js.Any
  ): SyntaxTree = {
    val __obj = js.Dynamic.literal(_allDiagnostics = _allDiagnostics.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _isDeclaration = _isDeclaration.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _parseOptions = _parseOptions.asInstanceOf[js.Any], _parserDiagnostics = _parserDiagnostics.asInstanceOf[js.Any], _sourceUnit = _sourceUnit.asInstanceOf[js.Any], computeDiagnostics = js.Any.fromFunction0(computeDiagnostics), diagnostics = js.Any.fromFunction0(diagnostics), fileName = js.Any.fromFunction0(fileName), isDeclaration = js.Any.fromFunction0(isDeclaration), lineMap = js.Any.fromFunction0(lineMap), parseOptions = js.Any.fromFunction0(parseOptions), sourceUnit = js.Any.fromFunction0(sourceUnit), structuralEquals = js.Any.fromFunction1(structuralEquals), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[SyntaxTree]
  }
  @scala.inline
  implicit class SyntaxTreeOps[Self <: SyntaxTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_allDiagnostics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_fileName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_isDeclaration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lineMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lineMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_parseOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parseOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_parserDiagnostics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parserDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sourceUnit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeDiagnostics(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeDiagnostics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDiagnostics(value: () => js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDeclaration(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeclaration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLineMap(value: () => LineMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParseOptions(value: () => ParseOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSourceUnit(value: () => SourceUnitSyntax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUnit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStructuralEquals(value: SyntaxTree => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuralEquals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

