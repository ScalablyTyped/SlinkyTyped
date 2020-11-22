package typingsSlinky.tsLoader.configMod

import typingsSlinky.tsLoader.anon.Typeoftypescript
import typingsSlinky.tsLoader.interfacesMod.LoaderOptions
import typingsSlinky.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/config", "getParsedCommandLine")
@js.native
object getParsedCommandLine extends js.Object {
  
  def apply(compiler: Typeoftypescript, loaderOptions: LoaderOptions, configFilePath: String): js.UndefOr[ParsedCommandLine] = js.native
}
