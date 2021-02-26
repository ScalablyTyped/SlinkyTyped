package typingsSlinky.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterOptions extends LimitOptions {
  
  var after: js.UndefOr[Double] = js.native
}
object AfterOptions {
  
  @scala.inline
  def apply(): AfterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterOptions]
  }
  
  @scala.inline
  implicit class AfterOptionsMutableBuilder[Self <: AfterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
  }
}
