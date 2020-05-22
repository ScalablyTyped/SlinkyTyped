package typingsSlinky.webpackConcatPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpack.mod.Plugin
import typingsSlinky.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plugin to help webpack concat js and inject into html
  */
@js.native
trait ConcatPlugin extends Plugin {
  def ensureTrailingSlash(str: String): String = js.native
  def getFileName(file: String): String = js.native
  def getFileName(file: String, filePath: String): String = js.native
  def getFileName(file: StringDictionary[String]): String = js.native
  def getFileName(file: StringDictionary[String], filePath: String): String = js.native
  def getRelativePathAsync(context: String): js.Promise[String] = js.native
  def hashFile(files: String): String = js.native
  def hashFile(files: StringDictionary[String]): String = js.native
  def resolveConcatAndUglify(compilation: Compilation, files: js.Array[String]): Unit = js.native
  def resolveReadFiles(compiler: Compiler_): Unit = js.native
}

