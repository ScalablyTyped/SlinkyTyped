package typingsSlinky.webpackWatchedGlobEntriesPlugin.mod

import typingsSlinky.glob.mod.IOptions
import typingsSlinky.std.Plugin
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
@js.native
class ^ () extends Plugin

@JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getEntries(globs: js.Array[String]): js.Any = js.native
  def getEntries(globs: js.Array[String], globOptions: js.UndefOr[scala.Nothing], pluginOptions: PluginOptions): js.Any = js.native
  def getEntries(globs: js.Array[String], globOptions: IOptions): js.Any = js.native
  def getEntries(globs: js.Array[String], globOptions: IOptions, pluginOptions: PluginOptions): js.Any = js.native
  def getFiles(globString: String): Record[String, String] = js.native
  def getFiles(globString: String, globOptions: js.UndefOr[scala.Nothing], basename_as_entry_name: Boolean): Record[String, String] = js.native
  def getFiles(globString: String, globOptions: IOptions): Record[String, String] = js.native
  def getFiles(globString: String, globOptions: IOptions, basename_as_entry_name: Boolean): Record[String, String] = js.native
}

