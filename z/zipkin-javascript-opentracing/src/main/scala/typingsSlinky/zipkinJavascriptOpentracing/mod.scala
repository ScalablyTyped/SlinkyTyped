package typingsSlinky.zipkinJavascriptOpentracing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-javascript-opentracing", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typingsSlinky.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing {
    def this(args: js.Any*) = this()
  }
  @JSImport("zipkin-javascript-opentracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("zipkin-javascript-opentracing", "FORMAT_BINARY")
  @js.native
  def FORMAT_BINARY: String = js.native
  @scala.inline
  def FORMAT_BINARY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_BINARY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("zipkin-javascript-opentracing", "FORMAT_HTTP_HEADERS")
  @js.native
  def FORMAT_HTTP_HEADERS: String = js.native
  @scala.inline
  def FORMAT_HTTP_HEADERS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_HTTP_HEADERS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("zipkin-javascript-opentracing", "FORMAT_TEXT_MAP")
  @js.native
  def FORMAT_TEXT_MAP: String = js.native
  @scala.inline
  def FORMAT_TEXT_MAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_TEXT_MAP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("zipkin-javascript-opentracing", "makeOptional")
  @js.native
  def makeOptional(`val`: js.Any): js.Any = js.native
  
  object prototypeNamespace {
    
    object extract {
      
      @JSImport("zipkin-javascript-opentracing", "prototypeNamespace.extract")
      @js.native
      def apply(format: js.Any, carrier: js.Any): js.Any = js.native
    }
    
    object inject {
      
      @JSImport("zipkin-javascript-opentracing", "prototypeNamespace.inject")
      @js.native
      def apply(span: js.Any, format: js.Any, carrier: js.Any): Unit = js.native
    }
    
    object startSpan {
      
      @JSImport("zipkin-javascript-opentracing", "prototypeNamespace.startSpan")
      @js.native
      def apply(name: js.Any, args: js.Any*): js.Any = js.native
    }
  }
  
  @js.native
  trait zipkinJavascriptOpentracing extends StObject {
    
    def extract(format: js.Any, carrier: js.Any): js.Any = js.native
    
    def inject(span: js.Any, format: js.Any, carrier: js.Any): Unit = js.native
    
    def startSpan(name: js.Any, args: js.Any*): js.Any = js.native
  }
  object zipkinJavascriptOpentracing {
    
    @scala.inline
    def apply(
      extract: (js.Any, js.Any) => js.Any,
      inject: (js.Any, js.Any, js.Any) => Unit,
      startSpan: (js.Any, /* repeated */ js.Any) => js.Any
    ): typingsSlinky.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing = {
      val __obj = js.Dynamic.literal(extract = js.Any.fromFunction2(extract), inject = js.Any.fromFunction3(inject), startSpan = js.Any.fromFunction2(startSpan))
      __obj.asInstanceOf[typingsSlinky.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing]
    }
    
    @scala.inline
    implicit class zipkinJavascriptOpentracingMutableBuilder[Self <: typingsSlinky.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtract(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "extract", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInject(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStartSpan(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "startSpan", js.Any.fromFunction2(value))
    }
  }
}
