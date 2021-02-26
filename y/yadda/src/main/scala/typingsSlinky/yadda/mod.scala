package typingsSlinky.yadda

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.yadda.contextMod.Properties
import typingsSlinky.yadda.featureParserMod.Options
import typingsSlinky.yadda.languageMod.Vocabulary
import typingsSlinky.yadda.libraryMod.^
import typingsSlinky.yadda.pluginsMod.MochaPlugin
import typingsSlinky.yadda.yaddaStrings.__ON_DEFINE__
import typingsSlinky.yadda.yaddaStrings.__ON_EXECUTE__
import typingsSlinky.yadda.yaddaStrings.__ON_SCENARIO__
import typingsSlinky.yadda.yaddaStrings.__ON_STEP__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yadda", "Context")
  @js.native
  class Context protected ()
    extends typingsSlinky.yadda.libMod.Context {
    def this(properties: Properties) = this()
  }
  
  @JSImport("yadda", "Dictionary")
  @js.native
  class Dictionary ()
    extends typingsSlinky.yadda.libMod.Dictionary {
    def this(prefix: String) = this()
  }
  
  object EventBus {
    
    @JSImport("yadda", "EventBus.EventBus")
    @js.native
    class EventBus ()
      extends typingsSlinky.yadda.libMod.EventBus.EventBus
    
    @JSImport("yadda", "EventBus.ON_DEFINE")
    @js.native
    val ON_DEFINE: __ON_DEFINE__ = js.native
    
    @JSImport("yadda", "EventBus.ON_EXECUTE")
    @js.native
    val ON_EXECUTE: __ON_EXECUTE__ = js.native
    
    @JSImport("yadda", "EventBus.ON_SCENARIO")
    @js.native
    val ON_SCENARIO: __ON_SCENARIO__ = js.native
    
    @JSImport("yadda", "EventBus.ON_STEP")
    @js.native
    val ON_STEP: __ON_STEP__ = js.native
    
    @JSImport("yadda", "EventBus.instance")
    @js.native
    def instance(): typingsSlinky.yadda.eventBusMod.EventBus = js.native
  }
  
  @JSImport("yadda", "FeatureFileSearch")
  @js.native
  class FeatureFileSearch protected ()
    extends typingsSlinky.yadda.libMod.FeatureFileSearch {
    def this(directories: String) = this()
  }
  
  @JSImport("yadda", "FileSearch")
  @js.native
  class FileSearch protected ()
    extends typingsSlinky.yadda.libMod.FileSearch {
    def this(directories: String) = this()
    def this(directories: String, patterns: js.RegExp) = this()
  }
  
  @JSImport("yadda", "Interpreter")
  @js.native
  class Interpreter protected ()
    extends typingsSlinky.yadda.libMod.Interpreter {
    def this(libraries: js.Array[^]) = this()
    def this(libraries: ^) = this()
  }
  
  @JSImport("yadda", "Library")
  @js.native
  class Library ()
    extends typingsSlinky.yadda.libMod.Library {
    def this(dictionary: typingsSlinky.yadda.dictionaryMod.^) = this()
  }
  
  @JSImport("yadda", "Platform")
  @js.native
  class Platform ()
    extends typingsSlinky.yadda.libMod.Platform
  
  @JSImport("yadda", "Yadda")
  @js.native
  class Yadda protected ()
    extends typingsSlinky.yadda.libMod.Yadda {
    def this(libraries: js.Array[^]) = this()
    def this(libraries: ^) = this()
    def this(libraries: js.Array[^], interpreter_context: Properties) = this()
    def this(libraries: js.Array[^], interpreter_context: typingsSlinky.yadda.contextMod.^) = this()
    def this(libraries: ^, interpreter_context: Properties) = this()
    def this(libraries: ^, interpreter_context: typingsSlinky.yadda.contextMod.^) = this()
  }
  
  object converters {
    
    @JSImport("yadda", "converters.date")
    @js.native
    def date(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Date, Unit]): Unit = js.native
    
    @JSImport("yadda", "converters.float")
    @js.native
    def float(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
    
    @JSImport("yadda", "converters.integer")
    @js.native
    def integer(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
    
    @JSImport("yadda", "converters.list")
    @js.native
    def list(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
    
    @JSImport("yadda", "converters.pass_through")
    @js.native
    def passThrough(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ String, Unit]): Unit = js.native
    
    @JSImport("yadda", "converters.table")
    @js.native
    def table(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
  }
  
  @JSImport("yadda", "createInstance")
  @js.native
  def createInstance(): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda", "createInstance")
  @js.native
  def createInstance(libraries: js.UndefOr[scala.Nothing], context: Properties): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda", "createInstance")
  @js.native
  def createInstance(libraries: js.Array[typingsSlinky.yadda.languageMod.Library]): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda", "createInstance")
  @js.native
  def createInstance(libraries: js.Array[typingsSlinky.yadda.languageMod.Library], context: Properties): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda", "createInstance")
  @js.native
  def createInstance(libraries: typingsSlinky.yadda.languageMod.Library): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda", "createInstance")
  @js.native
  def createInstance(libraries: typingsSlinky.yadda.languageMod.Library, context: Properties): typingsSlinky.yadda.yaddaMod.^ = js.native
  
  object localisation {
    
    object default extends Shortcut {
      
      @JSImport("yadda", "localisation.default")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `default.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library] = ^
    }
    
    object Chinese extends Shortcut {
      
      @JSImport("yadda", "localisation.Chinese")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.chineseMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.chineseMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Chinese.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.chineseMod.Library] = ^
    }
    
    object Dutch extends Shortcut {
      
      @JSImport("yadda", "localisation.Dutch")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.dutchMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.dutchMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Dutch.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.dutchMod.Library] = ^
    }
    
    object English extends Shortcut {
      
      @JSImport("yadda", "localisation.English")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `English.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library] = ^
    }
    
    object French extends Shortcut {
      
      @JSImport("yadda", "localisation.French")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.frenchMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.frenchMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `French.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.frenchMod.Library] = ^
    }
    
    object German extends Shortcut {
      
      @JSImport("yadda", "localisation.German")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.germanMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.germanMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `German.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.germanMod.Library] = ^
    }
    
    @JSImport("yadda", "localisation.Language")
    @js.native
    class Language[TLibrary /* <: typingsSlinky.yadda.languageMod.Library */] protected ()
      extends typingsSlinky.yadda.libMod.localisation.Language[TLibrary] {
      def this(name: String, vocabulary: Vocabulary) = this()
    }
    
    object Norwegian extends Shortcut {
      
      @JSImport("yadda", "localisation.Norwegian")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.norwegianMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.norwegianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Norwegian.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.norwegianMod.Library] = ^
    }
    
    object Pirate extends Shortcut {
      
      @JSImport("yadda", "localisation.Pirate")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.pirateMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.pirateMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Pirate.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.pirateMod.Library] = ^
    }
    
    object Polish extends Shortcut {
      
      @JSImport("yadda", "localisation.Polish")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.polishMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.polishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Polish.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.polishMod.Library] = ^
    }
    
    object Portuguese extends Shortcut {
      
      @JSImport("yadda", "localisation.Portuguese")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.portugueseMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.portugueseMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Portuguese.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.portugueseMod.Library] = ^
    }
    
    object Russian extends Shortcut {
      
      @JSImport("yadda", "localisation.Russian")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.russianMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.russianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Russian.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.russianMod.Library] = ^
    }
    
    object Spanish extends Shortcut {
      
      @JSImport("yadda", "localisation.Spanish")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.spanishMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.spanishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Spanish.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.spanishMod.Library] = ^
    }
    
    object Ukrainian extends Shortcut {
      
      @JSImport("yadda", "localisation.Ukrainian")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.ukrainianMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.ukrainianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Ukrainian.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.ukrainianMod.Library] = ^
    }
  }
  
  object parsers {
    
    @JSImport("yadda", "parsers.FeatureFileParser")
    @js.native
    class FeatureFileParser ()
      extends typingsSlinky.yadda.libMod.parsers.FeatureFileParser {
      def this(language: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.languageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda", "parsers.FeatureParser")
    @js.native
    class FeatureParser ()
      extends typingsSlinky.yadda.libMod.parsers.FeatureParser {
      def this(language: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.languageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda", "parsers.StepParser")
    @js.native
    class StepParser ()
      extends typingsSlinky.yadda.libMod.parsers.StepParser
  }
  
  object plugins {
    
    @JSImport("yadda", "plugins.casper")
    @js.native
    def casper(yadda: typingsSlinky.yadda.yaddaMod.^, casper: js.Any): Unit = js.native
    
    @JSImport("yadda", "plugins.jasmine")
    @js.native
    val jasmine: MochaPlugin = js.native
    
    @JSImport("yadda", "plugins.mocha")
    @js.native
    val mocha: MochaPlugin = js.native
  }
}
