package typingsSlinky.useMediaAntdQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchMedia extends js.Object {
  
  var matchMedia: String = js.native
  
  var maxWidth: Double = js.native
}
object MatchMedia {
  
  @scala.inline
  def apply(matchMedia: String, maxWidth: Double): MatchMedia = {
    val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchMedia]
  }
  
  @scala.inline
  implicit class MatchMediaOps[Self <: MatchMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatchMedia(value: String): Self = this.set("matchMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
  }
}
