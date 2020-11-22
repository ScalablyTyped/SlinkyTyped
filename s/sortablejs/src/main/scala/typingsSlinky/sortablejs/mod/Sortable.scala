package typingsSlinky.sortablejs.mod

import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.sortablejs.anon.Get
import typingsSlinky.sortablejs.anon.X
import typingsSlinky.sortablejs.sortablejsNumbers.`-1`
import typingsSlinky.sortablejs.sortablejsNumbers.`1`
import typingsSlinky.sortablejs.sortablejsStrings.animation
import typingsSlinky.sortablejs.sortablejsStrings.bubbleScroll
import typingsSlinky.sortablejs.sortablejsStrings.chosenClass
import typingsSlinky.sortablejs.sortablejsStrings.continue
import typingsSlinky.sortablejs.sortablejsStrings.dataIdAttr
import typingsSlinky.sortablejs.sortablejsStrings.delay
import typingsSlinky.sortablejs.sortablejsStrings.delayOnTouchOnly
import typingsSlinky.sortablejs.sortablejsStrings.direction
import typingsSlinky.sortablejs.sortablejsStrings.disabled
import typingsSlinky.sortablejs.sortablejsStrings.dragClass
import typingsSlinky.sortablejs.sortablejsStrings.draggable
import typingsSlinky.sortablejs.sortablejsStrings.dragoverBubble
import typingsSlinky.sortablejs.sortablejsStrings.dropBubble
import typingsSlinky.sortablejs.sortablejsStrings.easing
import typingsSlinky.sortablejs.sortablejsStrings.emptyInsertThreshold
import typingsSlinky.sortablejs.sortablejsStrings.fallbackClass
import typingsSlinky.sortablejs.sortablejsStrings.fallbackOffset
import typingsSlinky.sortablejs.sortablejsStrings.fallbackOnBody
import typingsSlinky.sortablejs.sortablejsStrings.fallbackTolerance
import typingsSlinky.sortablejs.sortablejsStrings.filter
import typingsSlinky.sortablejs.sortablejsStrings.forceFallback
import typingsSlinky.sortablejs.sortablejsStrings.ghostClass
import typingsSlinky.sortablejs.sortablejsStrings.group
import typingsSlinky.sortablejs.sortablejsStrings.handle
import typingsSlinky.sortablejs.sortablejsStrings.ignore
import typingsSlinky.sortablejs.sortablejsStrings.invertSwap
import typingsSlinky.sortablejs.sortablejsStrings.invertedSwapThreshold
import typingsSlinky.sortablejs.sortablejsStrings.multiDrag
import typingsSlinky.sortablejs.sortablejsStrings.multiDragKey
import typingsSlinky.sortablejs.sortablejsStrings.onAdd
import typingsSlinky.sortablejs.sortablejsStrings.onChange
import typingsSlinky.sortablejs.sortablejsStrings.onChoose
import typingsSlinky.sortablejs.sortablejsStrings.onClone
import typingsSlinky.sortablejs.sortablejsStrings.onDeselect
import typingsSlinky.sortablejs.sortablejsStrings.onEnd
import typingsSlinky.sortablejs.sortablejsStrings.onFilter
import typingsSlinky.sortablejs.sortablejsStrings.onMove
import typingsSlinky.sortablejs.sortablejsStrings.onRemove
import typingsSlinky.sortablejs.sortablejsStrings.onSelect
import typingsSlinky.sortablejs.sortablejsStrings.onSort
import typingsSlinky.sortablejs.sortablejsStrings.onSpill
import typingsSlinky.sortablejs.sortablejsStrings.onStart
import typingsSlinky.sortablejs.sortablejsStrings.onUnchoose
import typingsSlinky.sortablejs.sortablejsStrings.onUpdate
import typingsSlinky.sortablejs.sortablejsStrings.preventOnFilter
import typingsSlinky.sortablejs.sortablejsStrings.removeCloneOnHide
import typingsSlinky.sortablejs.sortablejsStrings.removeOnSpill
import typingsSlinky.sortablejs.sortablejsStrings.revertOnSpill
import typingsSlinky.sortablejs.sortablejsStrings.scroll
import typingsSlinky.sortablejs.sortablejsStrings.scrollFn
import typingsSlinky.sortablejs.sortablejsStrings.scrollSensitivity
import typingsSlinky.sortablejs.sortablejsStrings.scrollSpeed
import typingsSlinky.sortablejs.sortablejsStrings.selectedClass
import typingsSlinky.sortablejs.sortablejsStrings.setData
import typingsSlinky.sortablejs.sortablejsStrings.sort
import typingsSlinky.sortablejs.sortablejsStrings.store
import typingsSlinky.sortablejs.sortablejsStrings.swap
import typingsSlinky.sortablejs.sortablejsStrings.swapClass
import typingsSlinky.sortablejs.sortablejsStrings.swapThreshold
import typingsSlinky.sortablejs.sortablejsStrings.touchStartThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sortable extends js.Object {
  
  /**
    * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
    * @param element an HTMLElement or selector string.
    * @param selector default: `options.draggable`
    */
  def closest(element: HTMLElement): HTMLElement | Null = js.native
  def closest(element: HTMLElement, selector: String): HTMLElement | Null = js.native
  
  /**
    * Removes the sortable functionality completely.
    */
  def destroy(): Unit = js.native
  
  var el: HTMLElement = js.native
  
  def option(
    name: onMove,
    value: js.Function2[/* evt */ MoveEvent, /* originalEvent */ Event, Boolean | `-1` | `1` | Unit]
  ): Unit = js.native
  def option(
    name: scrollFn,
    value: js.ThisFunction5[
      /* this */ ^, 
      /* offsetX */ Double, 
      /* offsetY */ Double, 
      /* originalEvent */ Event, 
      /* touchEvt */ TouchEvent, 
      /* hoverTargetEl */ HTMLElement, 
      continue | Unit
    ]
  ): Unit = js.native
  @JSName("option")
  def option_animation(name: animation): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_animation(name: animation, value: Double): Unit = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_animation_Unit(name: animation): Unit = js.native
  @JSName("option")
  def option_bubbleScroll(name: bubbleScroll): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_bubbleScroll(name: bubbleScroll, value: Boolean): Unit = js.native
  @JSName("option")
  def option_bubbleScroll_Unit(name: bubbleScroll): Unit = js.native
  @JSName("option")
  def option_chosenClass(name: chosenClass): js.UndefOr[String] = js.native
  @JSName("option")
  def option_chosenClass(name: chosenClass, value: String): Unit = js.native
  @JSName("option")
  def option_chosenClass_Unit(name: chosenClass): Unit = js.native
  @JSName("option")
  def option_dataIdAttr(name: dataIdAttr): js.UndefOr[String] = js.native
  @JSName("option")
  def option_dataIdAttr(name: dataIdAttr, value: String): Unit = js.native
  @JSName("option")
  def option_dataIdAttr_Unit(name: dataIdAttr): Unit = js.native
  @JSName("option")
  def option_delay(name: delay): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_delay(name: delay, value: Double): Unit = js.native
  @JSName("option")
  def option_delayOnTouchOnly(name: delayOnTouchOnly): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_delayOnTouchOnly(name: delayOnTouchOnly, value: Boolean): Unit = js.native
  @JSName("option")
  def option_delayOnTouchOnly_Unit(name: delayOnTouchOnly): Unit = js.native
  @JSName("option")
  def option_delay_Unit(name: delay): Unit = js.native
  @JSName("option")
  def option_direction(name: direction): js.UndefOr[
    (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
  ] = js.native
  @JSName("option")
  def option_direction(
    name: direction,
    value: js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]
  ): Unit = js.native
  @JSName("option")
  def option_direction(name: direction, value: Direction): Unit = js.native
  @JSName("option")
  def option_direction_Unit(name: direction): Unit = js.native
  @JSName("option")
  def option_disabled(name: disabled): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_disabled(name: disabled, value: Boolean): Unit = js.native
  @JSName("option")
  def option_disabled_Unit(name: disabled): Unit = js.native
  @JSName("option")
  def option_dragClass(name: dragClass): js.UndefOr[String] = js.native
  @JSName("option")
  def option_dragClass(name: dragClass, value: String): Unit = js.native
  @JSName("option")
  def option_dragClass_Unit(name: dragClass): Unit = js.native
  @JSName("option")
  def option_draggable(name: draggable): js.UndefOr[String] = js.native
  @JSName("option")
  def option_draggable(name: draggable, value: String): Unit = js.native
  @JSName("option")
  def option_draggable_Unit(name: draggable): Unit = js.native
  @JSName("option")
  def option_dragoverBubble(name: dragoverBubble): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_dragoverBubble(name: dragoverBubble, value: Boolean): Unit = js.native
  @JSName("option")
  def option_dragoverBubble_Unit(name: dragoverBubble): Unit = js.native
  @JSName("option")
  def option_dropBubble(name: dropBubble): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_dropBubble(name: dropBubble, value: Boolean): Unit = js.native
  @JSName("option")
  def option_dropBubble_Unit(name: dropBubble): Unit = js.native
  @JSName("option")
  def option_easing(name: easing): js.UndefOr[String] = js.native
  @JSName("option")
  def option_easing(name: easing, value: String): Unit = js.native
  @JSName("option")
  def option_easing_Unit(name: easing): Unit = js.native
  @JSName("option")
  def option_emptyInsertThreshold(name: emptyInsertThreshold): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_emptyInsertThreshold(name: emptyInsertThreshold, value: Double): Unit = js.native
  @JSName("option")
  def option_emptyInsertThreshold_Unit(name: emptyInsertThreshold): Unit = js.native
  @JSName("option")
  def option_fallbackClass(name: fallbackClass): js.UndefOr[String] = js.native
  @JSName("option")
  def option_fallbackClass(name: fallbackClass, value: String): Unit = js.native
  @JSName("option")
  def option_fallbackClass_Unit(name: fallbackClass): Unit = js.native
  @JSName("option")
  def option_fallbackOffset(name: fallbackOffset): js.UndefOr[X] = js.native
  @JSName("option")
  def option_fallbackOffset(name: fallbackOffset, value: X): Unit = js.native
  @JSName("option")
  def option_fallbackOffset_Unit(name: fallbackOffset): Unit = js.native
  @JSName("option")
  def option_fallbackOnBody(name: fallbackOnBody): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_fallbackOnBody(name: fallbackOnBody, value: Boolean): Unit = js.native
  @JSName("option")
  def option_fallbackOnBody_Unit(name: fallbackOnBody): Unit = js.native
  @JSName("option")
  def option_fallbackTolerance(name: fallbackTolerance): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_fallbackTolerance(name: fallbackTolerance, value: Double): Unit = js.native
  @JSName("option")
  def option_fallbackTolerance_Unit(name: fallbackTolerance): Unit = js.native
  @JSName("option")
  def option_filter(name: filter): js.UndefOr[
    String | (js.ThisFunction3[
      /* this */ this.type, 
      /* event */ Event | TouchEvent, 
      /* target */ HTMLElement, 
      /* sortable */ this.type, 
      Boolean
    ])
  ] = js.native
  @JSName("option")
  def option_filter(name: filter, value: String): Unit = js.native
  @JSName("option")
  def option_filter(
    name: filter,
    value: js.ThisFunction3[
      /* this */ this.type, 
      /* event */ Event | TouchEvent, 
      /* target */ HTMLElement, 
      /* sortable */ this.type, 
      Boolean
    ]
  ): Unit = js.native
  @JSName("option")
  def option_filter_Unit(name: filter): Unit = js.native
  @JSName("option")
  def option_forceFallback(name: forceFallback): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_forceFallback(name: forceFallback, value: Boolean): Unit = js.native
  @JSName("option")
  def option_forceFallback_Unit(name: forceFallback): Unit = js.native
  @JSName("option")
  def option_ghostClass(name: ghostClass): js.UndefOr[String] = js.native
  @JSName("option")
  def option_ghostClass(name: ghostClass, value: String): Unit = js.native
  @JSName("option")
  def option_ghostClass_Unit(name: ghostClass): Unit = js.native
  @JSName("option")
  def option_group(name: group): js.UndefOr[String | GroupOptions] = js.native
  @JSName("option")
  def option_group(name: group, value: String): Unit = js.native
  @JSName("option")
  def option_group(name: group, value: GroupOptions): Unit = js.native
  @JSName("option")
  def option_group_Unit(name: group): Unit = js.native
  @JSName("option")
  def option_handle(name: handle): js.UndefOr[String] = js.native
  @JSName("option")
  def option_handle(name: handle, value: String): Unit = js.native
  @JSName("option")
  def option_handle_Unit(name: handle): Unit = js.native
  @JSName("option")
  def option_ignore(name: ignore): js.UndefOr[String] = js.native
  @JSName("option")
  def option_ignore(name: ignore, value: String): Unit = js.native
  @JSName("option")
  def option_ignore_Unit(name: ignore): Unit = js.native
  @JSName("option")
  def option_invertSwap(name: invertSwap): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_invertSwap(name: invertSwap, value: Boolean): Unit = js.native
  @JSName("option")
  def option_invertSwap_Unit(name: invertSwap): Unit = js.native
  @JSName("option")
  def option_invertedSwapThreshold(name: invertedSwapThreshold): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_invertedSwapThreshold(name: invertedSwapThreshold, value: Double): Unit = js.native
  @JSName("option")
  def option_invertedSwapThreshold_Unit(name: invertedSwapThreshold): Unit = js.native
  @JSName("option")
  def option_multiDrag(name: multiDrag): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_multiDrag(name: multiDrag, value: Boolean): Unit = js.native
  @JSName("option")
  def option_multiDragKey(name: multiDragKey): js.UndefOr[Null] = js.native
  @JSName("option")
  def option_multiDragKey_Unit(name: multiDragKey): Unit = js.native
  @JSName("option")
  def option_multiDrag_Unit(name: multiDrag): Unit = js.native
  @JSName("option")
  def option_onAdd(name: onAdd): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onAdd(name: onAdd, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onAdd_Unit(name: onAdd): Unit = js.native
  @JSName("option")
  def option_onChange(name: onChange): js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onChange(name: onChange, value: js.Function1[/* evt */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onChange_Unit(name: onChange): Unit = js.native
  @JSName("option")
  def option_onChoose(name: onChoose): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onChoose(name: onChoose, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onChoose_Unit(name: onChoose): Unit = js.native
  @JSName("option")
  def option_onClone(name: onClone): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onClone(name: onClone, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onClone_Unit(name: onClone): Unit = js.native
  @JSName("option")
  def option_onDeselect(name: onDeselect): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onDeselect(name: onDeselect, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onDeselect_Unit(name: onDeselect): Unit = js.native
  @JSName("option")
  def option_onEnd(name: onEnd): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onEnd(name: onEnd, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onEnd_Unit(name: onEnd): Unit = js.native
  @JSName("option")
  def option_onFilter(name: onFilter): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onFilter(name: onFilter, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onFilter_Unit(name: onFilter): Unit = js.native
  @JSName("option")
  def option_onMove(name: onMove): js.UndefOr[
    js.Function2[/* evt */ MoveEvent, /* originalEvent */ Event, Boolean | `-1` | `1` | Unit]
  ] = js.native
  @JSName("option")
  def option_onMove_Unit(name: onMove): Unit = js.native
  @JSName("option")
  def option_onRemove(name: onRemove): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onRemove(name: onRemove, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onRemove_Unit(name: onRemove): Unit = js.native
  @JSName("option")
  def option_onSelect(name: onSelect): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onSelect(name: onSelect, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onSelect_Unit(name: onSelect): Unit = js.native
  @JSName("option")
  def option_onSort(name: onSort): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onSort(name: onSort, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onSort_Unit(name: onSort): Unit = js.native
  @JSName("option")
  def option_onSpill(name: onSpill): js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onSpill(name: onSpill, value: js.Function1[/* evt */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onSpill_Unit(name: onSpill): Unit = js.native
  @JSName("option")
  def option_onStart(name: onStart): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onStart(name: onStart, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onStart_Unit(name: onStart): Unit = js.native
  @JSName("option")
  def option_onUnchoose(name: onUnchoose): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onUnchoose(name: onUnchoose, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onUnchoose_Unit(name: onUnchoose): Unit = js.native
  @JSName("option")
  def option_onUpdate(name: onUpdate): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  @JSName("option")
  def option_onUpdate(name: onUpdate, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
  @JSName("option")
  def option_onUpdate_Unit(name: onUpdate): Unit = js.native
  @JSName("option")
  def option_preventOnFilter(name: preventOnFilter): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_preventOnFilter(name: preventOnFilter, value: Boolean): Unit = js.native
  @JSName("option")
  def option_preventOnFilter_Unit(name: preventOnFilter): Unit = js.native
  @JSName("option")
  def option_removeCloneOnHide(name: removeCloneOnHide): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_removeCloneOnHide(name: removeCloneOnHide, value: Boolean): Unit = js.native
  @JSName("option")
  def option_removeCloneOnHide_Unit(name: removeCloneOnHide): Unit = js.native
  @JSName("option")
  def option_removeOnSpill(name: removeOnSpill): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_removeOnSpill(name: removeOnSpill, value: Boolean): Unit = js.native
  @JSName("option")
  def option_removeOnSpill_Unit(name: removeOnSpill): Unit = js.native
  @JSName("option")
  def option_revertOnSpill(name: revertOnSpill): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_revertOnSpill(name: revertOnSpill, value: Boolean): Unit = js.native
  @JSName("option")
  def option_revertOnSpill_Unit(name: revertOnSpill): Unit = js.native
  @JSName("option")
  def option_scroll(name: scroll): js.UndefOr[Boolean | HTMLElement] = js.native
  @JSName("option")
  def option_scroll(name: scroll, value: Boolean): Unit = js.native
  @JSName("option")
  def option_scroll(name: scroll, value: HTMLElement): Unit = js.native
  @JSName("option")
  def option_scrollFn(name: scrollFn): js.UndefOr[
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
  @JSName("option")
  def option_scrollFn_Unit(name: scrollFn): Unit = js.native
  @JSName("option")
  def option_scrollSensitivity(name: scrollSensitivity): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_scrollSensitivity(name: scrollSensitivity, value: Double): Unit = js.native
  @JSName("option")
  def option_scrollSensitivity_Unit(name: scrollSensitivity): Unit = js.native
  @JSName("option")
  def option_scrollSpeed(name: scrollSpeed): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_scrollSpeed(name: scrollSpeed, value: Double): Unit = js.native
  @JSName("option")
  def option_scrollSpeed_Unit(name: scrollSpeed): Unit = js.native
  @JSName("option")
  def option_scroll_Unit(name: scroll): Unit = js.native
  @JSName("option")
  def option_selectedClass(name: selectedClass): js.UndefOr[String] = js.native
  @JSName("option")
  def option_selectedClass(name: selectedClass, value: String): Unit = js.native
  @JSName("option")
  def option_selectedClass_Unit(name: selectedClass): Unit = js.native
  @JSName("option")
  def option_setData(name: setData): js.UndefOr[
    js.Function2[/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement, Unit]
  ] = js.native
  @JSName("option")
  def option_setData(
    name: setData,
    value: js.Function2[/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement, Unit]
  ): Unit = js.native
  @JSName("option")
  def option_setData_Unit(name: setData): Unit = js.native
  @JSName("option")
  def option_sort(name: sort): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_sort(name: sort, value: Boolean): Unit = js.native
  @JSName("option")
  def option_sort_Unit(name: sort): Unit = js.native
  @JSName("option")
  def option_store(name: store): js.UndefOr[Get] = js.native
  @JSName("option")
  def option_store(name: store, value: Get): Unit = js.native
  @JSName("option")
  def option_store_Unit(name: store): Unit = js.native
  @JSName("option")
  def option_swap(name: swap): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_swap(name: swap, value: Boolean): Unit = js.native
  @JSName("option")
  def option_swapClass(name: swapClass): js.UndefOr[String] = js.native
  @JSName("option")
  def option_swapClass(name: swapClass, value: String): Unit = js.native
  @JSName("option")
  def option_swapClass_Unit(name: swapClass): Unit = js.native
  @JSName("option")
  def option_swapThreshold(name: swapThreshold): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_swapThreshold(name: swapThreshold, value: Double): Unit = js.native
  @JSName("option")
  def option_swapThreshold_Unit(name: swapThreshold): Unit = js.native
  @JSName("option")
  def option_swap_Unit(name: swap): Unit = js.native
  @JSName("option")
  def option_touchStartThreshold(name: touchStartThreshold): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_touchStartThreshold(name: touchStartThreshold, value: Double): Unit = js.native
  @JSName("option")
  def option_touchStartThreshold_Unit(name: touchStartThreshold): Unit = js.native
  
  var options: Options = js.native
  
  /**
    * Saving and restoring of the sort.
    */
  def save(): Unit = js.native
  
  /**
    * Sorts the elements according to the array.
    * @param order an array of strings to sort.
    */
  def sort(order: js.Array[String]): Unit = js.native
  
  /**
    * Serializes the sortable's item data-id's (dataIdAttr option) into an array of string.
    */
  def toArray(): js.Array[String] = js.native
}
