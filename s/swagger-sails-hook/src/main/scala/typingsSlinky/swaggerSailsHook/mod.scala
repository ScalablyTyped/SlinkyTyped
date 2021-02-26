package typingsSlinky.swaggerSailsHook

import typingsSlinky.swaggerSailsHook.anon.After
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new `swagger-sails-hook` sails hook and register it with `sails`
    * @param sails - reference to the running sails instance
    * @returns SailsHook - `swagger-sails-hook` object implementing the Sails' hook specification.
    */
  @JSImport("swagger-sails-hook", JSImport.Namespace)
  @js.native
  def apply(sails: js.Any): SailsHook = js.native
  
  /**
    * `swagger-sails-hook` object implementing the Sails' hook specification.
    *
    * @see {@link http://sailsjs.com/documentation/concepts/extending-sails/hooks/hook-specification|Sails Hook Docs}
    * @see {@link http://sailsjs.com/documentation/anatomy/api/hooks/my-hook/index-js|Sails Hook Example}
    */
  @js.native
  trait SailsHook extends StObject {
    
    /**
      * Perform startup tasks.
      * All Sails configuration is guaranteed to be completed before a hook’s initialize function runs.
      * @param done - called when `swagger-sails-hook`'s startup tasks have finished.
      */
    def initialize(done: js.Function0[_]): Unit = js.native
    
    /**
      * `swagger-sails-hook` specific route bound to a Sails app at load time.
      *
      * It handles any unhandled requests (any routes that aren't bound in the app via a
      * custom route configuration or a blueprint) via the swagger middleware.
      */
    var routes: After = js.native
  }
  object SailsHook {
    
    @scala.inline
    def apply(initialize: js.Function0[_] => Unit, routes: After): SailsHook = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SailsHook]
    }
    
    @scala.inline
    implicit class SailsHookMutableBuilder[Self <: SailsHook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialize(value: js.Function0[_] => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoutes(value: After): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    }
  }
}
