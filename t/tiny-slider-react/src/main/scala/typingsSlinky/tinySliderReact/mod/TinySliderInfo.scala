package typingsSlinky.tinySliderReact.mod

import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinySliderInfo extends js.Object {
  var cloneCount: Double = js.native
  var container: HTMLElement = js.native
  var controlsContainer: js.UndefOr[Boolean] = js.native
  var hasControls: Boolean = js.native
  var index: Double = js.native
  var indexCached: Double = js.native
  var items: Double = js.native
  var navContainer: js.UndefOr[HTMLElement] = js.native
  var navCurrentIndex: js.UndefOr[Double] = js.native
  var navCurrentIndexCached: js.UndefOr[Double] = js.native
  var navItems: js.UndefOr[HTMLCollection] = js.native
  var nextButton: js.UndefOr[HTMLElement] = js.native
  var prevButton: js.UndefOr[HTMLElement] = js.native
  var slideBy: Double = js.native
  var slideCount: Double = js.native
  var slideCountNew: Double = js.native
  var slideItems: HTMLCollection = js.native
  var visibleNavIndexes: js.UndefOr[Double] = js.native
  var visibleNavIndexesCached: js.UndefOr[Double] = js.native
}

object TinySliderInfo {
  @scala.inline
  def apply(
    cloneCount: Double,
    container: HTMLElement,
    hasControls: Boolean,
    index: Double,
    indexCached: Double,
    items: Double,
    slideBy: Double,
    slideCount: Double,
    slideCountNew: Double,
    slideItems: HTMLCollection
  ): TinySliderInfo = {
    val __obj = js.Dynamic.literal(cloneCount = cloneCount.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], hasControls = hasControls.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexCached = indexCached.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], slideBy = slideBy.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideCountNew = slideCountNew.asInstanceOf[js.Any], slideItems = slideItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinySliderInfo]
  }
  @scala.inline
  implicit class TinySliderInfoOps[Self <: TinySliderInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexCached(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexCached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideCountNew(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCountNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideItems(value: HTMLCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlsContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withNavContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withNavCurrentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navCurrentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavCurrentIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navCurrentIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNavCurrentIndexCached(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navCurrentIndexCached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavCurrentIndexCached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navCurrentIndexCached")(js.undefined)
        ret
    }
    @scala.inline
    def withNavItems(value: HTMLCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButton(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevButton(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButton")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleNavIndexes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleNavIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleNavIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleNavIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleNavIndexesCached(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleNavIndexesCached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleNavIndexesCached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleNavIndexesCached")(js.undefined)
        ret
    }
  }
  
}

