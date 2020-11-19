package typingsSlinky.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.StringLiteralType, 'type' | 'value'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait StringLiteralType extends SomeType {
  
  var `type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String) = js.native
  
  var value: ModelToObject[String] | String = js.native
}
object StringLiteralType {
  
  @scala.inline
  def apply(
    `type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String),
    value: ModelToObject[String] | String
  ): StringLiteralType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteralType]
  }
  
  @scala.inline
  implicit class StringLiteralTypeOps[Self <: StringLiteralType] (val x: Self) extends AnyVal {
    
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
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: _ModelToObject[js.Any]*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: ModelToObject[String] | String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
