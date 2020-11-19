package typingsSlinky.senchaTouch.Ext.fx.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICube extends IAbstract {
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of out
    * @returns Boolean
    */
  var getOut: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Sets the value of out
    * @param out Boolean The new value.
    */
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.native
}
object ICube {
  
  @scala.inline
  def apply(): ICube = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICube]
  }
  
  @scala.inline
  implicit class ICubeOps[Self <: ICube] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setGetOut(value: () => Boolean): Self = this.set("getOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOut: Self = this.set("getOut", js.undefined)
    
    @scala.inline
    def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = this.set("setOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOut: Self = this.set("setOut", js.undefined)
  }
}
