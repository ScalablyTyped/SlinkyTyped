package typingsSlinky.tsLoader

import typingsSlinky.tsLoader.anon.Compiler
import typingsSlinky.tsLoader.interfacesMod.LoaderOptions
import typingsSlinky.tsLoader.loggerMod.Logger
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerSetupMod {
  
  @JSImport("ts-loader/dist/compilerSetup", "getCompiler")
  @js.native
  def getCompiler(loaderOptions: LoaderOptions, log: Logger): Compiler = js.native
  
  @JSImport("ts-loader/dist/compilerSetup", "getCompilerOptions")
  @js.native
  def getCompilerOptions(configParseResult: ParsedCommandLine): CompilerOptions = js.native
}
