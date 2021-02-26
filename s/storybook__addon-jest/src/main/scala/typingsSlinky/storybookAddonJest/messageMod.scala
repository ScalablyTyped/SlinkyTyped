package typingsSlinky.storybookAddonJest

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod extends Shortcut {
  
  @JSImport("@storybook/addon-jest/dist/components/Message", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MessageProps] = js.native
  
  @JSImport("@storybook/addon-jest/dist/components/Message", "Message")
  @js.native
  val Message: ReactComponentClass[MessageProps] = js.native
  
  @js.native
  trait MessageProps extends StObject {
    
    var msg: String = js.native
  }
  object MessageProps {
    
    @scala.inline
    def apply(msg: String): MessageProps = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageProps]
    }
    
    @scala.inline
    implicit class MessagePropsMutableBuilder[Self <: MessageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[MessageProps]
  
  /* This means you don't have to write `default`, but can instead just say `messageMod.foo` */
  override def _to: ReactComponentClass[MessageProps] = default
}
