package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait UserDefinedTypeName
  extends TypeName
     with BaseASTNode {
  
  var namePath: String = js.native
  
  @JSName("type")
  var type_UserDefinedTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName = js.native
}
object UserDefinedTypeName {
  
  @scala.inline
  def apply(
    namePath: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
  ): UserDefinedTypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedTypeName]
  }
  
  @scala.inline
  implicit class UserDefinedTypeNameMutableBuilder[Self <: UserDefinedTypeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamePath(value: String): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
