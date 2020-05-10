package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBack extends js.Object {
  /**
    * The back of an ID returned by a file with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var back: js.UndefOr[String] = js.native
  /**
    * The front of an ID returned by a file with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var front: js.UndefOr[String] = js.native
}

object AnonBack {
  @scala.inline
  def apply(): AnonBack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBack]
  }
  @scala.inline
  implicit class AnonBackOps[Self <: AnonBack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(js.undefined)
        ret
    }
    @scala.inline
    def withFront(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(js.undefined)
        ret
    }
  }
  
}

