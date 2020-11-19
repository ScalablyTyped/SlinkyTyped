package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.ListVoiceModelsConstants.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listVoiceModels` operation. */
@js.native
trait ListVoiceModelsParams extends js.Object {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The language for which custom voice models that are owned by the requesting service credentials are to be returned. Omit the parameter to see all custom voice models that are owned by the requester. */
  var language: js.UndefOr[Language | String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object ListVoiceModelsParams {
  
  @scala.inline
  def apply(): ListVoiceModelsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceModelsParams]
  }
  
  @scala.inline
  implicit class ListVoiceModelsParamsOps[Self <: ListVoiceModelsParams] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setLanguage(value: Language | String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
}
