package typingsSlinky.validator.mod

import typingsSlinky.validator.mod.validator.AlphaLocale
import typingsSlinky.validator.mod.validator.AlphanumericLocale
import typingsSlinky.validator.mod.validator.FloatLocale
import typingsSlinky.validator.mod.validator.HashAlgorithm
import typingsSlinky.validator.mod.validator.IPVersion
import typingsSlinky.validator.mod.validator.ISBNVersion
import typingsSlinky.validator.mod.validator.IdentityCardLocale
import typingsSlinky.validator.mod.validator.IsByteLengthOptions
import typingsSlinky.validator.mod.validator.IsCurrencyOptions
import typingsSlinky.validator.mod.validator.IsDecimalOptions
import typingsSlinky.validator.mod.validator.IsEmailOptions
import typingsSlinky.validator.mod.validator.IsEmptyOptions
import typingsSlinky.validator.mod.validator.IsFQDNOptions
import typingsSlinky.validator.mod.validator.IsFloatOptions
import typingsSlinky.validator.mod.validator.IsISO8601Options
import typingsSlinky.validator.mod.validator.IsISSNOptions
import typingsSlinky.validator.mod.validator.IsIntOptions
import typingsSlinky.validator.mod.validator.IsLengthOptions
import typingsSlinky.validator.mod.validator.IsMACAddressOptions
import typingsSlinky.validator.mod.validator.IsMobilePhoneOptions
import typingsSlinky.validator.mod.validator.IsNumericOptions
import typingsSlinky.validator.mod.validator.IsURLOptions
import typingsSlinky.validator.mod.validator.MobilePhoneLocale
import typingsSlinky.validator.mod.validator.NormalizeEmailOptions
import typingsSlinky.validator.mod.validator.PostalCodeLocale
import typingsSlinky.validator.mod.validator.UUIDVersion
import typingsSlinky.validator.validatorBooleans.`false`
import typingsSlinky.validator.validatorStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator", JSImport.Default)
@js.native
object default extends js.Object {
  
  /******************
    *** Sanitizers ***
    ******************/
  /**
    * Remove characters that appear in the blacklist.
    *
    * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `blacklist(input, '\\[\\]')`.
    */
  def blacklist(input: String, chars: String): String = js.native
  
  /******************
    *** Validators ***
    ******************/
  /**
    * Check if the string contains the seed.
    *
    * @param seed - Seed
    */
  def contains(str: String, seed: js.Any): Boolean = js.native
  
  /**
    * Check if the string matches the comparison.
    *
    * @param comparison - String to compare
    */
  def equals(str: String, comparison: String): Boolean = js.native
  
  /**
    * Replace `<`, `>`, `&`, `'`, `"` and `/` with HTML entities.
    */
  def escape(input: String): String = js.native
  
  /**
    * Check if the string is a date that's after the specified date.
    *
    * @param [date] - Date string (defaults to now)
    */
  def isAfter(str: String): Boolean = js.native
  def isAfter(str: String, date: String): Boolean = js.native
  
  /**
    * Check if the string contains only letters (a-zA-Z).
    *
    * @param [locale] - AlphaLocale
    */
  def isAlpha(str: String): Boolean = js.native
  def isAlpha(str: String, locale: AlphaLocale): Boolean = js.native
  
  val isAlphaLocales: js.Array[AlphaLocale] = js.native
  
  /**
    * Check if the string contains only letters and numbers.
    *
    * @param [locale] - AlphanumericLocale
    */
  def isAlphanumeric(str: String): Boolean = js.native
  def isAlphanumeric(str: String, locale: AlphanumericLocale): Boolean = js.native
  
  val isAlphanumericLocales: js.Array[AlphanumericLocale] = js.native
  
  /**
    * Check if the string contains ASCII chars only.
    */
  def isAscii(str: String): Boolean = js.native
  
  /**
    * Check if a string is a BIC (Bank Identification Code) or SWIFT code.
    */
  def isBIC(str: String): Boolean = js.native
  
