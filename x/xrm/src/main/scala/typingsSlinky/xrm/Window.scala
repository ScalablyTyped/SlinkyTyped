package typingsSlinky.xrm

import typingsSlinky.xrm.Xrm.GlobalContext
import typingsSlinky.xrm.Xrm.XrmStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Xrm: XrmStatic
  def GetGlobalContext(): GlobalContext
}

object Window {
  @scala.inline
  def apply(GetGlobalContext: () => GlobalContext, Xrm: XrmStatic): Window = {
    val __obj = js.Dynamic.literal(GetGlobalContext = js.Any.fromFunction0(GetGlobalContext), Xrm = Xrm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

