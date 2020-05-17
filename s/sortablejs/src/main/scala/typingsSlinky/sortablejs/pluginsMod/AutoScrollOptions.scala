package typingsSlinky.sortablejs.pluginsMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.sortablejs.mod.^
import typingsSlinky.sortablejs.sortablejsStrings.continue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScrollOptions extends js.Object {
  /**
    * apply autoscroll to all parent elements, allowing for easier movement.
    */
  var bubbleScroll: js.UndefOr[Boolean] = js.native
  /**
    *  Enable the plugin. Can be `HTMLElement`.
    */
  var scroll: js.UndefOr[Boolean | HTMLElement] = js.native
  /**
    * if you have custom scrollbar scrollFn may be used for autoscrolling.
    */
  var scrollFn: js.UndefOr[
    js.ThisFunction5[
      /* this */ ^, 
      /* offsetX */ Double, 
      /* offsetY */ Double, 
      /* originalEvent */ Event, 
      /* touchEvt */ TouchEvent, 
      /* hoverTargetEl */ HTMLElement, 
      continue | Unit
    ]
  ] = js.native
  /**
    * `px`, how near the mouse must be to an edge to start scrolling.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.native
  /**
    * `px`, speed of the scrolling.`
    */
  var scrollSpeed: js.UndefOr[Double] = js.native
}

object AutoScrollOptions {
  @scala.inline
  def apply(): AutoScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScrollOptions]
  }
  @scala.inline
  implicit class AutoScrollOptionsOps[Self <: AutoScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbleScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: Boolean | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollFn(
      value: js.ThisFunction5[
          /* this */ ^, 
          /* offsetX */ Double, 
          /* offsetY */ Double, 
          /* originalEvent */ Event, 
          /* touchEvt */ TouchEvent, 
          /* hoverTargetEl */ HTMLElement, 
          continue | Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollFn")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(js.undefined)
        ret
    }
  }
  
}

