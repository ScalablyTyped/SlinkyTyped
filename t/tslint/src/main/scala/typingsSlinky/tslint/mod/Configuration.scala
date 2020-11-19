package typingsSlinky.tslint.mod

import typingsSlinky.std.Map
import typingsSlinky.tslint.anon.PartialIOptions
import typingsSlinky.tslint.configurationMod.IConfigurationFile
import typingsSlinky.tslint.configurationMod.IConfigurationLoadResult
import typingsSlinky.tslint.configurationMod.RawConfigFile
import typingsSlinky.tslint.ruleMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "Configuration")
@js.native
object Configuration extends js.Object {
  
  val CONFIG_FILENAME: /* "tslint.json" */ String = js.native
  
  val CONFIG_FILENAMES: js.Array[String] = js.native
  
  val DEFAULT_CONFIG: IConfigurationFile = js.native
  
  val EMPTY_CONFIG: IConfigurationFile = js.native
  
  val JSON_CONFIG_FILENAME: /* "tslint.json" */ String = js.native
  
  def convertRuleOptions(ruleConfiguration: Map[String, PartialIOptions]): js.Array[IOptions] = js.native
  
  def extendConfigurationFile(targetConfig: IConfigurationFile, nextConfigSource: IConfigurationFile): IConfigurationFile = js.native
  
  def findConfiguration(configFile: String): IConfigurationLoadResult = js.native
  def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
  def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
  
  def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = js.native
  
  def getRelativePath(): js.UndefOr[String] = js.native
  def getRelativePath(directory: js.UndefOr[scala.Nothing], relativeTo: String): js.UndefOr[String] = js.native
  def getRelativePath(directory: String): js.UndefOr[String] = js.native
  def getRelativePath(directory: String, relativeTo: String): js.UndefOr[String] = js.native
  def getRelativePath(directory: Null, relativeTo: String): js.UndefOr[String] = js.native
  
  def getRulesDirectories(): js.Array[String] = js.native
  def getRulesDirectories(directories: js.UndefOr[scala.Nothing], relativeTo: String): js.Array[String] = js.native
  def getRulesDirectories(directories: String): js.Array[String] = js.native
  def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = js.native
  def getRulesDirectories(directories: js.Array[String]): js.Array[String] = js.native
  def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = js.native
  
  def isFileExcluded(filepath: String): Boolean = js.native
  def isFileExcluded(filepath: String, configFile: IConfigurationFile): Boolean = js.native
  
  def loadConfigurationFromPath(): IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: js.UndefOr[scala.Nothing], _originalFilePath: String): IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = js.native
  
  def parseConfigFile(configFile: RawConfigFile): IConfigurationFile = js.native
  def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: js.UndefOr[scala.Nothing],
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = js.native
  def parseConfigFile(configFile: RawConfigFile, configFileDir: String): IConfigurationFile = js.native
  def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: String,
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = js.native
  
  def readConfigurationFile(filepath: String): RawConfigFile = js.native
  
  def stringifyConfiguration(configFile: IConfigurationFile): String = js.native
  
  def useAsPath(directory: String): Boolean = js.native
}
