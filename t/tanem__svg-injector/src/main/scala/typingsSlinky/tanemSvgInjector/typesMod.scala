package typingsSlinky.tanemSvgInjector

import org.scalajs.dom.raw.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AfterAll = js.Function1[/* elementsLoaded */ Double, Unit]
  
  type BeforeEach = js.Function1[/* svg */ SVGElement, Unit]
  
  type Errback = js.Function2[/* error */ js.Error | Null, /* svg */ js.UndefOr[SVGElement], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tanemSvgInjector.tanemSvgInjectorStrings.always
    - typingsSlinky.tanemSvgInjector.tanemSvgInjectorStrings.once
    - typingsSlinky.tanemSvgInjector.tanemSvgInjectorStrings.never
  */
  trait EvalScripts extends StObject
  object EvalScripts {
    
    @scala.inline
    def always: typingsSlinky.tanemSvgInjector.tanemSvgInjectorStrings.always = "always".asInstanceOf[typingsSlinky.tanemSvgInjector.tanemSvgInjectorStrings.always]
    
    @scala.inline
    def never: typingsSlinky.tanemSvgInjector.tanemSvgInjectorStrings.never = "never".asInstanceOf[typingsSlinky.tanemSvgInjector.tanemSvgInjectorStrings.never]
    
    @scala.inline
    def once: typingsSlinky.tanemSvgInjector.tanemSvgInjectorStrings.once = "once".asInstanceOf[typingsSlinky.tanemSvgInjector.tanemSvgInjectorStrings.once]
  }
}
