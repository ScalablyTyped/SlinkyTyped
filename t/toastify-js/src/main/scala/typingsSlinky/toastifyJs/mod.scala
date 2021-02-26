package typingsSlinky.toastifyJs

import org.scalajs.dom.raw.Node
import typingsSlinky.toastifyJs.anon.ShowToast
import typingsSlinky.toastifyJs.toastifyJsStrings.bottom
import typingsSlinky.toastifyJs.toastifyJsStrings.center
import typingsSlinky.toastifyJs.toastifyJsStrings.left
import typingsSlinky.toastifyJs.toastifyJsStrings.right
import typingsSlinky.toastifyJs.toastifyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("toastify-js", JSImport.Namespace)
  @js.native
  def apply(): ShowToast = js.native
  @JSImport("toastify-js", JSImport.Namespace)
  @js.native
  def apply(options: Options): ShowToast = js.native
  
  @JSImport("toastify-js", "reposition")
  @js.native
  def reposition(): Unit = js.native
  
  @js.native
  trait Offset extends StObject {
    
    var x: Double | String = js.native
    
    var y: Double | String = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(x: Double | String, y: Double | String): Offset = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Image/icon to be shown before text
      */
    var avatar: js.UndefOr[String] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    /**
      * Invoked when the toast is dismissed
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var close: js.UndefOr[Boolean] = js.native
    
    var destination: js.UndefOr[String] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var gravity: js.UndefOr[top | bottom] = js.native
    
    var newWindow: js.UndefOr[Boolean] = js.native
    
    var node: js.UndefOr[Node] = js.native
    
    var offset: js.UndefOr[Offset] = js.native
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var position: js.UndefOr[left | center | right] = js.native
    
    var selector: js.UndefOr[String] = js.native
    
    /**
      * @default true
      */
    var stopOnFocus: js.UndefOr[Boolean] = js.native
    
    var text: js.UndefOr[String] = js.native
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
      def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setGravity(value: top | bottom): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPosition(value: left | center | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setStopOnFocus(value: Boolean): Self = StObject.set(x, "stopOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnFocusUndefined: Self = StObject.set(x, "stopOnFocus", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
