package typingsSlinky.simplebar

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.simplebar.simplebarStrings.ltr
import typingsSlinky.simplebar.simplebarStrings.rtl
import typingsSlinky.simplebar.simplebarStrings.x
import typingsSlinky.simplebar.simplebarStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simplebar", JSImport.Namespace)
  @js.native
  class ^ protected () extends SimpleBar {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: Options) = this()
  }
  
  /* static member */
  /* Inlined std.Pick<std.WeakMap<std.HTMLElement, simplebar.simplebar.SimpleBar>, 'get' | 'has'> */
  object instances {
    
    @JSImport("simplebar", "instances")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("simplebar", "instances.get")
    @js.native
    def get: js.Function1[/* key */ HTMLElement, js.UndefOr[SimpleBar]] = js.native
    @JSImport("simplebar", "instances.get")
    @js.native
    def get(key: HTMLElement): js.UndefOr[SimpleBar] = js.native
    @scala.inline
    def get_=(x: js.Function1[/* key */ HTMLElement, js.UndefOr[SimpleBar]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    @JSImport("simplebar", "instances.has")
    @js.native
    def has: js.Function1[/* key */ HTMLElement, Boolean] = js.native
    @JSImport("simplebar", "instances.has")
    @js.native
    def has(key: HTMLElement): Boolean = js.native
    @scala.inline
    def has_=(x: js.Function1[/* key */ HTMLElement, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("has")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("simplebar", "removeObserver")
  @js.native
  def removeObserver(): Unit = js.native
  
  /* Inlined simplebar.simplebar.KnownClassNamesOptions & {[className: string] : string} */
  @js.native
  trait ClassNamesOptions extends /* className */ StringDictionary[String] {
    
    var contentEl: js.UndefOr[String] = js.native
    
    var contentWrapper: js.UndefOr[String] = js.native
    
    var dragging: js.UndefOr[String] = js.native
    
    var heightAutoObserverEl: js.UndefOr[String] = js.native
    
    var heightAutoObserverWrapperEl: js.UndefOr[String] = js.native
    
    var horizontal: js.UndefOr[String] = js.native
    
    var hover: js.UndefOr[String] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var offset: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var scrollbar: js.UndefOr[String] = js.native
    
    var track: js.UndefOr[String] = js.native
    
    var vertical: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[String] = js.native
    
    var wrapper: js.UndefOr[String] = js.native
  }
  object ClassNamesOptions {
    
    @scala.inline
    def apply(): ClassNamesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassNamesOptions]
    }
    
    @scala.inline
    implicit class ClassNamesOptionsMutableBuilder[Self <: ClassNamesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentEl(value: String): Self = StObject.set(x, "contentEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentElUndefined: Self = StObject.set(x, "contentEl", js.undefined)
      
      @scala.inline
      def setContentWrapper(value: String): Self = StObject.set(x, "contentWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentWrapperUndefined: Self = StObject.set(x, "contentWrapper", js.undefined)
      
      @scala.inline
      def setDragging(value: String): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setHeightAutoObserverEl(value: String): Self = StObject.set(x, "heightAutoObserverEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightAutoObserverElUndefined: Self = StObject.set(x, "heightAutoObserverEl", js.undefined)
      
      @scala.inline
      def setHeightAutoObserverWrapperEl(value: String): Self = StObject.set(x, "heightAutoObserverWrapperEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightAutoObserverWrapperElUndefined: Self = StObject.set(x, "heightAutoObserverWrapperEl", js.undefined)
      
      @scala.inline
      def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setScrollbar(value: String): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      @scala.inline
      def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait KnownClassNamesOptions extends StObject {
    
    var contentEl: js.UndefOr[String] = js.native
    
    var contentWrapper: js.UndefOr[String] = js.native
    
    var dragging: js.UndefOr[String] = js.native
    
    var heightAutoObserverEl: js.UndefOr[String] = js.native
    
    var heightAutoObserverWrapperEl: js.UndefOr[String] = js.native
    
    var horizontal: js.UndefOr[String] = js.native
    
    var hover: js.UndefOr[String] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var offset: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var scrollbar: js.UndefOr[String] = js.native
    
    var track: js.UndefOr[String] = js.native
    
    var vertical: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[String] = js.native
    
    var wrapper: js.UndefOr[String] = js.native
  }
  object KnownClassNamesOptions {
    
    @scala.inline
    def apply(): KnownClassNamesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KnownClassNamesOptions]
    }
    
    @scala.inline
    implicit class KnownClassNamesOptionsMutableBuilder[Self <: KnownClassNamesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentEl(value: String): Self = StObject.set(x, "contentEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentElUndefined: Self = StObject.set(x, "contentEl", js.undefined)
      
      @scala.inline
      def setContentWrapper(value: String): Self = StObject.set(x, "contentWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentWrapperUndefined: Self = StObject.set(x, "contentWrapper", js.undefined)
      
      @scala.inline
      def setDragging(value: String): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setHeightAutoObserverEl(value: String): Self = StObject.set(x, "heightAutoObserverEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightAutoObserverElUndefined: Self = StObject.set(x, "heightAutoObserverEl", js.undefined)
      
      @scala.inline
      def setHeightAutoObserverWrapperEl(value: String): Self = StObject.set(x, "heightAutoObserverWrapperEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightAutoObserverWrapperElUndefined: Self = StObject.set(x, "heightAutoObserverWrapperEl", js.undefined)
      
      @scala.inline
      def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setScrollbar(value: String): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      @scala.inline
      def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var autoHide: js.UndefOr[Boolean] = js.native
    
    var classNames: js.UndefOr[ClassNamesOptions] = js.native
    
    var clickOnTrack: js.UndefOr[Boolean] = js.native
    
    var direction: js.UndefOr[rtl | ltr] = js.native
    
    var forceVisible: js.UndefOr[Boolean | x | y] = js.native
    
    var scrollbarMaxSize: js.UndefOr[Double] = js.native
    
    var scrollbarMinSize: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      @scala.inline
      def setClassNames(value: ClassNamesOptions): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClickOnTrack(value: Boolean): Self = StObject.set(x, "clickOnTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickOnTrackUndefined: Self = StObject.set(x, "clickOnTrack", js.undefined)
      
      @scala.inline
      def setDirection(value: rtl | ltr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setForceVisible(value: Boolean | typingsSlinky.simplebar.simplebarStrings.x | y): Self = StObject.set(x, "forceVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceVisibleUndefined: Self = StObject.set(x, "forceVisible", js.undefined)
      
      @scala.inline
      def setScrollbarMaxSize(value: Double): Self = StObject.set(x, "scrollbarMaxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarMaxSizeUndefined: Self = StObject.set(x, "scrollbarMaxSize", js.undefined)
      
      @scala.inline
      def setScrollbarMinSize(value: Double): Self = StObject.set(x, "scrollbarMinSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarMinSizeUndefined: Self = StObject.set(x, "scrollbarMinSize", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait SimpleBar extends StObject {
    
    def getContentElement(): Element = js.native
    
    def getScrollElement(): Element = js.native
    
    def recalculate(): Unit = js.native
  }
  object SimpleBar {
    
    @scala.inline
    def apply(getContentElement: () => Element, getScrollElement: () => Element, recalculate: () => Unit): SimpleBar = {
      val __obj = js.Dynamic.literal(getContentElement = js.Any.fromFunction0(getContentElement), getScrollElement = js.Any.fromFunction0(getScrollElement), recalculate = js.Any.fromFunction0(recalculate))
      __obj.asInstanceOf[SimpleBar]
    }
    
    @scala.inline
    implicit class SimpleBarMutableBuilder[Self <: SimpleBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContentElement(value: () => Element): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollElement(value: () => Element): Self = StObject.set(x, "getScrollElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRecalculate(value: () => Unit): Self = StObject.set(x, "recalculate", js.Any.fromFunction0(value))
    }
  }
}
