package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait env extends js.Object {
  var cssPrefix: String = js.native
  var isFF: Boolean = js.native
  var isIE: Boolean = js.native
  var isSafari: Boolean = js.native
  var isWebKit: Boolean = js.native
  var jsPrefix: String = js.native
  var mouse: js.Any = js.native
  var strict: Boolean = js.native
  var svg: Boolean = js.native
  var transform: Boolean = js.native
  var transition: Boolean = js.native
  var transitionDuration: String = js.native
  var transitionEnd: String = js.native
  var translate: String = js.native
}

object env {
  @scala.inline
  def apply(
    cssPrefix: String,
    isFF: Boolean,
    isIE: Boolean,
    isSafari: Boolean,
    isWebKit: Boolean,
    jsPrefix: String,
    mouse: js.Any,
    strict: Boolean,
    svg: Boolean,
    transform: Boolean,
    transition: Boolean,
    transitionDuration: String,
    transitionEnd: String,
    translate: String
  ): env = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix.asInstanceOf[js.Any], isFF = isFF.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], isSafari = isSafari.asInstanceOf[js.Any], isWebKit = isWebKit.asInstanceOf[js.Any], jsPrefix = jsPrefix.asInstanceOf[js.Any], mouse = mouse.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[env]
  }
  @scala.inline
  implicit class envOps[Self <: env] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSafari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWebKit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebKit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

