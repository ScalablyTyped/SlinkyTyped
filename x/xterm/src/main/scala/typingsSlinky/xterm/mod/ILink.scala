package typingsSlinky.xterm.mod

import org.scalajs.dom.raw.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A link within the terminal.
  */
@js.native
trait ILink extends StObject {
  
  /**
    * Calls when the link is activated.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    */
  def activate(event: MouseEvent, text: String): Unit = js.native
  
  /**
    * What link decorations to show when hovering the link, this property is tracked and changes
    * made after the link is provided will trigger changes. If not set, all decroations will be
    * enabled.
    */
  var decorations: js.UndefOr[ILinkDecorations] = js.native
  
  /**
    * Called when the link is released and no longer used by xterm.js.
    */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Called when the mouse hovers the link. To use this to create a DOM-based hover tooltip,
    * create the hover element within `Terminal.element` and add the `xterm-hover` class to it,
    * that will cause mouse events to not fall through and activate other links.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    */
  var hover: js.UndefOr[js.Function2[/* event */ MouseEvent, /* text */ String, Unit]] = js.native
  
  /**
    * Called when the mouse leaves the link.
    * @param event The mouse event triggering the callback.
    * @param text The text of the link.
    */
  var leave: js.UndefOr[js.Function2[/* event */ MouseEvent, /* text */ String, Unit]] = js.native
  
  /**
    * The buffer range of the link.
    */
  var range: IBufferRange = js.native
  
  /**
    * The text of the link.
    */
  var text: String = js.native
}
object ILink {
  
  @scala.inline
  def apply(activate: (MouseEvent, String) => Unit, range: IBufferRange, text: String): ILink = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction2(activate), range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILink]
  }
  
  @scala.inline
  implicit class ILinkMutableBuilder[Self <: ILink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: (MouseEvent, String) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDecorations(value: ILinkDecorations): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationsUndefined: Self = StObject.set(x, "decorations", js.undefined)
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    @scala.inline
    def setHover(value: (/* event */ MouseEvent, /* text */ String) => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setLeave(value: (/* event */ MouseEvent, /* text */ String) => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    @scala.inline
    def setRange(value: IBufferRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
