package typingsSlinky.typeorm.entitySchemaEntitySchemaCheckOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitySchemaCheckOptions extends js.Object {
  
  /**
    * Check expression.
    */
  var expression: String = js.native
  
  /**
    * Check constraint name.
    */
  var name: js.UndefOr[String] = js.native
}
object EntitySchemaCheckOptions {
  
  @scala.inline
  def apply(expression: String): EntitySchemaCheckOptions = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySchemaCheckOptions]
  }
  
  @scala.inline
  implicit class EntitySchemaCheckOptionsOps[Self <: EntitySchemaCheckOptions] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
