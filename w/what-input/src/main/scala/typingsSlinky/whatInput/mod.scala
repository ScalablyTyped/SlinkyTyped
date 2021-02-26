package typingsSlinky.whatInput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("what-input", "default.ask")
    @js.native
    def ask(): InputMethod = js.native
    @JSImport("what-input", "default.ask")
    @js.native
    def ask(strategy: Strategy): InputMethod = js.native
    
    @JSImport("what-input", "default.clearStorage")
    @js.native
    def clearStorage(): Unit = js.native
    
    @JSImport("what-input", "default.element")
    @js.native
    def element(): String | Null = js.native
    
    @JSImport("what-input", "default.ignoreKeys")
    @js.native
    def ignoreKeys(keyCodes: js.Array[Double]): Unit = js.native
    
    @JSImport("what-input", "default.registerOnChange")
    @js.native
    def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = js.native
    @JSImport("what-input", "default.registerOnChange")
    @js.native
    def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit], strategy: Strategy): Unit = js.native
    
    @JSImport("what-input", "default.specificKeys")
    @js.native
    def specificKeys(keyCodes: js.Array[Double]): Unit = js.native
    
    @JSImport("what-input", "default.unRegisterOnChange")
    @js.native
    def unRegisterOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.whatInput.whatInputStrings.initial
    - typingsSlinky.whatInput.whatInputStrings.pointer
    - typingsSlinky.whatInput.whatInputStrings.keyboard
    - typingsSlinky.whatInput.whatInputStrings.mouse
    - typingsSlinky.whatInput.whatInputStrings.touch
  */
  trait InputMethod extends StObject
  object InputMethod {
    
    @scala.inline
    def initial: typingsSlinky.whatInput.whatInputStrings.initial = "initial".asInstanceOf[typingsSlinky.whatInput.whatInputStrings.initial]
    
    @scala.inline
    def keyboard: typingsSlinky.whatInput.whatInputStrings.keyboard = "keyboard".asInstanceOf[typingsSlinky.whatInput.whatInputStrings.keyboard]
    
    @scala.inline
    def mouse: typingsSlinky.whatInput.whatInputStrings.mouse = "mouse".asInstanceOf[typingsSlinky.whatInput.whatInputStrings.mouse]
    
    @scala.inline
    def pointer: typingsSlinky.whatInput.whatInputStrings.pointer = "pointer".asInstanceOf[typingsSlinky.whatInput.whatInputStrings.pointer]
    
    @scala.inline
    def touch: typingsSlinky.whatInput.whatInputStrings.touch = "touch".asInstanceOf[typingsSlinky.whatInput.whatInputStrings.touch]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.whatInput.whatInputStrings.input
    - typingsSlinky.whatInput.whatInputStrings.intent
  */
  trait Strategy extends StObject
  object Strategy {
    
    @scala.inline
    def input: typingsSlinky.whatInput.whatInputStrings.input = "input".asInstanceOf[typingsSlinky.whatInput.whatInputStrings.input]
    
    @scala.inline
    def intent: typingsSlinky.whatInput.whatInputStrings.intent = "intent".asInstanceOf[typingsSlinky.whatInput.whatInputStrings.intent]
  }
}
