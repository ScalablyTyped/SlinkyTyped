package typingsSlinky.signale

import typingsSlinky.signale.mod.DefaultMethods
import typingsSlinky.signale.mod.LoggerFunc
import typingsSlinky.signale.mod.Signale
import typingsSlinky.signale.mod.SignaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Label extends StObject {
    
    var label: String = js.native
    
    var span: js.UndefOr[Double] = js.native
  }
  object Label {
    
    @scala.inline
    def apply(label: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    }
  }
  
  /* Inlined std.Record<signale.signale.DefaultMethods, signale.signale.LoggerFunc> */
  @js.native
  trait RecordDefaultMethodsLogge extends StObject {
    
    def await(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def await(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("await")
    var await_Original: LoggerFunc = js.native
    
    def complete(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def complete(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("complete")
    var complete_Original: LoggerFunc = js.native
    
    def debug(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def debug(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: LoggerFunc = js.native
    
    def error(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def error(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("error")
    var error_Original: LoggerFunc = js.native
    
    def fatal(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def fatal(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("fatal")
    var fatal_Original: LoggerFunc = js.native
    
    def fav(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def fav(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("fav")
    var fav_Original: LoggerFunc = js.native
    
    def info(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def info(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("info")
    var info_Original: LoggerFunc = js.native
    
    def log(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def log(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("log")
    var log_Original: LoggerFunc = js.native
    
    def note(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def note(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("note")
    var note_Original: LoggerFunc = js.native
    
    def pause(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def pause(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("pause")
    var pause_Original: LoggerFunc = js.native
    
    def pending(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def pending(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("pending")
    var pending_Original: LoggerFunc = js.native
    
    def star(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def star(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("star")
    var star_Original: LoggerFunc = js.native
    
    def start(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def start(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("start")
    var start_Original: LoggerFunc = js.native
    
    def success(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def success(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("success")
    var success_Original: LoggerFunc = js.native
    
    def warn(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def warn(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: LoggerFunc = js.native
    
    def watch(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def watch(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("watch")
    var watch_Original: LoggerFunc = js.native
  }
  
  /* Inlined signale.signale.Signale<signale.signale.DefaultMethods> */
  @js.native
  trait SignaleDefaultMethods extends StObject {
    
    /**
      * Adds new secrets/sensitive-information to the targeted Signale instance.
      *
      * @param secrets Array holding the secrets/sensitive-information to be filtered out.
      */
    def addSecrets(secrets: js.Array[Double | String]): Unit = js.native
    
    def await(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def await(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("await")
    var await_Original: LoggerFunc = js.native
    
    /**
      * Removes all secrets/sensitive-information from the targeted Signale instance.
      */
    def clearSecrets(): Unit = js.native
    
    def complete(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def complete(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("complete")
    var complete_Original: LoggerFunc = js.native
    
    /**
      * Sets the configuration of an instance overriding any existing global or local configuration.
      *
      * @param configObj Can hold any of the documented options.
      */
    def config(configObj: SignaleConfig): Signale[DefaultMethods] = js.native
    
    def debug(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def debug(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: LoggerFunc = js.native
    
    /**
      * Disables the logging functionality of all loggers belonging to a specific instance.
      */
    def disable(): Unit = js.native
    
    /**
      * Enables the logging functionality of all loggers belonging to a specific instance.
      */
    def enable(): Unit = js.native
    
    def error(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def error(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("error")
    var error_Original: LoggerFunc = js.native
    
    def fatal(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def fatal(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("fatal")
    var fatal_Original: LoggerFunc = js.native
    
    def fav(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def fav(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("fav")
    var fav_Original: LoggerFunc = js.native
    
    def info(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def info(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("info")
    var info_Original: LoggerFunc = js.native
    
    /**
      * Checks whether the logging functionality of a specific instance is enabled.
      *
      * @returns a boolean that describes whether or not the logger is enabled.
      */
    def isEnabled(): Boolean = js.native
    
    def log(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def log(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("log")
    var log_Original: LoggerFunc = js.native
    
    def note(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def note(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("note")
    var note_Original: LoggerFunc = js.native
    
    def pause(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def pause(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("pause")
    var pause_Original: LoggerFunc = js.native
    
    def pending(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def pending(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("pending")
    var pending_Original: LoggerFunc = js.native
    
    /**
      * Defines the scope name of the logger.
      *
      * @param name Can be one or more comma delimited strings.
      */
    def scope(name: String*): Signale[DefaultMethods] = js.native
    
    def star(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def star(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("star")
    var star_Original: LoggerFunc = js.native
    
    def start(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def start(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("start")
    var start_Original: LoggerFunc = js.native
    
    def success(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def success(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("success")
    var success_Original: LoggerFunc = js.native
    
    /**
      * Sets a timers and accepts an optional label. If none provided the timer will receive a unique label automatically.
      *
      * @param label Label corresponding to the timer. Each timer must have its own unique label.
      * @returns a string corresponding to the timer label.
      */
    def time(): String = js.native
    def time(label: String): String = js.native
    
    /**
      * Deactivates the timer to which the given label corresponds. If no label
      * is provided the most recent timer, that was created without providing a
      * label, will be deactivated.
      *
      * @param label Label corresponding to the timer, each timer has its own unique label.
      * @param span Total running time.
      */
    def timeEnd(): Label = js.native
    def timeEnd(label: js.UndefOr[scala.Nothing], span: Double): Label = js.native
    def timeEnd(label: String): Label = js.native
    def timeEnd(label: String, span: Double): Label = js.native
    
    /** Clears the scope name of the logger. */
    def unscope(): Unit = js.native
    
    def warn(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def warn(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: LoggerFunc = js.native
    
    def watch(message: js.UndefOr[scala.Nothing], optionalArgs: js.Any*): Unit = js.native
    def watch(message: js.Any, optionalArgs: js.Any*): Unit = js.native
    @JSName("watch")
    var watch_Original: LoggerFunc = js.native
  }
}
