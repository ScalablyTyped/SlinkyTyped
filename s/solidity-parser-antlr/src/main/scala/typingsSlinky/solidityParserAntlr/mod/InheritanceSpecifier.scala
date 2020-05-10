package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InheritanceSpecifier
  extends BaseASTNode
     with ASTNode {
  var arguments: js.Array[Expression] = js.native
  var baseName: UserDefinedTypeName = js.native
  @JSName("type")
  var type_InheritanceSpecifier: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier = js.native
}

object InheritanceSpecifier {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    baseName: UserDefinedTypeName,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier
  ): InheritanceSpecifier = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritanceSpecifier]
  }
  @scala.inline
  implicit class InheritanceSpecifierOps[Self <: InheritanceSpecifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseName(value: UserDefinedTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

