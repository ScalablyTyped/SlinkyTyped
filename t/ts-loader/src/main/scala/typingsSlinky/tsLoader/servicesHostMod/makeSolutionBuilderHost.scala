package typingsSlinky.tsLoader.servicesHostMod

import typingsSlinky.tsLoader.interfacesMod.SolutionBuilderWithWatchHost
import typingsSlinky.tsLoader.interfacesMod.TSInstance
import typingsSlinky.tsLoader.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/servicesHost", "makeSolutionBuilderHost")
@js.native
object makeSolutionBuilderHost extends js.Object {
  
  def apply(
    scriptRegex: js.RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance
  ): SolutionBuilderWithWatchHost = js.native
}
