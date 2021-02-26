package typingsSlinky.vegaLite.channeldefMod

import typingsSlinky.vegaLite.vegaLiteStrings.column
import typingsSlinky.vegaLite.vegaLiteStrings.layer
import typingsSlinky.vegaLite.vegaLiteStrings.repeat
import typingsSlinky.vegaLite.vegaLiteStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepeatRef extends StObject {
  
  var repeat: row | column | typingsSlinky.vegaLite.vegaLiteStrings.repeat | layer = js.native
}
object RepeatRef {
  
  @scala.inline
  def apply(repeat: row | column | repeat | layer): RepeatRef = {
    val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatRef]
  }
  
  @scala.inline
  implicit class RepeatRefMutableBuilder[Self <: RepeatRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepeat(value: row | column | repeat | layer): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
  }
}
