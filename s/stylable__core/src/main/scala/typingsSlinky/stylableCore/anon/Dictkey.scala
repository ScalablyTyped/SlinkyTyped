package typingsSlinky.stylableCore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var alias: js.Any = js.native
  
  var symlinks: Boolean = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(alias: js.Any, symlinks: Boolean): Dictkey = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], symlinks = symlinks.asInstanceOf[js.Any])
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
    def setAlias(value: js.Any): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymlinks(value: Boolean): Self = this.set("symlinks", value.asInstanceOf[js.Any])
  }
}
