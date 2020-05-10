package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use the ILayoutSite2 interface. Represents a rendering site for an ILayout.
  **/
@js.native
trait ILayoutSite extends js.Object {
  //#region Properties
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var animationsDisabled: Boolean = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var itemSurface: HTMLElement = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var rtl: Boolean = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var scrollbarPos: Double = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var surface: HTMLElement = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewport: HTMLElement = js.native
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewportSize: js.Any = js.native
}

object ILayoutSite {
  @scala.inline
  def apply(
    animationsDisabled: Boolean,
    itemSurface: HTMLElement,
    rtl: Boolean,
    scrollbarPos: Double,
    surface: HTMLElement,
    viewport: HTMLElement,
    viewportSize: js.Any
  ): ILayoutSite = {
    val __obj = js.Dynamic.literal(animationsDisabled = animationsDisabled.asInstanceOf[js.Any], itemSurface = itemSurface.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], scrollbarPos = scrollbarPos.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayoutSite]
  }
  @scala.inline
  implicit class ILayoutSiteOps[Self <: ILayoutSite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSurface(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSurface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurface(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

