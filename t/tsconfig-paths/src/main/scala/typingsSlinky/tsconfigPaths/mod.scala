package typingsSlinky.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tsconfigPaths.configLoaderMod.ConfigLoaderResult
import typingsSlinky.tsconfigPaths.configLoaderMod.ExplicitParams
import typingsSlinky.tsconfigPaths.filesystemMod.FileExistsAsync_
import typingsSlinky.tsconfigPaths.filesystemMod.FileExistsSync_
import typingsSlinky.tsconfigPaths.filesystemMod.ReadJsonAsync
import typingsSlinky.tsconfigPaths.filesystemMod.ReadJsonSync
import typingsSlinky.tsconfigPaths.mappingEntryMod.MappingEntry
import typingsSlinky.tsconfigPaths.matchPathAsyncMod.MatchPathAsync
import typingsSlinky.tsconfigPaths.matchPathAsyncMod.MatchPathAsyncCallback
import typingsSlinky.tsconfigPaths.matchPathSyncMod.MatchPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsconfig-paths", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createMatchPath(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]]): MatchPath = js.native
  def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.UndefOr[scala.Nothing],
    addMatchAll: Boolean
  ): MatchPath = js.native
  def createMatchPath(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]], mainFields: js.Array[String]): MatchPath = js.native
  def createMatchPath(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String],
    addMatchAll: Boolean
  ): MatchPath = js.native
  
  def createMatchPathAsync(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]]): MatchPathAsync = js.native
  def createMatchPathAsync(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.UndefOr[scala.Nothing],
    addMatchAll: Boolean
  ): MatchPathAsync = js.native
  def createMatchPathAsync(absoluteBaseUrl: String, paths: StringDictionary[js.Array[String]], mainFields: js.Array[String]): MatchPathAsync = js.native
  def createMatchPathAsync(
    absoluteBaseUrl: String,
    paths: StringDictionary[js.Array[String]],
    mainFields: js.Array[String],
    addMatchAll: Boolean
  ): MatchPathAsync = js.native
  
  def loadConfig(): ConfigLoaderResult = js.native
  def loadConfig(cwd: String): ConfigLoaderResult = js.native
  
  def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.UndefOr[scala.Nothing],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsSync_
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsSync_,
    extensions: js.UndefOr[scala.Nothing],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsSync_,
    extensions: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsSync_,
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(absolutePathMappings: js.Array[MappingEntry], requestedModule: String, readJson: ReadJsonSync): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.UndefOr[scala.Nothing],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: js.UndefOr[scala.Nothing],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: js.Array[String]
  ): js.UndefOr[String] = js.native
  def matchFromAbsolutePaths(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonSync,
    fileExists: FileExistsSync_,
    extensions: js.Array[String],
    mainFields: js.Array[String]
  ): js.UndefOr[String] = js.native
  
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.UndefOr[scala.Nothing],
    callback: MatchPathAsyncCallback
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.UndefOr[scala.Nothing],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String]
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String]
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsAsync_,
    extensions: js.UndefOr[scala.Nothing],
    callback: MatchPathAsyncCallback
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsAsync_,
    extensions: js.UndefOr[scala.Nothing],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String]
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsAsync_,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: js.UndefOr[scala.Nothing],
    fileExists: FileExistsAsync_,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String]
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.UndefOr[scala.Nothing],
    callback: MatchPathAsyncCallback
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.UndefOr[scala.Nothing],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String]
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: js.UndefOr[scala.Nothing],
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String]
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: FileExistsAsync_,
    extensions: js.UndefOr[scala.Nothing],
    callback: MatchPathAsyncCallback
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: FileExistsAsync_,
    extensions: js.UndefOr[scala.Nothing],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String]
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: FileExistsAsync_,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback
  ): Unit = js.native
  def matchFromAbsolutePathsAsync(
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String,
    readJson: ReadJsonAsync,
    fileExists: FileExistsAsync_,
    extensions: js.Array[String],
    callback: MatchPathAsyncCallback,
    mainFields: js.Array[String]
  ): Unit = js.native
  
  def register(explicitParams: ExplicitParams): js.Function0[Unit] = js.native
}
