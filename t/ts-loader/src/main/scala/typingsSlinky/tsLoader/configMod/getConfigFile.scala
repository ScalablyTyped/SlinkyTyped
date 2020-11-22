package typingsSlinky.tsLoader.configMod

import typingsSlinky.chalk.mod.Chalk
import typingsSlinky.tsLoader.anon.Typeoftypescript
import typingsSlinky.tsLoader.interfacesMod.LoaderOptions
import typingsSlinky.tsLoader.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/config", "getConfigFile")
@js.native
object getConfigFile extends js.Object {
  
  def apply(
    compiler: Typeoftypescript,
    colors: Chalk,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    loaderOptions: LoaderOptions,
    compilerCompatible: Boolean,
    log: Logger,
    compilerDetailsLogMessage: String
  ): typingsSlinky.tsLoader.anon.ConfigFile = js.native
}
