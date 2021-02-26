package typingsSlinky.stripejs

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.stripejs.anon.Base
import typingsSlinky.stripejs.anon.Complete
import typingsSlinky.stripejs.anon.Empty
import typingsSlinky.stripejs.anon.Invalid
import typingsSlinky.stripejs.anon.PreventDefault
import typingsSlinky.stripejs.mod.StripeError
import typingsSlinky.stripejs.stripejsStrings.`light-outline`
import typingsSlinky.stripejs.stripejsStrings.auto
import typingsSlinky.stripejs.stripejsStrings.blur
import typingsSlinky.stripejs.stripejsStrings.bold
import typingsSlinky.stripejs.stripejsStrings.bolder
import typingsSlinky.stripejs.stripejsStrings.buy
import typingsSlinky.stripejs.stripejsStrings.change
import typingsSlinky.stripejs.stripejsStrings.click
import typingsSlinky.stripejs.stripejsStrings.da
import typingsSlinky.stripejs.stripejsStrings.dark
import typingsSlinky.stripejs.stripejsStrings.de
import typingsSlinky.stripejs.stripejsStrings.default
import typingsSlinky.stripejs.stripejsStrings.donate
import typingsSlinky.stripejs.stripejsStrings.en
import typingsSlinky.stripejs.stripejsStrings.es
import typingsSlinky.stripejs.stripejsStrings.fi
import typingsSlinky.stripejs.stripejsStrings.focus
import typingsSlinky.stripejs.stripejsStrings.fr
import typingsSlinky.stripejs.stripejsStrings.inherit
import typingsSlinky.stripejs.stripejsStrings.initial
import typingsSlinky.stripejs.stripejsStrings.it
import typingsSlinky.stripejs.stripejsStrings.italic
import typingsSlinky.stripejs.stripejsStrings.ja
import typingsSlinky.stripejs.stripejsStrings.light
import typingsSlinky.stripejs.stripejsStrings.lighter
import typingsSlinky.stripejs.stripejsStrings.nl
import typingsSlinky.stripejs.stripejsStrings.no
import typingsSlinky.stripejs.stripejsStrings.normal
import typingsSlinky.stripejs.stripejsStrings.oblique
import typingsSlinky.stripejs.stripejsStrings.ready
import typingsSlinky.stripejs.stripejsStrings.revert
import typingsSlinky.stripejs.stripejsStrings.solid
import typingsSlinky.stripejs.stripejsStrings.sv
import typingsSlinky.stripejs.stripejsStrings.unset
import typingsSlinky.stripejs.stripejsStrings.zh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  @js.native
  trait BaseOptions extends StObject {
    
    /**
      * Set custom class names on the container DOM element when the Stripe Element is in a
      * particular state.
      */
    var classes: js.UndefOr[Empty] = js.native
    
    /**
      * Whether or not the input is disabled
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not the icon should be hidden
      * @default false
      */
    var hideIcon: js.UndefOr[Boolean] = js.native
    
    /**
      * Customize appearance using CSS properties
      */
    var style: js.UndefOr[Invalid] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Empty): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHideIcon(value: Boolean): Self = StObject.set(x, "hideIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideIconUndefined: Self = StObject.set(x, "hideIcon", js.undefined)
      
      @scala.inline
      def setStyle(value: Invalid): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CardElementOptions extends BaseOptions {
    
    /**
      * Whether or not to hide the postal code
      * NOTE: If you are already collecting a full billing address or postal code elsewhere, set this to `true`
      * @default false
      */
    var hidePostalCode: js.UndefOr[Boolean] = js.native
    
    /**
      * Appearance of the icon in the Element
      */
    var iconStyle: js.UndefOr[solid | default] = js.native
    
    /**
      * A placeholder text
      * NOTE: This is only available for `cardNumber`, `cardExpiry` & `cardCvc` elements
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * A pre-filled value
      * NOTE: Sensitive card information (card number, CVC, and expiration date) cannot be pre-filled
      * @see placeholder
      *
      * @example {postalCode: '94110'}
      */
    var value: js.UndefOr[js.Any] = js.native
  }
  object CardElementOptions {
    
    @scala.inline
    def apply(): CardElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardElementOptions]
    }
    
    @scala.inline
    implicit class CardElementOptionsMutableBuilder[Self <: CardElementOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidePostalCode(value: Boolean): Self = StObject.set(x, "hidePostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidePostalCodeUndefined: Self = StObject.set(x, "hidePostalCode", js.undefined)
      
      @scala.inline
      def setIconStyle(value: solid | default): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ElementCreatorOptions extends StObject {
    
    /**
      * Fonts that should be used for styling the element
      * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
      */
    var fonts: js.UndefOr[js.Array[FontCSSElement | FontConfigElement]] = js.native
    
    /**
      * The translation that should be used for the element text
      * `auto` defaults to the browser language
      *
      * @default 'auto'
      */
    var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String] = js.native
  }
  object ElementCreatorOptions {
    
    @scala.inline
    def apply(): ElementCreatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementCreatorOptions]
    }
    
    @scala.inline
    implicit class ElementCreatorOptionsMutableBuilder[Self <: ElementCreatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFonts(value: js.Array[FontCSSElement | FontConfigElement]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      @scala.inline
      def setFontsVarargs(value: (FontCSSElement | FontConfigElement)*): Self = StObject.set(x, "fonts", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  @js.native
  trait ElementFactory extends StObject {
    
    /**
      * Creates a new StripeJS element
      * @see https://stripe.com/docs/stripe-js/reference#elements-create
      * @param type - The type of element that should be created
      * @param options - Any options that should be used to con
      *
      * @example ```
      * const style = {
      *    base: {
      *      color: '#303238',
      *      fontSize: '16px',
      *      color: "#32325d",
      *      fontSmoothing: 'antialiased',
      *      '::placeholder': {
      *        color: '#ccc',
      *      },
      *    },
      *    invalid: {
      *      color: '#e5424d',
      *      ':focus': {
      *        color: '#303238',
      *        },
      *    },
      * };
      * const cardElement = elementCreator.create('card', {style: style})
      * ```
      *
      * @return The created element
      */
    def create(`type`: ElementType, options: CardElementOptions): StripeElement = js.native
    def create(`type`: ElementType, options: IBANElementOptions): StripeElement = js.native
    def create(`type`: ElementType, options: IdealBankOptions): StripeElement = js.native
    def create(`type`: ElementType, options: PaymentButtonOptions): StripeElement = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripejs.stripejsStrings.card
    - typingsSlinky.stripejs.stripejsStrings.cardNumber
    - typingsSlinky.stripejs.stripejsStrings.cardExpiry
    - typingsSlinky.stripejs.stripejsStrings.cardCvc
    - typingsSlinky.stripejs.stripejsStrings.postalCode
    - typingsSlinky.stripejs.stripejsStrings.paymentRequestButton
  */
  trait ElementType extends StObject
  object ElementType {
    
    @scala.inline
    def card: typingsSlinky.stripejs.stripejsStrings.card = "card".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.card]
    
    @scala.inline
    def cardCvc: typingsSlinky.stripejs.stripejsStrings.cardCvc = "cardCvc".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.cardCvc]
    
    @scala.inline
    def cardExpiry: typingsSlinky.stripejs.stripejsStrings.cardExpiry = "cardExpiry".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.cardExpiry]
    
    @scala.inline
    def cardNumber: typingsSlinky.stripejs.stripejsStrings.cardNumber = "cardNumber".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.cardNumber]
    
    @scala.inline
    def paymentRequestButton: typingsSlinky.stripejs.stripejsStrings.paymentRequestButton = "paymentRequestButton".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.paymentRequestButton]
    
    @scala.inline
    def postalCode: typingsSlinky.stripejs.stripejsStrings.postalCode = "postalCode".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.postalCode]
  }
  
  @js.native
  trait FontCSSElement extends StObject {
    
    /**
      * A relative or absolute URL pointing to a CSS file with `@font-face` definitions
      * @example 'https://fonts.googleapis.com/css?family=Open+Sans'
      */
    var cssSrc: String = js.native
  }
  object FontCSSElement {
    
    @scala.inline
    def apply(cssSrc: String): FontCSSElement = {
      val __obj = js.Dynamic.literal(cssSrc = cssSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontCSSElement]
    }
    
    @scala.inline
    implicit class FontCSSElementMutableBuilder[Self <: FontCSSElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssSrc(value: String): Self = StObject.set(x, "cssSrc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FontConfigElement extends StObject {
    
    /**
      * The name of the font family
      * @example 'Times New Roman'
      */
    var family: js.UndefOr[String] = js.native
    
    /**
      * A src value pointing to your custom font file.
      * @example
      * 'url(https://somewebsite.com/path/to/font.woff)'
      * 'url(path/to/font.woff)'
      */
    var src: js.UndefOr[String] = js.native
    
    /**
      * The style of the text
      * @default 'normal'
      */
    var style: js.UndefOr[normal | italic | oblique] = js.native
    
    /**
      * A unicode range for the font that should be used
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/@font-face/unicode-range
      */
    var unicodeRange: js.UndefOr[String] = js.native
    
    /**
      * The weight of the font
      * NOTE: This cannot be a number!
      */
    var weight: js.UndefOr[initial | inherit | bold | bolder | lighter | normal | revert | unset] = js.native
  }
  object FontConfigElement {
    
    @scala.inline
    def apply(): FontConfigElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontConfigElement]
    }
    
    @scala.inline
    implicit class FontConfigElementMutableBuilder[Self <: FontConfigElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStyle(value: normal | italic | oblique): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      @scala.inline
      def setWeight(value: initial | inherit | bold | bolder | lighter | normal | revert | unset): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  @js.native
  trait IBANElementOptions extends BaseOptions {
    
    /**
      * Appearance of the icon in the Element
      */
    var iconStyle: js.UndefOr[solid | default] = js.native
    
    /**
      * Customize the country and format of the placeholder IBAN
      * @default 'DE"
      */
    var placeholderCountry: js.UndefOr[String] = js.native
    
    /**
      * Specify the list of countries or country-groups whose IBANs you want to allow
      */
    var supportedCountries: js.UndefOr[js.Array[String]] = js.native
  }
  object IBANElementOptions {
    
    @scala.inline
    def apply(): IBANElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBANElementOptions]
    }
    
    @scala.inline
    implicit class IBANElementOptionsMutableBuilder[Self <: IBANElementOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconStyle(value: solid | default): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setPlaceholderCountry(value: String): Self = StObject.set(x, "placeholderCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderCountryUndefined: Self = StObject.set(x, "placeholderCountry", js.undefined)
      
      @scala.inline
      def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedCountriesUndefined: Self = StObject.set(x, "supportedCountries", js.undefined)
      
      @scala.inline
      def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IdealBankOptions extends BaseOptions {
    
    /**
      * A pre-filled value for the Element. Can be one of the banks listed in the
      * @see https://stripe.com/docs/sources/ideal#optional-specifying-the-customers-bank
      *
      * @example 'abn_amro'
      */
    var value: js.UndefOr[String] = js.native
  }
  object IdealBankOptions {
    
    @scala.inline
    def apply(): IdealBankOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdealBankOptions]
    }
    
    @scala.inline
    implicit class IdealBankOptionsMutableBuilder[Self <: IdealBankOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait MSClearAttributes extends StyleAttributes {
    
    var display: js.UndefOr[String] = js.native
  }
  object MSClearAttributes {
    
    @scala.inline
    def apply(): MSClearAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MSClearAttributes]
    }
    
    @scala.inline
    implicit class MSClearAttributesMutableBuilder[Self <: MSClearAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    }
  }
  
  @js.native
  trait OnChange extends StObject {
    
    /**
      * The financial institution that services the account whose IBAN was entered into the Element.
      * NOTE: This is only available when the element is of IBAN type
      */
    var bankName: String = js.native
    
    /**
      * The type of card that was used
      * @example 'visa'
      * NOTE: This is only available when the element is of Card or Cardnumber type
      */
    var brand: js.UndefOr[String] = js.native
    
    /**
      * true if the value is well-formed and potentially complete
      */
    var complete: Boolean = js.native
    
    /**
      * The country code of the entered IBAN
      * NOTE: This is only available when the element is of IBAN type
      */
    var country: js.UndefOr[String] = js.native
    
    /**
      * The type of the Element that changed.
      */
    var elementType: ElementType = js.native
    
    /**
      * true if the value is empty
      */
    var empty: Boolean = js.native
    
    /**
      * The current validation error if any
      */
    var error: StripeError = js.native
    
    /**
      * The value of the element
      * @see CardElementOptions.value for more information
      * NOTE: This is only filled is the element is of a Card type
      *
      * -----
      *
      * The selected bank. Can be one of the banks listed in the
      * @see https://stripe.com/docs/sources/ideal#optional-specifying-the-customers-bank
      * NOTE: This is also filled when the element is of IdealBank type
      */
    var value: js.UndefOr[js.Any] = js.native
  }
  object OnChange {
    
    @scala.inline
    def apply(bankName: String, complete: Boolean, elementType: ElementType, empty: Boolean, error: StripeError): OnChange = {
      val __obj = js.Dynamic.literal(bankName = bankName.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChange]
    }
    
    @scala.inline
    implicit class OnChangeMutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBankName(value: String): Self = StObject.set(x, "bankName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setElementType(value: ElementType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: StripeError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait PaymentButtonOptions extends StObject {
    
    /**
      * Set custom class names on the container DOM element when the Stripe Element is in a
      * particular state.
      */
    var classes: js.UndefOr[Base] = js.native
    
    var paymentRequest: js.Any = js.native
    
    var style: js.UndefOr[Complete] = js.native
  }
  object PaymentButtonOptions {
    
    @scala.inline
    def apply(paymentRequest: js.Any): PaymentButtonOptions = {
      val __obj = js.Dynamic.literal(paymentRequest = paymentRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentButtonOptions]
    }
    
    @scala.inline
    implicit class PaymentButtonOptionsMutableBuilder[Self <: PaymentButtonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Base): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setPaymentRequest(value: js.Any): Self = StObject.set(x, "paymentRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: Complete): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait PaymentRequestButtonStyle extends StObject {
    
    /**
      * The height of the button
      * @example '25px'
      */
    var height: js.UndefOr[String] = js.native
    
    /**
      * The theme of the button that should be used
      * @default 'dark'
      */
    var theme: js.UndefOr[dark | light | `light-outline`] = js.native
    
    /**
      * The type of button that should be shown
      * @default 'default'
      */
    var `type`: js.UndefOr[default | donate | buy] = js.native
  }
  object PaymentRequestButtonStyle {
    
    @scala.inline
    def apply(): PaymentRequestButtonStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentRequestButtonStyle]
    }
    
    @scala.inline
    implicit class PaymentRequestButtonStyleMutableBuilder[Self <: PaymentRequestButtonStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setTheme(value: dark | light | `light-outline`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: default | donate | buy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait StripeElement extends StObject {
    
    /**
      * Blur the element
      * @see https://stripe.com/docs/stripe-js/reference#other-methods
      */
    def blur(): Unit = js.native
    
    /**
      * Clear the value of the element
      */
    def clear(): Unit = js.native
    
    /**
      * Removes the Element from the DOM and destroys it
      * NOTE: a destroyed element can not be re-activated or re-mounted to the DOM
      */
    def destroy(): Unit = js.native
    
    /**
      * Give focus to the element
      */
    def focus(): Unit = js.native
    
    def mount(element: String): Unit = js.native
    /**
      * Mount the element to the DOM
      * @see https://stripe.com/docs/stripe-js/reference#element-mount
      *
      * @param element - A HTML DOM element or a CSS selector
      *
      * @example ```
      * <label for="card-element">Card</label>
      * <div id="card-element"></div>
      *
      * cardElement.mount('#card-element');
      * ```
      */
    def mount(element: HTMLElement): Unit = js.native
    
    /**
      * Watch for changes on the element
      * @see https://stripe.com/docs/stripe-js/reference#element-on
      *
      * @param event - What event to listen to
      * @param handler - The handler function that is called when the event fires
      */
    @JSName("on")
    def on_blur(event: blur, handler: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_change(event: change, handler: js.Function1[/* event */ OnChange, Unit]): Unit = js.native
    @JSName("on")
    def on_click(event: click, handler: js.Function1[/* event */ PreventDefault, Unit]): Unit = js.native
    @JSName("on")
    def on_focus(event: focus, handler: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_ready(event: ready, handler: js.Function0[Unit]): Unit = js.native
    
    /**
      * Unmounts the Element from the DOM
      * Call `element.mount()` to re-attach it to the DOM
      * @see mount
      */
    def unmount(): Unit = js.native
    
    /**
      * Updates the options the Element was initialized with
      * NOTE: Updates are merged into the existing configuration
      * @param options - The options that should be used to update the element
      */
    def update(options: CardElementOptions): Unit = js.native
    def update(options: IBANElementOptions): Unit = js.native
    def update(options: IdealBankOptions): Unit = js.native
    def update(options: PaymentButtonOptions): Unit = js.native
  }
  
  @js.native
  trait StyleAttributes extends StObject {
    
    @JSName(":-webkit-autofill")
    var `Colon-webkit-autofill`: js.UndefOr[StyleAttributes] = js.native
    
    @JSName("::-ms-clear")
    var `ColonColon-ms-clear`: js.UndefOr[MSClearAttributes] = js.native
    
    @JSName("::placeholder")
    var ColonColonplaceholder: js.UndefOr[StyleAttributes] = js.native
    
    @JSName("::selection")
    var ColonColonselection: js.UndefOr[StyleAttributes] = js.native
    
    @JSName(":disabled")
    var Colondisabled: js.UndefOr[StyleAttributes] = js.native
    
    @JSName(":focus")
    var Colonfocus: js.UndefOr[StyleAttributes] = js.native
    
    @JSName(":hover")
    var Colonhover: js.UndefOr[StyleAttributes] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[String] = js.native
    
    var fontSmoothing: js.UndefOr[String] = js.native
    
    var fontStyle: js.UndefOr[String] = js.native
    
    var fontVariant: js.UndefOr[js.Any] = js.native
    
    var iconColor: js.UndefOr[String] = js.native
    
    var letterSpacing: js.UndefOr[String] = js.native
    
    var lineHeight: js.UndefOr[String] = js.native
    
    /**
      * Add padding to the element
      * NOTE: Only available for the `idealBank` Element
      */
    var padding: js.UndefOr[String] = js.native
    
    /**
      * Align text inside the element
      * NOTE: Only available for the `cardNumber`, `cardExpiry`, and `cardCvc` Elements
      */
    var textAlign: js.UndefOr[String] = js.native
    
    var textDecoration: js.UndefOr[String] = js.native
    
    var textShadow: js.UndefOr[String] = js.native
    
    var textTransform: js.UndefOr[String] = js.native
  }
  object StyleAttributes {
    
    @scala.inline
    def apply(): StyleAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleAttributes]
    }
    
    @scala.inline
    implicit class StyleAttributesMutableBuilder[Self <: StyleAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setColon-webkit-autofill`(value: StyleAttributes): Self = StObject.set(x, ":-webkit-autofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-webkit-autofillUndefined`: Self = StObject.set(x, ":-webkit-autofill", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-clear`(value: MSClearAttributes): Self = StObject.set(x, "::-ms-clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-clearUndefined`: Self = StObject.set(x, "::-ms-clear", js.undefined)
      
      @scala.inline
      def setColonColonplaceholder(value: StyleAttributes): Self = StObject.set(x, "::placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonplaceholderUndefined: Self = StObject.set(x, "::placeholder", js.undefined)
      
      @scala.inline
      def setColonColonselection(value: StyleAttributes): Self = StObject.set(x, "::selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonselectionUndefined: Self = StObject.set(x, "::selection", js.undefined)
      
      @scala.inline
      def setColondisabled(value: StyleAttributes): Self = StObject.set(x, ":disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColondisabledUndefined: Self = StObject.set(x, ":disabled", js.undefined)
      
      @scala.inline
      def setColonfocus(value: StyleAttributes): Self = StObject.set(x, ":focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonfocusUndefined: Self = StObject.set(x, ":focus", js.undefined)
      
      @scala.inline
      def setColonhover(value: StyleAttributes): Self = StObject.set(x, ":hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonhoverUndefined: Self = StObject.set(x, ":hover", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontSmoothing(value: String): Self = StObject.set(x, "fontSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSmoothingUndefined: Self = StObject.set(x, "fontSmoothing", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontVariant(value: js.Any): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      @scala.inline
      def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    }
  }
}
