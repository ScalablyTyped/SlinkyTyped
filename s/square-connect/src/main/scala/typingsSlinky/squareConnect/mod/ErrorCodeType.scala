package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.squareConnect.squareConnectStrings.INTERNAL_SERVER_ERROR
  - typingsSlinky.squareConnect.squareConnectStrings.UNAUTHORIZED
  - typingsSlinky.squareConnect.squareConnectStrings.ACCESS_TOKEN_EXPIRED
  - typingsSlinky.squareConnect.squareConnectStrings.ACCESS_TOKEN_REVOKED
  - typingsSlinky.squareConnect.squareConnectStrings.FORBIDDEN
  - typingsSlinky.squareConnect.squareConnectStrings.INSUFFICIENT_SCOPES
  - typingsSlinky.squareConnect.squareConnectStrings.APPLICATION_DISABLED
  - typingsSlinky.squareConnect.squareConnectStrings.V1_APPLICATION
  - typingsSlinky.squareConnect.squareConnectStrings.V1_ACCESS_TOKEN
  - typingsSlinky.squareConnect.squareConnectStrings.CARD_PROCESSING_NOT_ENABLED
  - typingsSlinky.squareConnect.squareConnectStrings.BAD_REQUEST
  - typingsSlinky.squareConnect.squareConnectStrings.MISSING_REQUIRED_PARAMETER
  - typingsSlinky.squareConnect.squareConnectStrings.INCORRECT_TYPE
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_TIME
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_TIME_RANGE
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_VALUE
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_CURSOR
  - typingsSlinky.squareConnect.squareConnectStrings.UNKNOWN_QUERY_PARAMETER
  - typingsSlinky.squareConnect.squareConnectStrings.CONFLICTING_PARAMETERS
  - typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_JSON_BODY
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_SORT_ORDER
  - typingsSlinky.squareConnect.squareConnectStrings.VALUE_REGEX_MISMATCH
  - typingsSlinky.squareConnect.squareConnectStrings.VALUE_TOO_SHORT
  - typingsSlinky.squareConnect.squareConnectStrings.VALUE_TOO_LONG
  - typingsSlinky.squareConnect.squareConnectStrings.VALUE_TOO_LOW
  - typingsSlinky.squareConnect.squareConnectStrings.VALUE_TOO_HIGH
  - typingsSlinky.squareConnect.squareConnectStrings.VALUE_EMPTY
  - typingsSlinky.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_LONG
  - typingsSlinky.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_SHORT
  - typingsSlinky.squareConnect.squareConnectStrings.ARRAY_EMPTY
  - typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_BOOLEAN
  - typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_INTEGER
  - typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_FLOAT
  - typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_STRING
  - typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_OBJECT
  - typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_ARRAY
  - typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_MAP
  - typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_ARRAY_VALUE
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_ENUM_VALUE
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_CONTENT_TYPE
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_FORM_VALUE
  - typingsSlinky.squareConnect.squareConnectStrings.ONE_INSTRUMENT_EXPECTED
  - typingsSlinky.squareConnect.squareConnectStrings.NO_FIELDS_SET
  - typingsSlinky.squareConnect.squareConnectStrings.DEPRECATED_FIELD_SET
  - typingsSlinky.squareConnect.squareConnectStrings.CARD_EXPIRED
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_EXPIRATION
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_EXPIRATION_YEAR
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_EXPIRATION_DATE
  - typingsSlinky.squareConnect.squareConnectStrings.UNSUPPORTED_CARD_BRAND
  - typingsSlinky.squareConnect.squareConnectStrings.UNSUPPORTED_ENTRY_METHOD
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_ENCRYPTED_CARD
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_CARD
  - typingsSlinky.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_EXPIRED
  - typingsSlinky.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CANCELED
  - typingsSlinky.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CAPTURED
  - typingsSlinky.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_FAILED
  - typingsSlinky.squareConnect.squareConnectStrings.CARD_TOKEN_EXPIRED
  - typingsSlinky.squareConnect.squareConnectStrings.CARD_TOKEN_USED
  - typingsSlinky.squareConnect.squareConnectStrings.AMOUNT_TOO_HIGH
  - typingsSlinky.squareConnect.squareConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE
  - typingsSlinky.squareConnect.squareConnectStrings.REFUND_AMOUNT_INVALID
  - typingsSlinky.squareConnect.squareConnectStrings.REFUND_ALREADY_PENDING
  - typingsSlinky.squareConnect.squareConnectStrings.PAYMENT_NOT_REFUNDABLE
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_CARD_DATA
  - typingsSlinky.squareConnect.squareConnectStrings.LOCATION_MISMATCH
  - typingsSlinky.squareConnect.squareConnectStrings.IDEMPOTENCY_KEY_REUSED
  - typingsSlinky.squareConnect.squareConnectStrings.UNEXPECTED_VALUE
  - typingsSlinky.squareConnect.squareConnectStrings.SANDBOX_NOT_SUPPORTED
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_EMAIL_ADDRESS
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_PHONE_NUMBER
  - typingsSlinky.squareConnect.squareConnectStrings.CHECKOUT_EXPIRED
  - typingsSlinky.squareConnect.squareConnectStrings.BAD_CERTIFICATE
  - typingsSlinky.squareConnect.squareConnectStrings.INVALID_SQUARE_VERSION_FORMAT
  - typingsSlinky.squareConnect.squareConnectStrings.API_VERSION_INCOMPATIBLE
  - typingsSlinky.squareConnect.squareConnectStrings.CARD_DECLINED
  - typingsSlinky.squareConnect.squareConnectStrings.VERIFY_CVV_FAILURE
  - typingsSlinky.squareConnect.squareConnectStrings.VERIFY_AVS_FAILURE
  - typingsSlinky.squareConnect.squareConnectStrings.CARD_DECLINED_CALL_ISSUER
  - typingsSlinky.squareConnect.squareConnectStrings.NOT_FOUND
  - typingsSlinky.squareConnect.squareConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND
  - typingsSlinky.squareConnect.squareConnectStrings.METHOD_NOT_ALLOWED
  - typingsSlinky.squareConnect.squareConnectStrings.NOT_ACCEPTABLE
  - typingsSlinky.squareConnect.squareConnectStrings.REQUEST_TIMEOUT
  - typingsSlinky.squareConnect.squareConnectStrings.CONFLICT
  - typingsSlinky.squareConnect.squareConnectStrings.REQUEST_ENTITY_TOO_LARGE
  - typingsSlinky.squareConnect.squareConnectStrings.UNSUPPORTED_MEDIA_TYPE
  - typingsSlinky.squareConnect.squareConnectStrings.RATE_LIMITED
  - typingsSlinky.squareConnect.squareConnectStrings.NOT_IMPLEMENTED
  - typingsSlinky.squareConnect.squareConnectStrings.SERVICE_UNAVAILABLE
  - typingsSlinky.squareConnect.squareConnectStrings.GATEWAY_TIMEOUT
