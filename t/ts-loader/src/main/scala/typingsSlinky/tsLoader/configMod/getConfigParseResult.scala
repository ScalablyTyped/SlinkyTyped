package typingsSlinky.tsLoader.configMod

import typingsSlinky.tsLoader.anon.Typeoftypescript
import typingsSlinky.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/config", "getConfigParseResult")
@js.native
object getConfigParseResult extends js.Object {
  
  def apply(
    compiler: Typeoftypescript,
    configFile: ConfigFile,
    basePath: String,
    configFilePath: js.UndefOr[scala.Nothing],
    enableProjectReferences: Boolean
  ): ParsedCommandLine = js.native
  def apply(
    compiler: Typeoftypescript,
    configFile: ConfigFile,
    basePath: String,
    configFilePath: String,
    enableProjectReferences: Boolean
  ): ParsedCommandLine = js.native
}
