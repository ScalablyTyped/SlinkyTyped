package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corpus. */
@js.native
trait Corpus extends StObject {
  
  /** If the status of the corpus is `undetermined`, the following message: `Analysis of corpus 'name' failed. Please try adding the corpus again by setting the 'allow_overwrite' flag to 'true'`. */
  var error: js.UndefOr[String] = js.native
  
  /** The name of the corpus. */
  var name: String = js.native
  
  /** The number of OOV words in the corpus. The value is `0` while the corpus is being processed. */
  var out_of_vocabulary_words: Double = js.native
  
  /** The status of the corpus: * `analyzed`: The service successfully analyzed the corpus. The custom model can be trained with data from the corpus. * `being_processed`: The service is still analyzing the corpus. The service cannot accept requests to add new resources or to train the custom model. * `undetermined`: The service encountered an error while processing the corpus. The `error` field describes the failure. */
  var status: String = js.native
  
  /** The total number of words in the corpus. The value is `0` while the corpus is being processed. */
  var total_words: Double = js.native
}
object Corpus {
  
  @scala.inline
  def apply(name: String, out_of_vocabulary_words: Double, status: String, total_words: Double): Corpus = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], out_of_vocabulary_words = out_of_vocabulary_words.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_words = total_words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corpus]
  }
  
  @scala.inline
  implicit class CorpusMutableBuilder[Self <: Corpus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOut_of_vocabulary_words(value: Double): Self = StObject.set(x, "out_of_vocabulary_words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_words(value: Double): Self = StObject.set(x, "total_words", value.asInstanceOf[js.Any])
  }
}
