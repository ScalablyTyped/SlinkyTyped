package typingsSlinky.sqltoolsFormatter.formatterMod

import typingsSlinky.sqltoolsFormatter.typesMod.Config
import typingsSlinky.sqltoolsFormatter.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatter extends js.Object {
  
  def addNewline(query: String): String = js.native
  
  var cfg: Config = js.native
  
  def equalizeWhitespace(value: String): String = js.native
  
  def format(query: String): String = js.native
  
  def formatBlockComment(token: Token, query: String): String = js.native
  
  def formatCase(value: String): String = js.native
  
  def formatClosingParentheses(token: Token, query: String): String = js.native
  
  def formatComma(token: Token, query: String): String = js.native
  
  def formatLineComment(token: Token, query: String): String = js.native
  
  def formatNewlineReservedWord(token: Token, query: String): String = js.native
  
  def formatOpeningParentheses(token: Token, query: String): String = js.native
  
  def formatPlaceholder(token: Token, query: String): String = js.native
  
  def formatQuerySeparator(token: Token, query: String): String = js.native
  
  def formatReserved(token: Token, query: String): String = js.native
  
  def formatReservedWord(value: String): String = js.native
  
  def formatTopLevelReservedWord(token: Token, query: String): String = js.native
  
  def formatTopLevelReservedWordNoIndent(token: Token, query: String): String = js.native
  
  def formatWhitespace(token: Token, query: String): String = js.native
  
  def formatWithSpaceAfter(token: Token, query: String): String = js.native
  
  def formatWithSpaces(token: Token, query: String): String = js.native
  
  def formatWithoutSpaces(token: Token, query: String): String = js.native
  
  def getFormattedQueryFromTokens(): String = js.native
  
  def indentComment(comment: String): String = js.native
  
  var indentation: js.Any = js.native
  
  var index: js.Any = js.native
  
  var inlineBlock: js.Any = js.native
  
  var params: js.Any = js.native
  
  var previousNonWhiteSpace: js.Any = js.native
  
  var previousReservedWord: js.Any = js.native
  
  def previousToken(): Token = js.native
  
  var tokenOverride: js.Any = js.native
  
  var tokenizer: typingsSlinky.sqltoolsFormatter.tokenizerMod.default = js.native
  
  var tokens: js.Any = js.native
}
object Formatter {
  
