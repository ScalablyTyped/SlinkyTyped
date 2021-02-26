package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Break
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_Break: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break = js.native
}
object Break {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break): Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Break]
  }
  
  @scala.inline
  implicit class BreakMutableBuilder[Self <: Break] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
