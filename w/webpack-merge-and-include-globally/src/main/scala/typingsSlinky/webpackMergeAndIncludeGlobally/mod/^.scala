package typingsSlinky.webpackMergeAndIncludeGlobally.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webpack plugin to merge your source files together into single file, to be included in index.html,
  * and achieving same effect as you would by including them all separately through <script> or <link>.
  */
@JSImport("webpack-merge-and-include-globally", JSImport.Namespace)
@js.native
class ^ protected () extends Plugin {
  def this(options: Options) = this()
  def this(options: Options, onComplete: js.Function1[/* files */ StringDictionary[String], Unit]) = this()
}
@JSImport("webpack-merge-and-include-globally", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def getHashOfRelatedFile(assets: js.Any, fileName: String): String | Null = js.native
}
