package typingsSlinky.uifabricUtilities

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactTestRenderer.mod.ReactTestRenderer
import typingsSlinky.reactTestRenderer.mod.TestRendererOptions
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.customizationsMod.ICustomizations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AsyncPlaceholder extends StObject {
    
    var asyncPlaceholder: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
      ] = js.native
  }
  object AsyncPlaceholder {
    
    @scala.inline
    def apply(): AsyncPlaceholder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncPlaceholder]
    }
    
    @scala.inline
    implicit class AsyncPlaceholderMutableBuilder[Self <: AsyncPlaceholder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncPlaceholder(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any): Self = StObject.set(x, "asyncPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncPlaceholderUndefined: Self = StObject.set(x, "asyncPlaceholder", js.undefined)
    }
  }
  
  @js.native
  trait CachedInputs[TStyleProps, TStyleSet] extends StObject {
    
    /** Cache for all style functions. */
    var __cachedInputs__ : js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]] = js.native
    
    /** True if no styles prop or styles from Customizer is passed to wrapped component. */
    var __noStyleOverride__ : Boolean = js.native
  }
  object CachedInputs {
    
    @scala.inline
    def apply[TStyleProps, TStyleSet](
      __cachedInputs__ : js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]],
      __noStyleOverride__ : Boolean
    ): CachedInputs[TStyleProps, TStyleSet] = {
      val __obj = js.Dynamic.literal(__cachedInputs__ = __cachedInputs__.asInstanceOf[js.Any], __noStyleOverride__ = __noStyleOverride__.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedInputs[TStyleProps, TStyleSet]]
    }
    
    @scala.inline
    implicit class CachedInputsMutableBuilder[Self <: CachedInputs[_, _], TStyleProps, TStyleSet] (val x: Self with (CachedInputs[TStyleProps, TStyleSet])) extends AnyVal {
      
      @scala.inline
      def set__cachedInputs__(value: js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]]): Self = StObject.set(x, "__cachedInputs__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__cachedInputs__Varargs(value: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): Self = StObject.set(x, "__cachedInputs__", js.Array(value :_*))
      
      @scala.inline
      def set__noStyleOverride__(value: Boolean): Self = StObject.set(x, "__noStyleOverride__", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Configurable[T /* <: js.Function */] extends StObject {
    
    var configurable: Boolean = js.native
    
    def get(): T = js.native
  }
  object Configurable {
    
    @scala.inline
    def apply[T /* <: js.Function */](configurable: Boolean, get: () => T): Configurable[T] = {
      val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Configurable[T]]
    }
    
    @scala.inline
    implicit class ConfigurableMutableBuilder[Self <: Configurable[_], T /* <: js.Function */] (val x: Self with Configurable[T]) extends AnyVal {
      
      @scala.inline
      def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DefaultRender[T] extends StObject {
    
    var defaultRender: js.UndefOr[ReactComponentClass[T]] = js.native
  }
  object DefaultRender {
    
    @scala.inline
    def apply[T](): DefaultRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRender[T]]
    }
    
    @scala.inline
    implicit class DefaultRenderMutableBuilder[Self <: DefaultRender[_], T] (val x: Self with DefaultRender[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultRender(value: ReactComponentClass[T]): Self = StObject.set(x, "defaultRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRenderComponentClass(value: ReactComponentClass[T]): Self = StObject.set(x, "defaultRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRenderFunctionComponent(value: ReactComponentClass[T]): Self = StObject.set(x, "defaultRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRenderUndefined: Self = StObject.set(x, "defaultRender", js.undefined)
    }
  }
  
  @js.native
  trait Delay extends StObject {
    
    var delay: Double = js.native
  }
  object Delay {
    
    @scala.inline
    def apply(delay: Double): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(nextElement: ReactElement): ReactTestRenderer = js.native
    def apply(nextElement: ReactElement, options: TestRendererOptions): ReactTestRenderer = js.native
  }
  
  @js.native
  trait Focus extends StObject {
    
    def focus(): Unit = js.native
  }
  object Focus {
    
    @scala.inline
    def apply(focus: () => Unit): Focus = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[Focus]
    }
    
    @scala.inline
    implicit class FocusMutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Leading extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.native
    
    var trailing: js.UndefOr[Boolean] = js.native
  }
  object Leading {
    
    @scala.inline
    def apply(): Leading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leading]
    }
    
    @scala.inline
    implicit class LeadingMutableBuilder[Self <: Leading] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  @js.native
  trait MaxWait extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.native
    
    var maxWait: js.UndefOr[Double] = js.native
    
    var trailing: js.UndefOr[Boolean] = js.native
  }
  object MaxWait {
    
    @scala.inline
    def apply(): MaxWait = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxWait]
    }
    
    @scala.inline
    implicit class MaxWaitMutableBuilder[Self <: MaxWait] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext> */
  @js.native
  trait ReadonlyICustomizerContex extends StObject {
    
    val customizations: ICustomizations = js.native
  }
  object ReadonlyICustomizerContex {
    
    @scala.inline
    def apply(customizations: ICustomizations): ReadonlyICustomizerContex = {
      val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyICustomizerContex]
    }
    
    @scala.inline
    implicit class ReadonlyICustomizerContexMutableBuilder[Self <: ReadonlyICustomizerContex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomizations(value: ICustomizations): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RootRef extends StObject {
    
    var rootRef: js.UndefOr[ReactRef[HTMLElement]] = js.native
  }
  object RootRef {
    
    @scala.inline
    def apply(): RootRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootRef]
    }
    
    @scala.inline
    implicit class RootRefMutableBuilder[Self <: RootRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRootRef(value: ReactRef[HTMLElement]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    }
  }
  
  @js.native
  trait Rtl extends StObject {
    
    var rtl: js.UndefOr[Boolean] = js.native
  }
  object Rtl {
    
    @scala.inline
    def apply(): Rtl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rtl]
    }
    
    @scala.inline
    implicit class RtlMutableBuilder[Self <: Rtl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
}
