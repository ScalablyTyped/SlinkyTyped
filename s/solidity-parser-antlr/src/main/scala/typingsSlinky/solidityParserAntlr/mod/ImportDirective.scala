package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDirective
  extends BaseASTNode
     with ASTNode {
  var path: String = js.native
  var symbolAliases: js.Array[js.Tuple2[String, String]] = js.native
  @JSName("type")
  var type_ImportDirective: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective = js.native
  var unitAlias: String = js.native
}

object ImportDirective {
  @scala.inline
  def apply(
    path: String,
    symbolAliases: js.Array[js.Tuple2[String, String]],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective,
    unitAlias: String
  ): ImportDirective = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDirective]
  }
  @scala.inline
  implicit class ImportDirectiveOps[Self <: ImportDirective] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolAliases(value: js.Array[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitAlias")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

