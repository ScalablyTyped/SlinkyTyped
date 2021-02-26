package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** EmotionScores. */
@js.native
trait EmotionScores extends StObject {
  
  /** Anger score from 0 to 1. A higher score means that the text is more likely to convey anger. */
  var anger: js.UndefOr[Double] = js.native
  
  /** Disgust score from 0 to 1. A higher score means that the text is more likely to convey disgust. */
  var disgust: js.UndefOr[Double] = js.native
  
  /** Fear score from 0 to 1. A higher score means that the text is more likely to convey fear. */
  var fear: js.UndefOr[Double] = js.native
  
  /** Joy score from 0 to 1. A higher score means that the text is more likely to convey joy. */
  var joy: js.UndefOr[Double] = js.native
  
  /** Sadness score from 0 to 1. A higher score means that the text is more likely to convey sadness. */
  var sadness: js.UndefOr[Double] = js.native
}
object EmotionScores {
  
  @scala.inline
  def apply(): EmotionScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionScores]
  }
  
  @scala.inline
  implicit class EmotionScoresMutableBuilder[Self <: EmotionScores] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnger(value: Double): Self = StObject.set(x, "anger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngerUndefined: Self = StObject.set(x, "anger", js.undefined)
    
    @scala.inline
    def setDisgust(value: Double): Self = StObject.set(x, "disgust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisgustUndefined: Self = StObject.set(x, "disgust", js.undefined)
    
    @scala.inline
    def setFear(value: Double): Self = StObject.set(x, "fear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFearUndefined: Self = StObject.set(x, "fear", js.undefined)
    
    @scala.inline
    def setJoy(value: Double): Self = StObject.set(x, "joy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoyUndefined: Self = StObject.set(x, "joy", js.undefined)
    
    @scala.inline
    def setSadness(value: Double): Self = StObject.set(x, "sadness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSadnessUndefined: Self = StObject.set(x, "sadness", js.undefined)
  }
}
