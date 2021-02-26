package typingsSlinky.semanticUiProgress

import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ClassNameSettings.Param
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.TextSettings
import typingsSlinky.semanticUiProgress.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiProgress.anon.PartialPickImplkeyofImplActive
import typingsSlinky.semanticUiProgress.anon.PartialPickImplkeyofImplBar
import typingsSlinky.semanticUiProgress.anon.PartialPickImplkeyofImplError
import typingsSlinky.semanticUiProgress.anon.PartialPickImplkeyofImplMax
import typingsSlinky.semanticUiProgress.anon.PartialPickImplkeyofImplMethod
import typingsSlinky.semanticUiProgress.anon.PartialPickImplkeyofImplPercent
import typingsSlinky.semanticUiProgress.anon.PickImplactive
import typingsSlinky.semanticUiProgress.anon.PickImplactiveActive
import typingsSlinky.semanticUiProgress.anon.PickImplautoSuccess
import typingsSlinky.semanticUiProgress.anon.PickImplbar
import typingsSlinky.semanticUiProgress.anon.PickImplclassName
import typingsSlinky.semanticUiProgress.anon.PickImpldebug
import typingsSlinky.semanticUiProgress.anon.PickImplerror
import typingsSlinky.semanticUiProgress.anon.PickImplerrorError
import typingsSlinky.semanticUiProgress.anon.PickImplerrorErrorString
import typingsSlinky.semanticUiProgress.anon.PickImpllabel
import typingsSlinky.semanticUiProgress.anon.PickImpllabelLabel
import typingsSlinky.semanticUiProgress.anon.PickImpllimitValues
import typingsSlinky.semanticUiProgress.anon.PickImplmax
import typingsSlinky.semanticUiProgress.anon.PickImplmetadata
import typingsSlinky.semanticUiProgress.anon.PickImplmethod
import typingsSlinky.semanticUiProgress.anon.PickImplmin
import typingsSlinky.semanticUiProgress.anon.PickImplname
import typingsSlinky.semanticUiProgress.anon.PickImplnamespace
import typingsSlinky.semanticUiProgress.anon.PickImplnonNumeric
import typingsSlinky.semanticUiProgress.anon.PickImplonActive
import typingsSlinky.semanticUiProgress.anon.PickImplonChange
import typingsSlinky.semanticUiProgress.anon.PickImplonError
import typingsSlinky.semanticUiProgress.anon.PickImplonSuccess
import typingsSlinky.semanticUiProgress.anon.PickImplonWarning
import typingsSlinky.semanticUiProgress.anon.PickImplpercent
import typingsSlinky.semanticUiProgress.anon.PickImplpercentPercent
import typingsSlinky.semanticUiProgress.anon.PickImplperformance
import typingsSlinky.semanticUiProgress.anon.PickImplprecision
import typingsSlinky.semanticUiProgress.anon.PickImplprogress
import typingsSlinky.semanticUiProgress.anon.PickImplrandom
import typingsSlinky.semanticUiProgress.anon.PickImplratio
import typingsSlinky.semanticUiProgress.anon.PickImplregExp
import typingsSlinky.semanticUiProgress.anon.PickImplselector
import typingsSlinky.semanticUiProgress.anon.PickImplshowActivity
import typingsSlinky.semanticUiProgress.anon.PickImplsilent
import typingsSlinky.semanticUiProgress.anon.PickImplsuccess
import typingsSlinky.semanticUiProgress.anon.PickImplsuccessSuccess
import typingsSlinky.semanticUiProgress.anon.PickImpltext
import typingsSlinky.semanticUiProgress.anon.PickImpltotal
import typingsSlinky.semanticUiProgress.anon.PickImpltotalTotal
import typingsSlinky.semanticUiProgress.anon.PickImplvalue
import typingsSlinky.semanticUiProgress.anon.PickImplvalueValue
import typingsSlinky.semanticUiProgress.anon.PickImplverbose
import typingsSlinky.semanticUiProgress.anon.PickImplwarning
import typingsSlinky.semanticUiProgress.anon.PickImplwarningWarning
import typingsSlinky.semanticUiProgress.semanticUiProgressBooleans.`false`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get normalized value`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get percent`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get text`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get total`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`get value`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is active`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is complete`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is error`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is success`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`is warning`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`remove active`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`remove error`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`remove success`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`remove warning`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set active`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set bar label`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set duration`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set error`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set label`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set percent`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set progress`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set success`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set total`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`set warning`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.`update progress`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.autoSuccess
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.className
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.complete
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.debug
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.decrement
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.destroy
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.error
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.increment
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.label
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.limitValues
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.metadata
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.name
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.namespace
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onActive
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onChange
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onError
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onSuccess
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.onWarning
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.percent
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.performance
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.precision
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.random
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.ratio
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.regExp
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.reset
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.selector
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.setting
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.showActivity
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.silent
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.text
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.total
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.value
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Progress extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Returns normalized value inside acceptable range specified by total.
      */
    def apply(behavior: `get normalized value`, value: Double): Double = js.native
    /**
      * Returns percent as last specified
      */
    def apply(behavior: `get percent`): Double = js.native
    /**
      * Replaces templated string with value, total, percent left and percent.
      */
    def apply(behavior: `get text`, text: String): String = js.native
    /**
      * Returns total
      */
    def apply(behavior: `get total`): Double = js.native
    /**
      * Returns current progress value
      */
    def apply(behavior: `get value`): Double = js.native
    /**
      * Returns whether progress is in active state
      */
    def apply(behavior: `is active`): Boolean = js.native
    /**
      * Returns whether progress is completed
      */
    def apply(behavior: `is complete`): Boolean = js.native
    /**
      * Returns whether progress is in error state
      */
    def apply(behavior: `is error`): Boolean = js.native
    /**
      * Returns whether progress was a success
      */
    def apply(behavior: `is success`): Boolean = js.native
    /**
      * Returns whether progress is in warning state
      */
    def apply(behavior: `is warning`): Boolean = js.native
    /**
      * Removes progress to active state
      */
    def apply(behavior: `remove active`): JQuery = js.native
    /**
      * Removes progress to error state
      */
    def apply(behavior: `remove error`): JQuery = js.native
    /**
      * Removes progress to success state
      */
    def apply(behavior: `remove success`): JQuery = js.native
    /**
      * Removes progress to warning state
      */
    def apply(behavior: `remove warning`): JQuery = js.native
    /**
      * Sets progress to active state
      */
    def apply(behavior: `set active`): JQuery = js.native
    /**
      * Sets progress bar label to text
      */
    def apply(behavior: `set bar label`, text: String): JQuery = js.native
    /**
      * Changes progress animation speed
      */
    def apply(behavior: `set duration`, value: Double): JQuery = js.native
    /**
      * Sets progress to error state
      */
    def apply(behavior: `set error`): JQuery = js.native
    /**
      * Sets progress exterior label to text
      */
    def apply(behavior: `set label`, text: String): JQuery = js.native
    /**
      * Sets current percent of progress to value. If using a total will convert from percent to estimated value.
      */
    def apply(behavior: `set percent`, percent: Double): JQuery = js.native
    /**
      * Sets progress to specified value. Will automatically calculate percent from total.
      */
    def apply(behavior: `set progress`, value: Double): JQuery = js.native
    /**
      * Sets progress to success state
      */
    def apply(behavior: `set success`): JQuery = js.native
    /**
      * Set total to a new value
      */
    def apply(behavior: `set total`, total: Double): JQuery = js.native
    /**
      * Sets progress to warning state
      */
    def apply(behavior: `set warning`): JQuery = js.native
    /**
      * Immediately updates progress to value, ignoring progress animation interval delays
      */
    def apply(behavior: `update progress`, value: Double): JQuery = js.native
    /**
      * Finishes progress and sets loaded to 100%
      */
    def apply(behavior: complete): JQuery = js.native
    /**
      * Decrements progress by decrement value, if not passed a value will use random amount specified in settings
      */
    def apply(behavior: decrement): JQuery = js.native
    def apply(behavior: decrement, decrementValue: Double): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Increments progress by increment value, if not passed a value will use random amount specified in settings
      */
    def apply(behavior: increment): JQuery = js.native
    def apply(behavior: increment, incrementValue: Double): JQuery = js.native
    /**
      * Resets progress to zero
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, name: autoSuccess, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: autoSuccess, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: label, value: js.UndefOr[scala.Nothing]): percent | ratio = js.native
    def apply(behavior: setting, name: label, value: percent): JQuery = js.native
    def apply(behavior: setting, name: label, value: ratio): JQuery = js.native
    def apply(behavior: setting, name: limitValues, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: limitValues, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onActive, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
    def apply(
      behavior: setting,
      name: onActive,
      value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit] = js.native
    def apply(
      behavior: setting,
      name: onChange,
      value: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onError, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
    def apply(
      behavior: setting,
      name: onError,
      value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onSuccess, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit] = js.native
    def apply(
      behavior: setting,
      name: onSuccess,
      value: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onWarning, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit] = js.native
    def apply(
      behavior: setting,
      name: onWarning,
      value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: precision, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: precision, value: Double): JQuery = js.native
    def apply(behavior: setting, name: random, value: RandomSettings): JQuery = js.native
    def apply(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
    def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
    def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
    def apply(behavior: setting, name: showActivity, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: showActivity, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: text, value: TextSettings): JQuery = js.native
    def apply(behavior: setting, name: total, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
    def apply(behavior: setting, name: total, value: Double): JQuery = js.native
    def apply(behavior: setting, name: total, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: value, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
    def apply(behavior: setting, name: value, value: Double): JQuery = js.native
    def apply(behavior: setting, name: value, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: ProgressSettings): JQuery = js.native
    def apply(settings: ProgressSettings): JQuery = js.native
    
    var settings: ProgressSettings = js.native
  }
  object Progress {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String = js.native
        
        /**
          * @default 'error'
          */
        var error: String = js.native
        
        /**
          * @default 'success'
          */
        var success: String = js.native
        
        /**
          * @default 'warning'
          */
        var warning: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(active: String, error: String, success: String, warning: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplactiveActive | PickImplerrorErrorString | PickImplsuccessSuccess | PickImplwarningWarning) with PartialPickImplkeyofImplError
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
        
        /**
          * @default 'Progress value is non numeric'
          */
        var nonNumeric: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(method: String, nonNumeric: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], nonNumeric = nonNumeric.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNonNumeric(value: String): Self = StObject.set(x, "nonNumeric", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplmethod | PickImplnonNumeric) with PartialPickImplkeyofImplMethod
    }
    type ErrorSettings = typingsSlinky.semanticUiProgress.SemanticUI.Progress.ErrorSettings.Param
    
    object MetadataSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'percent'
          */
        var percent: String = js.native
        
        /**
          * @default 'total'
          */
        var total: String = js.native
        
        /**
          * @default 'value'
          */
        var value: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(percent: String, total: String, value: String): Impl = {
          val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplpercentPercent | PickImpltotalTotal | PickImplvalueValue) with PartialPickImplkeyofImplPercent
    }
    type MetadataSettings = typingsSlinky.semanticUiProgress.SemanticUI.Progress.MetadataSettings.Param
    
    object RandomSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 5
          */
        var max: Double = js.native
        
        /**
          * @default 2
          */
        var min: Double = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(max: Double, min: Double): Impl = {
          val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplmin | PickImplmax) with PartialPickImplkeyofImplMax
    }
    type RandomSettings = typingsSlinky.semanticUiProgress.SemanticUI.Progress.RandomSettings.Param
    
    /* Inlined semantic-ui-progress.SemanticUI.Progress.RegExpSettings.Param */
    @js.native
    trait RegExpSettings extends StObject {
      
      var variable: js.RegExp with js.UndefOr[js.RegExp] = js.native
    }
    object RegExpSettings {
      
      @scala.inline
      def apply(variable: js.RegExp with js.UndefOr[js.RegExp]): RegExpSettings = {
        val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
        __obj.asInstanceOf[RegExpSettings]
      }
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default /\{\$*[A-z0-9]+\}/g
          */
        var variable: js.RegExp = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(variable: js.RegExp): Impl = {
          val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setVariable(value: js.RegExp): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RegExpSettings._Impl, 'variable'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.RegExpSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.RegExpSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        var variable: js.RegExp with js.UndefOr[js.RegExp] = js.native
      }
      object Param {
        
        @scala.inline
        def apply(variable: js.RegExp with js.UndefOr[js.RegExp]): typingsSlinky.semanticUiProgress.SemanticUI.Progress.RegExpSettings.Param = {
          val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsSlinky.semanticUiProgress.SemanticUI.Progress.RegExpSettings.Param]
        }
        
        @scala.inline
        implicit class ParamMutableBuilder[Self <: typingsSlinky.semanticUiProgress.SemanticUI.Progress.RegExpSettings.Param] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setVariable(value: js.RegExp with js.UndefOr[js.RegExp]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
        }
      }
      
      @scala.inline
      implicit class RegExpSettingsMutableBuilder[Self <: RegExpSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVariable(value: js.RegExp with js.UndefOr[js.RegExp]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      }
    }
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '> .bar
          */
        var bar: String = js.native
        
        /**
          * @default '> .label'
          */
        var label: String = js.native
        
        /**
          * @default '.bar > .progress'
          */
        var progress: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(bar: String, label: String, progress: String): Impl = {
          val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplbar | PickImpllabelLabel | PickImplprogress) with PartialPickImplkeyofImplBar
    }
    type SelectorSettings = typingsSlinky.semanticUiProgress.SemanticUI.Progress.SelectorSettings.Param
    
    object TextSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default false
          */
        var active: `false` | String = js.native
        
        /**
          * @default false
          */
        var error: `false` | String = js.native
        
        /**
          * @default '{percent}%'
          */
        var percent: `false` | String = js.native
        
        /**
          * @default '{value} of {total}'
          */
        var ratio: `false` | String = js.native
        
        /**
          * @default false
          */
        var success: `false` | String = js.native
        
        /**
          * @default false
          */
        var warning: `false` | String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          active: `false` | String,
          error: `false` | String,
          percent: `false` | String,
          ratio: `false` | String,
          success: `false` | String,
          warning: `false` | String
        ): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActive(value: `false` | String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setError(value: `false` | String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPercent(value: `false` | String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRatio(value: `false` | String): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSuccess(value: `false` | String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWarning(value: `false` | String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplactive | PickImplerrorError | PickImplsuccess | PickImplwarning | PickImplpercent | PickImplratio) with PartialPickImplkeyofImplActive
    }
    type TextSettings = typingsSlinky.semanticUiProgress.SemanticUI.Progress.TextSettings.Param
  }
  
  object ProgressSettings {
    
    @js.native
    trait Impl extends StObject {
      
      // region Progress Settings
      /**
        * Whether success state should automatically trigger when progress completes
        *
        * @default true
        */
      var autoSuccess: Boolean = js.native
      
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Can be set to either to display progress as percent or ratio. Matches up to corresponding text template with the same name.
        *
        * @default 'percent'
        */
      var label: percent | ratio = js.native
      
      /**
        * When set to true, values that calculate to above 100% or below 0% will be adjusted.
        * When set to false, inappropriate values will produce an error.
        *
        * @default true
        */
      var limitValues: Boolean = js.native
      
      /**
        * DOM metadata used by module
        */
      var metadata: MetadataSettings = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String = js.native
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String = js.native
      
      /**
        * Callback on active state
        */
      def onActive(value: Double, total: Double): Unit = js.native
      
      // endregion
      // region Callbacks
      /**
        * Callback on percentage change
        */
      def onChange(percent: Double, value: Double, total: Double): Unit = js.native
      
      /**
        * Callback on error state
        */
      def onError(value: Double, total: Double): Unit = js.native
      
      /**
        * Callback on success state
        */
      def onSuccess(total: Double): Unit = js.native
      
      /**
        * Callback on warning state
        */
      def onWarning(value: Double, total: Double): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      /**
        * Decimal point precision for calculated progress
        *
        * @default 1
        */
      var precision: Double = js.native
      
      /**
        * When incrementing without value, sets range for random increment value
        */
      var random: RandomSettings = js.native
      
      /**
        * Regular expressions used by module
        */
      var regExp: RegExpSettings = js.native
      
      /**
        * Selectors used by module
        */
      var selector: SelectorSettings = js.native
      
      /**
        * Whether progress should automatically show activity when incremented
        *
        * @default true
        */
      var showActivity: Boolean = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Text content for each state, uses simple templating with {percent}, {value}, {total}
        */
      var text: TextSettings = js.native
      
      /**
        * Setting a total value will make each call to increment get closer to this total (i.e. 1/20, 2/20 etc)
        *
        * @default false
        */
      var total: `false` | Double = js.native
      
      /**
        * Sets current value, when total is specified, this is used to calculate a ratio of the total, with percent this should be the overall percent
        *
        * @default false
        */
      var value: `false` | Double = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        autoSuccess: Boolean,
        className: ClassNameSettings,
        debug: Boolean,
        error: ErrorSettings,
        label: percent | ratio,
        limitValues: Boolean,
        metadata: MetadataSettings,
        name: String,
        namespace: String,
        onActive: (Double, Double) => Unit,
        onChange: (Double, Double, Double) => Unit,
        onError: (Double, Double) => Unit,
        onSuccess: Double => Unit,
        onWarning: (Double, Double) => Unit,
        performance: Boolean,
        precision: Double,
        random: RandomSettings,
        regExp: RegExpSettings,
        selector: SelectorSettings,
        showActivity: Boolean,
        silent: Boolean,
        text: TextSettings,
        total: `false` | Double,
        value: `false` | Double,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(autoSuccess = autoSuccess.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], limitValues = limitValues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onActive = js.Any.fromFunction2(onActive), onChange = js.Any.fromFunction3(onChange), onError = js.Any.fromFunction2(onError), onSuccess = js.Any.fromFunction1(onSuccess), onWarning = js.Any.fromFunction2(onWarning), performance = performance.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showActivity = showActivity.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoSuccess(value: Boolean): Self = StObject.set(x, "autoSuccess", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(value: percent | ratio): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitValues(value: Boolean): Self = StObject.set(x, "limitValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnActive(value: (Double, Double) => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnChange(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnError(value: (Double, Double) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnSuccess(value: Double => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnWarning(value: (Double, Double) => Unit): Self = StObject.set(x, "onWarning", js.Any.fromFunction2(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRandom(value: RandomSettings): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowActivity(value: Boolean): Self = StObject.set(x, "showActivity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: TextSettings): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotal(value: `false` | Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: `false` | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplautoSuccess | PickImplshowActivity | PickImpllimitValues | PickImpllabel | PickImplrandom | PickImplprecision | PickImpltotal | PickImplvalue | PickImplonChange | PickImplonSuccess | PickImplonActive | PickImplonError | PickImplonWarning | PickImpltext | PickImplregExp | PickImplselector | PickImplmetadata | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/progress.html#/settings}
    */
  type ProgressSettings = typingsSlinky.semanticUiProgress.SemanticUI.ProgressSettings.Param
}
