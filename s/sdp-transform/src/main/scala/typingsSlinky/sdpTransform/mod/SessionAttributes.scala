package typingsSlinky.sdpTransform.mod

import typingsSlinky.sdpTransform.anon.Mids
import typingsSlinky.sdpTransform.anon.Semantic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionAttributes extends SharedAttributes {
  // a=group:BUNDLE audio video
  var groups: js.UndefOr[js.Array[Mids]] = js.native
  // a=ice-options:google-ice
  var iceOptions: js.UndefOr[String] = js.native
  var icelite: js.UndefOr[String] = js.native
  // a=msid-semantic: WMS Jvlam5X3SX1OP6pn20zWogvaKJz5Hjf9OnlV
  var msidSemantic: js.UndefOr[Semantic] = js.native
}

object SessionAttributes {
  @scala.inline
  def apply(): SessionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionAttributes]
  }
  @scala.inline
  implicit class SessionAttributesOps[Self <: SessionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[Mids]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withIceOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIcelite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icelite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcelite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icelite")(js.undefined)
        ret
    }
    @scala.inline
    def withMsidSemantic(value: Semantic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msidSemantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsidSemantic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msidSemantic")(js.undefined)
        ret
    }
  }
  
}

