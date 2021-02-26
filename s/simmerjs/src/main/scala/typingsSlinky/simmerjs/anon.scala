package typingsSlinky.simmerjs

import org.scalajs.dom.raw.Element
import typingsSlinky.simmerjs.mod.Options
import typingsSlinky.simmerjs.mod.Simmer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined simmerjs.simmerjs.Simmer & {noConflict (): any} */
  @js.native
  trait SimmernoConflictany extends StObject {
    
    /**
      * Analyze an element and produce a unique CSS selector for it.
      */
    def apply(element: Element): String = js.native
    
    /**
      * If you have an existing instance of Simmer, you can use its configure
      * method to instanciate a new Simmer which has the same scope and
      * configuration as the existing one, with any new configuration you wish to
      * apply.
      */
    def configure(options: Options): Simmer = js.native
    
    /**
      * Just in case you also had the brilliant idea of using a variable
      * called "Simmer", or you wish to move it off of the global object then
      * you can use the noConflict method to receive a reference to the
      * object and remove it from the window. Calling it will also revert the
      * original value of window.Simmer which was there before loading the
      * Simmer.js script (if there was one)
      */
    def noConflict(): js.Any = js.native
  }
}
