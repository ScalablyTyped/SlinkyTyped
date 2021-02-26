package typingsSlinky.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsCurrencyOptions extends StObject {
  
  /**
    * @default true
    */
  var allow_decimal: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var allow_negative_sign_placeholder: js.UndefOr[Boolean] = js.native
  
  /**
    * @default true
    */
  var allow_negatives: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var allow_space_after_digits: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var allow_space_after_symbol: js.UndefOr[Boolean] = js.native
  
  /**
    * @default '.'
    */
  var decimal_separator: js.UndefOr[String] = js.native
  
  /**
    * The array `digits_after_decimal` is filled with the exact number of digits allowed not a range, for example a range `1` to `3` will be given as `[1, 2, 3]`.
    *
    * @default [2]
    */
  var digits_after_decimal: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * @default false
    */
  var negative_sign_after_digits: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var negative_sign_before_digits: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var parens_for_negatives: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var require_decimal: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var require_symbol: js.UndefOr[Boolean] = js.native
  
  /**
    * @default '$'
    */
  var symbol: js.UndefOr[String] = js.native
  
  /**
    * @default false
    */
  var symbol_after_digits: js.UndefOr[Boolean] = js.native
  
  /**
    * @default ','
    */
  var thousands_separator: js.UndefOr[String] = js.native
}
object IsCurrencyOptions {
  
  @scala.inline
  def apply(): IsCurrencyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCurrencyOptions]
  }
  
  @scala.inline
  implicit class IsCurrencyOptionsMutableBuilder[Self <: IsCurrencyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_decimal(value: Boolean): Self = StObject.set(x, "allow_decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_decimalUndefined: Self = StObject.set(x, "allow_decimal", js.undefined)
    
    @scala.inline
    def setAllow_negative_sign_placeholder(value: Boolean): Self = StObject.set(x, "allow_negative_sign_placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_negative_sign_placeholderUndefined: Self = StObject.set(x, "allow_negative_sign_placeholder", js.undefined)
    
    @scala.inline
    def setAllow_negatives(value: Boolean): Self = StObject.set(x, "allow_negatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_negativesUndefined: Self = StObject.set(x, "allow_negatives", js.undefined)
    
    @scala.inline
    def setAllow_space_after_digits(value: Boolean): Self = StObject.set(x, "allow_space_after_digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_space_after_digitsUndefined: Self = StObject.set(x, "allow_space_after_digits", js.undefined)
    
    @scala.inline
    def setAllow_space_after_symbol(value: Boolean): Self = StObject.set(x, "allow_space_after_symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_space_after_symbolUndefined: Self = StObject.set(x, "allow_space_after_symbol", js.undefined)
    
    @scala.inline
    def setDecimal_separator(value: String): Self = StObject.set(x, "decimal_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimal_separatorUndefined: Self = StObject.set(x, "decimal_separator", js.undefined)
    
    @scala.inline
    def setDigits_after_decimal(value: js.Array[Double]): Self = StObject.set(x, "digits_after_decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigits_after_decimalUndefined: Self = StObject.set(x, "digits_after_decimal", js.undefined)
    
    @scala.inline
    def setDigits_after_decimalVarargs(value: Double*): Self = StObject.set(x, "digits_after_decimal", js.Array(value :_*))
    
    @scala.inline
    def setNegative_sign_after_digits(value: Boolean): Self = StObject.set(x, "negative_sign_after_digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegative_sign_after_digitsUndefined: Self = StObject.set(x, "negative_sign_after_digits", js.undefined)
    
    @scala.inline
    def setNegative_sign_before_digits(value: Boolean): Self = StObject.set(x, "negative_sign_before_digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegative_sign_before_digitsUndefined: Self = StObject.set(x, "negative_sign_before_digits", js.undefined)
    
    @scala.inline
    def setParens_for_negatives(value: Boolean): Self = StObject.set(x, "parens_for_negatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParens_for_negativesUndefined: Self = StObject.set(x, "parens_for_negatives", js.undefined)
    
    @scala.inline
    def setRequire_decimal(value: Boolean): Self = StObject.set(x, "require_decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_decimalUndefined: Self = StObject.set(x, "require_decimal", js.undefined)
    
    @scala.inline
    def setRequire_symbol(value: Boolean): Self = StObject.set(x, "require_symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_symbolUndefined: Self = StObject.set(x, "require_symbol", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setSymbol_after_digits(value: Boolean): Self = StObject.set(x, "symbol_after_digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol_after_digitsUndefined: Self = StObject.set(x, "symbol_after_digits", js.undefined)
    
    @scala.inline
    def setThousands_separator(value: String): Self = StObject.set(x, "thousands_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousands_separatorUndefined: Self = StObject.set(x, "thousands_separator", js.undefined)
  }
}
