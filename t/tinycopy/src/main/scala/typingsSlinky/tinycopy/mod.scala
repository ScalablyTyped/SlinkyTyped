package typingsSlinky.tinycopy

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.tinycopy.tinycopyStrings.error
import typingsSlinky.tinycopy.tinycopyStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tinycopy", JSImport.Default)
  @js.native
  class default protected () extends TinyCopy {
    def this(trigger: Element, target: String) = this()
    def this(trigger: Element, target: Element) = this()
    def this(trigger: Element, target: NodeListOf[Element with Node]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("tinycopy", "default.exec")
    @js.native
    def exec(
      value: String,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* data */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TinyCopy extends StObject {
    
    def on(`type`: String, action: js.Function1[/* e */ String | js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_error(`type`: error, action: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_success(`type`: success, action: js.Function1[/* data */ String, Unit]): this.type = js.native
  }
}
