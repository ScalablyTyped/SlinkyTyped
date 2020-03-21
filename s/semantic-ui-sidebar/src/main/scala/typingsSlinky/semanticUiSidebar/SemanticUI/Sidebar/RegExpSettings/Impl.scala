package typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default /(iPad|iPhone|iPod)/g
    */
  var ios: js.RegExp
  /**
    * @default /Mobile|iP(hone|od|ad)|Android|BlackBerry|IEMobile|Kindle|NetFront|Silk-Accelerated|(hpw|web)OS|Fennec|Minimo|Opera M(obi|ini)|Blazer|Dolfin|Dolphin|Skyfire|Zune/g
    */
  var mobile: js.RegExp
}

object Impl {
  @scala.inline
  def apply(ios: js.RegExp, mobile: js.RegExp): Impl = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

