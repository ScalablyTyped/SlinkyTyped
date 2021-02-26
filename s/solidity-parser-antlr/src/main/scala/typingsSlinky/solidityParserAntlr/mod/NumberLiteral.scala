package typingsSlinky.solidityParserAntlr.mod

import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.days
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ether
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.finney
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.hours
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.minutes
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.seconds
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.szabo
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.weeks
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.wei
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberLiteral
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  
  var number: String = js.native
  
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = js.native
  
  @JSName("type")
  var type_NumberLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral = js.native
}
object NumberLiteral {
  
  @scala.inline
  def apply(number: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteral]
  }
  
  @scala.inline
  implicit class NumberLiteralMutableBuilder[Self <: NumberLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdenomination(value: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years): Self = StObject.set(x, "subdenomination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdenominationNull: Self = StObject.set(x, "subdenomination", null)
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
