package typingsSlinky.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentTransition extends js.Object {
  /**
    * The animation plays when the Hub is changing its content.
    **/
  var contentTransition: String = js.native
  /**
    * The animation plays when the Hub is first displayed.
    **/
  var entrance: String = js.native
  /**
    * The animation plays when a section is inserted into the Hub.
    **/
  var insert: String = js.native
  /**
    * The animation plays when a section is removed into the Hub.
    **/
  var remove: String = js.native
}

object AnonContentTransition {
  @scala.inline
  def apply(contentTransition: String, entrance: String, insert: String, remove: String): AnonContentTransition = {
    val __obj = js.Dynamic.literal(contentTransition = contentTransition.asInstanceOf[js.Any], entrance = entrance.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentTransition]
  }
  @scala.inline
  implicit class AnonContentTransitionOps[Self <: AnonContentTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntrance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

