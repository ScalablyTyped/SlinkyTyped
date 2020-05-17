package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scanner extends ISlidingWindowSource {
  var _languageVersion: js.Any = js.native
  var fileName: js.Any = js.native
  var slidingWindow: js.Any = js.native
  var text: js.Any = js.native
  def absoluteIndex(): Double = js.native
  /* private */ def advanceAndSetTokenKind(kind: js.Any): js.Any = js.native
  /* private */ def createIllegalEscapeDiagnostic(start: js.Any, end: js.Any): js.Any = js.native
  /* private */ def createToken(
    fullStart: js.Any,
    leadingTriviaInfo: js.Any,
    start: js.Any,
    kind: js.Any,
    end: js.Any,
    fullEnd: js.Any,
    trailingTriviaInfo: js.Any,
    isVariableWidthKeyword: js.Any
  ): js.Any = js.native
  /* private */ def currentCharCode(): js.Any = js.native
  /* private */ def getErrorMessageText(text: js.Any): js.Any = js.native
  /* private */ def isDotPrefixedNumericLiteral(): js.Any = js.native
  /* private */ def isHexNumericLiteral(): js.Any = js.native
  /* private */ def isIdentifierPart(interpretedChar: js.Any): js.Any = js.native
  /* private */ def isIdentifierStart(interpretedChar: js.Any): js.Any = js.native
  /* private */ def isNewLineCharacter(ch: js.Any): js.Any = js.native
  /* private */ def isOctalNumericLiteral(): js.Any = js.native
  /* private */ def isUnicodeEscape(character: js.Any): js.Any = js.native
  def languageVersion(): LanguageVersion = js.native
  /* private */ def peekCharOrUnicodeEscape(): js.Any = js.native
  /* private */ def peekUnicodeOrHexEscape(): js.Any = js.native
  def scan(diagnostics: js.Array[Diagnostic], allowRegularExpression: Boolean): ISyntaxToken = js.native
  /* private */ def scanAmpersandToken(): js.Any = js.native
  /* private */ def scanAsteriskToken(): js.Any = js.native
  /* private */ def scanBarToken(): js.Any = js.native
  /* private */ def scanCaretToken(): js.Any = js.native
  /* private */ def scanCharOrUnicodeEscape(errors: js.Any): js.Any = js.native
  /* private */ def scanDecimalDigits(): js.Any = js.native
  /* private */ def scanDecimalNumericLiteral(): js.Any = js.native
  /* private */ def scanDefaultCharacter(character: js.Any, diagnostics: js.Any): js.Any = js.native
  /* private */ def scanDotToken(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanEqualsToken(): js.Any = js.native
  /* private */ def scanExclamationToken(): js.Any = js.native
  /* private */ def scanHexNumericLiteral(): js.Any = js.native
  /* private */ def scanLessThanToken(): js.Any = js.native
  /* private */ def scanLineTerminatorSequenceLength(ch: js.Any): js.Any = js.native
  /* private */ def scanLineTerminatorSequenceTrivia(ch: js.Any): js.Any = js.native
  /* private */ def scanMinusToken(): js.Any = js.native
  /* private */ def scanMultiLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  /* private */ def scanMultiLineCommentTriviaLength(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanNumericLiteral(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanOctalNumericLiteral(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanPercentToken(): js.Any = js.native
  /* private */ def scanPlusToken(): js.Any = js.native
  /* private */ def scanSingleLineCommentTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  /* private */ def scanSingleLineCommentTriviaLength(): js.Any = js.native
  /* private */ def scanSlashToken(allowRegularExpression: js.Any): js.Any = js.native
  /* private */ def scanStringLiteral(diagnostics: js.Any): js.Any = js.native
  /* private */ def scanSyntaxToken(diagnostics: js.Any, allowRegularExpression: js.Any): js.Any = js.native
  /* private */ def scanTrivia(underlyingText: js.Any, underlyingTextStart: js.Any, isTrailing: js.Any): js.Any = js.native
  /* private */ def scanTriviaInfo(diagnostics: js.Any, isTrailing: js.Any): js.Any = js.native
  /* private */ def scanUnicodeOrHexEscape(errors: js.Any): js.Any = js.native
  /* private */ def scanWhitespaceTrivia(underlyingText: js.Any, underlyingTextStart: js.Any): js.Any = js.native
  def setAbsoluteIndex(index: Double): Unit = js.native
  /* private */ def skipEscapeSequence(diagnostics: js.Any): js.Any = js.native
  /* private */ def slowScanIdentifierOrKeyword(diagnostics: js.Any): js.Any = js.native
  def substring(start: Double, end: Double, intern: Boolean): String = js.native
  /* private */ def tryFastScanIdentifierOrKeyword(firstCharacter: js.Any): js.Any = js.native
  /* private */ def tryScanRegularExpressionToken(): js.Any = js.native
}

object Scanner {
  @scala.inline
  def apply(
    _languageVersion: js.Any,
    absoluteIndex: () => Double,
    advanceAndSetTokenKind: js.Any => js.Any,
    createIllegalEscapeDiagnostic: (js.Any, js.Any) => js.Any,
    createToken: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    currentCharCode: () => js.Any,
    fetchMoreItems: (js.Any, Double, js.Array[_], Double, Double) => Double,
    fileName: js.Any,
    getErrorMessageText: js.Any => js.Any,
    isDotPrefixedNumericLiteral: () => js.Any,
    isHexNumericLiteral: () => js.Any,
    isIdentifierPart: js.Any => js.Any,
    isIdentifierStart: js.Any => js.Any,
    isNewLineCharacter: js.Any => js.Any,
    isOctalNumericLiteral: () => js.Any,
    isUnicodeEscape: js.Any => js.Any,
    languageVersion: () => LanguageVersion,
    peekCharOrUnicodeEscape: () => js.Any,
    peekUnicodeOrHexEscape: () => js.Any,
    scan: (js.Array[Diagnostic], Boolean) => ISyntaxToken,
    scanAmpersandToken: () => js.Any,
    scanAsteriskToken: () => js.Any,
    scanBarToken: () => js.Any,
    scanCaretToken: () => js.Any,
    scanCharOrUnicodeEscape: js.Any => js.Any,
    scanDecimalDigits: () => js.Any,
    scanDecimalNumericLiteral: () => js.Any,
    scanDefaultCharacter: (js.Any, js.Any) => js.Any,
    scanDotToken: js.Any => js.Any,
    scanEqualsToken: () => js.Any,
    scanExclamationToken: () => js.Any,
    scanHexNumericLiteral: () => js.Any,
    scanLessThanToken: () => js.Any,
    scanLineTerminatorSequenceLength: js.Any => js.Any,
    scanLineTerminatorSequenceTrivia: js.Any => js.Any,
    scanMinusToken: () => js.Any,
    scanMultiLineCommentTrivia: (js.Any, js.Any) => js.Any,
    scanMultiLineCommentTriviaLength: js.Any => js.Any,
    scanNumericLiteral: js.Any => js.Any,
    scanOctalNumericLiteral: js.Any => js.Any,
    scanPercentToken: () => js.Any,
    scanPlusToken: () => js.Any,
    scanSingleLineCommentTrivia: (js.Any, js.Any) => js.Any,
    scanSingleLineCommentTriviaLength: () => js.Any,
    scanSlashToken: js.Any => js.Any,
    scanStringLiteral: js.Any => js.Any,
    scanSyntaxToken: (js.Any, js.Any) => js.Any,
    scanTrivia: (js.Any, js.Any, js.Any) => js.Any,
    scanTriviaInfo: (js.Any, js.Any) => js.Any,
    scanUnicodeOrHexEscape: js.Any => js.Any,
    scanWhitespaceTrivia: (js.Any, js.Any) => js.Any,
    setAbsoluteIndex: Double => Unit,
    skipEscapeSequence: js.Any => js.Any,
    slidingWindow: js.Any,
    slowScanIdentifierOrKeyword: js.Any => js.Any,
    substring: (Double, Double, Boolean) => String,
    text: js.Any,
    tryFastScanIdentifierOrKeyword: js.Any => js.Any,
    tryScanRegularExpressionToken: () => js.Any
  ): Scanner = {
    val __obj = js.Dynamic.literal(_languageVersion = _languageVersion.asInstanceOf[js.Any], absoluteIndex = js.Any.fromFunction0(absoluteIndex), advanceAndSetTokenKind = js.Any.fromFunction1(advanceAndSetTokenKind), createIllegalEscapeDiagnostic = js.Any.fromFunction2(createIllegalEscapeDiagnostic), createToken = js.Any.fromFunction8(createToken), currentCharCode = js.Any.fromFunction0(currentCharCode), fetchMoreItems = js.Any.fromFunction5(fetchMoreItems), fileName = fileName.asInstanceOf[js.Any], getErrorMessageText = js.Any.fromFunction1(getErrorMessageText), isDotPrefixedNumericLiteral = js.Any.fromFunction0(isDotPrefixedNumericLiteral), isHexNumericLiteral = js.Any.fromFunction0(isHexNumericLiteral), isIdentifierPart = js.Any.fromFunction1(isIdentifierPart), isIdentifierStart = js.Any.fromFunction1(isIdentifierStart), isNewLineCharacter = js.Any.fromFunction1(isNewLineCharacter), isOctalNumericLiteral = js.Any.fromFunction0(isOctalNumericLiteral), isUnicodeEscape = js.Any.fromFunction1(isUnicodeEscape), languageVersion = js.Any.fromFunction0(languageVersion), peekCharOrUnicodeEscape = js.Any.fromFunction0(peekCharOrUnicodeEscape), peekUnicodeOrHexEscape = js.Any.fromFunction0(peekUnicodeOrHexEscape), scan = js.Any.fromFunction2(scan), scanAmpersandToken = js.Any.fromFunction0(scanAmpersandToken), scanAsteriskToken = js.Any.fromFunction0(scanAsteriskToken), scanBarToken = js.Any.fromFunction0(scanBarToken), scanCaretToken = js.Any.fromFunction0(scanCaretToken), scanCharOrUnicodeEscape = js.Any.fromFunction1(scanCharOrUnicodeEscape), scanDecimalDigits = js.Any.fromFunction0(scanDecimalDigits), scanDecimalNumericLiteral = js.Any.fromFunction0(scanDecimalNumericLiteral), scanDefaultCharacter = js.Any.fromFunction2(scanDefaultCharacter), scanDotToken = js.Any.fromFunction1(scanDotToken), scanEqualsToken = js.Any.fromFunction0(scanEqualsToken), scanExclamationToken = js.Any.fromFunction0(scanExclamationToken), scanHexNumericLiteral = js.Any.fromFunction0(scanHexNumericLiteral), scanLessThanToken = js.Any.fromFunction0(scanLessThanToken), scanLineTerminatorSequenceLength = js.Any.fromFunction1(scanLineTerminatorSequenceLength), scanLineTerminatorSequenceTrivia = js.Any.fromFunction1(scanLineTerminatorSequenceTrivia), scanMinusToken = js.Any.fromFunction0(scanMinusToken), scanMultiLineCommentTrivia = js.Any.fromFunction2(scanMultiLineCommentTrivia), scanMultiLineCommentTriviaLength = js.Any.fromFunction1(scanMultiLineCommentTriviaLength), scanNumericLiteral = js.Any.fromFunction1(scanNumericLiteral), scanOctalNumericLiteral = js.Any.fromFunction1(scanOctalNumericLiteral), scanPercentToken = js.Any.fromFunction0(scanPercentToken), scanPlusToken = js.Any.fromFunction0(scanPlusToken), scanSingleLineCommentTrivia = js.Any.fromFunction2(scanSingleLineCommentTrivia), scanSingleLineCommentTriviaLength = js.Any.fromFunction0(scanSingleLineCommentTriviaLength), scanSlashToken = js.Any.fromFunction1(scanSlashToken), scanStringLiteral = js.Any.fromFunction1(scanStringLiteral), scanSyntaxToken = js.Any.fromFunction2(scanSyntaxToken), scanTrivia = js.Any.fromFunction3(scanTrivia), scanTriviaInfo = js.Any.fromFunction2(scanTriviaInfo), scanUnicodeOrHexEscape = js.Any.fromFunction1(scanUnicodeOrHexEscape), scanWhitespaceTrivia = js.Any.fromFunction2(scanWhitespaceTrivia), setAbsoluteIndex = js.Any.fromFunction1(setAbsoluteIndex), skipEscapeSequence = js.Any.fromFunction1(skipEscapeSequence), slidingWindow = slidingWindow.asInstanceOf[js.Any], slowScanIdentifierOrKeyword = js.Any.fromFunction1(slowScanIdentifierOrKeyword), substring = js.Any.fromFunction3(substring), text = text.asInstanceOf[js.Any], tryFastScanIdentifierOrKeyword = js.Any.fromFunction1(tryFastScanIdentifierOrKeyword), tryScanRegularExpressionToken = js.Any.fromFunction0(tryScanRegularExpressionToken))
    __obj.asInstanceOf[Scanner]
  }
  @scala.inline
  implicit class ScannerOps[Self <: Scanner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_languageVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_languageVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsoluteIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAdvanceAndSetTokenKind(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceAndSetTokenKind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateIllegalEscapeDiagnostic(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createIllegalEscapeDiagnostic")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateToken(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createToken")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withCurrentCharCode(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCharCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetErrorMessageText(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorMessageText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDotPrefixedNumericLiteral(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDotPrefixedNumericLiteral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsHexNumericLiteral(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHexNumericLiteral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsIdentifierPart(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentifierPart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsIdentifierStart(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentifierStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsNewLineCharacter(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewLineCharacter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsOctalNumericLiteral(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOctalNumericLiteral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUnicodeEscape(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnicodeEscape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLanguageVersion(value: () => LanguageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeekCharOrUnicodeEscape(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekCharOrUnicodeEscape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeekUnicodeOrHexEscape(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peekUnicodeOrHexEscape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScan(value: (js.Array[Diagnostic], Boolean) => ISyntaxToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScanAmpersandToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanAmpersandToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanAsteriskToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanAsteriskToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanBarToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanBarToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanCaretToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanCaretToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanCharOrUnicodeEscape(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanCharOrUnicodeEscape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanDecimalDigits(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanDecimalDigits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanDecimalNumericLiteral(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanDecimalNumericLiteral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanDefaultCharacter(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanDefaultCharacter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScanDotToken(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanDotToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanEqualsToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanEqualsToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanExclamationToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanExclamationToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanHexNumericLiteral(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanHexNumericLiteral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanLessThanToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanLessThanToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanLineTerminatorSequenceLength(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanLineTerminatorSequenceLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanLineTerminatorSequenceTrivia(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanLineTerminatorSequenceTrivia")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanMinusToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanMinusToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanMultiLineCommentTrivia(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanMultiLineCommentTrivia")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScanMultiLineCommentTriviaLength(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanMultiLineCommentTriviaLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanNumericLiteral(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanNumericLiteral")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanOctalNumericLiteral(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanOctalNumericLiteral")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanPercentToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanPercentToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanPlusToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanPlusToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanSingleLineCommentTrivia(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanSingleLineCommentTrivia")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScanSingleLineCommentTriviaLength(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanSingleLineCommentTriviaLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanSlashToken(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanSlashToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanStringLiteral(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanStringLiteral")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanSyntaxToken(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanSyntaxToken")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScanTrivia(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanTrivia")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withScanTriviaInfo(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanTriviaInfo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScanUnicodeOrHexEscape(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanUnicodeOrHexEscape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanWhitespaceTrivia(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanWhitespaceTrivia")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAbsoluteIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAbsoluteIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkipEscapeSequence(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEscapeSequence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlidingWindow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidingWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlowScanIdentifierOrKeyword(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowScanIdentifierOrKeyword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubstring(value: (Double, Double, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substring")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryFastScanIdentifierOrKeyword(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryFastScanIdentifierOrKeyword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryScanRegularExpressionToken(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryScanRegularExpressionToken")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

