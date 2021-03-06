package typingsSlinky.spotifyWebApiNode.mod

import typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.long_term
import typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.medium_term
import typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.short_term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTopOptions extends PaginationOptions {
  
  var time_range: js.UndefOr[long_term | medium_term | short_term] = js.native
}
object GetTopOptions {
  
  @scala.inline
  def apply(): GetTopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopOptions]
  }
  
  @scala.inline
  implicit class GetTopOptionsMutableBuilder[Self <: GetTopOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTime_range(value: long_term | medium_term | short_term): Self = StObject.set(x, "time_range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_rangeUndefined: Self = StObject.set(x, "time_range", js.undefined)
  }
}
