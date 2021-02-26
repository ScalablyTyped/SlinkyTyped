package typingsSlinky.valdr

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.valdr.anon.Invalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valdr {
  
  @js.native
  trait Valdr extends StObject {
    
    /**
      * Adds a new list of constraints (JSON Object).
      * @param newConstraints the list of constraints (JSON Object).
      */
    def addConstraints(newConstraints: ValdrConstraints): Unit = js.native
    
    /**
      * Gets the list of constraints (JSON Object).
      * @returns the list of constraints.
      */
    def getConstraints(): ValdrConstraints = js.native
    
    /**
      * Removes one or many contraints.
      * @param constraintNames the name or array of constraint names.
      */
    def removeConstraints(constraintNames: String): Unit = js.native
    def removeConstraints(constraintNames: js.Array[String]): Unit = js.native
    
    /**
      * Sets custom classes on the surrounding elements.
      * @param newClasses the new classes.
      */
    def setClasses(newClasses: Invalid): Unit = js.native
    
    /**
      * Validates the value of the given type with the constraints for the given field name.
      * @param typeName the type name.
      * @param fieldName the field name.
      * @param value the value to validate.
      * @returns {ValdrValidationResult} the validation result.
      */
    def validate(typeName: String, fieldName: String, value: String): ValdrValidationResult = js.native
  }
  
  type ValdrConstraintFieldName = StringDictionary[ValdrConstraintValidator]
  
  type ValdrConstraintTypeName = StringDictionary[ValdrConstraintFieldName]
  
  @js.native
  trait ValdrConstraintValidator
    extends /* argumentName */ StringDictionary[js.Any] {
    
    var message: String = js.native
  }
  object ValdrConstraintValidator {
    
    @scala.inline
    def apply(message: String): ValdrConstraintValidator = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValdrConstraintValidator]
    }
    
    @scala.inline
    implicit class ValdrConstraintValidatorMutableBuilder[Self <: ValdrConstraintValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type ValdrConstraints = StringDictionary[ValdrConstraintTypeName]
  
  @js.native
  trait ValdrProvider extends StObject {
    
    /**
      * Adds a constraint validator alias.
      * @param valdrName the validator name.
      * @param alias the validator alias name.
      */
    def addConstraintAlias(valdrName: String, alias: String): Unit = js.native
    
    /**
      * Adds a new list of constraints (JSON Object).
      * @param newConstraints the list of constraints (JSON Object).
      */
    def addConstraints(newConstraints: ValdrConstraints): Unit = js.native
    
    /**
      * Adds a custom validator.
      * @param validatorName the name of the custom validator.
      */
    def addValidator(validatorName: String): Unit = js.native
    
    /**
      * Removes one or many contraints.
      * @param constraintNames the name or array of constraint names.
      */
    def removeConstraints(constraintNames: String): Unit = js.native
    def removeConstraints(constraintNames: js.Array[String]): Unit = js.native
    
    /**
      * Sets the constraint URL (eg "/api/constraints").
      * @param url the URL of the contraints.
      */
    def setConstraintUrl(url: String): Unit = js.native
  }
  
  @js.native
  trait ValdrValidationResult extends StObject {
    
    var valid: Boolean = js.native
    
    var validationResults: js.Array[ValdrViolation] = js.native
    
    var violations: js.Array[ValdrViolation] = js.native
  }
  object ValdrValidationResult {
    
    @scala.inline
    def apply(valid: Boolean, validationResults: js.Array[ValdrViolation], violations: js.Array[ValdrViolation]): ValdrValidationResult = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], validationResults = validationResults.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValdrValidationResult]
    }
    
    @scala.inline
    implicit class ValdrValidationResultMutableBuilder[Self <: ValdrValidationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationResults(value: js.Array[ValdrViolation]): Self = StObject.set(x, "validationResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationResultsVarargs(value: ValdrViolation*): Self = StObject.set(x, "validationResults", js.Array(value :_*))
      
      @scala.inline
      def setViolations(value: js.Array[ValdrViolation]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViolationsVarargs(value: ValdrViolation*): Self = StObject.set(x, "violations", js.Array(value :_*))
    }
  }
  
  /**
    * Custom validators must implement this interface to provide custom validation logic.
    */
  @js.native
  trait ValdrValidator extends StObject {
    
    /**
      *  Custom validator's name, that will be set in the violation's validator field.
      */
    var name: String = js.native
    
    /**
      * Method to be called to perform custom validation over given value.
      */
    def validate(value: js.Any): Boolean = js.native
    def validate(value: js.Any, validationArguments: StringDictionary[js.Any]): Boolean = js.native
  }
  
  @js.native
  trait ValdrViolation extends ValdrConstraintValidator {
    
    var field: String = js.native
    
    var `type`: String = js.native
    
    var valid: Boolean = js.native
    
    var validator: String = js.native
    
    var value: String = js.native
  }
  object ValdrViolation {
    
    @scala.inline
    def apply(field: String, message: String, `type`: String, valid: Boolean, validator: String, value: String): ValdrViolation = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValdrViolation]
    }
    
    @scala.inline
    implicit class ValdrViolationMutableBuilder[Self <: ValdrViolation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidator(value: String): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
