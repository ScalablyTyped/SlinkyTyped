package typingsSlinky.scrollIntoView

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollIntoView {
  
  @js.native
  trait Alignment extends StObject {
    
    /** 0 to 1, default 0.5 (center) */
    var left: js.UndefOr[Double] = js.native
    
    /** pixels to offset left alignment */
    var leftOffset: js.UndefOr[Double] = js.native
    
    /** 0 to 1, default 0.5 (center) */
    var top: js.UndefOr[Double] = js.native
    
    /** pixels to offset top alignment */
    var topOffset: js.UndefOr[Double] = js.native
  }
  object Alignment {
    
    @scala.inline
    def apply(): Alignment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alignment]
    }
    
    @scala.inline
    implicit class AlignmentMutableBuilder[Self <: Alignment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftOffset(value: Double): Self = StObject.set(x, "leftOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftOffsetUndefined: Self = StObject.set(x, "leftOffset", js.undefined)
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* type */ callbackParameterType, Unit]
  
  @js.native
  trait ScrollIntoView extends StObject {
    
    def apply(target: HTMLElement): Unit = js.native
    def apply(target: HTMLElement, callback: Callback): Unit = js.native
    def apply(target: HTMLElement, settings: Settings): Unit = js.native
    def apply(target: HTMLElement, settings: Settings, callback: Callback): Unit = js.native
  }
  
  @js.native
  trait Settings extends StObject {
    
    var align: js.UndefOr[Alignment] = js.native
    
    var ease: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
    
    var time: js.UndefOr[Double] = js.native
    
    var validTarget: js.UndefOr[js.Function2[/* target */ HTMLElement, /* parentsScrolled */ Double, Boolean]] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setEase(value: /* value */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setValidTarget(value: (/* target */ HTMLElement, /* parentsScrolled */ Double) => Boolean): Self = StObject.set(x, "validTarget", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidTargetUndefined: Self = StObject.set(x, "validTarget", js.undefined)
    }
  }
  
  /** type will be 'complete' if the scroll completed or 'canceled' if the current scroll was canceled by a new scroll */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.scrollIntoView.scrollIntoViewStrings.complete
    - typingsSlinky.scrollIntoView.scrollIntoViewStrings.canceled
  */
  trait callbackParameterType extends StObject
  object callbackParameterType {
    
    @scala.inline
    def canceled: typingsSlinky.scrollIntoView.scrollIntoViewStrings.canceled = "canceled".asInstanceOf[typingsSlinky.scrollIntoView.scrollIntoViewStrings.canceled]
    
    @scala.inline
    def complete: typingsSlinky.scrollIntoView.scrollIntoViewStrings.complete = "complete".asInstanceOf[typingsSlinky.scrollIntoView.scrollIntoViewStrings.complete]
  }
}
