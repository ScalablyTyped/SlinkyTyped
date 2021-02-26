package typingsSlinky.stickyCluster

import typingsSlinky.node.httpMod.Server
import typingsSlinky.stickyCluster.anon.Stickyclusterworkerindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sticky-cluster", JSImport.Namespace)
  @js.native
  def apply(callback: InitializeFn): Unit = js.native
  @JSImport("sticky-cluster", JSImport.Namespace)
  @js.native
  def apply(callback: InitializeFn, options: Options): Unit = js.native
  
  type Callback = js.Function1[/* server */ Server, Unit]
  
  type InitializeFn = js.Function1[/* callback */ Callback, Unit]
  
  @js.native
  trait Options extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var env: js.UndefOr[js.Function1[/* index */ Double, Stickyclusterworkerindex]] = js.native
    
    var errorHandler: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
    
    var hardShutdownDelay: js.UndefOr[Double] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var prefix: js.UndefOr[String] = js.native
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
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEnv(value: /* index */ Double => Stickyclusterworkerindex): Self = StObject.set(x, "env", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setErrorHandler(value: /* err */ js.Any => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setHardShutdownDelay(value: Double): Self = StObject.set(x, "hardShutdownDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardShutdownDelayUndefined: Self = StObject.set(x, "hardShutdownDelay", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
