package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import typingsSlinky.vsoNodeApi.anon.KeyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyData extends js.Object {
  var input: String = js.native
  var map: js.Array[KeyString] = js.native
}

object DependencyData {
  @scala.inline
  def apply(input: String, map: js.Array[KeyString]): DependencyData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyData]
  }
  @scala.inline
  implicit class DependencyDataOps[Self <: DependencyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: js.Array[KeyString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