*/
trait ErrorCodeType extends js.Object

object ErrorCodeType {
  @scala.inline
  def ACCESS_TOKEN_EXPIRED: typingsSlinky.squareConnect.squareConnectStrings.ACCESS_TOKEN_EXPIRED = this.cast("ACCESS_TOKEN_EXPIRED")
  @scala.inline
  def ACCESS_TOKEN_REVOKED: typingsSlinky.squareConnect.squareConnectStrings.ACCESS_TOKEN_REVOKED = this.cast("ACCESS_TOKEN_REVOKED")
  @scala.inline
  def AMOUNT_TOO_HIGH: typingsSlinky.squareConnect.squareConnectStrings.AMOUNT_TOO_HIGH = this.cast("AMOUNT_TOO_HIGH")
  @scala.inline
  def API_VERSION_INCOMPATIBLE: typingsSlinky.squareConnect.squareConnectStrings.API_VERSION_INCOMPATIBLE = this.cast("API_VERSION_INCOMPATIBLE")
  @scala.inline
  def APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND: typingsSlinky.squareConnect.squareConnectStrings.APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND = this.cast("APPLE_PAYMENT_PROCESSING_CERTIFICATE_HASH_NOT_FOUND")
  @scala.inline
  def APPLICATION_DISABLED: typingsSlinky.squareConnect.squareConnectStrings.APPLICATION_DISABLED = this.cast("APPLICATION_DISABLED")
  @scala.inline
  def ARRAY_EMPTY: typingsSlinky.squareConnect.squareConnectStrings.ARRAY_EMPTY = this.cast("ARRAY_EMPTY")
  @scala.inline
  def ARRAY_LENGTH_TOO_LONG: typingsSlinky.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_LONG = this.cast("ARRAY_LENGTH_TOO_LONG")
  @scala.inline
  def ARRAY_LENGTH_TOO_SHORT: typingsSlinky.squareConnect.squareConnectStrings.ARRAY_LENGTH_TOO_SHORT = this.cast("ARRAY_LENGTH_TOO_SHORT")
  @scala.inline
  def BAD_CERTIFICATE: typingsSlinky.squareConnect.squareConnectStrings.BAD_CERTIFICATE = this.cast("BAD_CERTIFICATE")
  @scala.inline
  def BAD_REQUEST: typingsSlinky.squareConnect.squareConnectStrings.BAD_REQUEST = this.cast("BAD_REQUEST")
  @scala.inline
  def CARD_DECLINED: typingsSlinky.squareConnect.squareConnectStrings.CARD_DECLINED = this.cast("CARD_DECLINED")
  @scala.inline
  def CARD_DECLINED_CALL_ISSUER: typingsSlinky.squareConnect.squareConnectStrings.CARD_DECLINED_CALL_ISSUER = this.cast("CARD_DECLINED_CALL_ISSUER")
  @scala.inline
  def CARD_EXPIRED: typingsSlinky.squareConnect.squareConnectStrings.CARD_EXPIRED = this.cast("CARD_EXPIRED")
  @scala.inline
  def CARD_PROCESSING_NOT_ENABLED: typingsSlinky.squareConnect.squareConnectStrings.CARD_PROCESSING_NOT_ENABLED = this.cast("CARD_PROCESSING_NOT_ENABLED")
  @scala.inline
  def CARD_TOKEN_EXPIRED: typingsSlinky.squareConnect.squareConnectStrings.CARD_TOKEN_EXPIRED = this.cast("CARD_TOKEN_EXPIRED")
  @scala.inline
  def CARD_TOKEN_USED: typingsSlinky.squareConnect.squareConnectStrings.CARD_TOKEN_USED = this.cast("CARD_TOKEN_USED")
  @scala.inline
  def CHECKOUT_EXPIRED: typingsSlinky.squareConnect.squareConnectStrings.CHECKOUT_EXPIRED = this.cast("CHECKOUT_EXPIRED")
  @scala.inline
  def CONFLICT: typingsSlinky.squareConnect.squareConnectStrings.CONFLICT = this.cast("CONFLICT")
  @scala.inline
  def CONFLICTING_PARAMETERS: typingsSlinky.squareConnect.squareConnectStrings.CONFLICTING_PARAMETERS = this.cast("CONFLICTING_PARAMETERS")
  @scala.inline
  def DELAYED_TRANSACTION_CANCELED: typingsSlinky.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CANCELED = this.cast("DELAYED_TRANSACTION_CANCELED")
  @scala.inline
  def DELAYED_TRANSACTION_CAPTURED: typingsSlinky.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_CAPTURED = this.cast("DELAYED_TRANSACTION_CAPTURED")
  @scala.inline
  def DELAYED_TRANSACTION_EXPIRED: typingsSlinky.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_EXPIRED = this.cast("DELAYED_TRANSACTION_EXPIRED")
  @scala.inline
  def DELAYED_TRANSACTION_FAILED: typingsSlinky.squareConnect.squareConnectStrings.DELAYED_TRANSACTION_FAILED = this.cast("DELAYED_TRANSACTION_FAILED")
  @scala.inline
  def DEPRECATED_FIELD_SET: typingsSlinky.squareConnect.squareConnectStrings.DEPRECATED_FIELD_SET = this.cast("DEPRECATED_FIELD_SET")
  @scala.inline
  def EXPECTED_ARRAY: typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_ARRAY = this.cast("EXPECTED_ARRAY")
  @scala.inline
  def EXPECTED_BASE64_ENCODED_BYTE_ARRAY: typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_BASE64_ENCODED_BYTE_ARRAY = this.cast("EXPECTED_BASE64_ENCODED_BYTE_ARRAY")
  @scala.inline
  def EXPECTED_BOOLEAN: typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_BOOLEAN = this.cast("EXPECTED_BOOLEAN")
  @scala.inline
  def EXPECTED_FLOAT: typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_FLOAT = this.cast("EXPECTED_FLOAT")
  @scala.inline
  def EXPECTED_INTEGER: typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_INTEGER = this.cast("EXPECTED_INTEGER")
  @scala.inline
  def EXPECTED_JSON_BODY: typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_JSON_BODY = this.cast("EXPECTED_JSON_BODY")
  @scala.inline
  def EXPECTED_MAP: typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_MAP = this.cast("EXPECTED_MAP")
  @scala.inline
  def EXPECTED_OBJECT: typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_OBJECT = this.cast("EXPECTED_OBJECT")
  @scala.inline
  def EXPECTED_STRING: typingsSlinky.squareConnect.squareConnectStrings.EXPECTED_STRING = this.cast("EXPECTED_STRING")
  @scala.inline
  def FORBIDDEN: typingsSlinky.squareConnect.squareConnectStrings.FORBIDDEN = this.cast("FORBIDDEN")
  @scala.inline
  def GATEWAY_TIMEOUT: typingsSlinky.squareConnect.squareConnectStrings.GATEWAY_TIMEOUT = this.cast("GATEWAY_TIMEOUT")
  @scala.inline
  def IDEMPOTENCY_KEY_REUSED: typingsSlinky.squareConnect.squareConnectStrings.IDEMPOTENCY_KEY_REUSED = this.cast("IDEMPOTENCY_KEY_REUSED")
  @scala.inline
  def INCORRECT_TYPE: typingsSlinky.squareConnect.squareConnectStrings.INCORRECT_TYPE = this.cast("INCORRECT_TYPE")
  @scala.inline
  def INSUFFICIENT_SCOPES: typingsSlinky.squareConnect.squareConnectStrings.INSUFFICIENT_SCOPES = this.cast("INSUFFICIENT_SCOPES")
  @scala.inline
  def INTERNAL_SERVER_ERROR: typingsSlinky.squareConnect.squareConnectStrings.INTERNAL_SERVER_ERROR = this.cast("INTERNAL_SERVER_ERROR")
  @scala.inline
  def INVALID_ARRAY_VALUE: typingsSlinky.squareConnect.squareConnectStrings.INVALID_ARRAY_VALUE = this.cast("INVALID_ARRAY_VALUE")
  @scala.inline
  def INVALID_CARD: typingsSlinky.squareConnect.squareConnectStrings.INVALID_CARD = this.cast("INVALID_CARD")
  @scala.inline
  def INVALID_CARD_DATA: typingsSlinky.squareConnect.squareConnectStrings.INVALID_CARD_DATA = this.cast("INVALID_CARD_DATA")
  @scala.inline
  def INVALID_CONTENT_TYPE: typingsSlinky.squareConnect.squareConnectStrings.INVALID_CONTENT_TYPE = this.cast("INVALID_CONTENT_TYPE")
  @scala.inline
  def INVALID_CURSOR: typingsSlinky.squareConnect.squareConnectStrings.INVALID_CURSOR = this.cast("INVALID_CURSOR")
  @scala.inline
  def INVALID_EMAIL_ADDRESS: typingsSlinky.squareConnect.squareConnectStrings.INVALID_EMAIL_ADDRESS = this.cast("INVALID_EMAIL_ADDRESS")
  @scala.inline
  def INVALID_ENCRYPTED_CARD: typingsSlinky.squareConnect.squareConnectStrings.INVALID_ENCRYPTED_CARD = this.cast("INVALID_ENCRYPTED_CARD")
  @scala.inline
  def INVALID_ENUM_VALUE: typingsSlinky.squareConnect.squareConnectStrings.INVALID_ENUM_VALUE = this.cast("INVALID_ENUM_VALUE")
  @scala.inline
  def INVALID_EXPIRATION: typingsSlinky.squareConnect.squareConnectStrings.INVALID_EXPIRATION = this.cast("INVALID_EXPIRATION")
  @scala.inline
  def INVALID_EXPIRATION_DATE: typingsSlinky.squareConnect.squareConnectStrings.INVALID_EXPIRATION_DATE = this.cast("INVALID_EXPIRATION_DATE")
  @scala.inline
  def INVALID_EXPIRATION_YEAR: typingsSlinky.squareConnect.squareConnectStrings.INVALID_EXPIRATION_YEAR = this.cast("INVALID_EXPIRATION_YEAR")
  @scala.inline
  def INVALID_FORM_VALUE: typingsSlinky.squareConnect.squareConnectStrings.INVALID_FORM_VALUE = this.cast("INVALID_FORM_VALUE")
  @scala.inline
  def INVALID_PHONE_NUMBER: typingsSlinky.squareConnect.squareConnectStrings.INVALID_PHONE_NUMBER = this.cast("INVALID_PHONE_NUMBER")
  @scala.inline
  def INVALID_SORT_ORDER: typingsSlinky.squareConnect.squareConnectStrings.INVALID_SORT_ORDER = this.cast("INVALID_SORT_ORDER")
  @scala.inline
  def INVALID_SQUARE_VERSION_FORMAT: typingsSlinky.squareConnect.squareConnectStrings.INVALID_SQUARE_VERSION_FORMAT = this.cast("INVALID_SQUARE_VERSION_FORMAT")
  @scala.inline
  def INVALID_TIME: typingsSlinky.squareConnect.squareConnectStrings.INVALID_TIME = this.cast("INVALID_TIME")
  @scala.inline
  def INVALID_TIME_RANGE: typingsSlinky.squareConnect.squareConnectStrings.INVALID_TIME_RANGE = this.cast("INVALID_TIME_RANGE")
  @scala.inline
  def INVALID_VALUE: typingsSlinky.squareConnect.squareConnectStrings.INVALID_VALUE = this.cast("INVALID_VALUE")
  @scala.inline
  def LOCATION_MISMATCH: typingsSlinky.squareConnect.squareConnectStrings.LOCATION_MISMATCH = this.cast("LOCATION_MISMATCH")
  @scala.inline
  def METHOD_NOT_ALLOWED: typingsSlinky.squareConnect.squareConnectStrings.METHOD_NOT_ALLOWED = this.cast("METHOD_NOT_ALLOWED")
  @scala.inline
  def MISSING_REQUIRED_PARAMETER: typingsSlinky.squareConnect.squareConnectStrings.MISSING_REQUIRED_PARAMETER = this.cast("MISSING_REQUIRED_PARAMETER")
  @scala.inline
  def NOT_ACCEPTABLE: typingsSlinky.squareConnect.squareConnectStrings.NOT_ACCEPTABLE = this.cast("NOT_ACCEPTABLE")
  @scala.inline
  def NOT_FOUND: typingsSlinky.squareConnect.squareConnectStrings.NOT_FOUND = this.cast("NOT_FOUND")
  @scala.inline
  def NOT_IMPLEMENTED: typingsSlinky.squareConnect.squareConnectStrings.NOT_IMPLEMENTED = this.cast("NOT_IMPLEMENTED")
  @scala.inline
  def NO_FIELDS_SET: typingsSlinky.squareConnect.squareConnectStrings.NO_FIELDS_SET = this.cast("NO_FIELDS_SET")
  @scala.inline
  def ONE_INSTRUMENT_EXPECTED: typingsSlinky.squareConnect.squareConnectStrings.ONE_INSTRUMENT_EXPECTED = this.cast("ONE_INSTRUMENT_EXPECTED")
  @scala.inline
  def PAYMENT_NOT_REFUNDABLE: typingsSlinky.squareConnect.squareConnectStrings.PAYMENT_NOT_REFUNDABLE = this.cast("PAYMENT_NOT_REFUNDABLE")
  @scala.inline
  def RATE_LIMITED: typingsSlinky.squareConnect.squareConnectStrings.RATE_LIMITED = this.cast("RATE_LIMITED")
  @scala.inline
  def REFUND_ALREADY_PENDING: typingsSlinky.squareConnect.squareConnectStrings.REFUND_ALREADY_PENDING = this.cast("REFUND_ALREADY_PENDING")
  @scala.inline
  def REFUND_AMOUNT_INVALID: typingsSlinky.squareConnect.squareConnectStrings.REFUND_AMOUNT_INVALID = this.cast("REFUND_AMOUNT_INVALID")
  @scala.inline
  def REQUEST_ENTITY_TOO_LARGE: typingsSlinky.squareConnect.squareConnectStrings.REQUEST_ENTITY_TOO_LARGE = this.cast("REQUEST_ENTITY_TOO_LARGE")
  @scala.inline
  def REQUEST_TIMEOUT: typingsSlinky.squareConnect.squareConnectStrings.REQUEST_TIMEOUT = this.cast("REQUEST_TIMEOUT")
  @scala.inline
  def SANDBOX_NOT_SUPPORTED: typingsSlinky.squareConnect.squareConnectStrings.SANDBOX_NOT_SUPPORTED = this.cast("SANDBOX_NOT_SUPPORTED")
  @scala.inline
  def SERVICE_UNAVAILABLE: typingsSlinky.squareConnect.squareConnectStrings.SERVICE_UNAVAILABLE = this.cast("SERVICE_UNAVAILABLE")
  @scala.inline
  def UNAUTHORIZED: typingsSlinky.squareConnect.squareConnectStrings.UNAUTHORIZED = this.cast("UNAUTHORIZED")
  @scala.inline
  def UNEXPECTED_VALUE: typingsSlinky.squareConnect.squareConnectStrings.UNEXPECTED_VALUE = this.cast("UNEXPECTED_VALUE")
  @scala.inline
  def UNKNOWN_QUERY_PARAMETER: typingsSlinky.squareConnect.squareConnectStrings.UNKNOWN_QUERY_PARAMETER = this.cast("UNKNOWN_QUERY_PARAMETER")
  @scala.inline
  def UNSUPPORTED_CARD_BRAND: typingsSlinky.squareConnect.squareConnectStrings.UNSUPPORTED_CARD_BRAND = this.cast("UNSUPPORTED_CARD_BRAND")
  @scala.inline
  def UNSUPPORTED_ENTRY_METHOD: typingsSlinky.squareConnect.squareConnectStrings.UNSUPPORTED_ENTRY_METHOD = this.cast("UNSUPPORTED_ENTRY_METHOD")
  @scala.inline
  def UNSUPPORTED_INSTRUMENT_TYPE: typingsSlinky.squareConnect.squareConnectStrings.UNSUPPORTED_INSTRUMENT_TYPE = this.cast("UNSUPPORTED_INSTRUMENT_TYPE")
  @scala.inline
  def UNSUPPORTED_MEDIA_TYPE: typingsSlinky.squareConnect.squareConnectStrings.UNSUPPORTED_MEDIA_TYPE = this.cast("UNSUPPORTED_MEDIA_TYPE")
  @scala.inline
  def V1_ACCESS_TOKEN: typingsSlinky.squareConnect.squareConnectStrings.V1_ACCESS_TOKEN = this.cast("V1_ACCESS_TOKEN")
  @scala.inline
  def V1_APPLICATION: typingsSlinky.squareConnect.squareConnectStrings.V1_APPLICATION = this.cast("V1_APPLICATION")
  @scala.inline
  def VALUE_EMPTY: typingsSlinky.squareConnect.squareConnectStrings.VALUE_EMPTY = this.cast("VALUE_EMPTY")
  @scala.inline
  def VALUE_REGEX_MISMATCH: typingsSlinky.squareConnect.squareConnectStrings.VALUE_REGEX_MISMATCH = this.cast("VALUE_REGEX_MISMATCH")
  @scala.inline
  def VALUE_TOO_HIGH: typingsSlinky.squareConnect.squareConnectStrings.VALUE_TOO_HIGH = this.cast("VALUE_TOO_HIGH")
  @scala.inline
  def VALUE_TOO_LONG: typingsSlinky.squareConnect.squareConnectStrings.VALUE_TOO_LONG = this.cast("VALUE_TOO_LONG")
  @scala.inline
  def VALUE_TOO_LOW: typingsSlinky.squareConnect.squareConnectStrings.VALUE_TOO_LOW = this.cast("VALUE_TOO_LOW")
  @scala.inline
  def VALUE_TOO_SHORT: typingsSlinky.squareConnect.squareConnectStrings.VALUE_TOO_SHORT = this.cast("VALUE_TOO_SHORT")
  @scala.inline
  def VERIFY_AVS_FAILURE: typingsSlinky.squareConnect.squareConnectStrings.VERIFY_AVS_FAILURE = this.cast("VERIFY_AVS_FAILURE")
  @scala.inline
  def VERIFY_CVV_FAILURE: typingsSlinky.squareConnect.squareConnectStrings.VERIFY_CVV_FAILURE = this.cast("VERIFY_CVV_FAILURE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

