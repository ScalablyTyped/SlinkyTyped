package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done. */
@js.native
trait PerformanceNavigation extends js.Object {
  val TYPE_BACK_FORWARD: Double = js.native
  val TYPE_NAVIGATE: Double = js.native
  val TYPE_RELOAD: Double = js.native
  val TYPE_RESERVED: Double = js.native
  val redirectCount: Double = js.native
  val `type`: Double = js.native
  def toJSON(): js.Any = js.native
}

object PerformanceNavigation {
  @scala.inline
  def apply(
    TYPE_BACK_FORWARD: Double,
    TYPE_NAVIGATE: Double,
    TYPE_RELOAD: Double,
    TYPE_RESERVED: Double,
    redirectCount: Double,
    toJSON: () => js.Any,
    `type`: Double
  ): PerformanceNavigation = {
    val __obj = js.Dynamic.literal(TYPE_BACK_FORWARD = TYPE_BACK_FORWARD.asInstanceOf[js.Any], TYPE_NAVIGATE = TYPE_NAVIGATE.asInstanceOf[js.Any], TYPE_RELOAD = TYPE_RELOAD.asInstanceOf[js.Any], TYPE_RESERVED = TYPE_RESERVED.asInstanceOf[js.Any], redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNavigation]
  }
  @scala.inline
  implicit class PerformanceNavigationOps[Self <: org.scalajs.dom.raw.PerformanceNavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTYPE_BACK_FORWARD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE_BACK_FORWARD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_NAVIGATE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE_NAVIGATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_RELOAD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE_RELOAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_RESERVED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE_RESERVED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

