package typingsSlinky.solidityParserAntlr.mod

import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.default
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.internal
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclaration
  extends BaseASTNode
     with ASTNode {
  var expression: js.UndefOr[Expression] = js.native
  var isDeclaredConst: js.UndefOr[Boolean] = js.native
  var isIndexed: Boolean = js.native
  var isStateVar: Boolean = js.native
  var name: String = js.native
  var storageLocation: js.UndefOr[String] = js.native
  var typeName: TypeName = js.native
  @JSName("type")
  var type_VariableDeclaration: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration = js.native
  var visibility: js.UndefOr[public | `private` | internal | default] = js.native
}

object VariableDeclaration {
  @scala.inline
  def apply(
    isIndexed: Boolean,
    isStateVar: Boolean,
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration,
    typeName: TypeName
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed.asInstanceOf[js.Any], isStateVar = isStateVar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration]
  }
  @scala.inline
  implicit class VariableDeclarationOps[Self <: VariableDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsIndexed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIndexed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStateVar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStateVar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeName(value: TypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDeclaredConst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeclaredConst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeclaredConst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeclaredConst")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: public | `private` | internal | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