  /**
    * Check if a string is base32 encoded.
    */
  def isBase32(str: String): Boolean = js.native
  
  /**
    * Check if a string is base64 encoded.
    */
  def isBase64(str: String): Boolean = js.native
  
  /**
    * Check if the string is a date that's before the specified date.
    *
    * @param [date] - Date string (defaults to now)
    */
  def isBefore(str: String): Boolean = js.native
  def isBefore(str: String, date: String): Boolean = js.native
  
  /**
    * check if a string is a boolean.
    */
  def isBoolean(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid BTC address.
    */
  def isBtcAddress(str: String): Boolean = js.native
  
  /**
    * Check if the string's length (in UTF-8 bytes) falls in a range.
    *
    * @param [options] - Options
    */
  def isByteLength(str: String): Boolean = js.native
  def isByteLength(str: String, options: IsByteLengthOptions): Boolean = js.native
  
  /**
    * Check if the string is a credit card.
    */
  def isCreditCard(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid currency amount.
    *
    * @param [options] - Options
    */
  def isCurrency(str: String): Boolean = js.native
  def isCurrency(str: String, options: IsCurrencyOptions): Boolean = js.native
  
  /**
    * Check if the string is a [data uri format](https://developer.mozilla.org/en-US/docs/Web/HTTP/data_URIs).
    */
  def isDataURI(str: String): Boolean = js.native
  
  /**
    * Check if the string represents a decimal number,
    * such as `0.1`, `.3`, `1.1`, `1.00003`, `4.0` etc.
    *
    * @param [options] - Options
    */
  def isDecimal(str: String): Boolean = js.native
  def isDecimal(str: String, options: IsDecimalOptions): Boolean = js.native
  
  /**
    * Check if the string is a number that's divisible by another.
    *
    * @param number - Divider number
    */
  def isDivisibleBy(str: String, number: Double): Boolean = js.native
  
  /**
    * Check if the string is an EAN (European Article Number).
    */
  def isEAN(str: String): Boolean = js.native
  
  /**
    * Check if the string is an email.
    *
    * @param [options] - Options
    */
  def isEmail(str: String): Boolean = js.native
  def isEmail(str: String, options: IsEmailOptions): Boolean = js.native
  
  /**
    * Check if the string has a length of zero.
    *
    * @param [options] - Options
    */
  def isEmpty(str: String): Boolean = js.native
  def isEmpty(str: String, options: IsEmptyOptions): Boolean = js.native
  
  /**
    * Check if the string is an [Ethereum](https://ethereum.org/) address using basic regex. Does not validate address checksums.
    */
  def isEthereumAddress(str: String): Boolean = js.native
  
  /**
    * Check if the string is a fully qualified domain name (e.g. `domain.com`).
    *
    * @param [options] - Options
    */
  def isFQDN(str: String): Boolean = js.native
  def isFQDN(str: String, options: IsFQDNOptions): Boolean = js.native
  
  /**
    * Check if the string is a float.
    *
    * @param [options] - Options
    */
  def isFloat(str: String): Boolean = js.native
  def isFloat(str: String, options: IsFloatOptions): Boolean = js.native
  
  val isFloatLocales: js.Array[FloatLocale] = js.native
  
  /**
    * Check if the string contains any full-width chars.
    */
  def isFullWidth(str: String): Boolean = js.native
  
  /**
    * Check if the string is an HSL (hue, saturation, lightness, optional alpha) color based on CSS Colors Level 4 specification.
    * Comma-separated format supported. Space-separated format supported with the exception of a few edge cases (ex: hsl(200grad+.1%62%/1)).
    */
  def isHSL(str: String): Boolean = js.native
  
  /**
    * Check if the string contains any half-width chars.
    */
  def isHalfWidth(str: String): Boolean = js.native
  
  /**
    * Check if the string is a hash of type algorithm.
    *
    * @param algorithm - HashAlgorithm
    */
  def isHash(str: String, algorithm: HashAlgorithm): Boolean = js.native
  
  /**
    * Check if the string is a hexadecimal color.
    */
  def isHexColor(str: String): Boolean = js.native
  
  /**
    * Check if the string is a hexadecimal number.
    */
  def isHexadecimal(str: String): Boolean = js.native
  
  /**
    * Check if a string is a IBAN (International Bank Account Number).
    */
  def isIBAN(str: String): Boolean = js.native
  
  /**
    * Check if the string is an IP (version 4 or 6).
    *
    * @param [version] - IP Version
    */
  def isIP(str: String): Boolean = js.native
  def isIP(str: String, version: IPVersion): Boolean = js.native
  
  /**
    * Check if the string is an IP Range (version 4 only).
    */
  def isIPRange(str: String): Boolean = js.native
  
  /**
    * Check if the string is an ISBN (version 10 or 13).
    *
    * @param [version] - ISBN Version
    */
  def isISBN(str: String): Boolean = js.native
  def isISBN(str: String, version: ISBNVersion): Boolean = js.native
  
  /**
    * Check if the string is an [ISIN](https://en.wikipedia.org/wiki/International_Securities_Identification_Number) (stock/security identifier).
    */
  def isISIN(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) officially assigned country code.
    */
  def isISO31661Alpha2(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) officially assigned country code.
    */
  def isISO31661Alpha3(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date.
    *
    * @param [options] - Options
    */
  def isISO8601(str: String): Boolean = js.native
  def isISO8601(str: String, options: IsISO8601Options): Boolean = js.native
  
  /**
    * Check if the string is a [ISRC](https://en.wikipedia.org/wiki/International_Standard_Recording_Code).
    */
  def isISRC(str: String): Boolean = js.native
  
  /**
    * Check if the string is an [ISSN](https://en.wikipedia.org/wiki/International_Standard_Serial_Number).
    *
    * @param [options] - Options
    */
  def isISSN(str: String): Boolean = js.native
  def isISSN(str: String, options: IsISSNOptions): Boolean = js.native
  
  /**
    * Check if the string is a valid identity card code.
    *
    * @param [locale="any"] - IdentityCardLocale
    */
  def isIdentityCard(str: String): Boolean = js.native
  def isIdentityCard(str: String, locale: IdentityCardLocale): Boolean = js.native
  @JSName("isIdentityCard")
  def isIdentityCard_any(str: String, locale: any): Boolean = js.native
  
  /**
    * Check if the string is in a array of allowed values.
    *
    * @param values - Allowed values.
    */
  def isIn(str: String, values: js.Array[_]): Boolean = js.native
  
  /**
    * Check if the string is an integer.
    *
    * @param [options] - Options
    */
  def isInt(str: String): Boolean = js.native
  def isInt(str: String, options: IsIntOptions): Boolean = js.native
  
  /**
    * Check if the string is valid JSON (note: uses `JSON.parse`).
    */
  def isJSON(str: String): Boolean = js.native
  
  /**
    * Check if the string is valid JWT token.
    */
  def isJWT(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid latitude-longitude coordinate in the format:
    *
    * `lat,long` or `lat, long`.
    */
  def isLatLong(str: String): Boolean = js.native
  
  /**
    * Check if the string's length falls in a range.
    *
    * Note: this function takes into account surrogate pairs.
    *
    * @param [options] - Options
    */
  def isLength(str: String): Boolean = js.native
  def isLength(str: String, options: IsLengthOptions): Boolean = js.native
  
  /**
    * Check if the string is a locale.
    */
  def isLocale(str: String): Boolean = js.native
  
  /**
    * Check if the string is lowercase.
    */
  def isLowercase(str: String): Boolean = js.native
  
  /**
    * Check if the string is a MAC address.
    *
    * @param [options] - Options
    */
  def isMACAddress(str: String): Boolean = js.native
  def isMACAddress(str: String, options: IsMACAddressOptions): Boolean = js.native
  
  /**
    * Check if the string is a MD5 hash.
    */
  def isMD5(str: String): Boolean = js.native
  
  /**
    * Check if the string is a [magnet uri format](https://en.wikipedia.org/wiki/Magnet_URI_scheme).
    */
  def isMagnetURI(str: String): Boolean = js.native
  
  /**
    * Check if the string matches to a valid [MIME type](https://en.wikipedia.org/wiki/Media_type) format.
    */
  def isMimeType(str: String): Boolean = js.native
  
  /**
    * Check if the string is a mobile phone number.
    *
    * @param [locale] - MobilePhoneLocale(s)
    * @param [options] - Options
    */
  def isMobilePhone(str: String): Boolean = js.native
  def isMobilePhone(str: String, locale: js.UndefOr[scala.Nothing], options: IsMobilePhoneOptions): Boolean = js.native
  def isMobilePhone(str: String, locale: js.Array[MobilePhoneLocale]): Boolean = js.native
  def isMobilePhone(str: String, locale: js.Array[MobilePhoneLocale], options: IsMobilePhoneOptions): Boolean = js.native
  def isMobilePhone(str: String, locale: MobilePhoneLocale): Boolean = js.native
  def isMobilePhone(str: String, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = js.native
  
  val isMobilePhoneLocales: js.Array[MobilePhoneLocale] = js.native
  
  @JSName("isMobilePhone")
  def isMobilePhone_any(str: String, locale: any): Boolean = js.native
  @JSName("isMobilePhone")
  def isMobilePhone_any(str: String, locale: any, options: IsMobilePhoneOptions): Boolean = js.native
  
  /**
    * Check if the string is a valid hex-encoded representation of a [MongoDB ObjectId](http://docs.mongodb.org/manual/reference/object-id/).
    */
  def isMongoId(str: String): Boolean = js.native
  
  /**
    * Check if the string contains one or more multibyte chars.
    */
  def isMultibyte(str: String): Boolean = js.native
  
  /**
    * Check if the string contains only numbers.
    *
    * @param [options] - Options
    */
  def isNumeric(str: String): Boolean = js.native
  def isNumeric(str: String, options: IsNumericOptions): Boolean = js.native
  
  /**
    * Check if the string is a valid octal number.
    */
  def isOctal(str: String): Boolean = js.native
  
  /**
    * Check if the string is a valid passport number relative to a specific country code.
    *
    * @param [countryCode] - Country code
    */
  def isPassportNumber(str: String): Boolean = js.native
  def isPassportNumber(str: String, countryCode: String): Boolean = js.native
  
  /**
    * Check if the string is a valid port number.
    */
  def isPort(str: String): Boolean = js.native
  
  def isPostalCode(str: String, locale: PostalCodeLocale): Boolean = js.native
  
  val isPostalCodeLocales: js.Array[PostalCodeLocale] = js.native
  
  /**
    * Check if the string is a postal code
    *
    * @param locale - PostalCodeLocale
    */
  @JSName("isPostalCode")
  def isPostalCode_any(str: String, locale: any): Boolean = js.native
  
  /**
    * Check if the string is a valid [RFC 3339](https://tools.ietf.org/html/rfc3339) date.
    */
  def isRFC3339(str: String): Boolean = js.native
  
  /**
    * Check if the string is a rgb or rgba color.
    *
    * @param [includePercentValues=true] - If you don't want to allow to set rgb or rgba values with percents, like rgb(5%,5%,5%), or rgba(90%,90%,90%,.3), then set it to false. (defaults to true)
    */
  def isRgbColor(str: String): Boolean = js.native
  def isRgbColor(str: String, includePercentValues: Boolean): Boolean = js.native
  
  /**
    * Check if the string is a Semantic Versioning Specification (SemVer).
    */
  def isSemVer(str: String): Boolean = js.native
  
  /**
    * Check if the string is of type slug.
    */
  def isSlug(str: String): Boolean = js.native
  
  /**
    * Check if the string contains any surrogate pairs chars.
    */
  def isSurrogatePair(str: String): Boolean = js.native
  
  /**
    * Check if the string is an URL.
    *
    * @param [options] - Options
    */
  def isURL(str: String): Boolean = js.native
  def isURL(str: String, options: IsURLOptions): Boolean = js.native
  
  /**
    * Check if the string is a UUID (version 3, 4 or 5).
    *
    * @param [version="all"] - UUID version
    */
  def isUUID(str: String): Boolean = js.native
  def isUUID(str: String, version: UUIDVersion): Boolean = js.native
  
  /**
    * Check if the string is uppercase.
    */
  def isUppercase(str: String): Boolean = js.native
  
  /**
    * Check if the string contains a mixture of full and half-width chars.
    */
  def isVariableWidth(str: String): Boolean = js.native
  
  /**
    * Checks characters if they appear in the whitelist.
    *
    * @param chars - whitelist
    */
  def isWhitelisted(str: String, chars: String): Boolean = js.native
  def isWhitelisted(str: String, chars: js.Array[String]): Boolean = js.native
  
  /**
    * Trim characters from the left-side of the input.
    *
    * @param [chars] - characters (defaults to whitespace)
    */
  def ltrim(input: String): String = js.native
  def ltrim(input: String, chars: String): String = js.native
  
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `'foo'`
    * @param [modifiers] - `'i'`
    */
  def matches(str: String, pattern: String): Boolean = js.native
  def matches(str: String, pattern: String, modifiers: String): Boolean = js.native
  /**
    * Check if string matches the pattern.
    *
    * @param pattern - `/foo/i`
    */
  def matches(str: String, pattern: js.RegExp): Boolean = js.native
  
  /**
    * Canonicalizes an email address. (This doesn't validate that the input is an email, if you want to validate the email use `isEmail` beforehand)
    *
    * @param [options] - Options
    */
  def normalizeEmail(email: String): String | `false` = js.native
  def normalizeEmail(email: String, options: NormalizeEmailOptions): String | `false` = js.native
  
  /**
    * Trim characters from the right-side of the input.
    *
    * @param [chars] - characters (defaults to whitespace)
    */
  def rtrim(input: String): String = js.native
  def rtrim(input: String, chars: String): String = js.native
  
  /**
    * Remove characters with a numerical value < `32` and `127`, mostly control characters.
    * Unicode-safe in JavaScript.
    *
    * @param [keep_new_lines=false] - if `true`, newline characters are preserved (`\n` and `\r`, hex `0xA` and `0xD`).
    */
  def stripLow(input: String): String = js.native
  def stripLow(input: String, keep_new_lines: Boolean): String = js.native
  
  /**
    * Convert the input string to a boolean.
    * Everything except for `'0'`, `'false'` and `''` returns `true`.
    *
    * @param [strict=false] - in `strict` mode, only `'1'` and `'true'` return `true`.
    */
  def toBoolean(input: String): Boolean = js.native
  def toBoolean(input: String, strict: Boolean): Boolean = js.native
  
  /**
    * Convert the input string to a `Date`, or `null` if the input is not a date.
    */
  def toDate(input: String): js.Date | Null = js.native
  
  /**
    * Convert the input string to a float, or `NaN` if the input is not a float.
    */
  def toFloat(input: String): Double = js.native
  
  /**
    * Convert the input string to an integer, or `NaN` if the input is not an integer.
    *
    * @param [radix=10] - radix or base (defaults to 10)
    */
  def toInt(input: String): Double = js.native
  def toInt(input: String, radix: Double): Double = js.native
  
  /**
    * Converts to string.
    */
  def toString(input: js.Any): String = js.native
  
  /**
    * Trim characters from both sides of the input.
    *
    * @param [chars] - characters (defaults to whitespace)
    */
  def trim(input: String): String = js.native
  def trim(input: String, chars: String): String = js.native
  
  /**
    * Replaces HTML encoded entities with `<`, `>`, `&`, `'`, `"` and `/`.
    */
  def unescape(input: String): String = js.native
  
  val version: String = js.native
  
  /**
    * Remove characters that do not appear in the whitelist.
    *
    * @param chars - The characters are used in a `RegExp` and so you will need to escape some chars, e.g. `whitelist(input, '\\[\\]')`.
    */
  def whitelist(input: String, chars: String): String = js.native
}
