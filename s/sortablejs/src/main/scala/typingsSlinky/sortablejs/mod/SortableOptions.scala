package typingsSlinky.sortablejs.mod

import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.sortablejs.anon.Get
import typingsSlinky.sortablejs.anon.X
import typingsSlinky.sortablejs.sortablejsNumbers.`-1`
import typingsSlinky.sortablejs.sortablejsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableOptions extends js.Object {
  /**
    * ms, animation speed moving items when sorting, `0` — without animation
    */
  var animation: js.UndefOr[Double] = js.native
  /**
    * Class name for the chosen item
    */
  var chosenClass: js.UndefOr[String] = js.native
  var dataIdAttr: js.UndefOr[String] = js.native
  /**
    * time in milliseconds to define when the sorting should start
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Only delay if user is using touch
    */
  var delayOnTouchOnly: js.UndefOr[Boolean] = js.native
  /**
    * Direction of Sortable
    * (will be detected automatically if not given)
    */
  var direction: js.UndefOr[
    (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
  ] = js.native
  /**
    * Disables the sortable if set to true.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Class name for the dragging item
    */
  var dragClass: js.UndefOr[String] = js.native
  /**
    * Specifies which items inside the element should be draggable
    */
  var draggable: js.UndefOr[String] = js.native
  var dragoverBubble: js.UndefOr[Boolean] = js.native
  var dropBubble: js.UndefOr[Boolean] = js.native
  /**
    * Easing for animation. Defaults to null.
    *
    * See https://easings.net/ for examples.
    *
    * For other possible values, see
    * https://www.w3schools.com/cssref/css3_pr_animation-timing-function.asp
    *
    * @example
    *
    * // CSS functions
    * | 'steps(int, start | end)'
    * | 'cubic-bezier(n, n, n, n)'
    *
    * // CSS values
    * | 'linear'
    * | 'ease'
    * | 'ease-in'
    * | 'ease-out'
    * | 'ease-in-out'
    * | 'step-start'
    * | 'step-end'
    * | 'initial'
    * | 'inherit'
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * distance mouse must be from empty sortable
    * to insert drag element into it
    */
  var emptyInsertThreshold: js.UndefOr[Double] = js.native
  /**
    * Class name for the cloned DOM Element when using forceFallback
    */
  var fallbackClass: js.UndefOr[String] = js.native
  var fallbackOffset: js.UndefOr[X] = js.native
  /**
    * Appends the cloned DOM Element into the Document's Body
    */
  var fallbackOnBody: js.UndefOr[Boolean] = js.native
  /**
    * Specify in pixels how far the mouse should move before it's considered as a drag.
    */
  var fallbackTolerance: js.UndefOr[Double] = js.native
  /**
    * Selectors that do not lead to dragging (String or Function)
    */
  var filter: js.UndefOr[
    String | (js.ThisFunction3[
      /* this */ Sortable, 
      /* event */ Event | TouchEvent, 
      /* target */ HTMLElement, 
      /* sortable */ Sortable, 
      Boolean
    ])
  ] = js.native
  /**
    * ignore the HTML5 DnD behaviour and force the fallback to kick in
    */
  var forceFallback: js.UndefOr[Boolean] = js.native
  /**
    * Class name for the drop placeholder
    */
  var ghostClass: js.UndefOr[String] = js.native
  /**
    * To drag elements from one list into another, both lists must have the same group value.
    * You can also define whether lists can give away, give and keep a copy (clone), and receive elements.
    */
  var group: js.UndefOr[String | GroupOptions] = js.native
  /**
    * Drag handle selector within list items
    */
  var handle: js.UndefOr[String] = js.native
  var ignore: js.UndefOr[String] = js.native
  /**
    * Will always use inverted swap zone if set to true
    */
  var invertSwap: js.UndefOr[Boolean] = js.native
  /**
    * Threshold of the inverted swap zone
    * (will be set to `swapThreshold` value by default)
    */
  var invertedSwapThreshold: js.UndefOr[Double] = js.native
  /**
    * Element is dropped into the list from another list
    */
  var onAdd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Called when dragging element changes position
    */
  var onChange: js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.native
  /**
    * Element is chosen
    */
  var onChoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Created a clone of an element
    */
  var onClone: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Element dragging ended
    */
  var onEnd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Attempt to drag a filtered element
    */
  var onFilter: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Event when you move an item in the list or between lists
    */
  var onMove: js.UndefOr[
    js.Function2[/* evt */ MoveEvent, /* originalEvent */ Event, Boolean | `-1` | `1`]
  ] = js.native
  /**
    * Element is removed from the list into another list
    */
  var onRemove: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Called by any change to the list (add / update / remove)
    */
  var onSort: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Element dragging started
    */
  var onStart: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Element is unchosen
    */
  var onUnchoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Changed sorting within list
    */
  var onUpdate: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Call `event.preventDefault()` when triggered `filter`
    */
  var preventOnFilter: js.UndefOr[Boolean] = js.native
  /**
    * Remove the clone element when it is not showing,
    * rather than just hiding it
    */
  var removeCloneOnHide: js.UndefOr[Boolean] = js.native
  var setData: js.UndefOr[
    js.Function2[/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement, Unit]
  ] = js.native
  /**
    * sorting inside list
    */
  var sort: js.UndefOr[Boolean] = js.native
  var store: js.UndefOr[Get] = js.native
  /**
    * Threshold of the swap zone.
    * Defaults to `1`
    */
  var swapThreshold: js.UndefOr[Double] = js.native
  /**
    * How many *pixels* the point should move before cancelling a delayed drag event
    */
  var touchStartThreshold: js.UndefOr[Double] = js.native
}

object SortableOptions {
  @scala.inline
  def apply(): SortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOptions]
  }
  @scala.inline
  implicit class SortableOptionsOps[Self <: SortableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withChosenClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chosenClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChosenClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chosenClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDataIdAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIdAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIdAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIdAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayOnTouchOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayOnTouchOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayOnTouchOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayOnTouchOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionFunction3(value: (/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement) => Direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDirection(
      value: (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDragClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDragoverBubble(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragoverBubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragoverBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragoverBubble")(js.undefined)
        ret
    }
    @scala.inline
    def withDropBubble(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropBubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropBubble")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyInsertThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyInsertThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyInsertThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyInsertThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackOffset(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackOnBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackOnBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackOnBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackOnBody")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: String | (js.ThisFunction3[
          /* this */ Sortable, 
          /* event */ Event | TouchEvent, 
          /* target */ HTMLElement, 
          /* sortable */ Sortable, 
          Boolean
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withGhostClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGhostClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String | GroupOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertSwap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertSwap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertSwap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertSwap")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertedSwapThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertedSwapThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertedSwapThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertedSwapThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* evt */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChoose(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChoose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChoose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChoose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClone(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilter(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMove(value: (/* evt */ MoveEvent, /* originalEvent */ Event) => Boolean | `-1` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSort(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnchoose(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnchoose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnchoose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnchoose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventOnFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventOnFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventOnFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventOnFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCloneOnHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCloneOnHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveCloneOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCloneOnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: (/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: Get): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withSwapThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchStartThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStartThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchStartThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStartThreshold")(js.undefined)
        ret
    }
  }
  
}

