package typingsSlinky.swaggerExpressMiddleware.mod

import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Router
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesSignature extends StObject {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(/**
    * Options for how the files are served
    */
  options: FilesOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
