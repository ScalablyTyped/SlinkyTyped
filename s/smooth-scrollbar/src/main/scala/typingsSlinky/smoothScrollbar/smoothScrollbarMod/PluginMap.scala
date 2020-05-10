package typingsSlinky.smoothScrollbar.smoothScrollbarMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.smoothScrollbar.TypeofScrollbarPlugin
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginMap extends js.Object {
  var constructors: StringDictionary[TypeofScrollbarPlugin] = js.native
  var order: Set[String] = js.native
}

object PluginMap {
  @scala.inline
  def apply(constructors: StringDictionary[TypeofScrollbarPlugin], order: Set[String]): PluginMap = {
    val __obj = js.Dynamic.literal(constructors = constructors.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMap]
  }
  @scala.inline
  implicit class PluginMapOps[Self <: PluginMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstructors(value: StringDictionary[TypeofScrollbarPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

