package typingsSlinky.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.swaggerizeExpress.mod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaObject
  extends IJsonSchema
     with /* index */ StringDictionary[js.Any] {
  
  var discriminator: js.UndefOr[String] = js.native
  
  var example: js.Any = js.native
  
  var externalDocs: ExternalDocumentationObject = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var xml: js.UndefOr[XMLObject] = js.native
}
object SchemaObject {
  
  @scala.inline
  def apply(example: js.Any, externalDocs: ExternalDocumentationObject): SchemaObject = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any], externalDocs = externalDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObject]
  }
  
  @scala.inline
  implicit class SchemaObjectOps[Self <: SchemaObject] (val x: Self) extends AnyVal {
    
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
    def setExample(value: js.Any): Self = this.set("example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = this.set("externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminator(value: String): Self = this.set("discriminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscriminator: Self = this.set("discriminator", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setXml(value: XMLObject): Self = this.set("xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXml: Self = this.set("xml", js.undefined)
  }
}
