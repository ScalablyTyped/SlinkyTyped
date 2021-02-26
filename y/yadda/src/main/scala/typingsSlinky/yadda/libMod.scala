package typingsSlinky.yadda

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.yadda.contextMod.Properties
import typingsSlinky.yadda.contextMod.^
import typingsSlinky.yadda.featureParserMod.Options
import typingsSlinky.yadda.languageMod.Vocabulary
import typingsSlinky.yadda.pluginsMod.MochaPlugin
import typingsSlinky.yadda.yaddaStrings.__ON_DEFINE__
import typingsSlinky.yadda.yaddaStrings.__ON_EXECUTE__
import typingsSlinky.yadda.yaddaStrings.__ON_SCENARIO__
import typingsSlinky.yadda.yaddaStrings.__ON_STEP__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("yadda/lib", "Context")
  @js.native
  class Context protected () extends ^ {
    def this(properties: Properties) = this()
  }
  
  @JSImport("yadda/lib", "Dictionary")
  @js.native
  class Dictionary ()
    extends typingsSlinky.yadda.dictionaryMod.^ {
    def this(prefix: String) = this()
  }
  
  object EventBus {
    
    @JSImport("yadda/lib", "EventBus.EventBus")
    @js.native
    class EventBus ()
      extends typingsSlinky.yadda.eventBusMod.EventBus
    
    @JSImport("yadda/lib", "EventBus.ON_DEFINE")
    @js.native
    val ON_DEFINE: __ON_DEFINE__ = js.native
    
    @JSImport("yadda/lib", "EventBus.ON_EXECUTE")
    @js.native
    val ON_EXECUTE: __ON_EXECUTE__ = js.native
    
    @JSImport("yadda/lib", "EventBus.ON_SCENARIO")
    @js.native
    val ON_SCENARIO: __ON_SCENARIO__ = js.native
    
    @JSImport("yadda/lib", "EventBus.ON_STEP")
    @js.native
    val ON_STEP: __ON_STEP__ = js.native
    
    @JSImport("yadda/lib", "EventBus.instance")
    @js.native
    def instance(): typingsSlinky.yadda.eventBusMod.EventBus = js.native
  }
  
  @JSImport("yadda/lib", "FeatureFileSearch")
  @js.native
  class FeatureFileSearch protected ()
    extends typingsSlinky.yadda.featureFileSearchMod.^ {
    def this(directories: String) = this()
  }
  
  @JSImport("yadda/lib", "FileSearch")
  @js.native
  class FileSearch protected ()
    extends typingsSlinky.yadda.fileSearchMod.^ {
    def this(directories: String) = this()
    def this(directories: String, patterns: js.RegExp) = this()
  }
  
  @JSImport("yadda/lib", "Interpreter")
  @js.native
  class Interpreter protected ()
    extends typingsSlinky.yadda.interpreterMod.^ {
    def this(libraries: js.Array[typingsSlinky.yadda.libraryMod.^]) = this()
    def this(libraries: typingsSlinky.yadda.libraryMod.^) = this()
  }
  
  @JSImport("yadda/lib", "Library")
  @js.native
  class Library ()
    extends typingsSlinky.yadda.libraryMod.^ {
    def this(dictionary: typingsSlinky.yadda.dictionaryMod.^) = this()
  }
  
  @JSImport("yadda/lib", "Platform")
  @js.native
  class Platform ()
    extends typingsSlinky.yadda.platformMod.^
  
  @JSImport("yadda/lib", "Yadda")
  @js.native
  class Yadda protected ()
    extends typingsSlinky.yadda.yaddaMod.^ {
    def this(libraries: js.Array[typingsSlinky.yadda.libraryMod.^]) = this()
    def this(libraries: typingsSlinky.yadda.libraryMod.^) = this()
    def this(libraries: js.Array[typingsSlinky.yadda.libraryMod.^], interpreter_context: Properties) = this()
    def this(libraries: js.Array[typingsSlinky.yadda.libraryMod.^], interpreter_context: ^) = this()
    def this(libraries: typingsSlinky.yadda.libraryMod.^, interpreter_context: Properties) = this()
    def this(libraries: typingsSlinky.yadda.libraryMod.^, interpreter_context: ^) = this()
  }
  
  object converters {
    
    @JSImport("yadda/lib", "converters.date")
    @js.native
    def date(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Date, Unit]): Unit = js.native
    
    @JSImport("yadda/lib", "converters.float")
    @js.native
    def float(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
    
    @JSImport("yadda/lib", "converters.integer")
    @js.native
    def integer(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
    
    @JSImport("yadda/lib", "converters.list")
    @js.native
    def list(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
    
    @JSImport("yadda/lib", "converters.pass_through")
    @js.native
    def passThrough(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ String, Unit]): Unit = js.native
    
    @JSImport("yadda/lib", "converters.table")
    @js.native
    def table(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
  }
  
  @JSImport("yadda/lib", "createInstance")
  @js.native
  def createInstance(): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda/lib", "createInstance")
  @js.native
  def createInstance(libraries: js.UndefOr[scala.Nothing], context: Properties): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda/lib", "createInstance")
  @js.native
  def createInstance(libraries: js.Array[typingsSlinky.yadda.languageMod.Library]): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda/lib", "createInstance")
  @js.native
  def createInstance(libraries: js.Array[typingsSlinky.yadda.languageMod.Library], context: Properties): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda/lib", "createInstance")
  @js.native
  def createInstance(libraries: typingsSlinky.yadda.languageMod.Library): typingsSlinky.yadda.yaddaMod.^ = js.native
  @JSImport("yadda/lib", "createInstance")
  @js.native
  def createInstance(libraries: typingsSlinky.yadda.languageMod.Library, context: Properties): typingsSlinky.yadda.yaddaMod.^ = js.native
  
  object localisation {
    
    object default extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.default")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `default.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library] = ^
    }
    
    object Chinese extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Chinese")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.chineseMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.chineseMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Chinese.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.chineseMod.Library] = ^
    }
    
    object Dutch extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Dutch")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.dutchMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.dutchMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Dutch.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.dutchMod.Library] = ^
    }
    
    object English extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.English")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `English.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.englishMod.Library] = ^
    }
    
    object French extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.French")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.frenchMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.frenchMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `French.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.frenchMod.Library] = ^
    }
    
    object German extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.German")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.germanMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.germanMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `German.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.germanMod.Library] = ^
    }
    
    @JSImport("yadda/lib", "localisation.Language")
    @js.native
    class Language[TLibrary /* <: typingsSlinky.yadda.languageMod.Library */] protected ()
      extends typingsSlinky.yadda.localisationMod.Language[TLibrary] {
      def this(name: String, vocabulary: Vocabulary) = this()
    }
    
    object Norwegian extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Norwegian")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.norwegianMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.norwegianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Norwegian.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.norwegianMod.Library] = ^
    }
    
    object Pirate extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Pirate")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.pirateMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.pirateMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Pirate.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.pirateMod.Library] = ^
    }
    
    object Polish extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Polish")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.polishMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.polishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Polish.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.polishMod.Library] = ^
    }
    
    object Portuguese extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Portuguese")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.portugueseMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.portugueseMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Portuguese.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.portugueseMod.Library] = ^
    }
    
    object Russian extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Russian")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.russianMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.russianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Russian.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.russianMod.Library] = ^
    }
    
    object Spanish extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Spanish")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.spanishMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.spanishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Spanish.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.spanishMod.Library] = ^
    }
    
    object Ukrainian extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Ukrainian")
      @js.native
      val ^ : typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.ukrainianMod.Library] = js.native
      
      type _To = typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.ukrainianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Ukrainian.foo` */
      override def _to: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.ukrainianMod.Library] = ^
    }
  }
  
  object parsers {
    
    @JSImport("yadda/lib", "parsers.FeatureFileParser")
    @js.native
    class FeatureFileParser ()
      extends typingsSlinky.yadda.parsersMod.FeatureFileParser {
      def this(language: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.languageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda/lib", "parsers.FeatureParser")
    @js.native
    class FeatureParser ()
      extends typingsSlinky.yadda.parsersMod.FeatureParser {
      def this(language: typingsSlinky.yadda.languageMod.^[typingsSlinky.yadda.languageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda/lib", "parsers.StepParser")
    @js.native
    class StepParser ()
      extends typingsSlinky.yadda.parsersMod.StepParser
  }
  
  object plugins {
    
    @JSImport("yadda/lib", "plugins.casper")
    @js.native
    def casper(yadda: typingsSlinky.yadda.yaddaMod.^, casper: js.Any): Unit = js.native
    
    @JSImport("yadda/lib", "plugins.jasmine")
    @js.native
    val jasmine: MochaPlugin = js.native
    
    @JSImport("yadda/lib", "plugins.mocha")
    @js.native
    val mocha: MochaPlugin = js.native
  }
  
  type Annotations = StringDictionary[String]
  
  type Converter = (js.Function2[
    /* arg1 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function3[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function4[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function5[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function6[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function7[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* arg6 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit], 
    Unit
  ])
  
  @js.native
  trait Feature extends StObject {
    
    var annotations: Annotations = js.native
    
    var description: js.Array[String] = js.native
    
    var scenarios: js.Array[Scenario] = js.native
    
    var title: String = js.native
  }
  object Feature {
    
    @scala.inline
    def apply(
      annotations: Annotations,
      description: js.Array[String],
      scenarios: js.Array[Scenario],
      title: String
    ): Feature = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature]
    }
    
    @scala.inline
    implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: Annotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value :_*))
      
      @scala.inline
      def setScenarios(value: js.Array[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenariosVarargs(value: Scenario*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scenario extends StObject {
    
    var annotations: Annotations = js.native
    
    var description: js.Array[String] = js.native
    
    var steps: js.Array[Step] = js.native
    
    var title: String = js.native
  }
  object Scenario {
    
    @scala.inline
    def apply(annotations: Annotations, description: js.Array[String], steps: js.Array[Step], title: String): Scenario = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scenario]
    }
    
    @scala.inline
    implicit class ScenarioMutableBuilder[Self <: Scenario] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: Annotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value :_*))
      
      @scala.inline
      def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Step = String
  
  @js.native
  trait StepFn extends StObject {
    
    var ctx: Properties = js.native
    
    var step: String = js.native
  }
  object StepFn {
    
    @scala.inline
    def apply(ctx: Properties, step: String): StepFn = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepFn]
    }
    
    @scala.inline
    implicit class StepFnMutableBuilder[Self <: StepFn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
