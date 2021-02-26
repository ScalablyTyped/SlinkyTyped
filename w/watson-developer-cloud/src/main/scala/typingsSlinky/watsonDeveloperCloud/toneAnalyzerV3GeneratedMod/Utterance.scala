package typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Utterance. */
@js.native
trait Utterance extends StObject {
  
  /** An utterance contributed by a user in the conversation that is to be analyzed. The utterance can contain multiple sentences. */
  var text: String = js.native
  
  /** A string that identifies the user who contributed the utterance specified by the `text` parameter. */
  var user: js.UndefOr[String] = js.native
}
object Utterance {
  
  @scala.inline
  def apply(text: String): Utterance = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utterance]
  }
  
  @scala.inline
  implicit class UtteranceMutableBuilder[Self <: Utterance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
