package typingsSlinky.styledComponents.styledComponentsMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheetManagerProps extends js.Object {
  var disableCSSOMInjection: js.UndefOr[Boolean] = js.native
  var disableVendorPrefixes: js.UndefOr[Boolean] = js.native
  var sheet: js.UndefOr[ServerStyleSheet] = js.native
  var stylisPlugins: js.UndefOr[js.Array[StylisPlugin]] = js.native
  var target: js.UndefOr[HTMLElement] = js.native
}

object StyleSheetManagerProps {
  @scala.inline
  def apply(): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
  @scala.inline
  implicit class StyleSheetManagerPropsOps[Self <: StyleSheetManagerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableCSSOMInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCSSOMInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCSSOMInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCSSOMInjection")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableVendorPrefixes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVendorPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableVendorPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVendorPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withSheet(value: ServerStyleSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(js.undefined)
        ret
    }
    @scala.inline
    def withStylisPlugins(value: js.Array[StylisPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylisPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylisPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylisPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

