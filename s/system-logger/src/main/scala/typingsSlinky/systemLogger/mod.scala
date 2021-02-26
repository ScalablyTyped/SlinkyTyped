package typingsSlinky.systemLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("system-logger", "Logger")
  @js.native
  class Logger () extends StObject {
    def this(configuration: LoggerConfiguration) = this()
    def this(configuration: js.UndefOr[scala.Nothing], fileConfig: FileConfiguration) = this()
    def this(configuration: LoggerConfiguration, fileConfig: FileConfiguration) = this()
    def this(
      configuration: js.UndefOr[scala.Nothing],
      fileConfig: js.UndefOr[scala.Nothing],
      sourceConfig: SourcesConfiguration
    ) = this()
    def this(
      configuration: js.UndefOr[scala.Nothing],
      fileConfig: FileConfiguration,
      sourceConfig: SourcesConfiguration
    ) = this()
    def this(
      configuration: LoggerConfiguration,
      fileConfig: js.UndefOr[scala.Nothing],
      sourceConfig: SourcesConfiguration
    ) = this()
    def this(
      configuration: LoggerConfiguration,
      fileConfig: FileConfiguration,
      sourceConfig: SourcesConfiguration
    ) = this()
    
    def log(level: String, message: String): Unit = js.native
    def log(level: String, message: String, optional: js.Any): Unit = js.native
    def log(level: level, message: String): Unit = js.native
    def log(level: level, message: String, optional: js.Any): Unit = js.native
  }
  
  @js.native
  sealed trait fileRotateType extends StObject
  @JSImport("system-logger", "fileRotateType")
  @js.native
  object fileRotateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[fileRotateType with Double] = js.native
    
    @js.native
    sealed trait daily extends fileRotateType
    /* 2 */ val daily: typingsSlinky.systemLogger.mod.fileRotateType.daily with Double = js.native
    
    @js.native
    sealed trait hourly extends fileRotateType
    /* 3 */ val hourly: typingsSlinky.systemLogger.mod.fileRotateType.hourly with Double = js.native
    
    @js.native
    sealed trait minutely extends fileRotateType
    /* 4 */ val minutely: typingsSlinky.systemLogger.mod.fileRotateType.minutely with Double = js.native
    
    @js.native
    sealed trait monthly extends fileRotateType
    /* 0 */ val monthly: typingsSlinky.systemLogger.mod.fileRotateType.monthly with Double = js.native
    
    @js.native
    sealed trait weekly extends fileRotateType
    /* 1 */ val weekly: typingsSlinky.systemLogger.mod.fileRotateType.weekly with Double = js.native
  }
  
  @js.native
  sealed trait level extends StObject
  @JSImport("system-logger", "level")
  @js.native
  object level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[level with Double] = js.native
    
    @js.native
    sealed trait debug extends level
    /* 4 */ val debug: typingsSlinky.systemLogger.mod.level.debug with Double = js.native
    
    @js.native
    sealed trait error extends level
    /* 0 */ val error: typingsSlinky.systemLogger.mod.level.error with Double = js.native
    
    @js.native
    sealed trait info extends level
    /* 2 */ val info: typingsSlinky.systemLogger.mod.level.info with Double = js.native
    
    @js.native
    sealed trait silly extends level
    /* 5 */ val silly: typingsSlinky.systemLogger.mod.level.silly with Double = js.native
    
    @js.native
    sealed trait verbose extends level
    /* 3 */ val verbose: typingsSlinky.systemLogger.mod.level.verbose with Double = js.native
    
    @js.native
    sealed trait warn extends level
    /* 1 */ val warn: typingsSlinky.systemLogger.mod.level.warn with Double = js.native
  }
  
  @js.native
  trait FileConfiguration extends StObject {
    
    var fileRotateMaxSize: js.UndefOr[Double] = js.native
    
    var fileRotateType: js.UndefOr[typingsSlinky.systemLogger.mod.fileRotateType] = js.native
    
    var isFileRotate: js.UndefOr[Boolean] = js.native
    
    var saveToFileName: js.UndefOr[String] = js.native
  }
  object FileConfiguration {
    
    @scala.inline
    def apply(): FileConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileConfiguration]
    }
    
    @scala.inline
    implicit class FileConfigurationMutableBuilder[Self <: FileConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileRotateMaxSize(value: Double): Self = StObject.set(x, "fileRotateMaxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileRotateMaxSizeUndefined: Self = StObject.set(x, "fileRotateMaxSize", js.undefined)
      
      @scala.inline
      def setFileRotateType(value: fileRotateType): Self = StObject.set(x, "fileRotateType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileRotateTypeUndefined: Self = StObject.set(x, "fileRotateType", js.undefined)
      
      @scala.inline
      def setIsFileRotate(value: Boolean): Self = StObject.set(x, "isFileRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFileRotateUndefined: Self = StObject.set(x, "isFileRotate", js.undefined)
      
      @scala.inline
      def setSaveToFileName(value: String): Self = StObject.set(x, "saveToFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveToFileNameUndefined: Self = StObject.set(x, "saveToFileName", js.undefined)
    }
  }
  
  @js.native
  trait LoggerConfiguration extends StObject {
    
    var externalDisplayFormat: js.UndefOr[js.Any] = js.native
    
    var level: typingsSlinky.systemLogger.mod.level = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object LoggerConfiguration {
    
    @scala.inline
    def apply(level: level): LoggerConfiguration = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerConfiguration]
    }
    
    @scala.inline
    implicit class LoggerConfigurationMutableBuilder[Self <: LoggerConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternalDisplayFormat(value: js.Any): Self = StObject.set(x, "externalDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalDisplayFormatUndefined: Self = StObject.set(x, "externalDisplayFormat", js.undefined)
      
      @scala.inline
      def setLevel(value: level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  @js.native
  trait SourcesConfiguration extends StObject {
    
    var callback: js.Any = js.native
    
    var connector: js.Any = js.native
    
    var levels: js.Array[level] = js.native
  }
  object SourcesConfiguration {
    
    @scala.inline
    def apply(callback: js.Any, connector: js.Any, levels: js.Array[level]): SourcesConfiguration = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourcesConfiguration]
    }
    
    @scala.inline
    implicit class SourcesConfigurationMutableBuilder[Self <: SourcesConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnector(value: js.Any): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: js.Array[level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelsVarargs(value: level*): Self = StObject.set(x, "levels", js.Array(value :_*))
    }
  }
}
