package typingsSlinky.validateJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("validate.js", JSImport.Namespace)
  @js.native
  val ^ : ValidateJS = js.native
  
  @js.native
  trait AsyncValidateOption extends StObject {
    
    var cleanAttributes: js.UndefOr[Boolean] = js.native
    
    var prettify: js.UndefOr[js.Function] = js.native
    
    var wrapErrors: js.UndefOr[js.Function] = js.native
  }
  object AsyncValidateOption {
    
    @scala.inline
    def apply(): AsyncValidateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncValidateOption]
    }
    
    @scala.inline
    implicit class AsyncValidateOptionMutableBuilder[Self <: AsyncValidateOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCleanAttributes(value: Boolean): Self = StObject.set(x, "cleanAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanAttributesUndefined: Self = StObject.set(x, "cleanAttributes", js.undefined)
      
      @scala.inline
      def setPrettify(value: js.Function): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
      
      @scala.inline
      def setWrapErrors(value: js.Function): Self = StObject.set(x, "wrapErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapErrorsUndefined: Self = StObject.set(x, "wrapErrors", js.undefined)
    }
  }
  
  @js.native
  trait CollectFormValuesOption extends StObject {
    
    var nullify: js.UndefOr[Boolean] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
  }
  object CollectFormValuesOption {
    
    @scala.inline
    def apply(): CollectFormValuesOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectFormValuesOption]
    }
    
    @scala.inline
    implicit class CollectFormValuesOptionMutableBuilder[Self <: CollectFormValuesOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNullify(value: Boolean): Self = StObject.set(x, "nullify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullifyUndefined: Self = StObject.set(x, "nullify", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  @js.native
  trait ValidateJS extends StObject {
    
    def apply(attributes: js.Any, constraints: js.Any): js.Any = js.native
    def apply(attributes: js.Any, constraints: js.Any, options: ValidateOption): js.Any = js.native
    
    def async(attributes: js.Any, constraints: js.Any): js.Promise[_] = js.native
    def async(attributes: js.Any, constraints: js.Any, options: AsyncValidateOption): js.Promise[_] = js.native
    
    def capitalize(value: String): String = js.native
    
    def cleanAttributes(attributes: js.Any, whitelist: js.Any): js.Any = js.native
    
    def collectFormValues(form: js.Any): js.Any = js.native
    def collectFormValues(form: js.Any, options: CollectFormValuesOption): js.Any = js.native
    
    def contains(obj: js.Any, value: js.Any): Boolean = js.native
    
    def extend(obj: js.Any, otherObjects: js.Any*): js.Any = js.native
    
    def format(str: String, vals: js.Any): String = js.native
    
    var formatters: js.Any = js.native
    
    def getDeepObjectValue(obj: js.Any, keypath: String): js.Any = js.native
    
    def isArray(value: js.Any): Boolean = js.native
    
    def isBoolean(value: js.Any): Boolean = js.native
    
    def isDate(value: js.Any): Boolean = js.native
    
    def isDefined(value: js.Any): Boolean = js.native
    
    def isDomElement(value: js.Any): Boolean = js.native
    
    def isEmpty(value: js.Any): Boolean = js.native
    
    def isFunction(value: js.Any): Boolean = js.native
    
    def isHash(value: js.Any): Boolean = js.native
    
    def isInteger(value: js.Any): Boolean = js.native
    
    def isNumber(value: js.Any): Boolean = js.native
    
    def isObject(value: js.Any): Boolean = js.native
    
    def isPromise(value: js.Any): Boolean = js.native
    
    def isString(value: js.Any): Boolean = js.native
    
    def prettify(value: String): String = js.native
    
    def result(value: js.Any, args: js.Any*): js.Any = js.native
    
    def single(value: js.Any, constraints: js.Any): js.Any = js.native
    def single(value: js.Any, constraints: js.Any, options: ValidateOption): js.Any = js.native
    
    def validate(attributes: js.Any, constraints: js.Any): js.Any = js.native
    def validate(attributes: js.Any, constraints: js.Any, options: ValidateOption): js.Any = js.native
    
    var validators: js.Any = js.native
  }
  
  @js.native
  trait ValidateOption extends StObject {
    
    var format: js.UndefOr[String] = js.native
    
    var fullMessages: js.UndefOr[Boolean] = js.native
    
    var prettify: js.UndefOr[js.Function] = js.native
  }
  object ValidateOption {
    
    @scala.inline
    def apply(): ValidateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidateOption]
    }
    
    @scala.inline
    implicit class ValidateOptionMutableBuilder[Self <: ValidateOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFullMessages(value: Boolean): Self = StObject.set(x, "fullMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullMessagesUndefined: Self = StObject.set(x, "fullMessages", js.undefined)
      
      @scala.inline
      def setPrettify(value: js.Function): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
    }
  }
  
  type _To = ValidateJS
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ValidateJS = ^
}
