package typingsSlinky.vanillaModal

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vanilla-modal", JSImport.Default)
  @js.native
  class default () extends VanillaModal {
    def this(settings: VanillaModalConfig) = this()
  }
  
  @js.native
  trait VanillaModal extends StObject {
    
    def addLoadedCssClass(): Unit = js.native
    
    def captureNode(node: Node): Unit = js.native
    
    def close(): Unit = js.native
    def close(e: Event): Unit = js.native
    
    def closeKeyHandler(e: Event): Unit = js.native
    
    def closeModal(e: Event): Unit = js.native
    
    def closeModalWithTransition(e: Event): Unit = js.native
    
    def delegateClose(e: Event): Unit = js.native
    
    def delegateOpen(e: Event): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def detectTransition(): Boolean = js.native
    
    def getDomNodes(): VanillaModalDomNodes = js.native
    
    def listen(): Unit = js.native
    
    def open(allMatches: String): Unit = js.native
    def open(allMatches: String, e: Event): Unit = js.native
    
    def outsideClickHandler(e: Event): Unit = js.native
    
    def releaseNode(node: Node): Unit = js.native
    
    def removeOpenId(): Unit = js.native
    
    def setOpenId(id: String): Unit = js.native
  }
  
  @js.native
  trait VanillaModalConfig extends StObject {
    
    var `class`: js.UndefOr[String] = js.native
    
    var clickOutside: js.UndefOr[Boolean] = js.native
    
    var close: js.UndefOr[String] = js.native
    
    var closeKeys: js.UndefOr[js.Array[js.UndefOr[Double]] | Boolean] = js.native
    
    var loadClass: js.UndefOr[String] = js.native
    
    var modal: js.UndefOr[String | HTMLElement] = js.native
    
    var modalContent: js.UndefOr[String] = js.native
    
    var modalInner: js.UndefOr[String] = js.native
    
    var onBeforeClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
    
    var onBeforeOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
    
    var onClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
    
    var onOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
    
    var open: js.UndefOr[String] = js.native
    
    var page: js.UndefOr[String] = js.native
    
    var transitionEnd: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
    
    var transitions: js.UndefOr[String] = js.native
  }
  object VanillaModalConfig {
    
    @scala.inline
    def apply(): VanillaModalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VanillaModalConfig]
    }
    
    @scala.inline
    implicit class VanillaModalConfigMutableBuilder[Self <: VanillaModalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setClickOutside(value: Boolean): Self = StObject.set(x, "clickOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickOutsideUndefined: Self = StObject.set(x, "clickOutside", js.undefined)
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseKeys(value: js.Array[js.UndefOr[Double]] | Boolean): Self = StObject.set(x, "closeKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseKeysUndefined: Self = StObject.set(x, "closeKeys", js.undefined)
      
      @scala.inline
      def setCloseKeysVarargs(value: js.UndefOr[Double]*): Self = StObject.set(x, "closeKeys", js.Array(value :_*))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setLoadClass(value: String): Self = StObject.set(x, "loadClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadClassUndefined: Self = StObject.set(x, "loadClass", js.undefined)
      
      @scala.inline
      def setModal(value: String | HTMLElement): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalContent(value: String): Self = StObject.set(x, "modalContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalContentUndefined: Self = StObject.set(x, "modalContent", js.undefined)
      
      @scala.inline
      def setModalHTMLElement(value: HTMLElement): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalInner(value: String): Self = StObject.set(x, "modalInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalInnerUndefined: Self = StObject.set(x, "modalInner", js.undefined)
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setOnBeforeClose(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "onBeforeClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBeforeCloseUndefined: Self = StObject.set(x, "onBeforeClose", js.undefined)
      
      @scala.inline
      def setOnBeforeOpen(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "onBeforeOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBeforeOpenUndefined: Self = StObject.set(x, "onBeforeOpen", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setTransitionEnd(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTransitionEndUndefined: Self = StObject.set(x, "transitionEnd", js.undefined)
      
      @scala.inline
      def setTransitions(value: String): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    }
  }
  
  @js.native
  trait VanillaModalDomNodes extends StObject {
    
    var modal: HTMLElement = js.native
    
    var modalContent: HTMLElement = js.native
    
    var modalInner: HTMLElement = js.native
    
    var page: HTMLElement = js.native
  }
  object VanillaModalDomNodes {
    
    @scala.inline
    def apply(modal: HTMLElement, modalContent: HTMLElement, modalInner: HTMLElement, page: HTMLElement): VanillaModalDomNodes = {
      val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any], modalContent = modalContent.asInstanceOf[js.Any], modalInner = modalInner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[VanillaModalDomNodes]
    }
    
    @scala.inline
    implicit class VanillaModalDomNodesMutableBuilder[Self <: VanillaModalDomNodes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModal(value: HTMLElement): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalContent(value: HTMLElement): Self = StObject.set(x, "modalContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalInner(value: HTMLElement): Self = StObject.set(x, "modalInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: HTMLElement): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
}
