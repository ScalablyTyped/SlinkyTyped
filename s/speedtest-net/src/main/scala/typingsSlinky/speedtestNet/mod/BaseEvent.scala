package typingsSlinky.speedtestNet.mod

import typingsSlinky.speedtestNet.speedtestNetStrings.config
import typingsSlinky.speedtestNet.speedtestNetStrings.download
import typingsSlinky.speedtestNet.speedtestNetStrings.log
import typingsSlinky.speedtestNet.speedtestNetStrings.ping
import typingsSlinky.speedtestNet.speedtestNetStrings.result
import typingsSlinky.speedtestNet.speedtestNetStrings.testStart
import typingsSlinky.speedtestNet.speedtestNetStrings.upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseEvent extends StObject {
  
  var `type`: config | log | testStart | ping | download | upload | result = js.native
}
object BaseEvent {
  
  @scala.inline
  def apply(`type`: config | log | testStart | ping | download | upload | result): BaseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent]
  }
  
  @scala.inline
  implicit class BaseEventMutableBuilder[Self <: BaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: config | log | testStart | ping | download | upload | result): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
