package typingsSlinky.yogBigpipe.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.yogBigpipe.mod.Pagelet.mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var mode: typingsSlinky.yogBigpipe.mod.Pagelet.mode = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(mode: mode): Dictkey = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
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
    def setMode(value: mode): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
