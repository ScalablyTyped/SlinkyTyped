package typingsSlinky.tablesorter.mod._Global_

import typingsSlinky.tablesorter.tablesorterMod.Tablesorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic[TElement] extends js.Object {
  /**
    * The tablesorter.
    */
  var tablesorter: Tablesorter[TElement] = js.native
}

object JQueryStatic {
  @scala.inline
  def apply[TElement](tablesorter: Tablesorter[TElement]): JQueryStatic[TElement] = {
    val __obj = js.Dynamic.literal(tablesorter = tablesorter.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic[TElement]]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self[telement] <: JQueryStatic[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withTablesorter(value: Tablesorter[TElement]): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablesorter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

