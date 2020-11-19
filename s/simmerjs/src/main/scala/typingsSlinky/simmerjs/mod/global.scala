package typingsSlinky.simmerjs.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.simmerjs.anon.SimmernoConflictany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait Window extends js.Object {
    
    /**
      * Analyze an element and produce a unique CSS selector for it.
      */
    /**
      * A global Simmer function will be exposed on the window. This is not the
      * constructor, but rather a default instance which has exposed itself on
      * the window wit ha default configuration. This is not an idea API and is
      * meant to maintain the original API dating back to 2011 when this library
      * was originally written.
      */
    def Simmer(element: Element): String = js.native
    /**
      * A global Simmer function will be exposed on the window. This is not the
      * constructor, but rather a default instance which has exposed itself on
      * the window wit ha default configuration. This is not an idea API and is
      * meant to maintain the original API dating back to 2011 when this library
      * was originally written.
      */
    @JSName("Simmer")
    var Simmer_Original: SimmernoConflictany = js.native
  }
}
