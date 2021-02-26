package typingsSlinky.vexJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vex-js", JSImport.Namespace)
  @js.native
  val ^ : Vex = js.native
  
  type ICSSAttributes = StringDictionary[String | Double]
  
  @js.native
  trait IVexOptions extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var afterOpen: js.UndefOr[js.Function1[/* vexContent */ JQuery[HTMLElement], Unit]] = js.native
    
    var appendLocation: js.UndefOr[HTMLElement | JQuery[HTMLElement] | String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeCSS: js.UndefOr[ICSSAttributes] = js.native
    
    var closeClassName: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentCSS: js.UndefOr[ICSSAttributes] = js.native
    
    var contentClassName: js.UndefOr[String] = js.native
    
    var css: js.UndefOr[ICSSAttributes] = js.native
    
    var escapeButtonCloses: js.UndefOr[Boolean] = js.native
    
    var overlayCSS: js.UndefOr[ICSSAttributes] = js.native
    
    var overlayClassName: js.UndefOr[String] = js.native
    
    var overlayClosesOnClick: js.UndefOr[Boolean] = js.native
    
    var showCloseButton: js.UndefOr[Boolean] = js.native
  }
  object IVexOptions {
    
    @scala.inline
    def apply(): IVexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVexOptions]
    }
    
    @scala.inline
    implicit class IVexOptionsMutableBuilder[Self <: IVexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setAfterOpen(value: /* vexContent */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      @scala.inline
      def setAppendLocation(value: HTMLElement | JQuery[HTMLElement] | String): Self = StObject.set(x, "appendLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendLocationHTMLElement(value: HTMLElement): Self = StObject.set(x, "appendLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendLocationUndefined: Self = StObject.set(x, "appendLocation", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseCSS(value: ICSSAttributes): Self = StObject.set(x, "closeCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseCSSUndefined: Self = StObject.set(x, "closeCSS", js.undefined)
      
      @scala.inline
      def setCloseClassName(value: String): Self = StObject.set(x, "closeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseClassNameUndefined: Self = StObject.set(x, "closeClassName", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentCSS(value: ICSSAttributes): Self = StObject.set(x, "contentCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentCSSUndefined: Self = StObject.set(x, "contentCSS", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCss(value: ICSSAttributes): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setEscapeButtonCloses(value: Boolean): Self = StObject.set(x, "escapeButtonCloses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeButtonClosesUndefined: Self = StObject.set(x, "escapeButtonCloses", js.undefined)
      
      @scala.inline
      def setOverlayCSS(value: ICSSAttributes): Self = StObject.set(x, "overlayCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayCSSUndefined: Self = StObject.set(x, "overlayCSS", js.undefined)
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayClosesOnClick(value: Boolean): Self = StObject.set(x, "overlayClosesOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClosesOnClickUndefined: Self = StObject.set(x, "overlayClosesOnClick", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    }
  }
  
  @js.native
  trait Vex extends StObject {
    
    def close(): Boolean = js.native
    def close(id: Double): Boolean = js.native
    
    def closeAll(): Boolean = js.native
    
    def closeByID(id: Double): Boolean = js.native
    
    var defaultOptions: js.UndefOr[IVexOptions] = js.native
    
    def open(options: IVexOptions): JQuery[HTMLElement] = js.native
  }
  
  type _To = Vex
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Vex = ^
}
