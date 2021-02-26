package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Recognizes when two entities are related and identifies the type of relation. For example, an `awardedTo` relation might connect the entities "Nobel Prize" and "Albert Einstein". See [Relation types](https://cloud.ibm.com/docs/services/natural-language-understanding/relations.html). Supported languages: Arabic, English, German, Japanese, Korean, Spanish. Chinese, Dutch, French, Italian, and Portuguese custom models are also supported. */
@js.native
trait RelationsOptions extends StObject {
  
  /** Enter a [custom model](https://cloud.ibm.com/docs/services/natural-language-understanding/customizing.html) ID to override the default model. */
  var model: js.UndefOr[String] = js.native
}
object RelationsOptions {
  
  @scala.inline
  def apply(): RelationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationsOptions]
  }
  
  @scala.inline
  implicit class RelationsOptionsMutableBuilder[Self <: RelationsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
