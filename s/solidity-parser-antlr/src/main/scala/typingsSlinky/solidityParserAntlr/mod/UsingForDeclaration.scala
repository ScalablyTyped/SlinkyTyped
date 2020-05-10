package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsingForDeclaration
  extends BaseASTNode
     with ASTNode {
  var libraryName: String = js.native
  var typeName: TypeName = js.native
  @JSName("type")
  var type_UsingForDeclaration: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration = js.native
}

object UsingForDeclaration {
  @scala.inline
  def apply(
    libraryName: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration,
    typeName: TypeName
  ): UsingForDeclaration = {
    val __obj = js.Dynamic.literal(libraryName = libraryName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsingForDeclaration]
  }
  @scala.inline
  implicit class UsingForDeclarationOps[Self <: UsingForDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLibraryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration): Self = {
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
  }
  
}

