package typingsSlinky.svgInjector.mod

import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGInjectorOptions extends js.Object {
  /**
    * Callback to run during each SVG injection. The SVG element is passed if
    * the injection was successful.
    */
  var each: js.UndefOr[js.Function1[/* svg */ SVGElement | String, Unit]] = js.native
  /**
    * Whether to run scripts blocks found in the SVG.
    *
    * Possible values:
    * 'always' — Run scripts every time.
    * 'once' — Only run scripts once for each SVG.
    * 'never' — Ignore scripts (default)
    */
  var evalScripts: js.UndefOr[String] = js.native
  /**
    * Location of fallback pngs, if desired.
    */
  var pngFallback: js.UndefOr[String] = js.native
}

object SVGInjectorOptions {
  @scala.inline
  def apply(): SVGInjectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGInjectorOptions]
  }
  @scala.inline
  implicit class SVGInjectorOptionsOps[Self <: SVGInjectorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEach(value: /* svg */ SVGElement | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withEvalScripts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withPngFallback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pngFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPngFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pngFallback")(js.undefined)
        ret
    }
  }
  
}

