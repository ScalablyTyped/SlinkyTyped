package typingsSlinky.webpackStatsPlugin.statsWriterPluginMod

import typingsSlinky.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsWriterPlugin extends Plugin {
  
  def emitStats(
    curCompiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
  ): js.Promise[String] = js.native
  def emitStats(
    curCompiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any,
    callback: TransformFunc
  ): js.Promise[Unit] = js.native
}
