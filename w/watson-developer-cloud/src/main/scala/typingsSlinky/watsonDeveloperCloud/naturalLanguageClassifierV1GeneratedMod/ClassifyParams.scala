package typingsSlinky.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `classify` operation. */
@js.native
trait ClassifyParams extends StObject {
  
  /** Classifier ID to use. */
  var classifier_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** The submitted phrase. The maximum length is 2048 characters. */
  var text: String = js.native
}
object ClassifyParams {
  
  @scala.inline
  def apply(classifier_id: String, text: String): ClassifyParams = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyParams]
  }
  
  @scala.inline
  implicit class ClassifyParamsMutableBuilder[Self <: ClassifyParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
