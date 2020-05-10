package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISupports extends js.Object {
  /** [Property] (Object) */
  var AudioTag: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var GeoLocation: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var SVG: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var Transitions: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var VML: js.UndefOr[js.Any] = js.native
}

object ISupports {
  @scala.inline
  def apply(): ISupports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupports]
  }
  @scala.inline
  implicit class ISupportsOps[Self <: ISupports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioTag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioTag")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoLocation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withSVG(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSVG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transitions")(js.undefined)
        ret
    }
    @scala.inline
    def withVML(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VML")(js.undefined)
        ret
    }
  }
  
}

