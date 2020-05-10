package typingsSlinky.typestyle.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedCSSProperties extends CSSProperties {
  /**
    * A debug only (stripped in process.env.NODE_ENV !== 'production') name
    * Helps you figure out where the class is coming from if you care
    **/
  @JSName("$debugName")
  var $debugName: js.UndefOr[String] = js.native
  @JSName("$nest")
  var $nest: js.UndefOr[NestedCSSSelectors] = js.native
}

object NestedCSSProperties {
  @scala.inline
  def apply(): NestedCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedCSSProperties]
  }
  @scala.inline
  implicit class NestedCSSPropertiesOps[Self <: NestedCSSProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$debugName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$debugName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$debugName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$debugName")(js.undefined)
        ret
    }
    @scala.inline
    def with$nest(value: NestedCSSSelectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$nest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nest")(js.undefined)
        ret
    }
  }
  
}

