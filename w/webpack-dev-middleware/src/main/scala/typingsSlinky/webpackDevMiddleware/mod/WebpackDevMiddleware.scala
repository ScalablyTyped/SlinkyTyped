package typingsSlinky.webpackDevMiddleware.mod

import typingsSlinky.webpackDevMiddleware.webpackDevMiddlewareBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackDevMiddleware extends js.Object {
  
  /** A function executed once the middleware has stopped watching. */
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  var fileSystem: typingsSlinky.memoryFs.mod.^ = js.native
  
  def getFilenameFromUrl(url: String): String | `false` = js.native
  
  /** Instructs a webpack-dev-middleware instance to recompile the bundle. e.g. after a change to the configuration. */
  def invalidate(): Unit = js.native
  def invalidate(
    callback: js.Function1[
      /* stats */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /** Executes a callback function when the compiler bundle is valid, typically after compilation */
  def waitUntilValid(): Unit = js.native
  def waitUntilValid(
    callback: js.Function1[
      /* stats */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
      ], 
      Unit
    ]
  ): Unit = js.native
}
