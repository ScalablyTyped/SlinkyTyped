package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getStopwordListStatus` operation. */
@js.native
trait GetStopwordListStatusParams extends js.Object {
  
  /** The ID of the collection. */
  var collection_id: String = js.native
  
  /** The ID of the environment. */
  var environment_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object GetStopwordListStatusParams {
  
  @scala.inline
  def apply(collection_id: String, environment_id: String): GetStopwordListStatusParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStopwordListStatusParams]
  }
  
  @scala.inline
  implicit class GetStopwordListStatusParamsOps[Self <: GetStopwordListStatusParams] (val x: Self) extends AnyVal {
    
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
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
}
