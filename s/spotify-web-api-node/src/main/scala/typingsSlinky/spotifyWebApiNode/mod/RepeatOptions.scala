package typingsSlinky.spotifyWebApiNode.mod

import typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.context
import typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.off
import typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepeatOptions extends DeviceOptions {
  
  var state: js.UndefOr[track | context | off] = js.native
}
object RepeatOptions {
  
  @scala.inline
  def apply(): RepeatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatOptions]
  }
  
  @scala.inline
  implicit class RepeatOptionsMutableBuilder[Self <: RepeatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: track | context | off): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
