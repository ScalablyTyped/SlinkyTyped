package typingsSlinky.waitme

import typingsSlinky.waitme.WaitMe.WaitMeOptions
import typingsSlinky.waitme.WaitMe.WaitMeStatic
import typingsSlinky.waitme.waitmeStrings.close
import typingsSlinky.waitme.waitmeStrings.hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * $(container).waitMe({param1 : value1, param2 : value2, ...});
    */
  @JSName("waitMe")
  var waitMe_Original: WaitMeStatic = js.native
  /**
    * execution after closed.
    * Use: $('.waitMe').on('close', function() {});
    * @param event 
    * @param handler 
    * @returns {this} 
    */
  @JSName("on")
  def on_close(event: close, handler: js.Function0[Unit]): this.type = js.native
  /**
    * $(container).waitMe({param1 : value1, param2 : value2, ...});
    */
  def waitMe(): JQuery = js.native
  def waitMe(options: WaitMeOptions): JQuery = js.native
  @JSName("waitMe")
  def waitMe_hide(options: hide): JQuery = js.native
}

