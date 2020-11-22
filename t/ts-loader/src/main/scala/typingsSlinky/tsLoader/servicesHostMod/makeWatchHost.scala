package typingsSlinky.tsLoader.servicesHostMod

import typingsSlinky.tsLoader.interfacesMod.TSInstance
import typingsSlinky.tsLoader.interfacesMod.WatchHost
import typingsSlinky.tsLoader.loggerMod.Logger
import typingsSlinky.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/servicesHost", "makeWatchHost")
@js.native
object makeWatchHost extends js.Object {
  
  def apply(
    scriptRegex: js.RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance
  ): WatchHost = js.native
  def apply(
    scriptRegex: js.RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance,
    projectReferences: js.Array[ProjectReference]
  ): WatchHost = js.native
}
