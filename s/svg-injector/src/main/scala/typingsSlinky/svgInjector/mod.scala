package typingsSlinky.svgInjector

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeList
import org.scalajs.dom.raw.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("svg-injector", JSImport.Namespace)
  @js.native
  val ^ : SVGInjector = js.native
  
  type SVGInjector = js.Function3[
    /* elements */ Node | NodeList | js.Array[Node], 
    /* options */ js.UndefOr[SVGInjectorOptions], 
    /* done */ js.UndefOr[js.Function1[/* elementCount */ Double, Unit]], 
    Unit
  ]
  
  @js.native
  trait SVGInjectorOptions extends StObject {
    
    /**
      * Callback to run during each SVG injection. The SVG element is passed if
      * the injection was successful.
      */
    var each: js.UndefOr[js.Function1[/* svg */ SVGElement | String, Unit]] = js.native
    
    /**
      * Whether to run scripts blocks found in the SVG.
      *
      * Possible values:
      * 'always' — Run scripts every time.
      * 'once' — Only run scripts once for each SVG.
      * 'never' — Ignore scripts (default)
      */
    var evalScripts: js.UndefOr[String] = js.native
    
    /**
      * Location of fallback pngs, if desired.
      */
    var pngFallback: js.UndefOr[String] = js.native
  }
  object SVGInjectorOptions {
    
    @scala.inline
    def apply(): SVGInjectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SVGInjectorOptions]
    }
    
    @scala.inline
    implicit class SVGInjectorOptionsMutableBuilder[Self <: SVGInjectorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEach(value: /* svg */ SVGElement | String => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      @scala.inline
      def setEvalScripts(value: String): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      @scala.inline
      def setPngFallback(value: String): Self = StObject.set(x, "pngFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPngFallbackUndefined: Self = StObject.set(x, "pngFallback", js.undefined)
    }
  }
  
  type _To = SVGInjector
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SVGInjector = ^
}
