package typingsSlinky.typedGraphql.mod

import typingsSlinky.typedGraphql.typedGraphqlStrings.INPUT_OBJECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionInputObjectType extends IntrospectionType {
  
  var description: js.UndefOr[String] = js.native
  
  var inputFields: js.Array[IntrospectionInputValue] = js.native
  
  var kind: INPUT_OBJECT = js.native
  
  var name: String = js.native
}
object IntrospectionInputObjectType {
  
  @scala.inline
  def apply(inputFields: js.Array[IntrospectionInputValue], kind: INPUT_OBJECT, name: String): IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputObjectType]
  }
  
  @scala.inline
  implicit class IntrospectionInputObjectTypeOps[Self <: IntrospectionInputObjectType] (val x: Self) extends AnyVal {
    
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
    def setInputFieldsVarargs(value: IntrospectionInputValue*): Self = this.set("inputFields", js.Array(value :_*))
    
    @scala.inline
    def setInputFields(value: js.Array[IntrospectionInputValue]): Self = this.set("inputFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: INPUT_OBJECT): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
