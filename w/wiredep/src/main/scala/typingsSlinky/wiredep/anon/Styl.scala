package typingsSlinky.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styl extends js.Object {
  
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: js.RegExp = js.native
  
  /**
    * @example:
    *   /@import\s['"](.+styl)['"]/gi
    */
  var styl: js.RegExp = js.native
}
object Styl {
  
  @scala.inline
  def apply(css: js.RegExp, styl: js.RegExp): Styl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styl]
  }
  
  @scala.inline
  implicit class StylOps[Self <: Styl] (val x: Self) extends AnyVal {
    
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
    def setCss(value: js.RegExp): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyl(value: js.RegExp): Self = this.set("styl", value.asInstanceOf[js.Any])
  }
}