  @scala.inline
  def apply(
    addNewline: String => String,
    cfg: Config,
    equalizeWhitespace: String => String,
    format: String => String,
    formatBlockComment: (Token, String) => String,
    formatCase: String => String,
    formatClosingParentheses: (Token, String) => String,
    formatComma: (Token, String) => String,
    formatLineComment: (Token, String) => String,
    formatNewlineReservedWord: (Token, String) => String,
    formatOpeningParentheses: (Token, String) => String,
    formatPlaceholder: (Token, String) => String,
    formatQuerySeparator: (Token, String) => String,
    formatReserved: (Token, String) => String,
    formatReservedWord: String => String,
    formatTopLevelReservedWord: (Token, String) => String,
    formatTopLevelReservedWordNoIndent: (Token, String) => String,
    formatWhitespace: (Token, String) => String,
    formatWithSpaceAfter: (Token, String) => String,
    formatWithSpaces: (Token, String) => String,
    formatWithoutSpaces: (Token, String) => String,
    getFormattedQueryFromTokens: () => String,
    indentComment: String => String,
    indentation: js.Any,
    index: js.Any,
    inlineBlock: js.Any,
    params: js.Any,
    previousNonWhiteSpace: js.Any,
    previousReservedWord: js.Any,
    previousToken: () => Token,
    tokenOverride: js.Any,
    tokenizer: typingsSlinky.sqltoolsFormatter.tokenizerMod.default,
    tokens: js.Any
  ): Formatter = {
    val __obj = js.Dynamic.literal(addNewline = js.Any.fromFunction1(addNewline), cfg = cfg.asInstanceOf[js.Any], equalizeWhitespace = js.Any.fromFunction1(equalizeWhitespace), format = js.Any.fromFunction1(format), formatBlockComment = js.Any.fromFunction2(formatBlockComment), formatCase = js.Any.fromFunction1(formatCase), formatClosingParentheses = js.Any.fromFunction2(formatClosingParentheses), formatComma = js.Any.fromFunction2(formatComma), formatLineComment = js.Any.fromFunction2(formatLineComment), formatNewlineReservedWord = js.Any.fromFunction2(formatNewlineReservedWord), formatOpeningParentheses = js.Any.fromFunction2(formatOpeningParentheses), formatPlaceholder = js.Any.fromFunction2(formatPlaceholder), formatQuerySeparator = js.Any.fromFunction2(formatQuerySeparator), formatReserved = js.Any.fromFunction2(formatReserved), formatReservedWord = js.Any.fromFunction1(formatReservedWord), formatTopLevelReservedWord = js.Any.fromFunction2(formatTopLevelReservedWord), formatTopLevelReservedWordNoIndent = js.Any.fromFunction2(formatTopLevelReservedWordNoIndent), formatWhitespace = js.Any.fromFunction2(formatWhitespace), formatWithSpaceAfter = js.Any.fromFunction2(formatWithSpaceAfter), formatWithSpaces = js.Any.fromFunction2(formatWithSpaces), formatWithoutSpaces = js.Any.fromFunction2(formatWithoutSpaces), getFormattedQueryFromTokens = js.Any.fromFunction0(getFormattedQueryFromTokens), indentComment = js.Any.fromFunction1(indentComment), indentation = indentation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], inlineBlock = inlineBlock.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], previousNonWhiteSpace = previousNonWhiteSpace.asInstanceOf[js.Any], previousReservedWord = previousReservedWord.asInstanceOf[js.Any], previousToken = js.Any.fromFunction0(previousToken), tokenOverride = tokenOverride.asInstanceOf[js.Any], tokenizer = tokenizer.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatter]
  }
  
  @scala.inline
  implicit class FormatterOps[Self <: Formatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddNewline(value: String => String): Self = this.set("addNewline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCfg(value: Config): Self = this.set("cfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualizeWhitespace(value: String => String): Self = this.set("equalizeWhitespace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: String => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatBlockComment(value: (Token, String) => String): Self = this.set("formatBlockComment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatCase(value: String => String): Self = this.set("formatCase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatClosingParentheses(value: (Token, String) => String): Self = this.set("formatClosingParentheses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatComma(value: (Token, String) => String): Self = this.set("formatComma", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatLineComment(value: (Token, String) => String): Self = this.set("formatLineComment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatNewlineReservedWord(value: (Token, String) => String): Self = this.set("formatNewlineReservedWord", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatOpeningParentheses(value: (Token, String) => String): Self = this.set("formatOpeningParentheses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatPlaceholder(value: (Token, String) => String): Self = this.set("formatPlaceholder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatQuerySeparator(value: (Token, String) => String): Self = this.set("formatQuerySeparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatReserved(value: (Token, String) => String): Self = this.set("formatReserved", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatReservedWord(value: String => String): Self = this.set("formatReservedWord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatTopLevelReservedWord(value: (Token, String) => String): Self = this.set("formatTopLevelReservedWord", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatTopLevelReservedWordNoIndent(value: (Token, String) => String): Self = this.set("formatTopLevelReservedWordNoIndent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatWhitespace(value: (Token, String) => String): Self = this.set("formatWhitespace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatWithSpaceAfter(value: (Token, String) => String): Self = this.set("formatWithSpaceAfter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatWithSpaces(value: (Token, String) => String): Self = this.set("formatWithSpaces", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatWithoutSpaces(value: (Token, String) => String): Self = this.set("formatWithoutSpaces", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFormattedQueryFromTokens(value: () => String): Self = this.set("getFormattedQueryFromTokens", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndentComment(value: String => String): Self = this.set("indentComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndentation(value: js.Any): Self = this.set("indentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: js.Any): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineBlock(value: js.Any): Self = this.set("inlineBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNonWhiteSpace(value: js.Any): Self = this.set("previousNonWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousReservedWord(value: js.Any): Self = this.set("previousReservedWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousToken(value: () => Token): Self = this.set("previousToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTokenOverride(value: js.Any): Self = this.set("tokenOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenizer(value: typingsSlinky.sqltoolsFormatter.tokenizerMod.default): Self = this.set("tokenizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Any): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
}
