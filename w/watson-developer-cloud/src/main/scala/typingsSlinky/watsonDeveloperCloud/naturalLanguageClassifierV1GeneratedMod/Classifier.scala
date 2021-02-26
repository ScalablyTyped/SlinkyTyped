package typingsSlinky.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A classifier for natural language phrases. */
@js.native
trait Classifier extends StObject {
  
  /** Unique identifier for this classifier. */
  var classifier_id: String = js.native
  
  /** Date and time (UTC) the classifier was created. */
  var created: js.UndefOr[String] = js.native
  
  /** The language used for the classifier. */
  var language: js.UndefOr[String] = js.native
  
  /** User-supplied name for the classifier. */
  var name: js.UndefOr[String] = js.native
  
  /** The state of the classifier. */
  var status: js.UndefOr[String] = js.native
  
  /** Additional detail about the status. */
  var status_description: js.UndefOr[String] = js.native
  
  /** Link to the classifier. */
  var url: String = js.native
}
object Classifier {
  
  @scala.inline
  def apply(classifier_id: String, url: String): Classifier = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
  
  @scala.inline
  implicit class ClassifierMutableBuilder[Self <: Classifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatus_description(value: String): Self = StObject.set(x, "status_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_descriptionUndefined: Self = StObject.set(x, "status_description", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
