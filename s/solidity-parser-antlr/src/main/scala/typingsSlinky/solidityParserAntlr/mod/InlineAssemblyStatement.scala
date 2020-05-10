package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineAssemblyStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var body: AssemblyBlock = js.native
  var language: String = js.native
  @JSName("type")
  var type_InlineAssemblyStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement = js.native
}

object InlineAssemblyStatement {
  @scala.inline
  def apply(
    body: AssemblyBlock,
    language: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  ): InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineAssemblyStatement]
  }
  @scala.inline
  implicit class InlineAssemblyStatementOps[Self <: InlineAssemblyStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: AssemblyBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

