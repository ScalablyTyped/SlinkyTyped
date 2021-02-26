package typingsSlinky.valerieBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// additional types for Valerie (all inside this namespace)
object Valerie {
  
  // Contains converters, always singletons.
  @js.native
  trait ConvertersStatic extends StObject {
    
    //TODO: other converters to be added
    var passThrough: IConverter = js.native
  }
  object ConvertersStatic {
    
    @scala.inline
    def apply(passThrough: IConverter): ConvertersStatic = {
      val __obj = js.Dynamic.literal(passThrough = passThrough.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertersStatic]
    }
    
    @scala.inline
    implicit class ConvertersStaticMutableBuilder[Self <: ConvertersStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassThrough(value: IConverter): Self = StObject.set(x, "passThrough", value.asInstanceOf[js.Any])
    }
  }
  
  // The interface for a converter, a pair of functions: format and parse, which work in tandem on a single type of value.
  @js.native
  trait IConverter extends StObject {
    
    def format(value: js.Any): String = js.native
    def format(value: js.Any, format: String): String = js.native
    
    // Formats the given value as a string.
    def parse(value: String): js.Any = js.native
  }
  
  @js.native
  trait IRule extends StObject {
    
    var defaultOptions: ValidationOptions = js.native
    
    def test(value: js.Any): ValidationResult = js.native
  }
  object IRule {
    
    @scala.inline
    def apply(defaultOptions: ValidationOptions, test: js.Any => ValidationResult): IRule = {
      val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[IRule]
    }
    
