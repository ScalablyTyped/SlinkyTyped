package typingsSlinky.webpackPluginServe.mod

import typingsSlinky.webpackPluginServe.anon.Apply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-plugin-serve", "WebpackPluginServe")
@js.native
class WebpackPluginServe () extends js.Object {
  def this(opts: WebpackPluginServeOptions) = this()
  
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
  ): Unit = js.native
  
  def attach(): Apply = js.native
  
  def hook(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
  ): Unit = js.native
}
