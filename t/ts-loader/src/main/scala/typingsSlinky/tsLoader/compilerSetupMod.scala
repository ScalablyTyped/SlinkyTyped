package typingsSlinky.tsLoader

import typingsSlinky.tsLoader.anon.Compiler
import typingsSlinky.tsLoader.interfacesMod.LoaderOptions
import typingsSlinky.tsLoader.loggerMod.Logger
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/compilerSetup", JSImport.Namespace)
@js.native
object compilerSetupMod extends js.Object {
  
  def getCompiler(loaderOptions: LoaderOptions, log: Logger): Compiler = js.native
  
  def getCompilerOptions(configParseResult: ParsedCommandLine): CompilerOptions = js.native
}
