package typingsSlinky.sqlQueryIdentifier.mod

import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_DATABASE
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TABLE
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.DELETE
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_DATABASE
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TABLE
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.INSERT
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.LISTING
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.MODIFICATION
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.SELECT
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.TRUNCATE
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN
import typingsSlinky.sqlQueryIdentifier.sqlQueryIdentifierStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var end: Double = js.native
  
  var executionType: LISTING | MODIFICATION | UNKNOWN = js.native
  
  var start: Double = js.native
  
  var text: String = js.native
  
  var `type`: SELECT | INSERT | UPDATE | DELETE | CREATE_TABLE | CREATE_DATABASE | DROP_TABLE | DROP_DATABASE | TRUNCATE | UNKNOWN = js.native
}
object Result {
  
  @scala.inline
  def apply(
    end: Double,
    executionType: LISTING | MODIFICATION | UNKNOWN,
    start: Double,
    text: String,
    `type`: SELECT | INSERT | UPDATE | DELETE | CREATE_TABLE | CREATE_DATABASE | DROP_TABLE | DROP_DATABASE | TRUNCATE | UNKNOWN
  ): Result = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], executionType = executionType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionType(value: LISTING | MODIFICATION | UNKNOWN): Self = this.set("executionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: SELECT | INSERT | UPDATE | DELETE | CREATE_TABLE | CREATE_DATABASE | DROP_TABLE | DROP_DATABASE | TRUNCATE | UNKNOWN
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
