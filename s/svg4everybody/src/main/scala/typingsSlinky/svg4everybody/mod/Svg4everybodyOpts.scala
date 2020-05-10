package typingsSlinky.svg4everybody.mod

import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGUseElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Svg4everybodyOpts extends js.Object {
  var attributeName: js.UndefOr[String] = js.native
  var fallback: js.UndefOr[
    js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, String]
  ] = js.native
  var nosvg: js.UndefOr[Boolean] = js.native
  var polyfill: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[
    js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, Boolean]
  ] = js.native
}

object Svg4everybodyOpts {
  @scala.inline
  def apply(): Svg4everybodyOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Svg4everybodyOpts]
  }
  @scala.inline
  implicit class Svg4everybodyOptsOps[Self <: Svg4everybodyOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withNosvg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNosvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosvg")(js.undefined)
        ret
    }
    @scala.inline
    def withPolyfill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyfill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolyfill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyfill")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

