package typingsSlinky.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An intent identified in the user input. */
@js.native
trait RuntimeIntent
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** A decimal percentage that represents Watson's confidence in the intent. */
  var confidence: Double = js.native
  /** The name of the recognized intent. */
  var intent: String = js.native
}

object RuntimeIntent {
  @scala.inline
  def apply(confidence: Double, intent: String): RuntimeIntent = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeIntent]
  }
  @scala.inline
  implicit class RuntimeIntentOps[Self <: RuntimeIntent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

