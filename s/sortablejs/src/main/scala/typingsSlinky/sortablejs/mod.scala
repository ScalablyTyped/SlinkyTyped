package typingsSlinky.sortablejs

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.sortablejs.anon.Get
import typingsSlinky.sortablejs.anon.Index
import typingsSlinky.sortablejs.anon.X
import typingsSlinky.sortablejs.pluginsMod.AutoScrollOptions
import typingsSlinky.sortablejs.pluginsMod.AutoScrollPlugin
import typingsSlinky.sortablejs.pluginsMod.MultiDragOptions
import typingsSlinky.sortablejs.pluginsMod.MultiDragPlugin
import typingsSlinky.sortablejs.pluginsMod.OnSpillOptions
import typingsSlinky.sortablejs.pluginsMod.OnSpillPlugin
import typingsSlinky.sortablejs.pluginsMod.SortablePlugin
import typingsSlinky.sortablejs.pluginsMod.SwapOptions
import typingsSlinky.sortablejs.pluginsMod.SwapPlugin
import typingsSlinky.sortablejs.sortablejsNumbers.`-1`
import typingsSlinky.sortablejs.sortablejsNumbers.`1`
import typingsSlinky.sortablejs.sortablejsStrings.animation
import typingsSlinky.sortablejs.sortablejsStrings.bubbleScroll
import typingsSlinky.sortablejs.sortablejsStrings.chosenClass
import typingsSlinky.sortablejs.sortablejsStrings.clone
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
import typingsSlinky.std.Event
import typingsSlinky.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sortablejs", JSImport.Namespace)
  @js.native
  class ^ protected () extends Sortable {
    /**
      * Sortable's main constructor.
      * @param element Any variety of HTMLElement.
      * @param options Sortable options object.
      */
    def this(element: HTMLElement, options: Options) = this()
  }
  @JSImport("sortablejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sortablejs", "AutoScroll")
  @js.native
  class AutoScroll () extends AutoScrollPlugin
  
  @JSImport("sortablejs", "MultiDrag")
  @js.native
  class MultiDrag () extends MultiDragPlugin
  
  @JSImport("sortablejs", "OnSpill")
  @js.native
  class OnSpill () extends OnSpillPlugin
  
  @JSImport("sortablejs", "Plugin")
  @js.native
  class Plugin () extends SortablePlugin
  
  @JSImport("sortablejs", "Swap")
  @js.native
  class Swap () extends SwapPlugin
  
  /* static member */
  @JSImport("sortablejs", "active")
  @js.native
  def active: Sortable | Null = js.native
  @scala.inline
  def active_=(x: Sortable | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
  
  /** The clone element. */
  /* static member */
  @JSImport("sortablejs", "clone")
  @js.native
  def clone_ : HTMLElement | Null = js.native
  
  @scala.inline
  def clone__=(x: HTMLElement | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clone")(x.asInstanceOf[js.Any])
  
  /**
    * Creation of new instances.
    * @param element Any variety of HTMLElement.
    * @param options Sortable options object.
    */
  /* static member */
  @JSImport("sortablejs", "create")
  @js.native
  def create(element: HTMLElement): Sortable = js.native
  @JSImport("sortablejs", "create")
  @js.native
  def create(element: HTMLElement, options: Options): Sortable = js.native
  
  /** The element being dragged. */
  /* static member */
  @JSImport("sortablejs", "dragged")
  @js.native
  def dragged: HTMLElement | Null = js.native
  @scala.inline
  def dragged_=(x: HTMLElement | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragged")(x.asInstanceOf[js.Any])
  
  /** Get the Sortable instance on an element. */
  /* static member */
  @JSImport("sortablejs", "get")
  @js.native
  def get(element: HTMLElement): js.UndefOr[Sortable] = js.native
  
  /** The ghost element.*/
  /* static member */
  @JSImport("sortablejs", "ghost")
  @js.native
  def ghost: HTMLElement | Null = js.native
  @scala.inline
  def ghost_=(x: HTMLElement | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ghost")(x.asInstanceOf[js.Any])
  
  /**
    * Mounts a plugin to Sortable
    * @param sortablePlugin a sortable plugin.
    *
    * @example
    *
    * Sortable.mount(new MultiDrag(), new AutoScroll())
    */
  /* static member */
  @JSImport("sortablejs", "mount")
  @js.native
  def mount(sortablePlugins: SortablePlugin*): Unit = js.native
  
  /* static member */
  @JSImport("sortablejs", "utils")
  @js.native
  def utils: Utils_ = js.native
  @scala.inline
  def utils_=(x: Utils_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
  
  /** Get the Sortable version */
  /* static member */
  @JSImport("sortablejs", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait DOMRect extends StObject {
    
    var bottom: Double = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object DOMRect {
    
    @scala.inline
    def apply(
      bottom: Double,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): DOMRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMRect]
    }
    
    @scala.inline
    implicit class DOMRectMutableBuilder[Self <: DOMRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sortablejs.sortablejsStrings.vertical
    - typingsSlinky.sortablejs.sortablejsStrings.horizontal
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def horizontal: typingsSlinky.sortablejs.sortablejsStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.sortablejs.sortablejsStrings.horizontal]
    
    @scala.inline
    def vertical: typingsSlinky.sortablejs.sortablejsStrings.vertical = "vertical".asInstanceOf[typingsSlinky.sortablejs.sortablejsStrings.vertical]
  }
  
  @js.native
  trait GroupOptions extends StObject {
    
    /**
      * a canonical version of pull, created by Sortable
      */
    var checkPull: js.UndefOr[
        js.Function4[
          /* sortable */ Sortable, 
          /* activeSortable */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          Boolean | String | js.Array[String]
        ]
      ] = js.native
    
    /**
      * a canonical version of put, created by Sortable
      */
    var checkPut: js.UndefOr[
        js.Function4[
          /* sortable */ Sortable, 
          /* activeSortable */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          Boolean | String | clone | js.Array[String]
        ]
      ] = js.native
    
    /**
      * group name
      */
    var name: String = js.native
    
    /**
      * ability to move from the list. clone — copy the item, rather than move.
      */
    var pull: js.UndefOr[
        PullResult | (js.Function4[
          /* to */ Sortable, 
          /* from */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          PullResult
        ])
      ] = js.native
    
    /**
      * whether elements can be added from other lists, or an array of group names from which elements can be taken.
      */
    var put: js.UndefOr[
        PutResult | (js.Function4[
          /* to */ Sortable, 
          /* from */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          PutResult
        ])
      ] = js.native
    
    /**
      * revert cloned element to initial position after moving to a another list.
      */
    var revertClone: js.UndefOr[Boolean] = js.native
  }
  object GroupOptions {
    
    @scala.inline
    def apply(name: String): GroupOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupOptions]
    }
    
    @scala.inline
    implicit class GroupOptionsMutableBuilder[Self <: GroupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckPull(
        value: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | js.Array[String]
      ): Self = StObject.set(x, "checkPull", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCheckPullUndefined: Self = StObject.set(x, "checkPull", js.undefined)
      
      @scala.inline
      def setCheckPut(
        value: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | clone | js.Array[String]
      ): Self = StObject.set(x, "checkPut", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCheckPutUndefined: Self = StObject.set(x, "checkPut", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPull(
        value: PullResult | (js.Function4[
              /* to */ Sortable, 
              /* from */ Sortable, 
              /* dragEl */ HTMLElement, 
              /* event */ SortableEvent, 
              PullResult
            ])
      ): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullFunction4(
        value: (/* to */ Sortable, /* from */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => PullResult
      ): Self = StObject.set(x, "pull", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      @scala.inline
      def setPullVarargs(value: String*): Self = StObject.set(x, "pull", js.Array(value :_*))
      
      @scala.inline
      def setPut(
        value: PutResult | (js.Function4[
              /* to */ Sortable, 
              /* from */ Sortable, 
              /* dragEl */ HTMLElement, 
              /* event */ SortableEvent, 
              PutResult
            ])
      ): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPutFunction4(
        value: (/* to */ Sortable, /* from */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => PutResult
      ): Self = StObject.set(x, "put", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      @scala.inline
      def setPutVarargs(value: String*): Self = StObject.set(x, "put", js.Array(value :_*))
      
      @scala.inline
      def setRevertClone(value: Boolean): Self = StObject.set(x, "revertClone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertCloneUndefined: Self = StObject.set(x, "revertClone", js.undefined)
    }
  }
  
  @js.native
  trait MoveEvent extends Event {
    
    var dragged: HTMLElement = js.native
    
    var draggedRect: DOMRect = js.native
    
    var from: HTMLElement = js.native
    
    /**
      * element on which have guided
      */
    var related: HTMLElement = js.native
    
    var relatedRect: DOMRect = js.native
    
    var to: HTMLElement = js.native
    
    var willInsertAfter: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait Options
    extends SortableOptions
       with AutoScrollOptions
       with MultiDragOptions
       with OnSpillOptions
       with SwapOptions
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  type PullResult = js.Array[String] | Boolean | clone
  
  type PutResult = js.Array[String] | Boolean
  
  @js.native
  trait Sortable extends StObject {
    
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
      value: js.Function2[
          /* evt */ MoveEvent, 
          /* originalEvent */ org.scalajs.dom.raw.Event, 
          Boolean | `-1` | `1` | Unit
        ]
    ): Unit = js.native
    def option(
      name: scrollFn,
      value: js.ThisFunction5[
          /* this */ typingsSlinky.sortablejs.mod.^, 
          /* offsetX */ Double, 
          /* offsetY */ Double, 
          /* originalEvent */ org.scalajs.dom.raw.Event, 
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
          /* event */ org.scalajs.dom.raw.Event | TouchEvent, 
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
          /* event */ org.scalajs.dom.raw.Event | TouchEvent, 
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
        js.Function2[
          /* evt */ MoveEvent, 
          /* originalEvent */ org.scalajs.dom.raw.Event, 
          Boolean | `-1` | `1` | Unit
        ]
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
    def option_scroll(name: scroll, value: HTMLElement): Unit = js.native
    @JSName("option")
    def option_scroll(name: scroll, value: Boolean): Unit = js.native
    @JSName("option")
    def option_scrollFn(name: scrollFn): js.UndefOr[
        js.ThisFunction5[
          /* this */ typingsSlinky.sortablejs.mod.^, 
          /* offsetX */ Double, 
          /* offsetY */ Double, 
          /* originalEvent */ org.scalajs.dom.raw.Event, 
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
  
  @js.native
  trait SortableEvent extends Event {
    
    @JSName("clone")
    var clone_FSortableEvent: HTMLElement = js.native
    
    /**
      * previous list
      */
    var from: HTMLElement = js.native
    
    /**
      * dragged element
      */
    var item: HTMLElement = js.native
    
    /**
      * New index within parent, only counting draggable elements
      */
    var newDraggableIndex: js.UndefOr[Double] = js.native
    
    /**
      * new index within parent
      */
    var newIndex: js.UndefOr[Double] = js.native
    
    /**
      * When MultiDrag is used to sort, this holds a HTMLElement and newIndex for each item.
      *
      * `oldIndicies[number]` is directly related to `newIndicies[number]`
      *
      * If MultiDrag is not used to sort, this array will be empty.
      */
    var newIndicies: js.Array[Index] = js.native
    
    /**
      * Old index within parent, only counting draggable elements
      */
    var oldDraggableIndex: js.UndefOr[Double] = js.native
    
    /**
      * old index within parent
      */
    var oldIndex: js.UndefOr[Double] = js.native
    
    /**
      * When MultiDrag is used to sort, this holds a HTMLElement and oldIndex for each item selected.
      *
      * `oldIndicies[number]` is directly related to `newIndicies[number]`
      *
      * If MultiDrag is not used to sort, this array will be empty.
      */
    var oldIndicies: js.Array[Index] = js.native
    
    /**
      * Pull mode if dragging into another sortable
      */
    var pullMode: js.UndefOr[clone | Boolean] = js.native
    
    /** When Swap is used to sort, this will contain the dragging item that was dropped on.*/
    var swapItem: HTMLElement | Null = js.native
    
    @JSName("target")
    var target_SortableEvent: HTMLElement = js.native
    
    /**
      * list, in which moved element.
      */
    var to: HTMLElement = js.native
  }
  
  @js.native
  trait SortableOptions extends StObject {
    
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
          /* event */ org.scalajs.dom.raw.Event | TouchEvent, 
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
        js.Function2[
          /* evt */ MoveEvent, 
          /* originalEvent */ org.scalajs.dom.raw.Event, 
          Boolean | `-1` | `1` | Unit
        ]
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
    implicit class SortableOptionsMutableBuilder[Self <: SortableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Double): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setChosenClass(value: String): Self = StObject.set(x, "chosenClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChosenClassUndefined: Self = StObject.set(x, "chosenClass", js.undefined)
      
      @scala.inline
      def setDataIdAttr(value: String): Self = StObject.set(x, "dataIdAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIdAttrUndefined: Self = StObject.set(x, "dataIdAttr", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayOnTouchOnly(value: Boolean): Self = StObject.set(x, "delayOnTouchOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayOnTouchOnlyUndefined: Self = StObject.set(x, "delayOnTouchOnly", js.undefined)
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDirection(
        value: (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
      ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionFunction3(value: (/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement) => Direction): Self = StObject.set(x, "direction", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDragClass(value: String): Self = StObject.set(x, "dragClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragClassUndefined: Self = StObject.set(x, "dragClass", js.undefined)
      
      @scala.inline
      def setDraggable(value: String): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDragoverBubble(value: Boolean): Self = StObject.set(x, "dragoverBubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragoverBubbleUndefined: Self = StObject.set(x, "dragoverBubble", js.undefined)
      
      @scala.inline
      def setDropBubble(value: Boolean): Self = StObject.set(x, "dropBubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropBubbleUndefined: Self = StObject.set(x, "dropBubble", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEmptyInsertThreshold(value: Double): Self = StObject.set(x, "emptyInsertThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyInsertThresholdUndefined: Self = StObject.set(x, "emptyInsertThreshold", js.undefined)
      
      @scala.inline
      def setFallbackClass(value: String): Self = StObject.set(x, "fallbackClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackClassUndefined: Self = StObject.set(x, "fallbackClass", js.undefined)
      
      @scala.inline
      def setFallbackOffset(value: X): Self = StObject.set(x, "fallbackOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackOffsetUndefined: Self = StObject.set(x, "fallbackOffset", js.undefined)
      
      @scala.inline
      def setFallbackOnBody(value: Boolean): Self = StObject.set(x, "fallbackOnBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackOnBodyUndefined: Self = StObject.set(x, "fallbackOnBody", js.undefined)
      
      @scala.inline
      def setFallbackTolerance(value: Double): Self = StObject.set(x, "fallbackTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackToleranceUndefined: Self = StObject.set(x, "fallbackTolerance", js.undefined)
      
      @scala.inline
      def setFilter(
        value: String | (js.ThisFunction3[
              /* this */ Sortable, 
              /* event */ org.scalajs.dom.raw.Event | TouchEvent, 
              /* target */ HTMLElement, 
              /* sortable */ Sortable, 
              Boolean
            ])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setForceFallback(value: Boolean): Self = StObject.set(x, "forceFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFallbackUndefined: Self = StObject.set(x, "forceFallback", js.undefined)
      
      @scala.inline
      def setGhostClass(value: String): Self = StObject.set(x, "ghostClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhostClassUndefined: Self = StObject.set(x, "ghostClass", js.undefined)
      
      @scala.inline
      def setGroup(value: String | GroupOptions): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setInvertSwap(value: Boolean): Self = StObject.set(x, "invertSwap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertSwapUndefined: Self = StObject.set(x, "invertSwap", js.undefined)
      
      @scala.inline
      def setInvertedSwapThreshold(value: Double): Self = StObject.set(x, "invertedSwapThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedSwapThresholdUndefined: Self = StObject.set(x, "invertedSwapThreshold", js.undefined)
      
      @scala.inline
      def setOnAdd(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* evt */ SortableEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnChoose(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onChoose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChooseUndefined: Self = StObject.set(x, "onChoose", js.undefined)
      
      @scala.inline
      def setOnClone(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onClone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloneUndefined: Self = StObject.set(x, "onClone", js.undefined)
      
      @scala.inline
      def setOnEnd(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOnMove(
        value: (/* evt */ MoveEvent, /* originalEvent */ org.scalajs.dom.raw.Event) => Boolean | `-1` | `1` | Unit
      ): Self = StObject.set(x, "onMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setOnSort(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnUnchoose(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onUnchoose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnchooseUndefined: Self = StObject.set(x, "onUnchoose", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPreventOnFilter(value: Boolean): Self = StObject.set(x, "preventOnFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventOnFilterUndefined: Self = StObject.set(x, "preventOnFilter", js.undefined)
      
      @scala.inline
      def setRemoveCloneOnHide(value: Boolean): Self = StObject.set(x, "removeCloneOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCloneOnHideUndefined: Self = StObject.set(x, "removeCloneOnHide", js.undefined)
      
      @scala.inline
      def setSetData(value: (/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement) => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setStore(value: Get): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setSwapThreshold(value: Double): Self = StObject.set(x, "swapThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwapThresholdUndefined: Self = StObject.set(x, "swapThreshold", js.undefined)
      
      @scala.inline
      def setTouchStartThreshold(value: Double): Self = StObject.set(x, "touchStartThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchStartThresholdUndefined: Self = StObject.set(x, "touchStartThreshold", js.undefined)
    }
  }
  
  @js.native
  trait Utils_ extends StObject {
    
    /**
      * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
      * @param element an HTMLElement.
      * @param selector an element seletor.
      * @param context a specific element's context.
      */
    def closest(element: HTMLElement, selector: String): HTMLElement | Null = js.native
    def closest(element: HTMLElement, selector: String, context: HTMLElement): HTMLElement | Null = js.native
    
    /**
      * Get the values of all the CSS properties.
      * @param element an HTMLElement.
      */
    def css(element: HTMLElement): CSSStyleDeclaration = js.native
    /**
      * Get the value of style properties.
      * @param element an HTMLElement.
      * @param prop a property key.
      */
    def css[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 388 */ js.Any */](element: HTMLElement, prop: K): /* import warning: importer.ImportType#apply Failed type conversion: std.CSSStyleDeclaration[K] */ js.Any = js.native
    /**
      * Set one CSS property.
      * @param element an HTMLElement.
      * @param prop a property key.
      * @param value a property value.
      */
    def css[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 388 */ js.Any */](
      element: HTMLElement,
      prop: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.CSSStyleDeclaration[K] */ js.Any
    ): Unit = js.native
    
    /**
      * Get elements by tag name.
      * @param context an HTMLElement.
      * @param tagName A tag name.
      * @param iterator An iterator.
      */
    def find(context: HTMLElement, tagName: String): NodeListOf[HTMLElement with Node] = js.native
    def find(
      context: HTMLElement,
      tagName: String,
      iterator: js.Function2[/* value */ HTMLElement, /* index */ Double, Unit]
    ): NodeListOf[HTMLElement with Node] = js.native
    
    /**
      * Check the current matched set of elements against a selector.
      * @param element an HTMLElement.
      * @param selector an element selector.
      */
    def is(element: HTMLElement, selector: String): Boolean = js.native
    
    /**
      * Remove an event handler function
      * @param element an HTMLElement.
      * @param event an Event context.
      * @param fn a callback.
      */
    def off(element: HTMLElement, event: String, fn: EventListenerOrEventListenerObject): Unit = js.native
    
    /**
      * Attach an event handler function
      * @param element an HTMLElement.
      * @param event an Event context.
      * @param fn
      */
    def on(element: HTMLElement, event: String, fn: EventListenerOrEventListenerObject): Unit = js.native
    
    /**
      * Add or remove one classes from each element
      * @param element an HTMLElement.
      * @param name a class name.
      * @param state a class's state.
      */
    def toggleClass(element: HTMLElement, name: String, state: Boolean): Unit = js.native
  }
}