    @scala.inline
    implicit class IRuleMutableBuilder[Self <: IRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultOptions(value: ValidationOptions): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest(value: js.Any => ValidationResult): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  // The interface for a validation state.
  @js.native
  trait IValidationState extends StObject {
    
    def failed(): Boolean = js.native
    
    def getName(): String = js.native
    
    def isApplicable(): Boolean = js.native
    
    def message(): String = js.native
    
    def passed(): Boolean = js.native
    
    def pending(): Boolean = js.native
    
    def result(): ValidationResult = js.native
    
    def touched(): Boolean = js.native
    def touched(value: Boolean): Boolean = js.native
  }
  
  // callback interface (see mapModel above)
  type IncludePropertyCallback = js.Function3[/* value */ js.Any, /* sourceModel */ js.Any, /* index */ js.Any, Boolean]
  
  // Constructs the validation state for a model, which may comprise of simple properties and sub-models.
  @js.native
  trait ModelValidationState extends StObject {
    
    // methods
    /**
      * Adds validation states to this validation state.<br/>
      * <i>[fluent]</i>
      * @name valerie.ModelValidationState#addValidationStates
      * @fluent
      * @param {object|array.<valerie.IValidationState>} validationStateOrStates the validation states to add
      * @return {valerie.ModelValidationState}
      */
    def addValidationStates(validationStateOrStates: js.Any): ModelValidationState = js.native
    
    /**
      * Sets the value or function used to determine if the model is applicable.<br/>
      * <i>[fluent]</i>
      * @name valerie.ModelValidationState#applicable
      * @fluent
      * @param {boolean|function} [valueOrFunction = true] the value or function to use
      * @return {valerie.ModelValidationState}
      */
    def applicable(valueOrFunction: js.Any): ModelValidationState = js.native
    
    /**
      * Clears the static summary of validation states that are in a failure state.<br/>
      * <i>[fluent]</i>
      * @name valerie.ModelValidationState#clearSummary
      * @fluent
      * @param {boolean} [clearSubModelSummaries = false] whether to clear the static summaries for sub-models
      * @return {valerie.ModelValidationState}
      */
    def clearSummary(valueOrFunction: js.Any): ModelValidationState = js.native
    
    /**
      * Ends a chain of fluent method calls on this model validation state.
      * @return {function} the model the validation state is for
      */
    def end(): js.Any = js.native
    
    /***
      * Gets whether the model has failed validation.
      * @return {boolean}
      */
    def failed(): Boolean = js.native
    
    /***
      * Gets the validation states that belong to the model that are in a failure state.
      * @return {Valerie.IValidationState[]}
      */
    def failedStates(): js.Array[IValidationState] = js.native
    
    /***
      * Gets the name of the model.
      * @return {string}
      */
    def getName(): String = js.native
    
    /**
      * Includes any validation failures for this model in a validation summary.<br/>
      * <i>[fluent]</i>
      * @fluent
      * @return {valerie.ModelValidationState}
      */
    def includeInSummary(): ModelValidationState = js.native
    
    def isApplicable(): Boolean = js.native
    
    def message(): String = js.native
    
    var model: js.Any = js.native
    
    /**
      * Sets the value or function used to determine the name of the model.<br/>
      * <i>[fluent]</i>
      * @fluent
      * @param {string|function} valueOrFunction the value or function to use
      * @return {valerie.ModelValidationState}
      */
    def name(valueOrFunction: js.Any): ModelValidationState = js.native
    
    // ctor
    def `new`(model: js.Any): ModelValidationState = js.native
    def `new`(model: js.Any, options: ModelValidationStateOptions): ModelValidationState = js.native
    
    var options: js.UndefOr[ModelValidationStateOptions] = js.native
    
    def passed(): Boolean = js.native
    
    /***
      * Gets or sets whether the computation that updates the validation result has been paused.
      * @param {boolean} [value = false] true if the computation should be paused, false if the computation should not be paused
      * @return {boolean} true if computation is paused, false otherwise
      */
    def paused(value: Boolean): Boolean = js.native
    
    def pending(): Boolean = js.native
    
    def pendingStates(): js.Array[IValidationState] = js.native
    
    def refresh(): Unit = js.native
    
    /**
      * Removes validation states.<br/>
      * <i>[fluent]</i>
      * @fluent
      * @param {object|array.<valerie.IValidationState>} validationStateOrStates the validation states to remove
      * @return {valerie.ModelValidationState}
      */
    def removeValidationStates(validationStateOrStates: js.Any): ModelValidationState = js.native
    
    def result(): ValidationResult = js.native
    
    /**
      * Stops validating the given sub-model by adding the validation state that belongs to it.
      * @param {*} validatableSubModel the sub - model to start validating
      * @return {valerie.ModelValidationState }
      */
    def startValidatingSubModel(validatableSubModel: js.Any): ModelValidationState = js.native
    
    /**
      * Stops validating the given sub-model by removing the validation state that belongs to it.
      * @param {*} validatableSubModel the sub-model to stop validating
      * @return {valerie.ModelValidationState}
      */
    def stopValidatingSubModel(validatableSubModel: js.Any): ModelValidationState = js.native
    
    def summary(): js.Array[summaryItem] = js.native
    
    /***
      * Gets or sets whether the model has been 'touched' by user action
      */
    def touched(value: Boolean): Boolean = js.native
    
    /**
      * Updates the static summary of validation states that are in a failure state.<br/>
      * <i>[fluent]</i>
      * @fluent
      * @param {boolean} [updateSubModelSummaries = false] whether to update the static summaries for sub-models
      * @return {valerie.ModelValidationState}
      */
    def updateSummary(updateSubModelSummaries: Boolean): ModelValidationState = js.native
    
    /**
      * Adds the validation states for all the descendant properties and sub-models that belong to the model.<br/>
      * <i>[fluent]</i>
      * @fluent
      * @return {valerie.ModelValidationState}
      */
    def validateAll(): ModelValidationState = js.native
    
    /**
      * Adds the validation states for all the descendant properties that belong to the model.<br/>
      * <i>[fluent]</i>
      * @fluent
      * @return {valerie.ModelValidationState}
      */
    def validateAllProperties(): ModelValidationState = js.native
    
    /**
      * Adds the validation states for all the child properties that belong to the model.<br/>
      * <i>[fluent]</i>
      * @fluent
      * @return {valerie.ModelValidationState}
      */
    def validateChildProperties(): ModelValidationState = js.native
    
    /**
      * Adds the validation states for all the child properties and sub-models that belong to the model.<br/>
      * <i>[fluent]</i>
      * @fluent
      * @return {valerie.ModelValidationState}
      */
    def validateChildPropertiesAndSubModels(): ModelValidationState = js.native
    
    def validationStates(): js.Array[IValidationState] = js.native
  }
  
  // Construction options for a model validation state.
  @js.native
  trait ModelValidationStateOptions extends StObject {
    
    def applicable(): Boolean = js.native
    
    var excludeFromSummary: Boolean = js.native
    
    var failureMessage: String = js.native
    
    def name(): String = js.native
    
    def paused(): Boolean = js.native
  }
  object ModelValidationStateOptions {
    
    @scala.inline
    def apply(
      applicable: () => Boolean,
      excludeFromSummary: Boolean,
      failureMessage: String,
      name: () => String,
      paused: () => Boolean
    ): ModelValidationStateOptions = {
      val __obj = js.Dynamic.literal(applicable = js.Any.fromFunction0(applicable), excludeFromSummary = excludeFromSummary.asInstanceOf[js.Any], failureMessage = failureMessage.asInstanceOf[js.Any], name = js.Any.fromFunction0(name), paused = js.Any.fromFunction0(paused))
      __obj.asInstanceOf[ModelValidationStateOptions]
    }
    
    @scala.inline
    implicit class ModelValidationStateOptionsMutableBuilder[Self <: ModelValidationStateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicable(value: () => Boolean): Self = StObject.set(x, "applicable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExcludeFromSummary(value: Boolean): Self = StObject.set(x, "excludeFromSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPaused(value: () => Boolean): Self = StObject.set(x, "paused", js.Any.fromFunction0(value))
    }
  }
  
  // A helper for parsing and formatting numeric values.
  @js.native
  trait NumericHelper extends StObject {
    
    // Adds thousands separators to the given numeric string.
    def addThousandsSeparator(numericString: String): String = js.native
    
    // Formats the given numeric value as a string.
    def format(value: Double, format: String): String = js.native
    
    // Initialises the helper
    def init(
      decimalSeparator: String,
      thousandsSeparator: String,
      currencySign: String,
      currencyMinorUnitPlaces: Double
    ): NumericHelper = js.native
    
    // Informs whether the given numeric string represents a currency value with major units only.
    def isCurrencyMajor(numericString: String): Boolean = js.native
    
    // Informs whether the given numeric string represents a currency value with major units and optionally minor units.
    def isCurrencyMajorMinor(numericString: String): Boolean = js.native
    
    // Informs whether the given numeric string represents a non-integer numeric value.
    def isFloat(numericString: String): Boolean = js.native
    
    // Informs whether the given numeric string represents an integer value.
    def isInteger(numericString: String): Boolean = js.native
    
    // Attempts to parse the given numeric string as a number value. The string is unformatted first.
    def parse(numericString: String): Double = js.native
    
    // Unformats a numeric string; removes currency signs, thousands separators and normalises decimal separators.
    def unformat(numericString: String): String = js.native
  }
  object NumericHelper {
    
    @scala.inline
    def apply(
      addThousandsSeparator: String => String,
      format: (Double, String) => String,
      init: (String, String, String, Double) => NumericHelper,
      isCurrencyMajor: String => Boolean,
      isCurrencyMajorMinor: String => Boolean,
      isFloat: String => Boolean,
      isInteger: String => Boolean,
      parse: String => Double,
      unformat: String => String
    ): NumericHelper = {
      val __obj = js.Dynamic.literal(addThousandsSeparator = js.Any.fromFunction1(addThousandsSeparator), format = js.Any.fromFunction2(format), init = js.Any.fromFunction4(init), isCurrencyMajor = js.Any.fromFunction1(isCurrencyMajor), isCurrencyMajorMinor = js.Any.fromFunction1(isCurrencyMajorMinor), isFloat = js.Any.fromFunction1(isFloat), isInteger = js.Any.fromFunction1(isInteger), parse = js.Any.fromFunction1(parse), unformat = js.Any.fromFunction1(unformat))
      __obj.asInstanceOf[NumericHelper]
    }
    
    @scala.inline
    implicit class NumericHelperMutableBuilder[Self <: NumericHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddThousandsSeparator(value: String => String): Self = StObject.set(x, "addThousandsSeparator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormat(value: (Double, String) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInit(value: (String, String, String, Double) => NumericHelper): Self = StObject.set(x, "init", js.Any.fromFunction4(value))
      
      @scala.inline
      def setIsCurrencyMajor(value: String => Boolean): Self = StObject.set(x, "isCurrencyMajor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsCurrencyMajorMinor(value: String => Boolean): Self = StObject.set(x, "isCurrencyMajorMinor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFloat(value: String => Boolean): Self = StObject.set(x, "isFloat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsInteger(value: String => Boolean): Self = StObject.set(x, "isInteger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParse(value: String => Double): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnformat(value: String => String): Self = StObject.set(x, "unformat", js.Any.fromFunction1(value))
    }
  }
  
  //
  // PropertyValidationState
  //
  @js.native
  trait PropertyValidationState[T] extends StObject {
    
    // fluent methods (can be chanined):
    /**
      * Adds a rule to the chain of rules used to validate the property's value.<br/>
      * <i>[fluent]</i>
      * @fluent
      * @param {valerie.IRule} rule the rule to add
      * @return {valerie.PropertyValidationState}
      */
    def addRule(rule: IRule): PropertyValidationState[T] = js.native
    
    def applicable(fn: js.Function0[Boolean]): PropertyValidationState[T] = js.native
    def applicable(value: Boolean): PropertyValidationState[T] = js.native
    
    def currencyMajor(): PropertyValidationState[T] = js.native
    def currencyMajor(options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def currencyMajorMinor(): PropertyValidationState[T] = js.native
    def currencyMajorMinor(options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def date(): PropertyValidationState[T] = js.native
    
    def during(earliest: js.Date, latest: js.Date): PropertyValidationState[T] = js.native
    def during(earliest: js.Date, latest: js.Date, options: ValidationOptions): PropertyValidationState[T] = js.native
    // dateFN + date
    def during(earliest: js.Date, latest: js.Function0[js.Date]): PropertyValidationState[T] = js.native
    def during(earliest: js.Date, latest: js.Function0[js.Date], options: ValidationOptions): PropertyValidationState[T] = js.native
    // date + date
    def during(earliest: js.Function0[js.Date], latest: js.Date): PropertyValidationState[T] = js.native
    def during(earliest: js.Function0[js.Date], latest: js.Date, options: ValidationOptions): PropertyValidationState[T] = js.native
    // date + dateFN
    def during(earliest: js.Function0[js.Date], latest: js.Function0[js.Date]): PropertyValidationState[T] = js.native
    def during(earliest: js.Function0[js.Date], latest: js.Function0[js.Date], options: ValidationOptions): PropertyValidationState[T] = js.native
    
    // dateFN + dateFN
    def earliest(earliest: js.Date): PropertyValidationState[T] = js.native
    def earliest(earliest: js.Date, options: ValidationOptions): PropertyValidationState[T] = js.native
    // date value
    def earliest(earliest: js.Function0[js.Date]): PropertyValidationState[T] = js.native
    def earliest(earliest: js.Function0[js.Date], options: ValidationOptions): PropertyValidationState[T] = js.native
    
    // date function
    def email(): PropertyValidationState[T] = js.native
    
    // return original observable
    def end(): T = js.native
    
    def entryFormat(format: String): PropertyValidationState[T] = js.native
    
    def excludeFromSummary(): PropertyValidationState[T] = js.native
    
    // regex
    def expression(regularExpressionString: String): PropertyValidationState[T] = js.native
    def expression(regularExpressionString: String, options: ValidationOptions): PropertyValidationState[T] = js.native
    def expression(regularExpression: js.RegExp): PropertyValidationState[T] = js.native
    def expression(regularExpression: js.RegExp, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    // other methods: not returning PropertyValidationState<T>
    def failed(): Boolean = js.native
    
    // regex string
    def float(): PropertyValidationState[T] = js.native
    def float(options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def getName(): String = js.native
    
    def integer(): PropertyValidationState[T] = js.native
    def integer(options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def isApplicable(): Boolean = js.native
    
    def isRequired(): Boolean = js.native
    
    def latest(latestValueOrFunction: js.Date): PropertyValidationState[T] = js.native
    def latest(latestValueOrFunction: js.Date, options: ValidationOptions): PropertyValidationState[T] = js.native
    def latest(latestValueOrFunction: js.Function0[js.Date]): PropertyValidationState[T] = js.native
    def latest(latestValueOrFunction: js.Function0[js.Date], options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def lengthBetween(shortest: js.Function0[Double], longest: js.Function0[Double]): PropertyValidationState[T] = js.native
    def lengthBetween(shortest: js.Function0[Double], longest: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
    def lengthBetween(shortest: js.Function0[Double], longest: Double): PropertyValidationState[T] = js.native
    def lengthBetween(shortest: js.Function0[Double], longest: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
    def lengthBetween(shortest: Double, longest: js.Function0[Double]): PropertyValidationState[T] = js.native
    def lengthBetween(shortest: Double, longest: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
    def lengthBetween(shortest: Double, longest: Double): PropertyValidationState[T] = js.native
    def lengthBetween(shortest: Double, longest: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def matches(permitted: js.Any): PropertyValidationState[T] = js.native
    def matches(permitted: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
    def matches(permitted: js.Function0[_]): PropertyValidationState[T] = js.native
    def matches(permitted: js.Function0[_], options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def maximum(maximum: js.Any): PropertyValidationState[T] = js.native
    def maximum(maximum: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
    def maximum(maximum: js.Function0[_]): PropertyValidationState[T] = js.native
    def maximum(maximum: js.Function0[_], options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def maximumLength(longest: js.Function0[Double]): PropertyValidationState[T] = js.native
    def maximumLength(longest: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
    def maximumLength(longest: Double): PropertyValidationState[T] = js.native
    def maximumLength(longest: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def maximumNumberOfItems(maximum: js.Function0[Double]): PropertyValidationState[T] = js.native
    def maximumNumberOfItems(maximum: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
    def maximumNumberOfItems(maximum: Double): PropertyValidationState[T] = js.native
    def maximumNumberOfItems(maximum: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def message(): String = js.native
    
    def minimum(minimumValueOrFunction: js.Any): PropertyValidationState[T] = js.native
    def minimum(minimumValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def minimumLength(shortest: js.Function0[Double]): PropertyValidationState[T] = js.native
    def minimumLength(shortest: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
    def minimumLength(shortest: Double): PropertyValidationState[T] = js.native
    def minimumLength(shortest: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def minimumNumberOfItems(minimum: js.Function0[Double]): PropertyValidationState[T] = js.native
    def minimumNumberOfItems(minimum: js.Function0[Double], options: ValidationOptions): PropertyValidationState[T] = js.native
    def minimumNumberOfItems(minimum: Double): PropertyValidationState[T] = js.native
    def minimumNumberOfItems(minimum: Double, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def name(value: String): PropertyValidationState[T] = js.native
    def name(value: js.Function0[String]): PropertyValidationState[T] = js.native
    
    def noneOf(forbiddenValues: js.Array[_]): PropertyValidationState[T] = js.native
    def noneOf(forbiddenValues: js.Array[_], options: ValidationOptions): PropertyValidationState[T] = js.native
    def noneOf(forbiddenValues: js.Function0[js.Array[_]]): PropertyValidationState[T] = js.native
    def noneOf(forbiddenValues: js.Function0[js.Array[_]], options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def not(forbiddenValueOrFunction: js.Any): PropertyValidationState[T] = js.native
    def not(forbiddenValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def number(): PropertyValidationState[T] = js.native
    
    def numberOfItems(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any): PropertyValidationState[T] = js.native
    def numberOfItems(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    // properties:
    // the observable or computed the validation state is for
    var observableOrComputed: T = js.native
    
    def oneOf(permittedValues: js.Array[_]): PropertyValidationState[T] = js.native
    def oneOf(permittedValues: js.Array[_], options: ValidationOptions): PropertyValidationState[T] = js.native
    def oneOf(permittedValues: js.Function0[js.Array[_]]): PropertyValidationState[T] = js.native
    def oneOf(permittedValues: js.Function0[js.Array[_]], options: ValidationOptions): PropertyValidationState[T] = js.native
    
    // the options to use when creating the validation state
    var options: ValidationOptions = js.native
    
    def passed(): Boolean = js.native
    
    def pending(): Boolean = js.native
    
    def postcode(): PropertyValidationState[T] = js.native
    
    def range(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any): PropertyValidationState[T] = js.native
    def range(minimumValueOrFunction: js.Any, maximumValueOrFunction: js.Any, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    def required(): PropertyValidationState[T] = js.native
    def required(valueOrFunction: js.Any): PropertyValidationState[T] = js.native
    
    // set touched state
    def result(): ValidationResult = js.native
    
    def rule(testFunction: js.Function0[_]): PropertyValidationState[T] = js.native
    
    def ruleMessage(failureMessageFormat: String): PropertyValidationState[T] = js.native
    
    def showMessage(): Boolean = js.native
    
    def string(): PropertyValidationState[T] = js.native
    
    def touched(): Boolean = js.native
    // get touched state
    def touched(value: Boolean): Boolean = js.native
    
    def validateChildProperties(): PropertyValidationState[T] = js.native
    
    def valueFormat(format: String): PropertyValidationState[T] = js.native
  }
  
  //
  // Static methods on valerie namespace
  //
  @js.native
  trait Static extends StObject {
    
    // Validation result class
    var ValidationResult: ValidationResultStatic = js.native
    
    // additional namespaces for static methods:
    var converters: ConvertersStatic = js.native
    
    /**
      * Maps a source model to a destination model, including only applicable properties
      * @param {Object|Array} sourceModel the source model
      * @return {*} the destination model
      */
    def mapApplicableModel(sourceModel: js.Any): js.Any = js.native
    
    /**
      * Maps a source model to a destination model.
      * @param {Object|Array} sourceModel the source model
      * @param {valerie.includePropertyCallback} [includeWrappedFunction] a function called before each source model
      * property is unwrapped, the result of which determines if the property is included in the destination model
      * @param {valerie.includePropertyCallback} [includeUnwrappedFunction] a function called after each source
      * model property is unwrapped, the result of which determines if the property is included in the destination model
      * @return {*} the destination model
      */
    def mapModel(sourceModel: js.Any): js.Any = js.native
    def mapModel(
      sourceModel: js.Any,
      includeWrappedFunction: js.UndefOr[scala.Nothing],
      includeUnwrappedFunction: IncludePropertyCallback
    ): js.Any = js.native
    def mapModel(sourceModel: js.Any, includeWrappedFunction: IncludePropertyCallback): js.Any = js.native
    def mapModel(
      sourceModel: js.Any,
      includeWrappedFunction: IncludePropertyCallback,
      includeUnwrappedFunction: IncludePropertyCallback
    ): js.Any = js.native
    
    /*
      //TODO: additional namespaces/statics not yet used
      dom: DomStatic;
      formatting: FormattingStatic;
      koBindingsHelper: KoBindingsHelperStatic;
      koExtras: KoExtrasStatic;
      rules: RulesStatic;
      */
    var utils: UtilsStatic = js.native
    
    /**
      * Makes the passed-in model validatable. After invocation the model will have a validation state.
      * <br/><b>fluent</b>
      * @param {object|function} model the model to make validatable
      * @param {valerie.ModelValidationState.options} [options] the options to use when creating the model's validation
      * state
      * @return {valerie.ModelValidationState} the validation state belonging to the model
      */
    def validatableModel(model: js.Any): ModelValidationState = js.native
    def validatableModel(model: js.Any, options: ValidationOptions): ModelValidationState = js.native
    
    // Makes the passed-in property validatable. After invocation the property will have a validation state.
    // (value should be observable or computed)
    def validatableProperty[T](value: T): PropertyValidationState[T] = js.native
    def validatableProperty[T](value: T, options: ValidationOptions): PropertyValidationState[T] = js.native
    
    var validationState: ValidationState = js.native
  }
  
  @js.native
  trait UtilsStatic extends StObject {
    
    // Creates a function that returns the given value as an array of one item, or simply returns the given value if it is already an array.
    def asArray[T](value: js.Any): js.Array[_] = js.native
    
    def asFunction[T](fn: js.Function0[T]): js.Function0[T] = js.native
    // Creates a function that returns the given value, or simply returns the given value if it is already a function
    def asFunction[T](value: T): js.Function0[T] = js.native
    
    // Tests whether the given value is an array
    def isArray(value: js.Any): Boolean = js.native
    
    // Tests whether the given value is an array or object.
    def isArrayOrObject(value: js.Any): Boolean = js.native
    
    // Tests whether the given value is a function.
    def isFunction(value: js.Any): Boolean = js.native
    
    // Tests whether the given value is "missing".undefined, null, an empty string or an empty array are considered to be "missing".
    def isMissing(value: js.Any): Boolean = js.native
    
    // Tests whether the given value is an object.
    def isObject(value: js.Any): Boolean = js.native
    
    // Tests whether the give value is a string.
    def isString(value: js.Any): Boolean = js.native
    
    //Merges the given default options with the given options.
    //  - either parameter can be omitted and a clone of the other parameter will be returned
    //  - the merge is shallow
    //  - array properties are shallow cloned
    def mergeOptions(defaultOptions: ValidationOptions, options: js.Any): ValidationOptions = js.native
  }
  
  @js.native
  trait ValidatableModel[T] extends StObject {
    
    // return original observableArray
    def end(): T = js.native
    
    def name(value: String): PropertyValidationState[T] = js.native
  }
  object ValidatableModel {
    
    @scala.inline
    def apply[T](end: () => T, name: String => PropertyValidationState[T]): ValidatableModel[T] = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), name = js.Any.fromFunction1(name))
      __obj.asInstanceOf[ValidatableModel[T]]
    }
    
    @scala.inline
    implicit class ValidatableModelMutableBuilder[Self <: ValidatableModel[_], T] (val x: Self with ValidatableModel[T]) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => T): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String => PropertyValidationState[T]): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ValidationOptions extends StObject {
    
    var applicable: js.UndefOr[js.Function0[_]] = js.native
    
    // the function used to determine if the property is applicable
    var converter: js.UndefOr[IConverter] = js.native
    
    // the converter used to parse user entries and format display of the property's value
    var entryFormat: js.UndefOr[String] = js.native
    
    // the string used to format the property's value for display in a user entry
    var excludeFromSummary: js.UndefOr[Boolean] = js.native
    
    // whether any validation failures for this property are excluded from a summary
    var invalidFailureMessage: js.UndefOr[String] = js.native
    
    // the message shown when the user has entered an invalid value
    var missingFailureMessage: js.UndefOr[String] = js.native
    
    // the message shown when a value is required but is missing
    var name: js.UndefOr[js.Function0[_]] = js.native
    
    // the function used to determine the name of the property; used in failure messages
    var required: js.UndefOr[js.Function0[_]] = js.native
    
    // the function used to determine if a value is required
    var rules: js.UndefOr[js.Any] = js.native
    
    //Valerie.array.<IRule>;  // the chain of rules used to validate the property's value
    var valueFormat: js.UndefOr[String] = js.native
  }
  object ValidationOptions {
    
    @scala.inline
    def apply(): ValidationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptions]
    }
    
    @scala.inline
    implicit class ValidationOptionsMutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicable(value: () => _): Self = StObject.set(x, "applicable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setApplicableUndefined: Self = StObject.set(x, "applicable", js.undefined)
      
      @scala.inline
      def setConverter(value: IConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      @scala.inline
      def setEntryFormat(value: String): Self = StObject.set(x, "entryFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryFormatUndefined: Self = StObject.set(x, "entryFormat", js.undefined)
      
      @scala.inline
      def setExcludeFromSummary(value: Boolean): Self = StObject.set(x, "excludeFromSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFromSummaryUndefined: Self = StObject.set(x, "excludeFromSummary", js.undefined)
      
      @scala.inline
      def setInvalidFailureMessage(value: String): Self = StObject.set(x, "invalidFailureMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidFailureMessageUndefined: Self = StObject.set(x, "invalidFailureMessage", js.undefined)
      
      @scala.inline
      def setMissingFailureMessage(value: String): Self = StObject.set(x, "missingFailureMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingFailureMessageUndefined: Self = StObject.set(x, "missingFailureMessage", js.undefined)
      
      @scala.inline
      def setName(value: () => _): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequired(value: () => _): Self = StObject.set(x, "required", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRules(value: js.Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setValueFormat(value: String): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    }
  }
  
  @js.native
  trait ValidationResult extends StObject {
    
    // the result state
    var failed: Boolean = js.native
    
    //true if the activity hasn't yet completed
    var message: String = js.native
    
    //a message from the activity
    def `new`(state: js.Any): ValidationResult = js.native
    def `new`(state: js.Any, message: String): ValidationResult = js.native
    
    //true if the activity failed validation
    var passed: Boolean = js.native
    
    //true if the activity passed validation
    var pending: Boolean = js.native
    
    var state: js.Any = js.native
  }
  
  @js.native
  trait ValidationResultStatic extends StObject {
    
    // static method to create validatio failed message
    def createFailedResult(message: String): ValidationResult = js.native
    
    var passedInstance: ValidationResult = js.native
  }
  object ValidationResultStatic {
    
    @scala.inline
    def apply(createFailedResult: String => ValidationResult, passedInstance: ValidationResult): ValidationResultStatic = {
      val __obj = js.Dynamic.literal(createFailedResult = js.Any.fromFunction1(createFailedResult), passedInstance = passedInstance.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResultStatic]
    }
    
    @scala.inline
    implicit class ValidationResultStaticMutableBuilder[Self <: ValidationResultStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateFailedResult(value: String => ValidationResult): Self = StObject.set(x, "createFailedResult", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPassedInstance(value: ValidationResult): Self = StObject.set(x, "passedInstance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidationState extends StObject {
    
    // Finds and returns the validation states
    def findIn(model: js.Any): js.Array[IValidationState] = js.native
    def findIn(
      model: js.Any,
      includeSubModels: js.UndefOr[scala.Nothing],
      recurse: js.UndefOr[scala.Nothing],
      validationStates: js.Array[IValidationState]
    ): js.Array[IValidationState] = js.native
    def findIn(model: js.Any, includeSubModels: js.UndefOr[scala.Nothing], recurse: Boolean): js.Array[IValidationState] = js.native
    def findIn(
      model: js.Any,
      includeSubModels: js.UndefOr[scala.Nothing],
      recurse: Boolean,
      validationStates: js.Array[IValidationState]
    ): js.Array[IValidationState] = js.native
    def findIn(model: js.Any, includeSubModels: Boolean): js.Array[IValidationState] = js.native
    def findIn(
      model: js.Any,
      includeSubModels: Boolean,
      recurse: js.UndefOr[scala.Nothing],
      validationStates: js.Array[IValidationState]
    ): js.Array[IValidationState] = js.native
    def findIn(model: js.Any, includeSubModels: Boolean, recurse: Boolean): js.Array[IValidationState] = js.native
    def findIn(
      model: js.Any,
      includeSubModels: Boolean,
      recurse: Boolean,
      validationStates: js.Array[IValidationState]
    ): js.Array[IValidationState] = js.native
    
    // Gets the validation state for the given model, observable or computed.
    def getFor(modelOrObservableOrComputed: js.Any): IValidationState = js.native
    
    // nforms if the given model, observable or computed has a validation state.
    def has(modelOrObservableOrComputed: js.Any): Boolean = js.native
    
    // Sets the validation state for the given model, observable or computed.
    def setFor(modelOrObservableOrComputed: js.Any, state: IValidationState): Unit = js.native
  }
  
  @js.native
  trait summaryItem extends StObject {
    
    var message: String = js.native
    
    var name: String = js.native
  }
  object summaryItem {
    
    @scala.inline
    def apply(message: String, name: String): summaryItem = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[summaryItem]
    }
    
    @scala.inline
    implicit class summaryItemMutableBuilder[Self <: summaryItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
