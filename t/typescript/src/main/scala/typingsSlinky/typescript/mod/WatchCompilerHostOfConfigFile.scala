package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Host to create watch with config file
  */
@js.native
trait WatchCompilerHostOfConfigFile[T /* <: BuilderProgram */]
  extends WatchCompilerHost[T]
     with ConfigFileDiagnosticsReporter {
  
  /** Name of the config file to compile */
  var configFileName: java.lang.String = js.native
  
  var extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]] = js.native
  
  /** Options to extend */
  var optionsToExtend: js.UndefOr[CompilerOptions] = js.native
  
  /**
    * Used to generate source file names from the config file and its include, exclude, files rules
    * and also to cache the directory stucture
    */
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: java.lang.String): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.UndefOr[scala.Nothing],
    exclude: js.UndefOr[scala.Nothing],
    include: js.UndefOr[scala.Nothing],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.UndefOr[scala.Nothing],
    exclude: js.UndefOr[scala.Nothing],
    include: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.UndefOr[scala.Nothing],
    exclude: js.UndefOr[scala.Nothing],
    include: js.Array[java.lang.String],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: java.lang.String, extensions: js.UndefOr[scala.Nothing], exclude: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.UndefOr[scala.Nothing],
    exclude: js.Array[java.lang.String],
    include: js.UndefOr[scala.Nothing],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.UndefOr[scala.Nothing],
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.UndefOr[scala.Nothing],
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: java.lang.String, extensions: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.UndefOr[scala.Nothing],
    include: js.UndefOr[scala.Nothing],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.UndefOr[scala.Nothing],
    include: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.UndefOr[scala.Nothing],
    include: js.Array[java.lang.String],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String],
    include: js.UndefOr[scala.Nothing],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  
  var watchOptionsToExtend: js.UndefOr[WatchOptions] = js.native
}
